package JavaApi;

import files.payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	JsonPath js=new JsonPath(payload.CoursePrice());
	
	//Print No of courses returned by API
	    int count= js.getInt("courses.size()");
	    System.out.println(count);
	    //Print Purchase Amount
	int totalAmount=js.getInt("dashboard.purchaseAmount");
	System.out.println(totalAmount);
	String titleFirstCourse=js.get("courses[0].title");
	System.out.println(titleFirstCourse);
	
	//Print All course titles and their respective Prices
	
	for(int i=0;i<count;i++)
	{
		
String courseTitles	=js.get("courses["+i+"].title");
System.out.println(js.get("courses["+i+"].price").toString());
System.out.println(courseTitles);
		
		
		
		
	}
	
	
		
		

	}

}
