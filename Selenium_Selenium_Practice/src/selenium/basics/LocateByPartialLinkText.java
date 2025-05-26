package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByPartialLinkText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		// if we dont provide full link text then driver goes by first matching node which is find by him
		
		driver.findElement(By.partialLinkText("Privacy ")).click();
		System.out.println(driver.getTitle()+"     "+driver.getCurrentUrl());
		
	//	driver.close();
		
		driver.quit(); // it will  close the all browser window which is open by driver instance
	}

}
