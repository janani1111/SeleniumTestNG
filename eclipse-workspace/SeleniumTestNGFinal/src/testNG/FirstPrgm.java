package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstPrgm {
	
	public static WebDriver driver;
	@Test
	public void firstTest()
	{
		WebElement btn = driver.findElement(By.id("alert"));
		btn.click();
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.alertIsPresent());
	}
	@BeforeTest
	public void sampl()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/alertappear.html");

	}
	@AfterTest
	public void sample()
	{
System.out.println("Alert is present");
		
		driver.switchTo().alert().accept();
	}
}
