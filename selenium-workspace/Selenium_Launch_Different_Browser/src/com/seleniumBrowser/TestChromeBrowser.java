package com.seleniumBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriver driver = new FirefoxDriver();  //for firefox opening
		System.out.println("----HollandandBarrett Web Page Opening!!!!----");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hollandandbarrett.com");
		
		
	}

}
