package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.sun.tools.javac.comp.Enter;

public class AlertBox2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijay\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		//fourth box
				WebElement FourthBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/button"));
				FourthBox.click();
				Alert alert4 = driver.switchTo().alert();
				Thread.sleep(3000);
				//alert4.sendKeys("Hello World");
				alert4.accept();
		
		//fifth button
				//driver.findElement(By.name("q")).sendKeys("testing"+Keys.ENTER);
				WebElement FifthButton = driver.findElement(By.xpath("//*[@id=\"btn\"]"));
				FifthButton.click();
				//FifthButton.sendKeys(Keys.ESCAPE);
				WebDriverWait wait = new WebDriverWait(driver, 15);
				 wait.until(ExpectedConditions.alertIsPresent());
				driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/button")).click();
				/*
				 * Alert alert5 = driver.switchTo().alert(); Thread.sleep(3000);
				 * //alert4.sendKeys("Hello World"); alert5.sendKeys(Keys.ESCAPE);
				 */
	}

}
