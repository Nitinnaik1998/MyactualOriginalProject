package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppersStack__Products {
	WebDriver driver;

	public ShoppersStack__Products(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='crocs']/ancestor::div[@class=\"featuredProducts_cardFooter__B8KN4\"]/descendant::button[text()='add to cart']")
	private WebElement footwearaddtoCart;

	public WebElement getFootwearaddtoCart() {
		return footwearaddtoCart;
	}
    
	@FindBy(xpath="//span[text()='tshirts']/ancestor::div[@class=\"featuredProducts_cardFooter__B8KN4\"]/descendant::button[text()='add to cart']")
	private WebElement tshirstaddtocart;

	public WebElement gettshirstaddtocart() {
		return tshirstaddtocart ;
	}
	
	@FindBy(xpath="//span[text()='nike shues']/ancestor::div[@class=\"featuredProducts_cardFooter__B8KN4\"]/descendant::button[text()='add to cart']")
	private WebElement shoesaddtocart;
	
	public WebElement gettshoesaddtocart() {
		return shoesaddtocart ;
	}
	
	@FindBy(xpath="//*[name()='svg' and @data-testid=\"ShoppingCartOutlinedIcon\"]")
	private WebElement cartIcon;

	public WebElement getCartIcon() {
		return cartIcon;
	}
	
	@FindBy(id="search")
	private WebElement searchProduct;

	public WebElement getSearchProduct() {
		return searchProduct;
	}
	
	@FindBy(xpath="//button[text()='add to cart']")
	private WebElement addtocartButton;

	public WebElement getAddtocartButton() {
		return addtocartButton;
	}
	
	@FindBy(xpath="//*[name()='svg' and @data-testid='SearchIcon']")
	private WebElement searchroductsIcon;

	public WebElement getSearchroductsIcon() {
		return searchroductsIcon;
	}
}
