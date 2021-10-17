package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.server.handler.FindElement;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Calendar.html");
		
		//no hard core rule for calendar. Based on the implementation of each,
		//solutions will differ to calendars. 
		//take date month formats for instance.
		WebElement editbox1 = driver.findElement(By.id("datepicker"));
		editbox1.sendKeys("08/10/2021"+Keys.ENTER);
		//if there is a text box given, then this is the easy and best soln
		
		//editbox.clear();
		driver.navigate().refresh();
		WebElement editbox = driver.findElement(By.id("datepicker"));
		
		editbox.click();
		
		 WebElement next = driver.findElement(By.xpath("//a[@title='Next']"));
		  next.click();
		  
		  WebElement date = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		  date.click();
		 
		
	}

}
