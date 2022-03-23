package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_select_page_adactin {
	

	public WebDriver driver;

	@FindBy(xpath = "//*[@id=\"radiobutton_1\"]")
	private WebElement  select1;
	
	@FindBy(xpath = "//*[@id=\"continue\"]")
	private WebElement continue1;

	public Hotel_select_page_adactin(WebDriver driver2) {
		this.driver = driver2 ;
		
		PageFactory.initElements(driver, this);
		
		
	}

	public WebElement getSelect1() {
		return select1;
	}

	public WebElement getContinue1() {
		return continue1;
	}
	
	

}
