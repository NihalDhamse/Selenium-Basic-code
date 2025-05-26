package selenium.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadioButton {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		WebElement femaleRadioBtn = driver.findElement(By.xpath("//input[@type='radio' and @value = '1']"));
		
		driver.findElement(By.xpath(""));
		
		selectMethod(femaleRadioBtn);
		
	
	
		Thread.sleep(3000);
		driver.close();
		
	}
	
	public static void selectMethod(WebElement element) {
		if(element.isEnabled()) {
			if(element.isDisplayed()) {
					boolean status = element.isSelected();
					if(status) {
					System.out.println("element is already selected");
					}
					else {
						element.click();
						System.out.println("element is clicked");
					}
			}
		}
	}
	
	public static boolean displayedMethod(WebElement element) {
		
		return element.isDisplayed();
		
	}
	
	public static boolean selectedMethod(WebElement element) {
		
		return element.isSelected();
		
	}

	public static boolean enabledMethod(WebElement element) {
	
	return element.isEnabled();
	
}


	




}
