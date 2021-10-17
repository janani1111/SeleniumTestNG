package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EditExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijay\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		
		
		WebElement sendEmail = driver.findElement(By.id("email"));
		sendEmail.sendKeys("testing@gmail.com");
		
		WebElement appendText = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		appendText.sendKeys("testing@gmail.com"+Keys.TAB);
		
		String abc = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(abc);
		
		WebElement clearBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		clearBox.clear();
		
		WebElement disabledBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		/*
		 * String test = disabledBox.getAttribute("disabled"); 
		 * if(test=="true")
		 * System.out.println("Text box is not enabled"); 
		 * else
		 * System.out.println("Text box is enabled");
		 */
		
		Boolean check = disabledBox.isEnabled();
		System.out.println(check);
		driver.quit();
		
	
	}

}
