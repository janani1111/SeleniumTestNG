package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//gecko location: "C:\\Users\\vijay\\Downloads\\geckodriver\\geckodriver.exe"
		//chrome location: "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe"
		
		//action plan
		//launch browser 1.google chrome 2.firefox
		//in any of the browser launch youtube
		//in other browser launch google
		//in google search text box, type any text and get the results page.
		//System.out.println("Hello World");
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver Pooja= new ChromeDriver();
		//Pooja.get("https://youtube.com");
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijay\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("testing"+Keys.ENTER);
	}

}
