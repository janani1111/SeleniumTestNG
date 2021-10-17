package Selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");

		List<WebElement> column = driver.findElements(By.tagName("th"));
		System.out.println("Column count= "+column.size());

		List<WebElement> row = driver.findElements(By.tagName("tr"));
		System.out.println("Column count= "+row.size());

		WebElement percent = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		System.out.println(percent.getText());

		List<WebElement> progress = driver.findElements(By.xpath("//td[2]"));

		List<Integer> numberlist = new ArrayList<>();

		for (WebElement webElement : progress) {
			String individualValue=webElement.getText().replace("%", "");
			numberlist.add(Integer.parseInt(individualValue));
		}
		System.out.println(numberlist);
		int small = Collections.min(numberlist);
		System.out.println(small);
		
		String SmallString = Integer.toString(small);
		
		String finalXpath = "//td[normalize-space()="+"\""+SmallString+"%"+"\""+"]//following::td[1]//input[@type='checkbox']";
		System.out.println(finalXpath);
		
		WebElement check = driver.findElement(By.xpath(finalXpath));
		//check.click();
		//check.click();
		
		Actions act = new Actions(driver);
		act.click(check).build().perform();
		//hw:
		//http://only-testing-blog.blogspot.com/2015/01/table-with-checkbox.html
		
	}
}
