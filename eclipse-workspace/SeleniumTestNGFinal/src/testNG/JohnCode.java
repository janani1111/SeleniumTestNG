package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class JohnCode {

			
		public static WebDriver driver;
		public static long StartTime;
		public static long EndTime;
		public static long TotalTimeTaken;
		
		@BeforeSuite
		public static void Before()
		{
			StartTime = System.currentTimeMillis();
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijay\\Downloads\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://demoqa.com/automation-practice-form");
		}
		@org.testng.annotations.AfterSuite
		public static void After()
		{
			long EndTtime = System.currentTimeMillis();
			long TotalTimeTaken = EndTtime - StartTime;
			System.out.println("The time Taken for google Testcase = " + TotalTimeTaken);
		}
		@Test
		public static void EnterFirstname()
		{
			WebElement firstname = driver.findElement(By.id("firstName"));
			firstname.sendKeys("John");
		}
		@Test
		public static void EnterLastname()
		{
			WebElement lastname = driver.findElement(By.id("lastName"));
			lastname.sendKeys("Daniel");
		}
		@Test
		public static void EnterMailAddress()
		{
			WebElement mail = driver.findElement(By.id("userEmail"));
			mail.sendKeys("ijohndaniel1@gmail.com");
		}
		@Test
		public static void SelectGender()
		{
			WebElement Gender = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[3]/div[2]/div[1]/label"));
			Gender.click();
		}
		@Test
		public static void EnterMobileNumber()
		{
			WebElement MobileNumber = driver.findElement(By.id("userNumber"));
			MobileNumber.sendKeys("1234567890");
		}
		@Test
		public static void EnterDOB()
		{
			WebElement DOB = driver.findElement(By.id("dateOfBirthInput"));
			DOB.sendKeys("12 Aug 1998");
		}
		@Test
		public static void EnterSubject()
		{
			WebElement Subject = driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]"));
			Subject.sendKeys("English");
		}
		@Test
		public static void SelectHobbies()
		{
			WebElement Hobbies = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label"));
			Hobbies	.click();
		}
		@Test
		public static void UploadPicture()
		{
			WebElement Upload=driver.findElement(By.name("uploadPicture"));
			Upload.sendKeys("C:\\Users\\Asus\\Downloads\\TestCase_Zomato_orderFood.xlsx");
		}
		@Test
		public static void EnterAddress()
		{
			WebElement Address=driver.findElement(By.name("currentAddress"));
			Address.sendKeys("Dharapuram, Tamilnadu");
		}	
		}




