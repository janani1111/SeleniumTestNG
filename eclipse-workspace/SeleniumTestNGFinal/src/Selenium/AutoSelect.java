package Selenium;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import com.sun.tools.javac.util.List;

public class AutoSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		WebElement editBox = driver.findElement(By.id("tags"));
		//editBox.sendKeys("s");
		Actions action = new Actions(driver);
		action.sendKeys(editBox, "s").perform();
		
		Thread.sleep(4000);
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
	System.out.println(list.size());
	
	for (WebElement webElement : list) {
		if(webElement.getText().equals("Web Services"))
		{
			webElement.click();
			break;
		}
	}
	
	
	// editBox.clear(); 
	 //action.sendKeys(editBox, "c"+Keys.ENTER).perform();
	 
	 
	 //editBox.sendKeys("c");
	/* 
	 * Actions action = new Actions(driver); action.sendKeys("s");
	 * action.keyDown(editBox, Keys.ARROW_DOWN).click().build().perform();
	 * //action.click(); //action.sendKeys(editBox, sendKeys(Keys.ARROW_DOWN));
	 */	
	
	}

}
