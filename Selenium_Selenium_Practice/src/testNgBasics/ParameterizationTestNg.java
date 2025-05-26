package testNgBasics;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationTestNg {
	
	@Test
	@Parameters({"username","password"})
	public void login(@Optional("moanli@gmail.com" )String uname, @Optional("monali54231")String upassword) {
		System.out.println(uname + "  "+ upassword);
	}

}
