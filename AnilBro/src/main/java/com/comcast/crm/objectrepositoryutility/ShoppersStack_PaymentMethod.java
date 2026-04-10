package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppersStack_PaymentMethod {
	WebDriver driver;

	public ShoppersStack_PaymentMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='radio-buttons-group' and @value='COD']")
	private WebElement cashonDelievery;

	public WebElement getCashonDelievery() {
		return cashonDelievery;
	}

	@FindBy(xpath = "//button[text()='Add Card']")
	private WebElement addCard;

	public WebElement getAddCard() {
		return addCard;
	}

	public WebElement getProceedButton() {
		return proceedButton;
	}

	@FindBy(xpath = "//button[text()='Proceed']")
	private WebElement proceedButton;
}
