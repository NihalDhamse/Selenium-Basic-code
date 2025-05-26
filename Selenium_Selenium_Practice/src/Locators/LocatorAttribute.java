package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorAttribute {
	
	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.xpath("(//div[@class='_6luv _52jv']//input/attribute::placeholder)[1]"));
		
		System.out.println(ele.getAttribute("placeholder"));

		driver.close();

	}

}
