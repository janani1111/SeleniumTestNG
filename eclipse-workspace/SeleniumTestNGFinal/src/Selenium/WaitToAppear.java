package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitToAppear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/appear.html");

		WebElement btn = driver.findElement(By.xpath("//*[@id=\"btn\"]"));
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.visibilityOf(btn));
		System.out.println("Button present");
		System.out.println(btn.getText());
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"wrapper\"]/div/div[3]/div[1]/button[2]")));
		
		
	}

}
