package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopperStackHomePage {
	WebDriver driver;

	public ShopperStackHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Login']")
	private WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}

	@FindBy(xpath = "//a[text()='Men']")
	private WebElement men;

	public WebElement getMen() {
		return men;
	}

	@FindBy(xpath = "//a[text()='Dhotis']")
	private WebElement Dhotis;

	public WebElement getDhotis() {
		return Dhotis;
	}

	@FindBy(xpath = "//a[text()='T-shirts']")
	private WebElement tShirts;

	public WebElement getTshirts() {
		return tShirts;
	}

	@FindBy(xpath = "//a[text()='Topwear']")
	private WebElement topWear;

	public WebElement getTopWear() {
		return topWear;
	}

	@FindBy(xpath = "//a[text()='Blazers&Coats']/ancestor::aside[@class=\"men\"]/descendant::a[text()='Jackets']")
	private WebElement jockets;

	public WebElement getJockets() {
		return jockets;
	}

	@FindBy(xpath = "//a[text()='Sweatshirt']")
	private WebElement sweatShirt;

	public WebElement getSweatShirt() {
		return sweatShirt;
	}
    
	@FindBy(xpath="//a[text()='Kurtas & kurta Sets']")
	private WebElement kurtas;

	public WebElement getKurtas() {
		return sweatShirt;
	}

	@FindBy(xpath = "//a[text()='Shirts']")
	private WebElement shirts;

	public WebElement getShirts() {
		return shirts;
	}

	public void mouseoveronmen() {
		Actions action = new Actions(driver);

		action.moveToElement(men).click().perform();
		// action.moveToElement(topWear).click().perform();

	}

}
