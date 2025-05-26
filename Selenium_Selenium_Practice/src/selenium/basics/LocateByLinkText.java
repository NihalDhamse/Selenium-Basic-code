package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByLinkText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Careers")).click();
		System.out.println(driver.getTitle()+"     "+driver.getCurrentUrl());
		
	//	driver.close(); //it will close the current browser window which is open by driver instance
		
		driver.quit(); // it will  close the all browser window which is open by driver instance
	}

}
