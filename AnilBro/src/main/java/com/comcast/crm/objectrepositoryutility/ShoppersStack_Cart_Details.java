package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class ShoppersStack_Cart_Details {
	WebDriver driver;

	public ShoppersStack_Cart_Details (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBys({@FindBy(xpath="//button[@id=\"buynow_fl\"]"),@FindBy(xpath="//span[text()='Buy Now']")})
	private WebElement buyNow;

	

	public WebElement getBuyNow() {
		// TODO Auto-generated method stub
		return buyNow;
	}

}
