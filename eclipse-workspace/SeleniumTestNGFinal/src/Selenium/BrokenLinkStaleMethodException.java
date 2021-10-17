package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinkStaleMethodException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijay\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		
		//use link text locator
		WebElement gotoHome =  driver.findElement(By.linkText("Go to Home Page"));
		gotoHome.click();
		
		driver.navigate().back();
		
		
		WebElement broken = driver.findElement(By.linkText("Verify am I broken?"));
		broken.click();
		
		String title = driver.getTitle();
		
		if(title.contains("404"))
			System.out.println("Link is broken");
		else
			System.out.println("link is not broken");
		
		driver.navigate().back();
		
		WebElement gotoHome1 =  driver.findElement(By.linkText("Go to Home Page"));
		gotoHome1.click(); 
		
		
		
		
		
		//org.openqa.selenium.StaleElementReferenceException - will be thrown
		//we will have identified an element before, but if we try to refresh it and then perform any openration on that element it will show an error.
		//to avoid this, find this element once again and then perform action.
		
	}

}
