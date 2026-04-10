package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPageWithPhoneNo {
WebDriver driver;
	
	public CreateOrganizationPageWithPhoneNo(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="accountname")
	private WebElement OrganizationName;
	
	@FindBy(id="phone")
	private WebElement phoneNo;
	
	@FindBy(name="ship_street")
	private WebElement shippingAddress;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;

	
	
	public WebElement getOrganizationName() {
		return OrganizationName;
	}



	public WebElement getPhoneNo() {
		return phoneNo;
	}



	public WebElement getShippingAddress() {
		return shippingAddress;
	}



	public WebElement getSaveButton() {
		return saveButton;
	}



	public void OrganizationInfo(String orgName,String phNo,String shippingaddress) {
		driver.manage().window().maximize();
		OrganizationName.sendKeys(orgName);
		phoneNo.sendKeys(phNo);
		shippingAddress.sendKeys(shippingaddress);
		saveButton.click();
	}



}
