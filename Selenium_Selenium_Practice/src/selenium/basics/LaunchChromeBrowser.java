package selenium.basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	
  public static void main(String[] args) {
	
	 ChromeDriver driver= new ChromeDriver();
	 driver.get("https://www.google.com");
	 driver.manage().window().maximize();
	 driver.close();
}

}
