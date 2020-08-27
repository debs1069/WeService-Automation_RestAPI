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
				String id = jsonPath.getString("id");
			System.out.println(id);
	//update name,age accordingly:		
		String updatedName="test1";	
		String updatedAge="24";
		String responseBody1= given().header("Content-Type","application/json").header("Accept","application/json").
				body(payLoad.PutEmployeeMethod(updatedName,updatedAge)).when().put("/api/v1/update/{id}").then().log().all().assertThat().statusCode(200).extract().response().asString();
	
		JsonPath jsonPath1 = new JsonPath(responseBody1);
		String newName = jsonPath1.getString("name");
		String newAge=jsonPath1.getString("age");
	System.out.println(newName);
	System.out.println(newAge);
	}

}
