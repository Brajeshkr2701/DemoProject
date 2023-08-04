package JavaApi;

import io.restassured.RestAssured;

public class JiraTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="http://localhost:8080/";
		given().pathParam("id","10101").log().all().header("").body("").post("")

	}

}
