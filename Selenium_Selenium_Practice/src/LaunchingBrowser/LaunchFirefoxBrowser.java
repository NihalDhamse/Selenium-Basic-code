package LaunchingBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {
	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://amazone.in");
		driver.manage().window().maximize();
		
		driver.close();
	}

}
