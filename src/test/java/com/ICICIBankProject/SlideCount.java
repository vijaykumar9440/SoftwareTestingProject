package com.ICICIBankProject;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;




@Test
public class SlideCount {
	
	public void slidecount() {
	
	
        // Setup WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Open the homepage
        driver.get("https://www.icicibank.com/");

        // Find the slider element
        WebElement slider = driver.findElement(By.xpath("//ul[@class='slick-dots']"));

        // Find all the slide elements within the slider
        int slideCount = slider.findElements(By.className("//ul[@class='slick-dots']s")).size();

        // Print the slide count
        System.out.println("Number of slides: " + slideCount);

        // Close the browser
        driver.quit();
	}
	
}
