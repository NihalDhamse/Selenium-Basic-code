package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigationCommonds {
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		WebDriver driver = new ChromeDriver(options);
		
		Navigation navigate = driver.navigate();
		
		navigate.to("https://www.facebook.com");
		
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign Up")).click();
		
		navigate.back();
		System.out.println(driver.getCurrentUrl() + "    "+ driver.getTitle());
		
		navigate.forward();
		System.out.println(driver.getCurrentUrl() + "    "+ driver.getTitle());
		
		navigate.refresh();
		System.out.println(driver.getCurrentUrl() + "    "+ driver.getTitle());
		
		navigate.back();
		System.out.println(driver.getCurrentUrl() + "    "+ driver.getTitle());
		
		
		//driver.close();
		
	}

}
