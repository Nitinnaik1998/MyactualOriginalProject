package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewOrganizationWithIndustry {
WebDriver driver;
	
	public CreateNewOrganizationWithIndustry(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="accountname")
	private WebElement organizationName;
	
	@FindBy(name="industry")
	private WebElement industryDropdown;
	
	@FindBy(name="accounttype")
	private WebElement typeDropdown;
	
	@FindBy(name="ship_street")
	private WebElement shippingAddress;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;

	public WebElement getOrganizationName() {
		return organizationName;
	}
	
	public WebElement getIndustryDropdown() {
		return industryDropdown;
	}

	public WebElement getTypeDropdown() {
		return typeDropdown;
	}

	public WebElement getShippingAddress() {
		return shippingAddress;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public void OrganizationInfromation(String orgName,String shippingaddress) {
		driver.manage().window().maximize();
		organizationName.sendKeys(orgName);
		Select s=new Select(industryDropdown);
	
		shippingAddress.sendKeys(shippingaddress);
		saveButton.click();
	}

}




