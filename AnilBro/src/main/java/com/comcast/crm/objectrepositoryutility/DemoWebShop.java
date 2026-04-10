package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShop {
	
	WebDriver driver;
	public DemoWebShop(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='Register']")
	private WebElement registerLink;
	
	
	public WebElement getRegisterLink() {
		return registerLink;
	}


	

}
