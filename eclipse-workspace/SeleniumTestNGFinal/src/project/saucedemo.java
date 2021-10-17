package project;

import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class saucedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement loginbtn = driver.findElement(By.id("login-button"));
		loginbtn.click();
		
		WebElement menu = driver.findElement(By.id("react-burger-menu-btn"));
		menu.click();
	
		Actions act = new Actions(driver);
		
		
		WebElement about = driver.findElement(By.id("about_sidebar_link"));
		//about.click();
		act.click(about).build().perform();
		WebElement logoutbtn = driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]"));
		logoutbtn.click();

		/*
		 * String inputText = "Rozmeen"; WebElement myElement =
		 * driver.findElement(By.id("u_0_b")); String js =
		 * "arguments[0].setAttribute('value','"+inputText+"')" ((JavascriptExecutor)
		 * driver).executeScript(js, myElement);
		 */
	}

}
