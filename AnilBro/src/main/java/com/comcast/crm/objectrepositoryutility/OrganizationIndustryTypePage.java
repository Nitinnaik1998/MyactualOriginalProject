package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationIndustryTypePage {
WebDriver driver;
	
	public OrganizationIndustryTypePage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="dtlview_Industry")
	WebElement actIndustry;
	
	
   @FindBy(id="mouseArea_Type")
   WebElement actType;

   public WebElement getActIndustry() {
	return actIndustry;
   }


   public WebElement getActType() {
	return actType;
   }
	
}
