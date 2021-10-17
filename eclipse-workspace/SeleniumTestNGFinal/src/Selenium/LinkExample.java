package Selenium;

import java.io.IOException;
//import java.net.HttpURLConnection;
import java.net.MalformedURLException;
//import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkExample {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vijay\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		//use link text locator
		//driver.findElement(By.linkText("Go to Home Page")).click();
		
		/*
		 * //without clicking find where the link is going to take to WebElement getURL
		 * = driver.findElement(By.xpath(
		 * "/html/body/div/div/div[3]/section/div[2]/div/div/a")); //t.click(); String
		 * URL = getURL.getAttribute("href"); System.out.println(URL);
		 */
		
		//go to link with same name, go with xpath
				WebElement ClickSameNameLink = driver.findElement(By.cssSelector("#CC0000"));
		ClickSameNameLink.click();
		
		/*
		 * String url;
		 */
		
		 //find how many links are there in a web page 
		 String url;
		 int i = 0;
		 List<WebElement> countLinks = driver.findElements(By.tagName("a")); 
		 Iterator<WebElement> n = countLinks.iterator();
		 while(n.hasNext()) 
		 { 
			 url = n.next().getAttribute("href"); 
			 i++;
			 System.out.println(url);
			 }
		 System.out.println(i);
		 /* 
		 * //check if link is broken WebElement checkLink = driver.findElement(By.xpath(
		 * "/html/body/div/div/div[3]/section/div[3]/div/div/a")); checkLink.click();
		 * HttpURLConnection con = null; //String url1 =
		 * "http://www.leafground.com/pages/error.html"; con = (HttpURLConnection)(new
		 * URL("http://www.leafground.com/pages/error.html").openConnection());
		 * //con.setRequestMethod("http://www.leafground.com/pages/error.html");
		 * con.setRequestMethod("Head"); con.connect(); int responseCode=0;
		 * if(responseCode >=400) System.out.println("Its a broken or a invalid URL");
		 * else System.out.println("It is a valid URL");
		 */
	//driver.close();
	
	}

}
