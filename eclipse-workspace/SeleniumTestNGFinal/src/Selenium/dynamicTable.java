package Selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/sorttable.html");
		
		 ArrayList<String> list = new ArrayList<String>();
		 //String name;
		
		List<WebElement> actual = driver.findElements(By.xpath("//td[2]"));
		for (WebElement webElement : actual) {
			System.out.println(webElement.getText());
			list.add(webElement.getText());
		}
		
		Collections.sort(list);
		
		WebElement nameSortButton = driver.findElement(By.xpath("//*[@id=\"table_id\"]/thead/tr/th[2]"));
		nameSortButton.click();
		ArrayList<String> sortedlist = new ArrayList<String>();
		List<WebElement> sorted = driver.findElements(By.xpath("//td[2]"));
		System.out.println("");
		System.out.println("this is sorted");
		System.out.println("");
		for (WebElement webElement : sorted) {
			
			System.out.println(webElement.getText());
			sortedlist.add(webElement.getText());
		}
		
		if(list.equals(sortedlist))
			System.out.println("Names are sorted");
		else
			System.out.println("Outputs doesnot match");
		
	}

}
