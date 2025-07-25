package com.locatorsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorsDemoID {
	
	WebDriver driver; // declared as global
	
	@Test
	public void DemoTestID() throws Exception{
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://auth.hollandandbarrett.com/u/login?state=hKFo2SAwTkFIUjhRd1BXc0daR2U2SmFmNjR4anhoRmktQ2RiM6Fur3VuaXZlcnNhbC1sb2dpbqN0aWTZIFdRWkZTQm9PY0wyTk5NLTFudkJzSDdHZFZpTC1CbjhIo2NpZNkgSmwzRWF2a010RDNpcjhLOTNSTlM4TldBVVFKcks4bnI");
	    driver.manage().window().maximize();
	    //syntax for writing id
	    driver.findElement(By.id("username")).sendKeys("jayaramanjayaraman806@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Hari@03302004");
        driver.findElement(By.xpath("//button[@name='action']")).click();

        Thread.sleep(5000);

	    driver.quit(); //closes entire chrome browser
	}


}
