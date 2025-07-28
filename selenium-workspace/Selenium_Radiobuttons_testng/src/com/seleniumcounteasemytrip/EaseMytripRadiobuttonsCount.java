package com.seleniumcounteasemytrip;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class EaseMytripRadiobuttonsCount {

	 @Test
	    public void selectAndCountRadioButtons() throws InterruptedException {
	        // Launch Chrome
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        // Open the website
	        driver.get("https://www.easemytrip.com");

	        // Wait for page elements to load
	        Thread.sleep(5000);

	        // Find all radio buttons using type='radio'
	        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));
	        System.out.println("Total radio buttons found: " + radioButtons.size());

	        // Click each radio button one by one
	        for (int i = 0; i < radioButtons.size(); i++) {
	            WebElement radio = radioButtons.get(i);
	            // Scroll into view if necessary and click
	            if (radio.isDisplayed() && radio.isEnabled()) {
	                radio.click();
	                System.out.println("Clicked Radio Button " + (i + 1));
	                Thread.sleep(1000); // Small delay to see the click
	            }
	        }

	        // Close browser
	        driver.quit();
	    }
}