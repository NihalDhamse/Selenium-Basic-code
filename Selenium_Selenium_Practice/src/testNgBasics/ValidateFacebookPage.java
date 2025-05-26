package testNgBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidateFacebookPage {
	WebDriver driver;
	
	@BeforeTest
	public void initBrowser() {
		Reporter.log("open the brower",true);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		
	}
	
	@AfterTest
	public void tearDown() {
		Reporter.log("close the browser", true);
		driver.close();
	}
	
	@Test
	public void ValidateOpenURL() {
		Reporter.log("validate current url", true);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
	}
	
	@Test
	public void ValidateCurrentTitle() {
		Reporter.log("validate current title", true);
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
	}
	
	@Test
	public void validateDisplayLogo() {
		Reporter.log("validate displayed logo", true);
		Assert.assertTrue(driver.findElement(By.xpath("//img[@alt ='Facebook']")).isDisplayed());
	}

}
