package TestNGConcept;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {

	@BeforeSuite
	public void beforeSuit() {
		System.out.println("This is beforeSuit Method");
	}
	
	@AfterMethod
	public void aeforeSuit() {
		System.out.println("This is afterSuit Method");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is beforeTest Method");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This is AfterTest Method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is beforeClass Method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is afterClass Method");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("THis is BeforeMethod");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("THis is after Method ");
	}
	
	@Test
	public void test1() {
		System.out.println("Addition of method 10+20 :" +(10+20));
	}
	
	@Test
	public void test2() {
		System.out.println("Multiplication of 5*10 :"+(5*10));
	}
	
	@Test
	public void test3() {
		System.out.println("Substraction of 10-8 :" +(10-8));
	}
	
	

}
