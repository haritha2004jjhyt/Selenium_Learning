package com.seleniumradiobuttons;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;

public class FaceBookLocators {

    @Test
    public void TestRadioBtn() throws Exception {
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Maximize browser window and navigate to URL
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/campaign/landing.php");

        // Select the "Female" radio button
        driver.findElement(By.xpath("//label[normalize-space()='Female']")).click();
        Thread.sleep(5000);

        // Select the "Male" radio button
        driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
        Thread.sleep(5000);

        
//        List<WebElement> radioButtonsById = driver.findElements(By.xpath("//span[starts-with(@id, 'u_0_') and contains(@data-name, 'gender_wrapper')]"));
//        System.out.println("Number Of Gender Radio Buttons by ID: " + radioButtonsById.size());

        List<WebElement> radiobtn = driver.findElements(By.xpath("//input[@name='sex']"));
        System.out.println("Number Of Radio Buttons..... " + radiobtn.size());
        // Count the number of radio buttons for gender
//        List<WebElement> radiobtn = driver.findElements(By.xpath("//div[normalize-space()='Gender']"));
//        System.out.println("Number Of Radio Buttons..... " + radiobtn.size());

        // Close browser
        driver.quit();
    }
}
