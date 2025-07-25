package com.seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LocatorsDemo {

    WebDriver driver;

    @Test
    public void DemoTestID() throws Exception {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Haritha J\\selenium-workspace\\Selenium_EasyCalc_TestNG\\EdgeDriverJars\\msedgedriver.exe");
        driver = new EdgeDriver();

        driver.get("https://www.easycalculation.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("googleSearchId")).sendKeys("Bangalore");
        driver.findElement(By.xpath("//button[@class='search_button']")).click();

        Thread.sleep(3000);

        // Click the first relevant search result
        driver.findElement(By.xpath("")).click();

        Thread.sleep(5000);
        driver.quit();
    }
}



