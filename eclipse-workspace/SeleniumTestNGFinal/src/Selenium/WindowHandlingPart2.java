package Selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");

		String oldWindow = driver.getWindowHandle();

		WebElement multipleWindows = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/button"));
		multipleWindows.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Set<String> newWindows = driver.getWindowHandles();

		for (String next : newWindows) 
		{
			if(!next.equals(oldWindow))
			{
				driver.switchTo().window(next);
				driver.close();
			}
		}

	}

}
