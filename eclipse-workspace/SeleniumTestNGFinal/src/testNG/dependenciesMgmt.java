package testNG;

import org.testng.annotations.Test;

public class dependenciesMgmt {
	
	//example of dependency
	//prob1:first server must be up
	//prob2:then only u can login
	
	@Test(enabled=true)
	public void tenth()
	{
		System.out.println("Tenth");
	}
	
	@Test(dependsOnMethods = "tenth")
	public void highersecondary()
	{
		System.out.println("12th");
	}
	
	@Test(dependsOnMethods = "highersecondary")
	public void engineering()
	{
		System.out.println("engineering");
	}
}
