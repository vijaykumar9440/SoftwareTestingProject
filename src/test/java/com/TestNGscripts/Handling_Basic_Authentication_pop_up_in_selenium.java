package com.TestNGscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Basic_Authentication_pop_up_in_selenium {
	
	
	@Test 
	public void HandlingBasicauthenticationpopupinselenium()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	String loginpagemessage	= driver.findElement(By.cssSelector("p")).getText();
		
		
		System.out.println("Loginpage message:-"+loginpagemessage);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
