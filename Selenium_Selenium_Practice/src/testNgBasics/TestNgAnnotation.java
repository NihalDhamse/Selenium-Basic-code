package testNgBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotation {
	
	@Test
	public void test1() {
		System.out.println("test1 method");
	}
	
	@Test
	public void test2() {
		System.out.println("test2 method");
	}
	
	@BeforeSuite
	public void  beforesuite() {
		System.out.println("Before suite ");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("after suite ");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("before test ");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("after test");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("after class");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("before  method");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method");
	}
}
