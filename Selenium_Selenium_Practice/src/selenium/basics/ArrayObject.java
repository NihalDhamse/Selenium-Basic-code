package selenium.basics;

public class ArrayObject {
	
	public static void main(String[] args) {
		ArrayObjectExample[] obj = new ArrayObjectExample[3];
		
		obj[0] = new ArrayObjectExample(1, "asdf", 10000d);
		obj[1] = new ArrayObjectExample(2, "ghjk",20000d);
		obj[2] = new ArrayObjectExample(3 , "zxcv", 30000d);
		
		for(ArrayObjectExample arr: obj) {
			System.out.println(arr.a_id+" " + arr.a_name+"   "+arr.a_salary);
		}
		
		String[] arr = {"MONALI","Bhavana"};
		for(String arr1: arr)
			System.out.println(arr1);
	}

}
