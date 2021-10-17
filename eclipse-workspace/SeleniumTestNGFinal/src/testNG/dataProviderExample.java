package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderExample {
	
	//this to pass multiple values through data providers
	  String [][] value={ 
	  		{"Admin","admin123"}, 
	  		{"Admin","se1"},
	  		{"fr2","admin123"}, 
	  		{"de1","fe2"} 
	  		};
	  @DataProvider(name="value")
		public String[][] loginDataProvider()
		{
			return value;
		}
	
	@Test(dataProvider = "value")
	public void login(String uName, String pwd)
	{
	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\vijay\\Downloads\\geckodriver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	WebElement username=driver.findElement(By.id("txtUsername"));
	username.sendKeys(uName);
	
	WebElement pass=driver.findElement(By.id("txtPassword"));
	pass.sendKeys(pwd);
	
	WebElement login=driver.findElement(By.id("btnLogin"));
	login.click();
	
	driver.quit();
	
	}
	
	//This is how you fetch data from excel and run it.
		
	
}
