package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijay\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://leafground.com/pages/selectable.html");

		List<WebElement> selectable = driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		int listSize = selectable.size();

		System.out.println(listSize);
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(selectable.get(0)).
		click(selectable.get(3)).click(selectable.get(5)).build().perform();

		/*
		 * action.clickAndHold(selectable.get(0));
		 * action.clickAndHold(selectable.get(1));
		 * action.clickAndHold(selectable.get(2)); action.release().build().perform();
		 */
	}

}
