package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpotifyLogin {
	WebDriver driver;
	public SpotifyLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(xpath="//span[text()='Log in']")
	private WebElement Login;
    
    @FindBy(xpath="//button[text()='Log in with a password']")
    private WebElement loginwithpassword;

	public WebElement getLogin() {
		return Login;
	}
    
	public WebElement getloginwithpassword() {
		return loginwithpassword;
		
	}
    
	


}