package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class parallelExecution 
{
	@Test
	public void openGoogle()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijay\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		driver.quit();
	}
	@Test
	public void openYahoo()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijay\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://bing.com");
		driver.quit();
	}
}
