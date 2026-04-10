package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageOrganizations {             //Rule1:Create a seperate class
	WebDriver driver;
	
	public HomePageOrganizations(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

	@FindBy(linkText="Organizations") //Rule 2:Object Creation &locate the element
	private WebElement OrganizationsLink; //Rule3

	public WebElement getOrganizationsLink() {//Rule 4:
		return OrganizationsLink;
	}
	
	public void Organization() {
		driver.manage().window().maximize();
		OrganizationsLink.click();
	}
	public void logout() {
		Actions action=new Actions(driver);
		WebElement logo=driver.findElement(By.xpath("//td[@class=\"genHeaderSmall\"]/..//td[2]"));
		action.moveToElement(logo).perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
	}
}
