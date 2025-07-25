package com.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateurl {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://www.google.co.in");
        String URL = driver.getCurrentUrl();
        System.out.println(URL);

        // Navigate to Yahoo
        driver.navigate().to("https://login.yahoo.com/");
        URL = driver.getCurrentUrl();
        System.out.println(URL);

        // Navigate back to Google
        driver.navigate().back();
        URL = driver.getCurrentUrl();
        System.out.println(URL);

        // Close the browser
        driver.quit();
    }
		

}
