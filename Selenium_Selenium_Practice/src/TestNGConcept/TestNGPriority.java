package TestNGConcept;

import org.testng.annotations.Test;

public class TestNGPriority {
	
	
	@Test(priority = 1)
	public void test1() {
		System.out.println("This is my test1 method");
	}
	
	@Test(priority = 2)
	public void test2() {
		System.out.println("This is my test2 method");
	}
	
	@Test(priority = 3)
	public void test3() {
		System.out.println("This is my test3 method");
	}
	
	@Test(priority = 4)
	public void test4() {
		System.out.println("This is my test4 method");
	}
	
	@Test(priority = -1)
	public void test5() {
		System.out.println("This is my test5 method");
	}
	
	@Test(priority = -2)
	public void test6() {
		System.out.println("This is my test6 method");
	}
	
	@Test(priority = -3)
	public void test7() {
		System.out.println("This is my test7 method");
	}

	@Test
	public void test8() {
		System.out.println("This is my test8 method");
	}
}
