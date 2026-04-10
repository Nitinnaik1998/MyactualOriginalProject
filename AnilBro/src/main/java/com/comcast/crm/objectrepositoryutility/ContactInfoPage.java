package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInfoPage {
	public ContactInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(className="dvHeaderText")
	WebElement headerInfo;
	
	@FindBy(id="mouseArea_Last Name")
	WebElement actlastName;
	
	@FindBy(xpath = "//td[contains(@id,'mouseArea_Organization')]")
	WebElement organization_name;

	@FindBy(id="dtlview_Support Start Date")
	WebElement actStartDate;
	
	@FindBy(id="mouseArea_Support End Date")
	WebElement actsEndDate;

	public WebElement getActStartDate() {
		return actStartDate;
	}

	public WebElement getActsEndDate() {
		return actsEndDate;
	}

	public WebElement getOrganization_name() {
		return organization_name;
	}

	public WebElement getHeaderInfo() {
		return headerInfo;
	}

	public WebElement getActlastName() {
		return actlastName;
	}

	
}
