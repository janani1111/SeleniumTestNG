package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class sortable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijay\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//String URL = "http://leafground.com/pages/sortable.html";
		
		driver.get("http://leafground.com/pages/sortable.html");
		//driver.navigate().to("http://leafground.com/pages/sortable.html");
		//driver.get(URL);
		//driver.navigate().to(URL);
		
		Actions action = new Actions(driver);
		List<WebElement> selectable = driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));

		int listSize = selectable.size();
		System.out.println(listSize);
		int i,j=1;
		for(i=0;i<listSize;i++)
			System.out.println(selectable.get(i).getText());
		for(i=0;i<listSize-1;i++)
		{
			
				WebElement from = selectable.get(j);
			String fromtext =  selectable.get(j).getText();
				WebElement to = selectable.get(i);
			String totext =  selectable.get(i).getText();
				action.dragAndDrop(from, to).perform();
			System.out.println( fromtext + " is moved to " + totext);
				j++;
				//Thread.sleep(2000);
			
		}
		for(i=0;i<listSize;i++)
			System.out.println(selectable.get(i).getText());
	}

}
