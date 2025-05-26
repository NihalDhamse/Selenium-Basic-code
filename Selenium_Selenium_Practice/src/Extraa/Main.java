package Extraa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/elec-sasa-lele-flipkart-sale-new-store?param=8973&fm=neo%2Fmerchandising&iid=M_2ec1d8b1-7a02-4d86-a6c0-cabb0d4824ec_1_VMDN1VE1AUK9_MC.KCBBC8GGWR9V&otracker=hp_rich_navigation_4_1.navigationCard.RICH_NAVIGATION_Electronics_KCBBC8GGWR9V&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_4_L0_view-all&cid=KCBBC8GGWR9V");
		
		
		Thread.sleep(3000);
//		WebElement elem1=driver.findElement(By.xpath("//span[text()='Electronics']"));		
//		WebElement elem2=driver.findElement(By.xpath("//a[@title='Gaming Laptops']"));
//		
//		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[@title='Gaming Laptops']")).click();
//		Thread.sleep(3000);
		
		 WebElement  ele1 = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
	        By ele2 = By.xpath("//a[text()='Microwave Ovens']");
	        mouseActions(driver,ele1,ele2);
	        Thread.sleep(3000);
	        driver.close();
		
		
	}
	
//	static void mouseAction(WebDriver driver, WebElement elem1, WebElement elem2) {
//		new Actions(driver).moveToElement(elem1).moveToElement(elem2).click().build().perform();;
//	}
	
	 static void mouseActions(WebDriver driver, WebElement ele1,By ele2) {

	        //new Actions(driver).moveToElement(ele1).moveToElement(ele2).click().build().perform();
		    new Actions(driver).moveToElement(ele1).pause(Duration.ofSeconds(1)).perform();
		    
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    WebElement heelsLink = wait.until(ExpectedConditions.elementToBeClickable(ele2));
		    heelsLink.click();
		    
		    
	  }
	
	
	
}
