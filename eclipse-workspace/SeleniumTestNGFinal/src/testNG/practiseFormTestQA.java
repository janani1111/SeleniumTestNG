package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class practiseFormTestQA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		
		
		
		

		
		WebElement subjects = driver.findElement(By.xpath("//*[@id=\"subjectsInput\"]"));
		subjects.sendKeys("Maths");
		//find the input feild and then copy xpath
		
		
		
	//	WebElement gender = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"));
		//gender.click();
		//copy xpath for input, it will tell, element not clickable, other element which will 
		//receive click is this and suggested label, and it worked.
		
		
	//calander, city, state, hobbies..	
	}

}
