package com.comcast.crm.objectrepositoryutility;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpotifyBody {
WebDriver driver;
	
	public  SpotifyBody(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
 
	
	@FindBy(xpath="//input[@data-testid=\"search-input\"]")
	private WebElement searchtextField;
	
	
	@FindBy(xpath="//span[text()='Artists']")
	private WebElement artistLink;
	
	@FindBy(xpath="//div[@class=\"Q1bjJKI72VoGS6UV\"]/descendant::p[@data-encore-id=\"cardTitle\"]")
	private WebElement artistName;
	
	
	@FindBy(xpath="//div[@class=\"NILrlF6tOUcbSyzo\"]/ancestor::div[@class=\"m9t_KhZ6MI0XQj9b\"]/descendant::a[@data-testid=\"internal-track-link\"]")
	private List<WebElement> songsList;
	
	@FindBy(xpath="//div[@class=\"F_VvNCRKZ2cKj1a9\"]/child::div[@data-encore-id=\"text\"]")
	private List<WebElement> songsDuration;

	public WebElement getSearchtextField() {
		return searchtextField;
	}

	public List<WebElement> getSongsDuration() {
		return songsDuration;
	}

	public WebElement getArtistLink() {
		return artistLink;
	}


	public WebElement getArtistName() {
		return artistName;
	}

	
	public List<WebElement> getSongsList() {
		return songsList;
	}

	
}
