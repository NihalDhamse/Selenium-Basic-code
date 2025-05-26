package selenium.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pickDate {
	public static void main(String[] args) {
		//WebDriver driver = new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("datepicker")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		
		String aMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		String aYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		String aDay = driver.findElement(By.xpath("//td[@data-handler=\"selectDay\"]/a[text()='23']")).getText();
				//click();

		
		while(!(aMonth.equals("July") && aYear.equals("2026"))) {
			
			driver.findElement(By.xpath("//a[@data-handler=\"next\"]")).click();
			aMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			aYear = driver.findElement(By.className("ui-datepicker-year")).getText();
			
		}
		driver.findElement(By.xpath("//td[@data-handler=\"selectDay\"]/a[text()='23']")).click();
		// String aDay =driver.findElement(By.xpath("//td[@data-handler=\"selectDay\"]/a[text()='23']")).getText();
	//			aDay.getText();
		//aDay.click();
		
		System.out.println("The date of calender is : " + aMonth +" " +  aYear + " " + aDay );
		driver.close();

	}

}
