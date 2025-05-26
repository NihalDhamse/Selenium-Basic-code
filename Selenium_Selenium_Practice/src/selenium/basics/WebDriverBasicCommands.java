package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasicCommands {
	public static void main(String[] args) {
		
		WebDriver driver;
		 
		driver= new ChromeDriver();
		 driver.get("https://www.google.com");
		 driver.manage().window().maximize();
		 
		 System.out.println(driver.getTitle());
		 		 
		 System.out.println( driver.getCurrentUrl());
		 
		 String pageSource = driver.getPageSource();
		 System.out.println(pageSource);
				 
		 driver.close();
		 
		 driver = new FirefoxDriver();
		 
		 driver.get("https://www.facebook.com");
		 
		 System.out.println(driver.getTitle());
 		 
		 System.out.println( driver.getCurrentUrl());
		 driver.close();
	}

}
