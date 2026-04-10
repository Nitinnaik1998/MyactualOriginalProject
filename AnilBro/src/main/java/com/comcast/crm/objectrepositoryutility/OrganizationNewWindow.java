package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationNewWindow {
	
	WebDriver driver;
	public OrganizationNewWindow(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="search_txt")
	WebElement searchtextField;
	
	@FindBy(name="search")
	WebElement searchButton;
	


	public WebElement getsearchtextField() {
		return searchtextField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

		
		public void getOrgName(String organizationName)  {
	WebElement data=driver.findElement(By.xpath("//a[text()='"+organizationName+"']"));
	organizationName=data.getText();
    data.click();

	
			
		}
			
		}
	

