package apiTest;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class GetEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="http://dummy.restapiexample.com";
		String responseBody= given().header("Content-Type","application/json").header("Accept","application/json").
				body(payLoad.GetEmployeeMethod()).when().get("/api/v1/employee/{id}").then().log().all().assertThat().statusCode(200).extract().response().asString();
	
		JsonPath jsonPath = new JsonPath(responseBody);
		int id = jsonPath.getInt("id");
	System.out.println(id);
	}

}
