package selenium.basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFoxBrowser {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		 driver.get("https://www.google.com");
		 driver.manage().window().maximize();
		 driver.close();
	}

}
