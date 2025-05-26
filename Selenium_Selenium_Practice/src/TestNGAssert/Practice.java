package TestNGAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice {
	
	@BeforeTest
	public void setUp() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tools.picsart.com/text/font-generator/");
		
	}
	
	@Test
	public void test1(WebDriver driver) throws InterruptedException {
		WebElement clicks=driver.findElement(By.id("onetrust-accept-btn-handler"));
				clicks.click();
		WebElement element=driver.findElement(By.xpath("//input[@id='sticky-search-input']"));
		Actions action=new Actions(driver);
		action.moveToElement(element).click().sendKeys("Nihal").build().perform();
		
		Thread.sleep(3000);
		WebElement exp=driver.findElement(By.xpath("(//div[@class='FontRow-btnContainer-0-2-228'])[1]"));
		
		//Assert.assertEquals(act, exp, "not match");
	}
 
	
	@AfterTest
	public void tearDown(WebDriver driver) {
		driver.quit();
	}
	
	
}
