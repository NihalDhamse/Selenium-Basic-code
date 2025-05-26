package TestNGConcept;

import org.testng.annotations.Test;

public class DependsOnMethodExample {

	@Test(enabled = true)
	public void registerAccount() {
		System.out.println("user register");
	}
	
	@Test(dependsOnMethods = "registerAccount")
	public void login() {
		System.out.println(" User login ");
	}
	
	@Test(dependsOnMethods = "login")
	public void homePage() {
		System.out.println("Home Page ");
	}
	
	@Test(dependsOnMethods = "login")
	public void addProduct() {
		System.out.println("Add product");
	}
	
	@Test(dependsOnMethods = "login")
	public void payment() {
		System.out.println("Payment");
	}
	
	@Test(dependsOnMethods = {"login","payment"})
	public void shipping() {
		System.out.println("Shhiping the product");
	}
	
	@Test(dependsOnMethods = "login")
	public void logout() {
		System.out.println("Logout");
	}
}
