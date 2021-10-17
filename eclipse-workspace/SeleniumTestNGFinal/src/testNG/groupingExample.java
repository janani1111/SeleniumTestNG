package testNG;

import org.testng.annotations.Test;

public class groupingExample {
	
	/*Scenario:
	 * LEts say we have a basket full of mobile phones
	 *we need to run tests only for moto and vivo
	 * we cannot opt to disable the other brands, but have to select the reqrd ones and run them
	 *below is how we achieve it.
	 */
	
	@Test(groups = {"apple"})
	public void apple1()
	{
		System.out.println("This is apple phone 1");
	}
	@Test(groups = {"apple"})
	public void apple2()
	{
		System.out.println("This is apple phone 2");
	}
	@Test(groups = {"vivo"})
	public void vivo1()
	{
		System.out.println("This is vivo phone 1");
	}
	@Test(groups = {"vivo"})
	public void vivo2()
	{
		System.out.println("This is vivo phone 2");
	}
	@Test(groups = {"lenova"})
	public void lenova1()
	{
		System.out.println("This is lenova phone 1");
	}
	@Test(groups = {"lenova"})
	public void lenova2()
	{
		System.out.println("This is lenova phone 2");
	}
	@Test(groups = {"moto"})
	public void moto1()
	{
		System.out.println("This is moto phone 1");
	}
	@Test(groups = {"moto"})
	public void moto2()
	{
		System.out.println("This is moto phone 2");
	}
}
