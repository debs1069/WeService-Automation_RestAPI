package apiTest;

public class payLoad {

	public static String baseURI() {
		String uri="http://dummy.restapiexample.com";
		return uri;
	}
	
		
public static String CreateEmployeeMethod() {
	return "{\r\n" + 
			"  \"name\": \"test\",\r\n" + 
			"  \"salary\": \"123\",\r\n" + 
			"  \"age\": \"23\",\r\n" + 
			"  \"id\": \"719\"\r\n" + 
			"}";

	}

public static String GetEmployeeMethod() {
	return "{\r\n" + 
			"\r\n" + 
			"  \"id\": \"719\",\r\n" + 
			"  \"employee_name\": \"test\",\r\n" + 
			"  \"employee_salary\": \"123\",\r\n" + 
			"  \"employee_age\": \"23\",\r\n" + 
			"  \"profile_image\":\"\"\r\n" + 
			"  \r\n" + 
			"}";
}

public static String PutEmployeeMethod(String updatedName,String updatedAge) {
	return "{ \r\n" + 
			"			\"name\":\""+updatedName+"\",\r\n" + 
			"			\"age\":\""+updatedAge+"\",\r\n" + 
			"			\"salary\": null\r\n" + 
			"		 \r\n" + 
			"			}";
}

}
