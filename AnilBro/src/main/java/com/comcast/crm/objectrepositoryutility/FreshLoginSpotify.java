package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FreshLoginSpotify {
	WebDriver driver;
	public FreshLoginSpotify(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement EmailTextField;

	@FindBy(id="password")
	private WebElement PasswordTextField;
	
	
	@FindBy(xpath="//span[text()='Log in']")
	private WebElement LoginButton;
	public WebElement getEmailTextField() {
		return EmailTextField;
	}


	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}


	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	public void LoginSpotify(String password) {
		getPasswordTextField().sendKeys(password);
	    getLoginButton().click();
	}

}
