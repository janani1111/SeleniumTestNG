package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTextChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/TextChange.html");

		WebElement btn = driver.findElement(By.id("btn"));
		System.out.println(btn.getText());
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		wait.until(ExpectedConditions.textToBePresentInElement(btn,"Click ME!"));
		System.out.println("Button text changed");
	
		btn.click();
		driver.switchTo().alert().accept();
		System.out.println(btn.getText());
	}

}
