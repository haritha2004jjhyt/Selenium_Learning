package com.DropDownBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Facebook {
	@Test
    public void FBlaunch() throws Exception {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/campaign/landing.php");

        // Locate the "Month" dropdown by its ID
        WebElement month_Dropdown = driver.findElement(By.id("month"));

        // Use Select class to interact with dropdown
        Select month_dd = new Select(month_Dropdown);

        // Select month using index (Index 9 = October since it starts at 0)
        month_dd.selectByIndex(9);
        Thread.sleep(5000);

        // Select month using value attribute ("9" = September)
        month_dd.selectByValue("9");
        Thread.sleep(5000);

        // Select month using visible text ("Dec")
        month_dd.selectByVisibleText("Dec");
        Thread.sleep(5000);

        // Optional: close the browser
        driver.quit();
    }

}
