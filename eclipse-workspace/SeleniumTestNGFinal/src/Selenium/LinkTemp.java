package Selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijay\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		
		String url;
		 int i = 0;
		 List<WebElement> countLinks = driver.findElements(By.tagName("a")); 
		 Iterator<WebElement> n = countLinks.iterator();
		 while(n.hasNext()) 
		 { 
			 url = n.next().getAttribute("href"); 
			 i++;
			 System.out.println(url);
			 }
		 System.out.println(i);
	}

}
