package com.seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TagNameDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hollandandbarrett.com/");
        driver.manage().window().maximize();

        try {
            Thread.sleep(2000);
            driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        } catch (Exception e) {
            System.out.println("No cookie popup found.");
        }

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Total links: " + allLinks.size());

        for (WebElement ele : allLinks) {
            System.out.println("Displayed: " + ele.isDisplayed());
            System.out.println("Enabled: " + ele.isEnabled());
            System.out.println("Link: " + ele.getAttribute("href"));
        }

        // Click on 4th link
        WebElement ele = allLinks.get(3);
        ele.click();

        // Optionally click another link
        // allLinks.get(5).click();

        driver.quit();
    }
}
