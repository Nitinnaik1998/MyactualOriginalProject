package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginByEmailSpotify {
	WebDriver driver;

	public LoginByEmailSpotify(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
    
	
	@FindBy(id="username")
	private WebElement EmailTextField;
	
	@FindBy(xpath="//span[text()='Continue']")
	private WebElement ContinueButton;
  
	
	public WebElement getEmailTextField() {
		return EmailTextField;
		
	}
	
	public WebElement ContinueButton() {
		return ContinueButton;
	}
	
}