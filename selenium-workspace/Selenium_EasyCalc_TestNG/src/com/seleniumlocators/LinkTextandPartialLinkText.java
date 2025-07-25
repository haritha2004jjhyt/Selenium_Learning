package com.seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class LinkTextandPartialLinkText {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void linkTest() {
        driver.get("https://www.hollandandbarrett.com/");

        // Click link by partial link text
        driver.findElement(By.partialLinkText("Vitamins")).click();

        // Find all links on the page
        List<WebElement> links = driver.findElements(By.xpath("//a"));
        int noOfLinks = links.size();
        System.out.println("No. of links in hollandandbarrett Application: " + noOfLinks);

        for (int i = 0; i < links.size(); i++) {
            System.out.println(links.get(i).getText());
        }

        // Store specific link text
        String str = links.get(1).getText();
        String str1 = "Vitamins";

        // Click on 'Vitamins' link if matched
        if (str1.equals(str)) {
            driver.findElement(By.linkText("Vitamins")).click();
            driver.findElement(By.xpath("(//a[contains(@type,'button')])[4]")).click();
        }
    }
}
