package HandlingScroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestScrollBy1 {
	WebDriver driver;
	String url = "https://www.spicejet.com/";

	@Test
	public void Test() throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
		Thread.sleep(6000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1400)");

   }
}
