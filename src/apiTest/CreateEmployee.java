package apiTest;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;


import java.util.Properties;


public class CreateEmployee {
	//public static Properties prop;
	//Properties prop= new Properties();
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		RestAssured.baseURI=payLoad.baseURI();
		given().header("Content-Type","application/json").header("Accept","application/json")
		.body(payLoad.CreateEmployeeMethod()).when().post("/api/v1/create").then().log().all().assertThat().statusCode(200);
	
		
	}

}
