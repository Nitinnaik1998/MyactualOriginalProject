package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage {
	WebDriver driver;
	public OrganizationsPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//img[@title=\"Create Organization...\"]")
	private WebElement CreateOrganizationButton;

	public WebElement getCreateOrganizationButton() {
		return CreateOrganizationButton;
	}
   public void OrganizationButton() {
	   driver.manage().window().maximize();
	   CreateOrganizationButton.click();
   }
}
