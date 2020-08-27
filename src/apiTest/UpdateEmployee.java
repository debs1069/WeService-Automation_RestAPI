package apiTest;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class UpdateEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI=payLoad.baseURI();
		
		String responseBody=given().header("Content-Type","application/json").header("Accept","application/json")
				.body(payLoad.CreateEmployeeMethod()).when().post("/api/v1/create").then().log().all().assertThat().statusCode(200).extract().toString();
			
				JsonPath jsonPath = new JsonPath(responseBody);
				String Age = jsonPath.getString("Age");
			System.out.println(Age);
	//we get the age from response and update name to test1  accordingly:		
		String updatedName="test1";	
		String responseBody1= given().header("Content-Type","application/json").header("Accept","application/json").
				body(payLoad.GetEmployeeMethod()).when().put("/api/v1/update/{id}").then().log().all().assertThat().statusCode(200).extract().response().asString();
	
		JsonPath jsonPath1 = new JsonPath(responseBody1);
		String newName = jsonPath1.getString("name");
	System.out.println(newName);
	}

}
