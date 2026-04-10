package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppersStack_Address {
	WebDriver driver;

	public ShoppersStack_Address(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getAddnewAddress() {
		return addnewAddress;
	}

	@FindBy(xpath="//button[@class=\"selectaddress_adneadd__cICdt\"]/child::span[text()='Add New Address']")
	private WebElement addnewAddress;

}
