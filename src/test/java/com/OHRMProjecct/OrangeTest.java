package com.OHRMProjecct;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeTest { 
	
	@Test
	public void openOHRMApplication()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//validate Title 
		
		String ActualTitle =driver.getTitle();
		String ExpectedTitle = "OrangeHRM";
		assertEquals(ActualTitle,ExpectedTitle, "title is mismatched");
		
		//URL Validation 

		String ActualURL =driver.getCurrentUrl();
		String ExpectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		assertEquals(ActualURL,ExpectedURL, "URL is mismatched");
			
		
	}
	
	
	
	@Test 
	public void validatingLogin() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin23");
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}


