package selenium.methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleDropDownWithoutSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement day = driver.findElement(By.id("day"));
		
		
	/*	Actions actions = new Actions(driver);
		actions.moveToElement(day).click().perform();
				
		for (WebElement ele: daydd) {
			
			if(ele.getText().equals("10")) {
				ele.click();
				break;
			}
			
		}*/
	
//		WebElement month = driver.findElement(By.id("month"));
		List<WebElement> daydd = driver.findElements(By.xpath("//*[@id='day']/option"));
		List<WebElement> monthdd = driver.findElements(By.xpath("//*[@id='month']/option"));
		List<WebElement> yeardd = driver.findElements(By.xpath("//*[@id='year']/option"));
		
		
		handleDropdown(daydd, "25");
		handleDropdown(monthdd, "Jan");
		handleDropdown(yeardd, "2012");
		
		Thread.sleep(3000);
		driver.close();
		
	}
	
	public static void handleDropdown(List<WebElement> options, String value) {
		
	//	Actions actions = new Actions(driver);
	//	actions.moveToElement(ele).click().perform();
		
		for (WebElement ele1: options) {
			if(ele1.getText().equals(value)) {
				ele1.click();
				break;
			}
			
		}
		
		
	}

}
