package JavaApi;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Basicssss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Add place->Update place with New Address->Get Place to validate if New Address is present in response
		


		RestAssured.baseURI="https://rahulshettyacademy.com";
			
		String response=given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
			.body("{\r\n"
					+ "  \"location\": {\r\n"
					+ "    \"lat\": -38.383494,\r\n"
					+ "    \"lng\": 33.427362\r\n"
					+ "  },\r\n"
					+ "  \"accuracy\": 50,\r\n"
					+ "  \"name\": \"Frontline house\",\r\n"
					+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
					+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
					+ "  \"types\": [\r\n"
					+ "    \"shoe park\",\r\n"
					+ "    \"shop\"\r\n"
					+ "  ],\r\n"
					+ "  \"website\": \"http://google.com\",\r\n"
					+ "  \"language\": \"French-IN\"\r\n"
					+ "}\r\n"
					+ "").when().post("/maps/api/place/add/json")
			//Assertions based on body	
			.then().assertThat().statusCode(200).body("scope", equalTo("APP"))
			//Assetions based on headers
			.headers("server","Apache/2.4.41 (Ubuntu)")
			//Extract whole response in to string
			.extract().response().asString();
			
			//Add place->Update place with New Address->Get Place to validate if New Address is present in response
		System.out.println(response);
		JsonPath js=new JsonPath(response);//For parsing Json
	String placeId=js.getString("place_id");
	System.out.println(placeId);
	

	
	
			

	}

}
