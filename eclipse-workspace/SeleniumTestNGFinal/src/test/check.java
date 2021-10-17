package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.gecko.driver",
		  "C:\\Users\\vijay\\Downloads\\geckodriver\\geckodriver.exe"); 
		  WebDriver driver = new FirefoxDriver(); 
		  driver.get("https://google.com");
		  driver.findElement(By.name("q")).sendKeys("hello world"+Keys.ENTER);
		  //driver.findElement(By.name("q")).sendKeys("testing"+Keys.ENTER);
		  System.out.println(" Current URL "+driver.getCurrentUrl()); //
		  System.out.println("Title " + driver.getTitle()); //
		  System.out.println("Page source "+driver.getPageSource());
		  System.out.println("Hello");
		  driver.navigate().to("https://www.youtube.com/"); driver.navigate().back();
		  driver.navigate().forward(); 
		  driver.navigate().refresh(); 
		  //driver.close();
		 
	
	}

}
