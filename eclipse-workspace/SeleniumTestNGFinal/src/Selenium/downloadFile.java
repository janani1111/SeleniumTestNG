package Selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class downloadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/download.html");
		
		WebElement excel = driver.findElement(By.linkText("Download Excel"));
		excel.click();
		
		File location = new File("C:\\Users\\vijay\\Downloads");
		
		File[] totalfiles = location.listFiles();
		
		for (File file : totalfiles) {
			if(file.getName().equals("testleaf.xlsx"))
			{
				System.out.println("File present");
				break;
			}
		}
		
		WebElement pdf = driver.findElement(By.linkText("Download PDF"));
		pdf.click();
		
		//document.getElementById("").click();
		
		//WebElement text = driver.findElement(By.linkText("Download Text"));
		//text.click();
		
	}

}
