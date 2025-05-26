package com.switchTo;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindow {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		String parentId = driver.getWindowHandle();
		System.out.println(driver.getTitle()+"   "+driver.getCurrentUrl());
		
		//driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		System.out.println(driver.getTitle()+"   "+driver.getCurrentUrl());
		driver.get("https://www.google.com");
		
		Set<String> windowsId = driver.getWindowHandles();
		
		for(String id: windowsId) {
			if(!parentId.equals(id)) {
				driver.switchTo().window(id);
				System.out.println(driver.getTitle()+"   "+driver.getCurrentUrl());
				driver.close();
			}
		}
		driver.switchTo().window(parentId);
		driver.close();
		
	//	//*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[1]
		
		
		
	}

}
