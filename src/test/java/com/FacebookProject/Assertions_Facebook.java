
package com.FacebookProject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions_Facebook {
	WebDriver driver;
	@Test
	public void Launchapp()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("VIJAYKUMAR",Keys.ENTER);
		

// Title assertion
		String ActualTitle =driver.getTitle();
		String ExpectedTitle = "";
		assertEquals(ActualTitle,ExpectedTitle, "title is mismatched" );
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
