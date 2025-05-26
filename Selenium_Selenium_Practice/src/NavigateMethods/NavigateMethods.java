package NavigateMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigateMethods {

	public static void main(String[] args) {
		
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--borderless");
//		
		WebDriver driver = new ChromeDriver();
		
		
		Navigation navigate= driver.navigate();
		
		navigate.to("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
	    System.out.println(driver.getTitle()+"  <---->  " +driver.getCurrentUrl());
	    
	    driver.findElement(By.linkText("Sign Up")).click();
	    
	    navigate.forward();
	    System.out.println(driver.getTitle()+"  <---->  " +driver.getCurrentUrl());
	    
	    navigate.back();
	    System.out.println(driver.getTitle()+"  <---->  " +driver.getCurrentUrl());
	    
	    navigate.refresh();
	    System.out.println(driver.getTitle()+"  <---->  " +driver.getCurrentUrl());
	    
	    navigate.forward();
	    System.out.println(driver.getTitle()+"  <---->  " +driver.getCurrentUrl());
	    
	    navigate.refresh();
	    System.out.println(driver.getTitle()+"  <---->  " +driver.getCurrentUrl());
	    
	    driver.close();
		
	}
}
