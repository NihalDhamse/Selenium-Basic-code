package com.switchTo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		System.out.println(driver.getTitle()+"   "+driver.getCurrentUrl());
		
		driver.findElement(By.id("selenium143")).click();
		driver.findElement(By.linkText("Open a popup window")).click();
		
		
		Set<String> childId = driver.getWindowHandles();
		//System.out.println(childId);
		for(String winId: childId) {
			driver.switchTo().window(winId);
			System.out.println(driver.getTitle()+"   "+driver.getCurrentUrl());
			driver.close();
		}
		
		driver.switchTo().window(parentId);
		driver.close();
	}

}
