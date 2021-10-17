package testNG;

import org.testng.annotations.Test;

public class driveCar {
	//skip a test case - enabled property
	@Test(priority = 9,enabled = false)
	public void turnMusicOn()
	{
		System.out.println("Music On");
	}
	//set priority to specify working order
	//else functions will get executed in alphabetical order
	@Test(priority = 0)
	public void startTheCar()
	{
		System.out.println("Start the car");
	}
	@Test(priority = 1)
	public void firstGear()
	{
		System.out.println("Put First Gear");
	}
	@Test(priority = 2)
	public void secondGear()
	{
		System.out.println("Put Second Gear");
	}
	@Test(priority = 3)
	public void thirdGear()
	{
		System.out.println("Put Third Gear");
	}

}
