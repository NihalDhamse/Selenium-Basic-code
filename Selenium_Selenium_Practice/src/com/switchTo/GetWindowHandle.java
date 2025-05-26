package com.switchTo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		String parentWinId= driver.getWindowHandle();
		System.out.println(parentWinId);
		
		System.out.println(driver.getTitle()+" " + driver.getCurrentUrl());
		
		
		driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']//*[name()='svg']")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/a[4]/*[name()='svg'][1]")).click();
		Thread.sleep(5000);
		
	/*	Set<String> winIds = driver.getWindowHandles();
		for(String wind:winIds) {
			if(!parentWinId.equals(wind)) {
			driver.switchTo().window(wind);
			System.out.println(wind);
			System.out.println(driver.getTitle()+ " " + driver.getCurrentUrl());
			driver.close();
			}
		}
		*/
		switchToWindow(driver,"OrangeHRM | LinkedIn" );
		driver.switchTo().window(parentWinId);
		System.out.println(parentWinId);
		System.out.println(driver.getTitle()+" "+driver.getCurrentUrl());
		driver.quit();
		//driver.close();
		
	}
	
	public static void switchToWindow(WebDriver driver, String targetTitle) {
        Set<String> windowHandles = driver.getWindowHandles();

        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
            System.out.println(driver.getTitle());
            if (driver.getTitle().equals(targetTitle)) {
            	System.out.println(driver.getCurrentUrl());
            	driver.close();
               return;
            }
        }
        throw new IllegalArgumentException("No window found with the title: " + targetTitle);
    }



}
