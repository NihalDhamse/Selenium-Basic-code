package LaunchingBrowser;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEgdeBroswer {
	public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		driver.close();
	
	}

}
