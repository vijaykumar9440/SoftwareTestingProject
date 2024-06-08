package com.OHRMProjecct;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFunctionalityTest { 
	
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
	public void validatingLogin() throws InterruptedException {
//Browser Launch
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		
//Login with InvalidCredentials 		
		WebElement UsernameField=driver.findElement(By.xpath("//input[@name='username']"));
		UsernameField.sendKeys("Admin");
		WebElement PasswordField = driver.findElement(By.xpath("//input[@name='password']"));
		PasswordField.sendKeys("admin23");
		
		
		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		LoginButton.click();		
		
		
		//validating invalid credentials error message
		String ExpectedInvalidcredentials_error_message = "Invalid credentials";
	WebElement ActualInvalidcredentials_error_message=driver.findElement(By.class="oxd-text oxd-text--p oxd-alert-content-text");
	
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}


