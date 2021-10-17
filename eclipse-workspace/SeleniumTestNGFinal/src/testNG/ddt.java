package testNG;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ddt {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		
	
		
		FileInputStream excel=new FileInputStream(new File("C:\\Users\\vijay\\OneDrive\\Documents\\Book1.xls"));  
		//XSSFWorkbook workbook = new XSSFWorkbook();
		
		Workbook wb= Workbook.getWorkbook(excel);   
		
		Sheet sheet=wb.getSheet(0);  
		
		
		int row = sheet.getRows(); 
				    int col = sheet.getColumns();
				    System.out.println(row);
				    System.out.println(col);
				    
					String[] uname = new String[row];
					
					String[] pwd = new String[col];
				    
				    //String testdata[][] =new String[row-1][col];
				    
				    for(int i=0;i<row;i++)
				    {
				    	for(int j=0;j<col;j++)
				    	{
				    	  uname[i]= sheet.getCell(j, i).getContents();
				    	  pwd[i]= sheet.getCell(j,i+1).getContents();
				    	  login(uname[i],pwd[i]);
				    	}
				    	  
				    }
				    
				    
				
				
				    
	}
	
	
	
	public static void login(String uName, String pwd)
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

	}


