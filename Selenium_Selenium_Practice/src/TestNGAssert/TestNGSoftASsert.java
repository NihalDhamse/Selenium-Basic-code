package TestNGAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGSoftASsert {
	
	@Test
	public void softAssert() {
		
		String act="Nihal";
		String exp="Nihal";
		SoftAssert softAssert=new SoftAssert();
		System.out.println("Before assert");
		softAssert.assertEquals(act, exp, "THis is not match name");
		System.out.println("after softassert execution");
	}
	
	@BeforeTest
	public void webSite() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void closeWindow(WebDriver driver) {
		driver.close();
	}
	
//	public static void main(String[] args) {
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com");
//		driver.manage().window().maximize();
//		
//		SoftAssert softAssert=new SoftAssert();
//		
//		//WebElement logoEle=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
//		
//		
//	}
	
	@Test
	public void pageText(WebDriver driver) {
		
		//WebElement element=driver.findElement(By.xpath("//h2[@class='_8eso']"));
		String act=driver.getCurrentUrl();
		
		System.out.println(driver.getCurrentUrl());
		
		
		
		
	}

	@Test
	public void getTitle(WebDriver driver) {
		SoftAssert softAssert=new SoftAssert();
		String act=driver.getTitle();
		String exp="Facebook – log in or sign up";
		
		softAssert.assertEquals(act, exp, "The page titile is not match");
		
	}
	
	@Test
	public void createAPage(WebDriver driver) {
		WebElement act=driver.findElement(By.xpath("//a[text()='Create a Page']"));
		String exp="Create a Page";
		Assert.assertEquals(act, exp, "Text is not match");
		
	}
	
	@Test
	public void createAccount(WebDriver driver) {
		WebElement element=driver.findElement(By.xpath("//a[text()='Sign Up']"));
		element.click();
		WebElement act=driver.findElement(By.xpath("//div[text()='Create a new account']"));
		String exp="Create a new account";
		Assert.assertEquals(act, exp," Create account text is not match");
		
	}
	
	
	
	
	
}
