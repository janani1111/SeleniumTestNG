package testNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

public class assertionsExample {
	
	String name="Janani";
	boolean value=true;
	
	@Test
	public void check()
	{
		//assertEquals(name, "janani");
		assertNotEquals(name, "janani");
		assertEquals(value, true);
		/*
		 * if(name.equals("Janani")) 
		 * 	System.out.println("Equal"); 
		 * else
		 * 	System.out.println("Not equal");
		 */	}

}
