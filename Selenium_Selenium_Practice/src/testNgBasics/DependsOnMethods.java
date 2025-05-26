package testNgBasics;

import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test(priority =1 )
	public void login() {
		System.out.println("login test");
	}
	
	@Test(priority =2 )
	public void create_account() {
		System.out.println("create account");
	}
	
	@Test(priority =1 )
	public void update_account() {
		System.out.println("update account");
	}
	
	@Test(priority =3 )
	public void logout() {
		System.out.println("logout");
	}
	
	@Test
	public void deposite_amount() {
		System.out.println("deposite amount");
	}
	
	
	

}
