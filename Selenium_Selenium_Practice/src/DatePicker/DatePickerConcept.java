package DatePicker;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DatePickerConcept {

	@Test
	public void test1() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void test2() {
		Assert.assertTrue(false);
	}

	@Test
	public void test3() {
		Assert.assertEquals("Nihal","Nihal ");
	}

	@Test
	public void test4() {
		Assert.assertEquals("Nihal","nihal");
	}

	@Test
	public void test5() {
		Assert.assertEquals("nihal","Nihal");
	}

	@Test
	public void test6() {
		Assert.assertTrue(false);
	}
}
