package selenium.basics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByTagName {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
	
	
	 driver = new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
	
	List<WebElement> listOfAllLink = driver.findElements(By.tagName("a"));
	
/*	for(int i=0; i<listOfAllLink.size();i++) {
		String linkText = listOfAllLink.get(i).getText();
		System.out.println(linkText);
		if(linkText.equals("Facebook Lite")) {
			listOfAllLink.get(i).getText();
			System.out.println(driver.getTitle()+"     "+driver.getCurrentUrl());
			break;
		}
	}
	
	
	for(WebElement ele: listOfAllLink) {
		if(ele.getText().equals("Sign Up"))
		//	if(ele.getAttribute("innerHTML").equals("Sign Up")
		{
			ele.click();
			System.out.println(driver.getTitle()+"     "+driver.getCurrentUrl());
			break;
		}
	}
	
	Iterator <WebElement> itr = listOfAllLink.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next().getText());
		if(itr.next().getText().equals("Create a Page")) {
			itr.next().click();
			break;
			}
	}
	*/
	
	handleLink(listOfAllLink, "Forgotten password?");
	driver.close();

}
	
	static void handleLink(List<WebElement> list, String linkText) {
		for(WebElement ele: list) {
			if(ele.getText().equals(linkText))
				{
					ele.click();
					System.out.println(driver.getTitle());
					break;
				}
		}
	}
}