package com.automation_project;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.pom_manager.Page_Object_Manager_Adactin;

public class Adactin_Runner extends Base_Class {
	
	public static WebDriver driver = browser_configuration("chrome");
	
	public static Page_Object_Manager_Adactin pom = new Page_Object_Manager_Adactin(driver);
	
	
public static void main(String[] args) throws InterruptedException, AWTException, IOException {
	
	   geturl("http://adactinhotelapp.com/index.php");
	   
	   //login_page
	   userinput(pom.get_Instance_Lp().getUsername(), particular_Data("C:\\Users\\SUBASH\\eclipse-workspace\\Mavanproject\\Adactin Test case.xlsx", 1, 5));
	   
	   userinput(pom.get_Instance_Lp().getPassword(),particular_Data("C:\\Users\\SUBASH\\eclipse-workspace\\Mavanproject\\Adactin Test case.xlsx", 2, 5));
	   
	   clickonElement(pom.get_Instance_Lp().getLogin());
	   
	   sleepmethod(3000);
	   
	   
	   //homepage
	   dropdown("byText", pom.get_Instance_Hp().getLocaion(), "London");
	   
	 //dropdown("byIndex", pom.get_Instance_Hp().getHotels(), "3");
	   
	   dropdown("byIndex", pom.get_Instance_Hp().getRoomtype(), "3");
	   
	   dropdown("byIndex",pom.get_Instance_Hp().getNoof_room(), "4");
	   
	   clearelement(pom.get_Instance_Hp().getCheckin());
	   
	   userinput(pom.get_Instance_Hp().getCheckin(), particular_Data("C:\\Users\\SUBASH\\eclipse-workspace\\Mavanproject\\Adactin Test case.xlsx", 7, 5));
	   
	   clearelement(pom.get_Instance_Hp().getCheckout());
	   
	   userinput(pom.get_Instance_Hp().getCheckout(), particular_Data("C:\\Users\\SUBASH\\eclipse-workspace\\Mavanproject\\Adactin Test case.xlsx", 8, 5));
	   
	   dropdown("byIndex", pom.get_Instance_Hp().getAdults(),"3");
	   
	   dropdown("byIndex", pom.get_Instance_Hp().getChild(), "1");
	   
	   sleepmethod(3000);
	   
	   clickonElement(pom.get_Instance_Hp().getSearch());
	   
	   
	   //select_hotel
	   clickonElement(pom.get_Instance_Hs().getSelect1());
	   
	   clickonElement(pom.get_Instance_Hs().getContinue1());
	   
	   
	   //book_hotel
	   userinput(pom.get_Instance_Bk().getFirstname(), particular_Data("C:\\Users\\SUBASH\\eclipse-workspace\\Mavanproject\\Adactin Test case.xlsx", 14, 5));
	   
	   userinput(pom.get_Instance_Bk().getLastname(), particular_Data("C:\\Users\\SUBASH\\eclipse-workspace\\Mavanproject\\Adactin Test case.xlsx", 15, 5));
	   
	   userinput(pom.get_Instance_Bk().getBiladd(), particular_Data("C:\\Users\\SUBASH\\eclipse-workspace\\Mavanproject\\Adactin Test case.xlsx", 16, 5));
	   
	   userinput(pom.get_Instance_Bk().getCardno(), particular_Data("C:\\Users\\SUBASH\\eclipse-workspace\\Mavanproject\\Adactin Test case.xlsx", 17, 5));
	   
	   dropdown("byIndex", pom.get_Instance_Bk().getCardtype(), "3");
	   
	   dropdown("ByText", pom.get_Instance_Bk().getExpairmth(), "June");
	   
	   dropdown("byText", pom.get_Instance_Bk().getExpairyr(), "2022");
	   
	   userinput(pom.get_Instance_Bk().getCvv(), particular_Data("C:\\Users\\SUBASH\\eclipse-workspace\\Mavanproject\\Adactin Test case.xlsx", 20, 5));
	   
	   sleepmethod(9000);
	   
	   clickonElement(pom.get_Instance_Bk().getBooknow());
	   
	   sleepmethod(9000);
	   
	   clickonElement(pom.get_Instance_Bk().getMyiti());
	   
	
  }

}
