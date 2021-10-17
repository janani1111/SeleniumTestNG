package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijay\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		//click a option from a check box list
		WebElement java= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input"));
		java.click();
		
		//verify if an option is already selected or not
		WebElement check = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input"));
		boolean result = check.isSelected();
		System.out.println(result);
		if(result)
			System.out.println("It is checked");
		else
			System.out.println("It is not checked");
		
		//check if an option is selected; if yes, deselect it. Else leave it blank
		WebElement deSelect1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));
		if(deSelect1.isSelected())
			deSelect1.click();
		
		WebElement deSelect2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));
		if(deSelect2.isSelected())
			deSelect2.click();
		
		//select all options under a check box
		WebElement option1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[1]/input"));
		option1.click();
		
		WebElement option2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[2]/input"));
		option2.click();
		
		WebElement option3 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[3]/input"));
		option3.click();
		
		WebElement option4 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[4]/input"));
		option4.click();
		
		WebElement option5 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[5]/input"));
		option5.click();
		
	}

}
