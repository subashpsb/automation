package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page_Adactin {
public WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"location\"]")
	private WebElement locaion;
	
	@FindBy(xpath = "//*[@id=\"location\"]")
	private WebElement hotels;
	
	@FindBy(xpath ="//*[@id=\"room_type\"]" )
	private WebElement roomtype;
	
	@FindBy(xpath = "//*[@id=\"room_nos\"]")
	private WebElement noof_room;
	
	@FindBy(xpath = "//*[@id=\"datepick_in\"]")
	private WebElement checkin;
	
	@FindBy(xpath = "//*[@id=\"datepick_out\"]")
	private WebElement checkout;
	
	@FindBy(xpath = "//*[@id=\"adult_room\"]")
	private WebElement adults;
	
	@FindBy(xpath = "//*[@id=\"child_room\"]")
	private WebElement child;
	
	@FindBy(xpath = "//*[@id=\"Submit\"]")
	private WebElement search;

	public Home_Page_Adactin(WebDriver driver2) {
	    this.driver = driver2;
	    PageFactory.initElements(driver, this);
	    
	}

	public WebElement getLocaion() {
		return locaion;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNoof_room() {
		return noof_room;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearch() {
		return search;
	}
	
	

}



