package com.switchTo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InternetCropWebsite {
	public static void main(String[] args) throws InterruptedException, AWTException {
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--incognito");
		
		WebDriver  driver = new ChromeDriver();
	//	driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		Robot robot = new Robot();
		
		 typeString(robot, "admin");

         // Press Tab to move to the next field
         robot.keyPress(KeyEvent.VK_TAB);
         robot.keyRelease(KeyEvent.VK_TAB);

         typeString(robot, "admin");
         robot.keyPress(KeyEvent.VK_TAB);
         robot.keyRelease(KeyEvent.VK_TAB);
         
         robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
         robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);


		Thread.sleep(2000);
		driver.close();
	}

	private static void typeString(Robot robot, String text) {
		
		for (char c : text.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);
            robot.delay(100); // Small delay for better typing simulation
        }

		
	}

}
