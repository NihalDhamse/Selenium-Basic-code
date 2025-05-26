package com.switchTo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleNewTabWindow {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		String parentId = driver.getWindowHandle();
		System.out.println(driver.getTitle()+"   "+driver.getCurrentUrl());
		
		driver.findElement(By.id("selenium143")).click();
		driver.findElement(By.linkText("compendiumdev")).click();
		
		
		/*Set<String> childId = driver.getWindowHandles();
		for(String winId: childId) {
			driver.switchTo().window(winId);
			System.out.println(driver.getTitle()+"   "+driver.getCurrentUrl());
			driver.close();
		}*/
		
		switchToWindow(driver, "Selenium143");
		
		driver.switchTo().window(parentId);
		driver.close();
	}
	
	  public static void switchToWindow(WebDriver driver, String targetTitle) {
	        Set<String> windowHandles = driver.getWindowHandles();

	        for (String handle : windowHandles) {
	            driver.switchTo().window(handle);
	            if (driver.getTitle().equals(targetTitle)) {
	            	System.out.println(driver.getCurrentUrl());
	            	driver.findElement(By.linkText("What is Selenium?")).click();
	            	System.out.println(driver.getCurrentUrl());
	                driver.close();
	               return;
	            }
	        }
	       // throw new IllegalArgumentException("No window found with the title: " + targetTitle);
	    }

}
