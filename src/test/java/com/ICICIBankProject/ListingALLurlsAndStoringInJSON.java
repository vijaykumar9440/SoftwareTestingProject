package com.ICICIBankProject;



import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListingALLurlsAndStoringInJSON {

    @Test
    public void ListingAllurl_Page_and_storing_in_JSON() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.icicibank.com/");

        // Cast WebDriver instance to JavascriptExecutor
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        // Execute JavaScript to get all anchor elements on the page
        List<WebElement> anchorElements = (List<WebElement>) jsExecutor
                .executeScript("return document.getElementsByTagName('a');");

        // Create a JSONArray to store URLs
        JSONArray urlArray = new JSONArray();

        // Iterate through anchor elements to extract URLs
        for (WebElement element : anchorElements) {
            String url = element.getAttribute("href");
            if (url != null && !url.isEmpty()) {
                // Create a JSONObject for each URL and add it to the JSONArray
                JSONObject urlObject = new JSONObject();
                urlObject.put("url", url);
                urlArray.add(urlObject);
            }
        }

        // Close the browser window
        driver.quit();

        // Print the JSON array
        System.out.println(urlArray.toJSONString());
    }
}