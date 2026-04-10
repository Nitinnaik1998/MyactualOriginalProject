package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ShoppersStack_AddressForm {
	WebDriver driver;

	public ShoppersStack_AddressForm(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Name")
	private WebElement nameInput;
	
	@FindBy(id="House/Office Info")
	private WebElement houseInput;
	
	@FindBy(id="Street Info")
	private WebElement streetInput;
	
	@FindBy(id="Landmark")
	private WebElement landmarkInput;
	
	@FindBy(id="Pincode")
	private WebElement pincodeInput;
	
	@FindBy(id="Phone Number")
	private WebElement phonenumberInput;
	
	@FindBy(xpath="//button[text()='Add Address']")
	private WebElement addaddressButton;
	
	@FindBy(id="Country")
	private WebElement countryDropdown;
	
	@FindBy(id="State")
	private WebElement stateDropdown;
	
	@FindBy(id="City")
	private WebElement cityDropdown;

	public WebElement getStateDropdown() {
		return stateDropdown;
	}

	public WebElement getCityDropdown() {
		return cityDropdown;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getNameInput() {
		return nameInput;
	}

	public WebElement getHouseInput() {
		return houseInput;
	}

	public WebElement getStreetInput() {
		return streetInput;
	}

	public WebElement getLandmarkInput() {
		return landmarkInput;
	}

	public WebElement getPincodeInput() {
		return pincodeInput;
	}

	public WebElement getPhonenumberInput() {
		return phonenumberInput;
	}

	public WebElement getAddaddressButton() {
		return addaddressButton;
	}

	public WebElement getCountryDropdown() {
		return countryDropdown;
	}
	
	
}
