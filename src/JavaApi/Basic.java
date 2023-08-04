package JavaApi;
import static io.restassured.RestAssured.*;

import files.payload;
import io.restassured.RestAssured;





public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//validate if Add Place API is working as expected
		//given-All input details
		//when-Submit the Api-resource,http method
		//Then-validate the response
		
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body(payload.AddPlace()).when().post("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200);
		
	}

}
