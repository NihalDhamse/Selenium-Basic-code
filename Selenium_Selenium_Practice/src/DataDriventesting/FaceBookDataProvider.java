package DataDriventesting;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FaceBookDataProvider {
	
	 @DataProvider(name = "registrationData")
	    public Object[][] getRegistrationData() {
	        return new Object[][] {
	            {"Nihal", "Dhamse", "nihal@gmail.com", "password123", "10", "May", "1988", "Male"},
	            {"Bhavana", "Ahire", "bhavana@gmail.com", "securePass!", "22", "August", "1919", "Female"},
	            {"Job", "Chahiye", "job@gmail.com", "passMike@2024", "5", "December", "1947", "Male"}
	        };
	    }

	    @Test(dataProvider = "registrationData")
	    public void createNewAccount(String firstName, String lastName, String email, String password, String day, String month, String year, String gender) throws InterruptedException {
	        WebDriver driver = new ChromeDriver();
	        try {
	            driver.manage().window().maximize();
	            driver.get("https://www.facebook.com/");

	            // Click "Create New Account" button
	            WebElement createAccountBtn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	            createAccountBtn.click();
	            Thread.sleep(2000); // Wait for form to open

	            // Fill the form
	            driver.findElement(By.name("firstname")).sendKeys(firstName);
	            driver.findElement(By.name("lastname")).sendKeys(lastName);
	            driver.findElement(By.name("reg_email__")).sendKeys(email);
	            Thread.sleep(1000); // Sometimes need to wait for re-enter email field
	            driver.findElement(By.name("reg_email_confirmation__")).sendKeys(email);
	            driver.findElement(By.name("reg_passwd__")).sendKeys(password);

	            // Select Date of Birth
	           WebElement days= driver.findElement(By.xpath("//select[@id=\"day\"]"));
	           Select select1=new Select(days);
	           select1.selectByVisibleText(day);
	           
	           WebElement months=driver.findElement(By.xpath("//select[@id=\"month\"]"));
	           Select select2=new Select(months);
	           select2.selectByVisibleText(month);
	           
	           WebElement years= driver.findElement(By.xpath("//select[@id=\"year\"]"));
	           Select select3=new Select(years);
	           select3.selectByVisibleText(year);

	            // Select Gender
	            if (gender.equalsIgnoreCase("Male")) {
	                driver.findElement(By.xpath("//input[@value='2']")).click(); // Male radio button
	            } else if (gender.equalsIgnoreCase("Female")) {
	                driver.findElement(By.xpath("//input[@value='1']")).click(); // Female radio button
	            } else {
	                driver.findElement(By.xpath("//input[@value='-1']")).click(); // Custom gender
	            }

	            Thread.sleep(3000); // just to observe before closing

	            // (Optional) Click on "Sign Up" button
	            // driver.findElement(By.name("websubmit")).click();

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            driver.quit();
	        }
	    }

}
