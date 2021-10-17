package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Images {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijay\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
	
		WebElement img1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img"));
		//img1.click();
		if(img1.getAttribute("naturalWidth").equals("0"))
			System.out.println("image is broken");
		else
			System.out.println("image is not broken");
		
		driver.navigate().back();
		
		WebElement img2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
		//naturalwidth attribute is 0, then image is broken
		
		if(img2.getAttribute("naturalWidth").equals("0"))
			System.out.println("image is broken");		
		else
			System.out.println("image is not broken");
		
		Actions action = new Actions(driver);
		
		WebElement img3 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/img"));
		
		action.click(img3).perform();
		//action.clickAndHold(From).moveToElement(To).release(To).build().perform();
		
		//action.dragAndDrop(From, To).build().perform();
	}

}
