package com.EdgeBrowserCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getPageSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriver driver = new FirefoxDriver();  //for firefox opening
//		WebDriver driver = new ChromeDriver();  //for chrome opening	

		System.out.println("----Web Page Opening!!!!----");
		System.setProperty("webdriver.edge.driver",	"C:\\Users\\Haritha J\\selenium-workspace\\Selenium_WebDriver_Commands\\EdgeBrowserJars\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

	}

}
