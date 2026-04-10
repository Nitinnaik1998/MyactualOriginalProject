package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInfoPage {
	
	public OrganizationInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(className="dvHeaderText")
	WebElement headerInfo;
	
	@FindBy(id="mouseArea_Organization Name")
	WebElement actOrgName;

	public WebElement getHeaderInfo() {
		return headerInfo;
	}

	public WebElement getActOrgName() {
		return actOrgName;
	}
	
}