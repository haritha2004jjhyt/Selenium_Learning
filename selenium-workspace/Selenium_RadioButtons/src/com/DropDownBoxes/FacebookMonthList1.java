package com.DropDownBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class FacebookMonthList1 {

    @Test
    public void FacebookMonth() throws Exception {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/campaign/landing.php");

        // Locate the 'month' dropdown
        WebElement month_Dropdown = driver.findElement(By.id("month"));
        Select month_dd = new Select(month_Dropdown);

        // Get all options from the dropdown
        List<WebElement> month_list = month_dd.getOptions();
        int total_month = month_list.size();

        System.out.println("Total months count in List : " + total_month);

        // Print each month name
        for (WebElement ele : month_list) {
            String month_name = ele.getText();
            System.out.println("Month Name: " + month_name);
        }

        driver.quit();
    }
}
