package apiTest;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class GetEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI=payLoad.baseURI();
		String responseBody= given().header("Content-Type","application/json").header("Accept","application/json").
				body(payLoad.GetEmployeeMethod()).when().get("/api/v1/employee/{id}").then().log().all().assertThat().statusCode(200).extract().response().asString();
	
		JsonPath jsonPath = new JsonPath(responseBody);
		String name = jsonPath.getString("name");
//validate name from response:		
	System.out.println(name);
	
	if(name.equals("test")) {
		System.out.println("name validated");
	}
	}

}
