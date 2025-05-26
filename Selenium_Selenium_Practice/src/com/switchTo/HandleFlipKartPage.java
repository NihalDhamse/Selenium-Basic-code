package com.switchTo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleFlipKartPage {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	//driver.findElement(By.xpath("https://www.flipkart.com/fk-sasalele-sale-tv-and-appliances-may25-at-store?param=3783&fm=neo%2Fmerchandising&iid=M_87dbfbea-d06b-4274-941d-1e593e066778_1_VMDN1VE1AUK9_MC.8TVKUWT87M16&otracker=hp_rich_navigation_3_1.navigationCard.RICH_NAVIGATION_TVs%2B%26%2BAppliances_8TVKUWT87M16&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_3_L0_view-all&cid=8TVKUWT87M16"));
	
	driver.findElement(By.xpath("//span[@class='_1XjE3T']//span[text()='Electronics']")).click();
	
	Thread.sleep(3000);
	
	//WebElement tvTab = driver.findElement(By.xpath("//span[@class='TSD49J'][1]"));
	
	WebElement tvTab = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
	
	WebElement oven = driver.findElement(By.xpath("//a[text()='Microwave Ovens']"));
	
	mouseActions(driver, tvTab, oven);
	Thread.sleep(3000);
	driver.close();
	
	}
	
	static void mouseActions(WebDriver driver, WebElement ele1, WebElement ele2) {
		//new Actions(driver).moveToElement(ele1).moveToElement(ele2).click().build().perform();
		
		new Actions(driver).moveToElement(ele1).pause(Duration.ofSeconds(1)).perform();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement link = wait.until(ExpectedConditions.elementToBeClickable(ele2));
		link.click();
	}

}
