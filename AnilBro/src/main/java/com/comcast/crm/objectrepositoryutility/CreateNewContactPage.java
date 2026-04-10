package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactPage {
WebDriver driver;
	
	public  CreateNewContactPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="lastname")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@name=\"account_name\"]/following::img")
	private WebElement organizationNameLogo;

	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;

	@FindBy(id="jscal_field_support_start_date")
	private WebElement supportstartDate;
	
	@FindBy(id="jscal_field_support_end_date")
	private WebElement supportendDate;
	
	public WebElement getOrganizationNameLogo() {
		return organizationNameLogo;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getSupportstartDate() {
		return supportstartDate;
	}

	public WebElement getSupportendDate() {
		return supportendDate;
	}

}
