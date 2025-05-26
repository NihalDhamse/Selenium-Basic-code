package testNgBasics;

import org.testng.annotations.Test;

public class DefaultTestExecution {
	@Test
	public void login() {
		System.out.println("login test");
	}
	
	@Test
	public void create_account() {
		System.out.println("create account");
	}
	
	@Test
	public void update_account() {
		System.out.println("update account");
	}
	
	@Test
	public void logout() {
		System.out.println("logout");
	}
	
	
	

}
