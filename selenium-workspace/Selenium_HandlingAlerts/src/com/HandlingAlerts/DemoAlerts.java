package com.HandlingAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoAlerts {

    @Test
    public void TestPopups() throws Exception {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open Rediffmail login page
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        // Click on 'Go' without entering credentials
        driver.findElement(By.name("proceed")).click();

        Thread.sleep(5000); // wait for the alert
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert text: " + alert.getText());

        //  alert message validation
        String text = alert.getText();
        if (text.equals("Please enter a valid user name")) {
            System.out.println("Correct alert message");
        } else {
            System.out.println("Incorrect alert message");
        }

        alert.accept();
        Thread.sleep(2000);

        driver.quit();
    }
}
