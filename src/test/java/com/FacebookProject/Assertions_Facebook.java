
package com.FacebookProject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		String ExpectedTitle = "Log in to Facebook";
		assertEquals(ActualTitle,ExpectedTitle, "title is mismatched" );
		
//Emailid input data assertion 
		  String Emailidvalue=driver.findElement(By.id("email")).getAttribute("value");
		  System.out.println(Emailidvalue);
		   String  EXPECTEDEmailidvalue = "VIJAYKUMAR";
		  assertEquals(Emailidvalue, EXPECTEDEmailidvalue, "emailid mismatched" );
		  
	/*	
  // URL assertion
		  
		  String ActualCurrentURL  = driver.getCurrentUrl();
		  String Expectedurl = "https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzE1MzM1NjI1LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
		   assertEquals(ActualCurrentURL, Expectedurl, "url ismismatched ");
		   */
		   
// error message assertion		
		 /*  
		    String ActualErrormessage= driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
		    String ExpectedErrormessage = "The password that you've entered is incorrect. Forgotten password?";
		 assertEquals(ActualErrormessage, ExpectedErrormessage, "error message assertion mismatched");
		  
		  
		  */
		  
		  
		  //Closing Browser
		 driver.quit();
		  
		  
		  
		  
		  
		 
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
