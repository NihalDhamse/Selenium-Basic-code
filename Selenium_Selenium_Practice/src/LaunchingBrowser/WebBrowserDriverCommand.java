package LaunchingBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebBrowserDriverCommand {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:www.facebook.com");
		driver.manage().window().maximize();
		
		String tittle=driver.getTitle();
		System.out.println(tittle);
		
		String webURL=driver.getCurrentUrl();
		System.out.println(webURL);
		
		String webSource=driver.getPageSource();
		System.out.println(webSource);
		
		driver.close();
		
		
		driver = new EdgeDriver();
		
		String ed_title=driver.getTitle();
		System.out.println(ed_title);
		
		String ed_URL=driver.getCurrentUrl();
		System.out.println(ed_URL);
		
		String ed_Source=driver.getPageSource();
		System.out.println(ed_Source);
		
		driver.quit();
	}

}
