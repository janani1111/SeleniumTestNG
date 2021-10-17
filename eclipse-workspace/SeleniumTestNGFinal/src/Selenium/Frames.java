package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//import com.sun.tools.javac.util.List;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijay\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/frame.html");

		driver.switchTo().frame(0);
		WebElement button1 = driver.findElement(By.id("Click"));
		button1.click();

		System.out.println(button1.getText());

		driver.switchTo().defaultContent();

		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");

		WebElement button2 = driver.findElement(By.id("Click1"));
		button2.click();

		System.out.println(button2.getText());

		driver.switchTo().defaultContent();

		List<WebElement> listNew = driver.findElements(By.tagName("iframe"));
		int n = listNew.size();

		System.out.println(n);
	}

}
