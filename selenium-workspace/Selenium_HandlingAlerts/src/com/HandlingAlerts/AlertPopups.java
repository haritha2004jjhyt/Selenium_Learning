package com.HandlingAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertPopups {

    @Test
    public void TestPopups() throws Exception {
        // Setup ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        // Page opening for test
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        
        // Simple Alert Creation
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        Thread.sleep(4000);
        alert.accept();
        //  result text validate
        String result = driver.findElement(By.cssSelector("#result")).getText();
        System.out.println(result);
        Assert.assertEquals(result, "You successfully clicked an alert");
        
        
        // Confirm Alert - dismiss
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(4000);
        alert2.dismiss();
        String result2 = driver.findElement(By.cssSelector("#result")).getText();
        System.out.println(result2);
        Assert.assertEquals(result2, "You clicked: Cancel");

        // Confirm Alert - accept
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert3 = driver.switchTo().alert();
        Thread.sleep(4000);
        alert3.accept();
        String result3 = driver.findElement(By.cssSelector("#result")).getText();
        System.out.println(result3);
        Assert.assertEquals(result3, "You clicked: Ok");
        
        
        // Confirm Alert - accept (JS Prompt)
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert4 = driver.switchTo().alert();
        Thread.sleep(4000); // to show visibly
        String inputText = "Selenium Prompt Test"; //this text will be given prompt
        alert4.sendKeys(inputText);
        alert4.accept();// Accept the prompt
        String result4 = driver.findElement(By.cssSelector("#result")).getText();// Validate the result
        System.out.println(result4);
        Thread.sleep(4000);
        Assert.assertEquals(result4, "You entered: " + inputText);

        driver.quit();        // Close browser
    }
}
