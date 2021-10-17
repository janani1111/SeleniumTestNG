package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class edubridge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				  "C:\\Users\\vijay\\Downloads\\geckodriver\\geckodriver.exe"); 
				  WebDriver driver = new FirefoxDriver(); 
				 driver.get("https://www.edubridgeindia.com/");
				  driver.findElement(By.xpath("/html/body/header/div/div[1]/nav/div/div/div/span/button")).click();
				// driver.get("https://phptravels.com/demo/");
				// driver.findElement(By.linkText("Login")).click();
				// driver.findElement();
	}

}
