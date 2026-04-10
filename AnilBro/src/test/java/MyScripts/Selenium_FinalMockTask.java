package MyScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.comcast.crm.generic.fileutility.ExcelUtility;
import com.comcast.crm.generic.fileutility.FileUtility;
import com.comcast.crm.generic.webdriverutility.JavaUtility;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.ShopperStackHomePage;
import com.comcast.crm.objectrepositoryutility.ShopperStackLogin;
import com.comcast.crm.objectrepositoryutility.ShoppersStack_Address;
import com.comcast.crm.objectrepositoryutility.ShoppersStack_AddressForm;
import com.comcast.crm.objectrepositoryutility.ShoppersStack_Cart_Details;
import com.comcast.crm.objectrepositoryutility.ShoppersStack_OrderConfirmed;
import com.comcast.crm.objectrepositoryutility.ShoppersStack_PaymentMethod;
import com.comcast.crm.objectrepositoryutility.ShoppersStack_SelectDeliveryAddress;
import com.comcast.crm.objectrepositoryutility.ShoppersStack__Products;

public class Selenium_FinalMockTask {
	WebDriver driver;
	ExcelUtility eLib = new ExcelUtility();

	@Test(dataProvider = "getDetails")
	public void shopperstack(String email, String password, String productName) throws Exception {

		FileUtility fLib = new FileUtility();
		JavaUtility jLib = new JavaUtility();

		WebDriverUtility wLib = new WebDriverUtility();

		String BROWSER = fLib.getDataFromPropertiesFile("Browser");
		String URL = eLib.getDataFromExcel("org", 1, 0);

		String buyerName = eLib.getDataFromExcel("org", 2, 0);
		String houseName = eLib.getDataFromExcel("org", 2, 1);
		String streetName = eLib.getDataFromExcel("org", 2, 2);
		String landmarkName = eLib.getDataFromExcel("org", 2, 3);
		String countryName = eLib.getDataFromExcel("org", 10, 0);
		String stateName = eLib.getDataFromExcel("org", 10, 1);
		String cityName = eLib.getDataFromExcel("org", 10, 2);
		String cityPincode = eLib.getDataFromExcel("org", 10, 3);
		String mobileNumber = eLib.getDataFromExcel("org", 10, 4);

		driver = wLib.launchBrowser(driver, BROWSER);

		driver.get(URL);
		wLib.waitForPageToLoad(driver);
		wLib.windowMaximize(driver);

		ShopperStackHomePage sshp = new ShopperStackHomePage(driver);
		wLib.waitForElementPresent(driver, sshp.getLoginButton());

		sshp.getLoginButton().click();

		ShopperStackLogin ssl = new ShopperStackLogin(driver);
		ssl.login(email, password);

		Thread.sleep(5000);
		ShoppersStack__Products smp = new ShoppersStack__Products(driver);
		smp.getSearchProduct().sendKeys(productName);
		smp.getSearchroductsIcon().click();
		smp.getAddtocartButton().click();
		smp.getCartIcon().click();

		ShoppersStack_Cart_Details hcd = new ShoppersStack_Cart_Details(driver);
		Thread.sleep(3000);
		hcd.getBuyNow().click();

		ShoppersStack_Address ssa = new ShoppersStack_Address(driver);
		ssa.getAddnewAddress().click();

		ShoppersStack_AddressForm ssaf = new ShoppersStack_AddressForm(driver);
		ssaf.getNameInput().sendKeys(buyerName);
		ssaf.getHouseInput().sendKeys(houseName);
		ssaf.getStreetInput().sendKeys(streetName);
		ssaf.getLandmarkInput().sendKeys(landmarkName);
		wLib.selectByText(ssaf.getCountryDropdown(), countryName);
		wLib.selectByText(ssaf.getStateDropdown(), stateName);
		wLib.selectByText(ssaf.getCityDropdown(), cityName);
		ssaf.getPincodeInput().sendKeys(cityPincode);
		ssaf.getPhonenumberInput().sendKeys(mobileNumber);
		ssaf.getAddaddressButton().click();

		ShoppersStack_SelectDeliveryAddress ssda = new ShoppersStack_SelectDeliveryAddress(driver);
		ssda.getRadioButton().click();
		ssda.getProceedButton().click();

		ShoppersStack_PaymentMethod sspm = new ShoppersStack_PaymentMethod(driver);
		sspm.getCashonDelievery().click();
		sspm.getProceedButton().click();

		ShoppersStack_OrderConfirmed ssoc = new ShoppersStack_OrderConfirmed(driver);
		String orderConfirmed = ssoc.getOrderconfirmedMessage().getText();
		System.out.println(orderConfirmed);
		String thankyouMsg = ssoc.getThankyouMessage().getText();
		System.out.println(thankyouMsg);
		String orderId = ssoc.getOrderID().getText();

		wLib.waitForElementPresent(driver, ssoc.getToastmsgCreated());

		String actualCreated = ssoc.getToastmsgCreated().getText();
		String expectedCreated = "Created";
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(actualCreated.contains(expectedCreated));
		System.out.println(actualCreated);
		System.out.println(
				"Your order " + productName + "number is" + orderId + "we update you when your order has shipped");
		eLib.setDataIntoExcelByCreatingSheet(productName, 0, 0, orderId);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.invisibilityOf(ssoc.getToastmsgCreated()));

		ssoc.logout();

		wLib.quitBrowser(driver);

	}

	@DataProvider
	public Object[][] getDetails() throws Exception {

		String email1 = eLib.getDataFromExcelforShoppersStack("Sheet2", 0, 0);
		String password1 = eLib.getDataFromExcelforShoppersStack("Sheet2", 0, 1);
		String product1 = eLib.getDataFromExcelforShoppersStack("Sheet2", 0, 2);
		String email2 = eLib.getDataFromExcelforShoppersStack("Sheet2", 1, 0);
		String password2 = eLib.getDataFromExcelforShoppersStack("Sheet2", 1, 1);
		String product2 = eLib.getDataFromExcelforShoppersStack("Sheet2", 1, 2);

		Object[][] obj = new Object[2][3];
		obj[0][0] = email1;
		obj[0][1] = password1;
		obj[0][2] = product1;
		obj[1][0] = email2;
		obj[1][1] = password2;
		obj[1][2] = product2;

		return obj;
	}

}
