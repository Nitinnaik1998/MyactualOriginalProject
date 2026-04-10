package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppersStack_SelectDeliveryAddress {

	WebDriver driver;

	public ShoppersStack_SelectDeliveryAddress (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//label[@class='selectaddress_addname__9Z9SJ']/ancestor::div[@class='selectaddress_addresscont__Ps89s']/descendant::input[@type='radio']")
	private WebElement radioButton;

	

	public WebElement getRadioButton() {
		return radioButton;
	}
	
	public WebElement getProceedButton() {
		return proceedButton;
	}

	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement proceedButton;
}
