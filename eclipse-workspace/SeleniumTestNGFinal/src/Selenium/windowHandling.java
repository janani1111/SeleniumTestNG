package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowHandling {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijay\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String oldWindow = driver.getWindowHandle();
		
		WebElement gotoHome = driver.findElement(By.id("home"));
		gotoHome.click();
		//String newWindow = driver.getWindowHandle();
		//driver.switchTo().window(newWindow);
		 Set<String> handles = driver.getWindowHandles(); 
		 for (String newWindow : handles) 
		 { 
			 driver.switchTo().window(newWindow); 	 
		 }
			
		WebElement editClick = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[2]/div/ul/li[1]/a"));
		editClick.click();
		driver.close();
		
		driver.switchTo().window(oldWindow);
		
		WebElement multipleWindows = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		multipleWindows.click();
		
		int countOfOpenWebPages = driver.getWindowHandles().size();
		System.out.println(countOfOpenWebPages);
		
		WebElement closeWebPages = driver.findElement(By.id("color"));
		closeWebPages.click();
		
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
