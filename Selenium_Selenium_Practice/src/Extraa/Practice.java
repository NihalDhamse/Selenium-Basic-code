package Extraa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(day).click().perform();
		
		List<WebElement> daydd = driver.findElements(By.xpath("//select[@name='birthday_day']/option[@value]"));
		
		for (WebElement ele: daydd) {
			
			if(ele.getText().equals("10")) {
				ele.click();
				break;
			}
			
		}
		driver.close();
}
}
