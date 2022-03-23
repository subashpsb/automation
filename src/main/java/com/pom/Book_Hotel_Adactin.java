package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel_Adactin {
	
public WebDriver driver;
	
	
	@FindBy(xpath = "//*[@id=\"first_name\"]")
	private WebElement firstname;
	
	@FindBy(xpath = "//*[@id=\"last_name\"]")
	private WebElement lastname;
	
	@FindBy(xpath = "//*[@id=\"address\"]")
	private WebElement biladd;
	
	@FindBy (xpath = "//*[@id=\"cc_num\"]")
	private WebElement cardno;
	
	@FindBy (xpath = "//*[@id=\"cc_type\"]")
	private WebElement cardtype;
	
	@FindBy (xpath = "//*[@id=\"cc_exp_month\"]")
	private WebElement expairmth;
	
	@FindBy(xpath = "//*[@id=\"cc_exp_year\"]")
	private WebElement expairyr;
	
	@FindBy(xpath = "//*[@id=\"cc_cvv\"]")
	private WebElement cvv;
	
	@FindBy(xpath = "//*[@id=\"book_now\"]")
	private WebElement booknow;
	
	@FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/a[2]")
	private WebElement myiti;

	public Book_Hotel_Adactin(WebDriver driver2) {
	     this.driver = driver2;
	     
	     PageFactory.initElements(driver, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getBiladd() {
		return biladd;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpairmth() {
		return expairmth;
	}

	public WebElement getExpairyr() {
		return expairyr;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public WebElement getMyiti() {
		return myiti;
	}
	
	
	


}
