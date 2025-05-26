package com.switchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleSingleIFrame {
	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		int iframes = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println("Total number of frames" + iframes);
		
		driver.switchTo().frame(0);
		
		//driver.switchTo().frame("mce_0_ifr");
		
		//driver.switchTo().frame(By.xpath(""));
		
		WebElement text_area = driver.findElement(By.xpath("//body[@id='tinymce']/p"));
		System.out.println(text_area.getText());
		
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();
		
		driver.close();

		
	}

}
