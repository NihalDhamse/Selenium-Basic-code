package com.switchTo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertWithoutSwitchTo {
	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		
		
	  driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	  
	 /* Alert alert = new WebDriverWait(driver, Duration.ofSeconds(10)).
			  until(ExpectedConditions.alertIsPresent());
	  alert.accept();
	  */
	  isAlertPresent(driver).accept();
	  System.out.println();
	  driver.close();
	  
	}
	
	static Alert isAlertPresent(WebDriver driver) {
		try {
		return new WebDriverWait(driver, Duration.ofSeconds(10)).
		  until(ExpectedConditions.alertIsPresent());
		}catch(Exception e) {
			return null;
		}
	}

}
