package com.TestNGscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromWebTable {
	@Test
	public void readdatafromwebtable() {
	
	
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();

    try {
        // Open the web page containing the table
        driver.get("https://www.worldometers.info/world-population/population-by-country/");

        // Locate the table element by its XPath
        WebElement table = driver.findElement(By.xpath("//table[@id='example2']"));

        // Get all rows from the table body
        List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));

        // Iterate through each row
        for (WebElement row : rows) {
            // Get all cells (td elements) from the current row
            List<WebElement> cells = row.findElements(By.tagName("td"));

            // Iterate through each cell and print the text content
            for (WebElement cell : cells) {
                System.out.print(cell.getText() + "\t");
            }

            // Print a newline after each row
            System.out.println();
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        // Close the WebDriver
        driver.quit();
    }
}
}
	
	
	
	
	
	
	
	
	

}
