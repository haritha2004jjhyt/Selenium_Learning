package com.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationDemo {

	public static void main(String[] args) {

   //If chrome driver not found we can install it from selenium webbrowser downloads by expanding browsers option:     
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();

        // 1st: Navigate to OrangeHRM
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        
        // 2nd : Navigate to OpenCart
        driver.navigate().to("https://demo.opencart.com/");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // 3rd: Navigate to Bing
        driver.navigate().to("http://www.bing.com");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // 4th : Navigate to FreeCRM
        driver.navigate().to("https://www.freecrm.com/");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // 5th : Navigate to Half.com
        driver.navigate().to("http://www.half.ebay.com");
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // 6th : Go-back
        driver.navigate().back();
        System.out.println("After back: " + driver.getCurrentUrl());

        // 7th : Go-forward
        driver.navigate().forward();
        System.out.println("After forward: " + driver.getCurrentUrl());

        // 8th : Page refreshing
        driver.navigate().refresh();
        System.out.println("Page refreshed.");

        // 9th : Page Source Length
        String pageSource = driver.getPageSource();
        System.out.println("Page Source Length: " + pageSource.length());

        // 10th : Browser Close
        driver.quit(); //Closes entire browser
     //   driver.close(); //closes only (focused browser) separate windows
    }

}
