package com.TestNGscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllSyntax {
	@Test
 
	public void allsyntax()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		
		
		driver.get("https://www.facebook.com/");
		
		File screenshot((TakeScreenshot)driver)
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
