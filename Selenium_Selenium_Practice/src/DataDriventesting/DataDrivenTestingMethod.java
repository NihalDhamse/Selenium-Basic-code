package DataDriventesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTestingMethod {
	
	@Test(dataProvider = "TestData" )
	public void getTestData(String username, String password, String msg) {
		System.out.println(username+ " "+password+ " "+msg);
	}
	
	@DataProvider(name = "TestData")
	public String [][] createTestData() {
		
		//2-d array rows and column
		
		String [][] data= new String[4][3];
		data[0][0] = "nihal@gmail.com";
		data[0][1] = "Nihal@123";
		data[0][2] = "Succecssfully logged in";
		
		data[1][0] = "bhavan@gmail.com";
		data[1][1] = "Bhavana@123";
		data[1][2] = "Succecssfully logged in";
		
		data[2][0] = "nihal@gmail.com";
		data[2][1] = "Bhavana@123";
		data[2][2] = "Error massgae should be displayed";
		
		data[3][0] = "bhavana@gmail.com";
		data[3][1] = "Nihal@123";
		data[3][2] = "Error massgae should be displayed";
		
		return data;
	}
	
	@Test(dataProvider = "setTestData")
	public void testObjData(Object obj1, Object obj2, Object obj3, Object obj4, Object obj5) {
		
		System.out.println(obj1+ " "+obj2+ " "+obj3+" "+obj4+" "+obj5);
	}
	
	
	@DataProvider
	public Object[][] setTestData() {
		
		Object[][] obj = {
				{"Nihal@gmail.com","Nihal@123","Logged in sucess"},
				{"Nihal@gmail.com","Bhavana@123","Logged in Failed"}
		};
		return obj;
	}

}
