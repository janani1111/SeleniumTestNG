package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijay\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://leafground.com/pages/Button.html");
		
		//1. get location
		WebElement getLocationButton = driver.findElement(By.id("position"));
		getLocationButton.getLocation();
		org.openqa.selenium.Point xypoint = getLocationButton.getLocation();
		int a = xypoint.getX();
		int b = xypoint.getY();
		System.out.println(a+" "+b);
		
		//2. get button color
		WebElement color=driver.findElement(By.id("color"));
		String abc = color.getCssValue("background-color");
		System.out.println(abc);
		
		//3. find the size of a button
		WebElement size = driver.findElement(By.id("size"));
		int h = size.getSize().getHeight();
		int w = size.getSize().getWidth();
		System.out.println(h+" "+w);
		
		//button click
		WebElement home = driver.findElement(By.id("home"));
		home.click();	
		
		
		
		driver.quit(); 
		
		

	}

}
