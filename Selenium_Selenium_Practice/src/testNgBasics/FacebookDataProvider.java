package testNgBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookDataProvider {
	WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		
	}
	

	
	@Test(dataProvider = "setTestData")
	public void getData(String firstname,String surname, int day, String month,int year,String gender, int mobileNum, String password) throws InterruptedException {
		
		driver.findElement(By.name("firstname")).sendKeys( firstname);
		driver.findElement(By.name("lastname")).sendKeys( surname);
		driver.findElement(By.name("birthday_day")).sendKeys(String.valueOf(day));
		driver.findElement(By.id("month")).sendKeys(month);
		driver.findElement(By.id("year")).sendKeys(String.valueOf(year));
		
		  if (gender.equalsIgnoreCase("Male")) {
              driver.findElement(By.xpath("//input[@value='2']")).click(); 
          } else if (gender.equalsIgnoreCase("Female")) {
              driver.findElement(By.xpath("//input[@value='1']")).click(); 
          } else {
              driver.findElement(By.xpath("//input[@value='-1']")).click(); 
          }
	
		driver.findElement(By.name("reg_email__")).sendKeys(String.valueOf(mobileNum));
		driver.findElement(By.name("reg_passwd__")).sendKeys( password);
		
		
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		
		//System.out.println(firstName+ "  "+obj2+ "  "+obj3+ "  "+obj4+ "  "+obj5+ "  "+obj6+ "  "+obj7+ "  "+obj8);
		
	}
	
	@DataProvider
	public Object[][] setTestData(){
		Object[][] obj = {{"Monali", "Khaire",3,"Nov",1990, "female",987425315, "monali@123"},
				{"Sanket", "Khaire",25,"Jun",1987, "male",987451285, "sanket@123"},
				{"Mitansh", "Khaire",21,"Apr",2021, "male",687425315, "mitansh@123"},
				{"bhavana", "ahire",9,"Aug",2010, "female",887425315, "bhavana@123"},
				{"nihal", "dhamse",12,"Apr",1998, "male",988745216, "nihal@123"},
				
				};
		return obj;
						
		}
	
	public static void handleDropDown(WebElement element, String visibleText) {
		
		new Select(element).selectByVisibleText("visibleText");
		
	} 
		
}


