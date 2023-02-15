package TestClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass2 {
	
	@BeforeClass 
	public void beforeclass()
	{
		System.out.println("Before class is called");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("After class is called");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before method is called");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("After method is called");
	}
	@Test
	public void test1() {
		System.out.println("Test1 is called");
	}
	@Test
	public void test2() {
		System.out.println("Test2 is called");
	}
	
	
	
	
	

}
