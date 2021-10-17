package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tictactoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				  "C:\\Users\\vijay\\Downloads\\geckodriver\\geckodriver.exe"); 
				  WebDriver driver = new FirefoxDriver(); 
			driver.get("https://selenium-apps.doselect.in/tic-tac-toe/");
			
			
			driver.findElement(By.xpath("/html/body/div/ul/li[1]")).click();	
			driver.findElement(By.xpath("//*[@id=\"game\"]/li[2]")).click();	
			driver.findElement(By.xpath("/html/body/div/ul/li[3]")).click();	
			driver.findElement(By.xpath("//*[@id=\"game\"]/li[4]")).click();	
			driver.findElement(By.xpath("/html/body/div/ul/li[5]")).click();	
			driver.findElement(By.xpath("/html/body/div/ul/li[6]")).click();	
			driver.findElement(By.xpath("/html/body/div/ul/li[7]")).click();	
			String result = driver.findElement(By.xpath("/html/body/div/div/span[1]")).getText();
			System.out.println(result);
			//driver.close();
			
			///html/body/div/ul/li[1]
	}

}
