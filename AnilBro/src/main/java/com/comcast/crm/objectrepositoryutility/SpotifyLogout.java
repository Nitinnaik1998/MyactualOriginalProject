package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpotifyLogout {
	WebDriver driver;
	
	public  SpotifyLogout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//button[@data-testid=\"user-widget-link\"]/child::span[@data-testid=\"username-first-letter\"]")
	private WebElement logoutLogo;
	
	
	@FindBy(xpath="//span[text()='Log out']")
	private WebElement logoutLink;


	public WebElement getLogoutLogo() {
		return logoutLogo;
	}


	public WebElement getLogoutLink() {
		return logoutLink;
	}

}
