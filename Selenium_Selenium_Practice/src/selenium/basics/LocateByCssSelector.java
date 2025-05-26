package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByCssSelector {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#email")).sendKeys("monali@gmail.com");			//find by id use # 
		driver.findElement(By.cssSelector("#pass")).sendKeys("monali");
		
		System.out.println(driver.findElement(By.cssSelector("._8eso")).getText());			// find by class  use .classname
		driver.close();
			
	}

}
