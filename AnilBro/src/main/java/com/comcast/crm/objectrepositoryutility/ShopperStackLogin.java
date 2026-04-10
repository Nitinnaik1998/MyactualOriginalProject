package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopperStackLogin {
	WebDriver driver;
	public ShopperStackLogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	
	
	
	public WebElement getEmailTextfield() {
		return emailTextfield;
	}

	

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	

	public WebElement getLoginButton() {
		return loginButton;
	}



	@FindBy(id="Email")
	private WebElement emailTextfield;
	
	@FindBy(id="Password")
	private WebElement passwordTextfield;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginButton;
	
	public void login(String email,String password) {
		getEmailTextfield().sendKeys(email);
		getPasswordTextfield().sendKeys(password);
		getLoginButton().click();
	}

}
