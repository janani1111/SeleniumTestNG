package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class suiteExample {
	
	//aim: open chrome and go to
	//1. google 2.bing 3.yahoo
	//close the browser
	
	
	//to reduce time, use before suite and open driver.
	//use after suite annotation to close driver and calc time.
	//in 3 diff test, have 3 diff test cases
	// collection of test cases is called a test suite.
	@Test
	public void openGoogle()
	{
		long startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.quit();
		long endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("Total time = "+totalTime);
	}

	@Test
	public void openBing()
	{
		long startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://bing.com");
		driver.quit();
		long endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("Total time = "+totalTime);
	}
	
	@Test
	public void openYahoo()
	{
		long startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://yahoo.com");
		driver.quit();
		long endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("Total time = "+totalTime);
	}
}

