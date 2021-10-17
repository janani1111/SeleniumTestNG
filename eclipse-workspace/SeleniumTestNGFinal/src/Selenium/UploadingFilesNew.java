package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadingFilesNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijay\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/upload-download");
		
		driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\vijay\\Downloads\\testleaf.xlsx");
		
	}

}
