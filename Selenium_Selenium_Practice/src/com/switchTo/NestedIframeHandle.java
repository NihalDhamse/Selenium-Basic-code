package com.switchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframeHandle {
	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		int iframes = driver.findElements(By.tagName("frame")).size();
		
		System.out.println("Total number of frames" + iframes);
		
		driver.switchTo().frame(0);
		
		System.out.println(driver.findElement(By.name("")));
		
		driver.quit();
		
		
	}

}
