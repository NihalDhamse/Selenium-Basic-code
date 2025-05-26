package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByID {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.id("email"));
		name.sendKeys("monali@gmail.com");
		
		
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("moanli@1875");
		
		
		
		System.out.println(name.getAttribute("value"));
		
		
		
		
		driver.findElement(By.name("login")).click();
		
		driver.close();
	}

}
