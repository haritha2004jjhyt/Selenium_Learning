package com.WebPagesTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebPagesLaunch {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","C:\\Users\\Haritha J\\selenium-workspace\\Selenium_EdgeBrowser_Launch\\EdgeBrowserJars\\msedgedriver.exe");

        System.out.println("----Opening each site in a separate Edge window----");

        String[] urls = {
            "https://open-source-demo.orangehrmlive.com",
            "https://demo.opencart.com",
            "https://www.bing.com",
            "https://www.freecrm.com",
            "https://www.half.ebay.com"
        };

        for (String url : urls) {
            WebDriver driver = new EdgeDriver();      // Launch new Edge window
            driver.manage().window().maximize();      // Maximize window
            driver.get(url);                          // Open URL
            Thread.sleep(2000);                       // Short delay to avoid overlap (optional)
        }

        System.out.println("----All windows opened----");
    }
}
