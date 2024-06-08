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
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	String URL = "https://www.icicibank.com/";
	 driver.navigate().to(URL);
	  List <WebElement> Listofurls=driver.findElements(By.tagName("a"));
	  int sizeofurls =Listofurls.size();
	  System.out.println(sizeofurls);
	  
	  
	  for (int i =0; i<sizeofurls;i++) {
		  System.out.println(Listofurls.get(i).getText());
	  }
	  driver.quit();
	
	
	
	
	
	
	
	
	}

}
