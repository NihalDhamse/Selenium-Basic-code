package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoacteByXpath {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("monali@gmail.com");
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("monali");
	 
	 driver.findElement(By.xpath("//button[@name='login']")).click();
	 driver.close();
	 
	// xpath into css selector
}
}
