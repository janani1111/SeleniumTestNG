package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijay\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		//Click first box
		WebElement firstBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		firstBox.click();
		Alert alert1 = driver.switchTo().alert();
		//Thread.sleep(3000);
		alert1.accept();
		
		//second box
		WebElement secondBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		secondBox.click();
		Alert alert2 = driver.switchTo().alert();
		//Thread.sleep(3000);
		alert2.dismiss();
		WebElement r = driver.findElement(By.id("result"));
		System.out.println(r.getText());
		
		//third box
		WebElement ThirdBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		ThirdBox.click();
		Alert alert3 = driver.switchTo().alert();
		//Thread.sleep(3000);
		System.out.println(alert3.getText());
		alert3.sendKeys("Hello World");
		alert3.accept();
		
		WebElement result = driver.findElement(By.xpath("//*[@id=\"result1\"]"));
		String result1 = result.getText();
		String actual1 = "You should have enjoyed learning at TestLeaf.";
		if(result1==actual1)
			System.out.println("You have left with test leaf");
		else
			System.out.println("You have pressed a different text.");
		
		
		

	
	}

}
