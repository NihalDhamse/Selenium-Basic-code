package DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverWindowsMethod {
	
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://amazon.in");
		
		driver.manage().window().maximize();
		
		String getTitle=driver.getTitle();
		System.out.println("Get Titile of the webPage :  "+driver.getTitle());
		
		System.out.println("Get Text of the webPage :" );
	}

}
