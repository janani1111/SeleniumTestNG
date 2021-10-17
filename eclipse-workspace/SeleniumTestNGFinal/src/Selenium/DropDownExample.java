package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijay\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		//1. dropdown1
		
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		
		Select select = new Select(dropdown1);
		select.selectByIndex(3);
		//Thread.sleep(2000);
		select.selectByValue("2");
		select.selectByVisibleText("Selenium");
		
		List<WebElement> optList = select.getOptions();
		//if error shows, improt util. 
		//these are called generics
		
		int size = optList.size();
		System.out.println(size);
		
		dropdown1.sendKeys("loa");
		
		//multiselectBox
		
		WebElement mutli = driver.findElement(By.xpath
				("//*[@id=\'contentblock\']/section/div[6]/select"));
	
		Select mutliSelectBox = new Select(mutli);
		//mutliSelectBox.selectByIndex(0);
		
		mutliSelectBox.selectByIndex(3);
		mutliSelectBox.selectByIndex(1);
		mutliSelectBox.selectByIndex(2);
		driver.close();
		
		
	}

}
