package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShopRegister {
	WebDriver driver;

	public DemoWebShopRegister(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "gender-male")
	private WebElement maleRadioButton;

	@FindBy(id = "FirstName")
	private WebElement firstName;

	@FindBy(id = "LastName")
	private WebElement lastName;

	@FindBy(id = "Email")
	private WebElement email;

	@FindBy(id = "Password")
	private WebElement password;

	@FindBy(id = "ConfirmPassword")
	private WebElement confrimPassword;

	@FindBy(id = "register-button")
	private WebElement registerButton;

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfrimPassword() {
		return confrimPassword;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public void registrationPage(String FirstName, String LastName, String email, String password,
			String confirmPassword) {
		getMaleRadioButton().click();
		getFirstName().sendKeys(FirstName);
		getLastName().sendKeys(LastName);
		getEmail().sendKeys(email);
		getPassword().sendKeys(password);
		getConfrimPassword().sendKeys(confirmPassword);
		getRegisterButton().click();
	}

}
