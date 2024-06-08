package com.ICICIBankProject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Writing_Xpath_using_CSS_selector {
	
	@Test
	public void writtingxpathusingcss_selector()
	{
	     WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
		
		
		
		   driver.get("https://www.google.com");

	        // Find the search input field using CSS selector
	        WebElement searchInputCSS = driver.findElement(By.cssSelector("//input[@name='q']"));

	        // Find the search button using CSS selector
	        WebElement searchButtonCSS = driver.findElement(By.cssSelector("//input[@name='btnK']"));

	        // Enter search query
	        searchInputCSS.sendKeys("Selenium WebDriver");

	        // Click the search button
	        searchButtonCSS.click();

	      
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
