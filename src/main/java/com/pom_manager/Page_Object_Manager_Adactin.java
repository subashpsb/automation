package com.pom_manager;

import org.openqa.selenium.WebDriver;

import com.pom.Book_Hotel_Adactin;
import com.pom.Home_Page_Adactin;
import com.pom.Hotel_select_page_adactin;
import com.pom.Login_page_adactin;

public class Page_Object_Manager_Adactin {
	
public WebDriver driver;
	
	
	private Login_page_adactin lp;
	
	private Home_Page_Adactin hp;
	
	private Hotel_select_page_adactin hs;
	
	private Book_Hotel_Adactin bk;
	

	
	 public Page_Object_Manager_Adactin(WebDriver driver2) {
		  this.driver = driver2;
	}

	public Home_Page_Adactin get_Instance_Hp() {
		
		if (hp== null) {
			hp = new Home_Page_Adactin (driver);
		}
	
	
	  return hp;
}

     public Book_Hotel_Adactin get_Instance_Bk() {
	  
	  if(bk== null) {
		  bk = new Book_Hotel_Adactin (driver);
		  
	  }
	return bk;
  }
  
     public Hotel_select_page_adactin get_Instance_Hs() {
	   if(hs== null) {
		   hs = new Hotel_select_page_adactin (driver); 
	   
   }
	return hs;
}

    public Login_page_adactin get_Instance_Lp() {
    	
    	if(lp== null) {
    		lp = new Login_page_adactin(driver);
    	}
		return lp;
    	
    }
   
   
   

}
