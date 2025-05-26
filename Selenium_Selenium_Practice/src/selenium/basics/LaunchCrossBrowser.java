package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class LaunchCrossBrowser {
	 static WebDriver driver;
	public static void launchBrowser( String browserName) {
	
		if(browserName.equals("Chrome")) {
			driver = new ChromeDriver();
		}else if (browserName.equals("Firefox"))
			driver = new FirefoxDriver();
		else if(browserName.equals("Edge"))
			driver = new EdgeDriver();
		else
			System.out.println("enter valid browser");
		
		
	}
	public static void main(String[] args) {
		launchBrowser("Edge");
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.close();
		
	}

}
