package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataProviderExcel {
	
	String[][] data = null;
	
	@DataProvider(name="loginData")
	public String[][] loginProviderData() throws BiffException, IOException
	{
		data = getExcelDAta();
		return data;
	}
	
	
	
	
	public String[][] getExcelDAta() throws BiffException, IOException
	{
		FileInputStream excel=new FileInputStream(new File("C:\\Users\\vijay\\OneDrive\\Documents\\Book1.xls"));  
		//XSSFWorkbook workbook = new XSSFWorkbook();
		
		Workbook wb= Workbook.getWorkbook(excel);   
		
		Sheet sheet=wb.getSheet(0);  
		
		
		int row = sheet.getRows(); 
				    int col = sheet.getColumns();
				    System.out.println(row);
				    System.out.println(col);
				    
				    String testdata[][] =new String[row-1][col];
				    for(int i=1; i<row;i++) {
				    	for(int j=0; j<col;j++)
				    	{
				    		testdata[i-1][j]=sheet.getCell(j, i).getContents();
				    	}
				    }
				    
				    return testdata;
				    
	}
	@Test(dataProvider = "loginData")
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
}
