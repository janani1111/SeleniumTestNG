package Selenium;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/mouseOver.html");
		
		WebElement course = driver.findElement(By.partialLinkText("Course"));
		Actions action = new Actions(driver);
		action.moveToElement(course).perform();
		
		WebElement Selenium = driver.findElement(By.partialLinkText("Selenium"));
		Selenium.click();
		
		driver.switchTo().alert().accept();
		
		//driver.switchTo().defaultContent();
		action.moveToElement(course).perform();
		
		WebElement RPA = driver.findElement(By.partialLinkText("RPA"));
		RPA.click();
		
		
		
		driver.switchTo().alert().accept();
		
		
	}

}
