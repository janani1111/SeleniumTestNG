package project;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class john {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.economycarrentals.com/en-us");
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,250)");

//				Selecting the country
				WebElement Country = driver.findElement(By.id("search-country"));
				org.openqa.selenium.support.ui.Select Value = new org.openqa.selenium.support.ui.Select(Country);
				Value.selectByVisibleText("India");
				Thread.sleep(500);

//				Select City
				WebElement City = driver.findElement(By.id("search-city"));
				org.openqa.selenium.support.ui.Select value = new org.openqa.selenium.support.ui.Select(City);
				value.selectByVisibleText("Chennai");
				Thread.sleep(50);

//				Select Location
				Thread.sleep(100);
				WebElement Location = driver.findElement(By.id("search-location-pickup"));
				Thread.sleep(100);
				Location.click();
				Thread.sleep(100);
				Location.sendKeys(Keys.ARROW_DOWN);

//				Rental Start date
				WebElement Startdate = driver.findElement(By.id("search-rental-start-date"));
				Startdate.click();
				WebElement next = driver.findElement(By.className("next"));
				next.click();
				Thread.sleep(1000);
				WebElement dateselect = driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/table/tbody/tr[3]/td[6]"));
				dateselect.click();
				
//				Rental Start Time
				WebElement Starttime = driver.findElement(By.id("search-rental-start-time"));
				Starttime.click();
				WebElement timeselect = driver.findElement(By.xpath("//*[@id=\"search-rental-start-time\"]/option[13]"));
				timeselect.click();
				
				/*
				 * // Rental End date WebElement Enddate =
				 * driver.findElement(By.id("search-rental-end-date")); Enddate.click();
				 * WebElement next1 = driver.findElement(By.xpath(
				 * "/html/body/div[6]/div/div[1]/table/thead/tr[1]/th[3]")); next1.click();
				 * WebElement dateselect1 = driver.findElement(By.xpath(
				 * "/html/body/div[6]/div/div[1]/table/tbody/tr[5]/td[6]"));
				 * dateselect1.click();
				 * 
				 	*/
				
				//Rental End Time
				WebElement Endtime = driver.findElement(By.id("search-rental-end-time"));
				Endtime.click();
				WebElement timeselect1 = driver.findElement(By.xpath("//*[@id=\"search-rental-end-time\"]/option[33]"));
				timeselect1.click();
//				Thread.sleep(50);
				
//				Search
				WebElement search = driver.findElement(By.id("search-button"));
				Actions actions = new Actions(driver);
				actions.moveToElement(search).click().build().perform();
				
//				driver.switchTo();
//				
//				WebElement popup = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div/div/div[3]/button"));
//		        popup.click();
//		        Alert okalert = driver.switchTo().alert();
//				okalert.accept();
//				
//				remove popup
				//WebElement popup = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div/div/section/article[1]/form/div/div[2]/div[3]/button"));
				//popup.click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div/div/div[3]/button")).click();
			//	actions.sendKeys(Keys.ENTER).perform();
				
				// WebDriverWait wait = new WebDriverWait(driver, 15);
				 //   wait.until(ExpectedConditions.alertIsPresent());
				// Alert okalert = driver.switchTo().alert();
			//	okalert.accept();
			

			

	}

}
