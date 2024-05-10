package com.TestNGscripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_all_urls_in_page {
	
	

	@Test
	public void get_all_urls_of_page_and_print()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		driver.get("https://www.icicibank.com/");
		
	List<WebElement> listofurls= driver.findElements(By.tagName("a"));
	
     int Listsize =listofurls.size();
     System.out.println( "size of urls:-"+Listsize);
     
     for( int i=0; i < Listsize; i++)
     {
    	 System.out.println(listofurls.get(i).getText());
     }
     
     driver.quit();
	
		
		
		
		
		
		
		
		
		
	}

}
