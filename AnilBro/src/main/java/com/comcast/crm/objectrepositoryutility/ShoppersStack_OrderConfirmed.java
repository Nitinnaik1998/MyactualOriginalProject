package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppersStack_OrderConfirmed {
	WebDriver driver;

	public ShoppersStack_OrderConfirmed(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
 
	
	@FindBy(xpath="//h1[text()='Order Confirmed']/ancestor::div[@id='root']/descendant::b")
	private WebElement orderID;

	public WebElement getOrderID() {
		return orderID;
	}
	
	@FindBy(xpath="//span[@class='BaseBadge-root MuiBadge-root css-1rzb3uu']")
	private WebElement logoutLogo;
	
	
	@FindBy(xpath="//*[name()='svg' and @data-testid='LogoutIcon']/ancestor::li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz']")
	private WebElement logoutLink;
	
	


	public WebElement getLogoutLogo() {
		return logoutLogo;
	}


	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	@FindBy(xpath="//h1[text()='Order Confirmed']")
	private WebElement orderconfirmedMessage;
	
	public WebElement getOrderconfirmedMessage() {
		return orderconfirmedMessage;
	}
    
	@FindBy(xpath="//h2[text()='Thank you for your order ']")
	private WebElement thankyouMessage;
	
	
	public WebElement getThankyouMessage() {
		return thankyouMessage;
	}
	
    @FindBy(xpath="//div[contains(text(),'Created')]")
    private WebElement toastmsgCreated;
    
    @FindBy(xpath="")
    private WebElement toastmsgSuccessfullyadded;
    
	public WebElement getToastmsgCreated() {
		return toastmsgCreated;
	}


	public void logout() {
		getLogoutLogo().click();
		getLogoutLink().click();
	}
}
