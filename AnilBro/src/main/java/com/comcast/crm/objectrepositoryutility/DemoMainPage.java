package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoMainPage {
	public DemoMainPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSearchitemsTextField() {
		return searchitemsTextField;
	}
	
    public WebElement getSearchBox() {
		return searchBox;
	}


	@FindBy(id="small-searchterms")
	private WebElement searchitemsTextField;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchBox;
	
	
	

}
