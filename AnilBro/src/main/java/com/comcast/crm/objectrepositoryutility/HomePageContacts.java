package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageContacts {
WebDriver driver;
	
	public HomePageContacts(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

	@FindAll({@FindBy(xpath="//a[text()='Contacts']"),@FindBy(linkText ="Contacts")})
	private WebElement ContactsLink; 

	public WebElement getContactsLink() {
		return ContactsLink;
	}

	public void logout() {
		Actions action=new Actions(driver);
		WebElement logo=driver.findElement(By.xpath("//td[@class=\"genHeaderSmall\"]/..//td[2]"));
		action.moveToElement(logo).perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
	}
	}
	




