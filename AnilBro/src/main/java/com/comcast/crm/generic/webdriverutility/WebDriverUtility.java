
package com.comcast.crm.generic.webdriverutility;

import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	public void triggerURL(WebDriver driver, String URL) {
		driver.get(URL);

	}

	public WebDriver launchBrowser(WebDriver driver, String BROWSER) {

		if (BROWSER.equals("Chrome")) {
			ChromeOptions options = new ChromeOptions();

			Map<String, Object> prefs = new HashMap<>();

			prefs.put("autofill.profile_enabled", false);
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			prefs.put("profile.default_content_setting_values.notifications", 2);
			options.setExperimentalOption("prefs", prefs);

			options.addArguments("--disable-notifications");
			options.addArguments("--disable-infobars");
			options.addArguments("--disable-extensions");
			options.addArguments("--incognito");
			driver = new ChromeDriver(options);
		} else if (BROWSER.equals("Edge")) {
			driver = new EdgeDriver();
		} else if (BROWSER.equals("FireFox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}
		return driver;
	}

	public void windowMaximize(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void waitForPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

	}

	public void quitBrowser(WebDriver driver) {
		driver.quit();
	}

	public void waitForElementPresent(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public void clickOnElement(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	public void switchToTabURL(WebDriver driver, String partialURL) {
		Set<String> set1 = driver.getWindowHandles();
		Iterator<String> it1 = set1.iterator();

		while (it1.hasNext()) {
			String windowID = it1.next();
			driver.switchTo().window(windowID);

			String actURL = driver.getCurrentUrl();
			if (actURL.contains(partialURL)) {
				break;
			}
		}
	}

	public void switchToTabTitle(WebDriver driver, String partialTitle) {
		Set<String> set1 = driver.getWindowHandles();
		Iterator<String> it1 = set1.iterator();

		while (it1.hasNext()) {
			String windowID = it1.next();
			driver.switchTo().window(windowID);

			String actURL = driver.getCurrentUrl();
			if (actURL.contains(partialTitle)) {
				break;
			}
		}
	}

	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);

	}

	public void switchToFrame(WebDriver driver, String nameID) {
		driver.switchTo().frame(nameID);
	}

	public void switchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	public void switchToAlertAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	public void switchToAlertCancel(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	public void selectByText(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	public void selectByIndex(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	public void mousemoveonElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	public void doubleClick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}

	public void clickonElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.click(element).perform();
	}
}
