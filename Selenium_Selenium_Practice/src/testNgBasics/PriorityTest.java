package testNgBasics;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test
	public void login() {
		System.out.println("login test");
	}
	
	@Test(dependsOnMethods = "login" )
	public void create_account() {
		System.out.println("create account");
	}
	
	@Test(dependsOnMethods = {"login", "create_account"} )
	public void update_account() {
		System.out.println("update account");
	}
	
	@Test(dependsOnMethods = "update_account" )
	public void logout() {
		System.out.println("logout");
	}
	
	@Test
	public void deposite_amount() {
		System.out.println("deposite amount");
	}
	
	
	

}
