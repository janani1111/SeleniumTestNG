package Selenium;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class uploadFile {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijay\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://leafground.com/pages/upload.html");
		
		//WebElement upload = ;
				driver.findElement(By.name("filename")).sendKeys("C:\\Users\\vijay\\Downloads\\testleaf.xlsx");
		//upload.click();
		
		/*
		 * String file = "C:\\Users\\vijay\\Downloads\\testleaf.xlsx";
		 * 
		 * StringSelection selection = new StringSelection(file);
		 * 
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,
		 * null);
		 * 
		 * Robot robot = new Robot();
		 * 
		 * robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_V);
		 * robot.keyRelease(KeyEvent.VK_V); robot.keyRelease(KeyEvent.VK_CONTROL);
		 * robot.keyPress(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_ENTER);
		 * 
		 */
	}

}
