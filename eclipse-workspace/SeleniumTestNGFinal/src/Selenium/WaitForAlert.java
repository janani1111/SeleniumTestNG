package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/alertappear.html");

		WebElement btn = driver.findElement(By.id("alert"));
		btn.click();
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("Alert is present");
		
		driver.switchTo().alert().accept();
	}

}
