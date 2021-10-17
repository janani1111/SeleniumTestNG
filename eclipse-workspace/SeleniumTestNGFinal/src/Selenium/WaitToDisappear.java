package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitToDisappear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijay\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://leafground.com/pages/disapper.html");
		
		

		WebElement btn = driver.findElement(By.id("btn"));
		WebDriverWait wait = new WebDriverWait(driver,20);
		if(wait.until(ExpectedConditions.invisibilityOf(btn)))
			System.out.println("Button is invisible");
		else
			System.out.println("Button is visible");

	}

}
