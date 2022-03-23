package com.automation_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;



public class Base_Class {
	
	public static WebDriver driver;  // ---->null
	private static String value;
	
	
	
	public static WebDriver browser_configuration(String type) {
		
		if (type.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver2.exe");
			
			driver= new ChromeDriver();
			
			
		} else if (type.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.chrome.driver","value");
			
			driver= new FirefoxDriver();

		}
		
		  driver.manage().window().maximize();
		
		  return driver;
		
	}
	
	
	
	public static  void clickonElement( WebElement element) {
		
		element.click();

	}
	
	public static void userinput(WebElement element, String data) {
		
		element.sendKeys( data);
	}
	
    public static void geturl(String url) {
    	driver.get(url);  	
	}
	
    
	public static  void javascript( WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",element);

	}
	
	
	public static void clearelement(WebElement element ) {
		
		element.clear();
	}
	
	public static void dropdown(String type, WebElement element, String Value ) {
		
		Select s = new Select (element);
		
		if (type.equalsIgnoreCase("byValue")) {
		 s.selectByValue(Value);
	  }
	   else if(type.equalsIgnoreCase("byText")){
		
		 s.selectByVisibleText(Value);
	  }
	   else if (type.equalsIgnoreCase("byIndex"))	{
		 int index = Integer.parseInt(Value);
		 s.selectByIndex(index);
	  }
	
	}
	
	public static void sleepmethod(long mills) throws InterruptedException  {
		Thread.sleep(mills);
		

	}
	
	public static void implicitwait( int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}
	
	public static String particular_Data( String path, int row_Index, int cell_Index) throws IOException {
		
		 File f = new File (path);
	     
	     FileInputStream fis = new FileInputStream(f);
	     
	     Workbook wb = new XSSFWorkbook(fis);          
	     
	     org.apache.poi.ss.usermodel.Sheet s = wb.getSheetAt(0);
	     
	     Row r = s.getRow(row_Index);
	     
	     Cell c = r.getCell(cell_Index);
	     
	     CellType celltype = c.getCellType();
	     
	     if(celltype.equals(CellType.STRING)) {
	    	 value = c.getStringCellValue();
	    	
	     }
		
	     else if (celltype.equals(CellType.NUMERIC)) {
	    	 double numericCellValue = c.getNumericCellValue();
	    	 int val = (int) numericCellValue;
	    	 
	    	value = String.valueOf(val);
	   

	}
	
	return value;

}
	
}



