package com.EdgeBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("----Web Page Opening!!!!----");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Haritha J\\selenium-workspace\\Selenium_EdgeBrowser_Launch\\EdgeBrowserJars\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		driver.manage().window().minimize();
		
	}

}
