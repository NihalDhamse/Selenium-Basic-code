package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorClassName {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement signBtn=driver.findElement(By.className("default-ltr-cache-17nnie8-StyledBrandLogo ev1dnif2"));
		System.out.println(signBtn.isDisplayed());
		System.out.println(signBtn.getText());
		driver.close();
	}

}
