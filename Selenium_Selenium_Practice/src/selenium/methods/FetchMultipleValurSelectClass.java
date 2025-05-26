package selenium.methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FetchMultipleValurSelectClass {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement day = driver.findElement(By.id("day"));
		getAllOption(day, "4");
		Thread.sleep(3000);
		
		driver.close();
		
	}
	
	static void getAllOption(WebElement dropDown, String value) {
		
		List<WebElement> ele = new Select(dropDown).getOptions();
		
		for(WebElement options: ele) {
			if(options.getText().equals(value)) {
				options.click();
			break;
			}
		}
	}

}


// handle without select class
//utility method for select class