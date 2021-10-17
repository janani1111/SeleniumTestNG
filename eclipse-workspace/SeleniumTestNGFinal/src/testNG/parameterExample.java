package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterExample {
	@Test
	@Parameters("name")
	public void printName(String a)
	{
		System.out.println("Name is:" + a);
	}

}
