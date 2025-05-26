package testNgBasics;

import org.testng.annotations.Test;

public class DisabledTestCases {
	
	@Test (enabled = true)
	public void test1() {
		System.out.println("TEST1");
	}
	@Test
	public void test2() {
		System.out.println("TEST 2");
	}
	@Test(enabled = false)
	public void test3() {
		System.out.println("TEST 3");
	}
	@Test
	public void test4() {
		System.out.println("TEST 4");
	}
	@Test (enabled = false)
	public void test5() {
		System.out.println("TEST 5");
	}

}
