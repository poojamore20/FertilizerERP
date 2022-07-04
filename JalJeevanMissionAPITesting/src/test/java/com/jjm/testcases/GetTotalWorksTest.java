package com.jjm.testcases;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetTotalWorksTest {

	@Test
	public void getTotalWorks() {

		
		
		JSONObject request = new JSONObject();
		
		request.put("user_id", "79");
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().
	    	header("Content-Type","application/json"). 
	    	contentType(ContentType.JSON).accept(ContentType.JSON).body(request.toJSONString()).
//         	param("username","superadmin@gmail.com").
//         	param("password","choice@123").
 		    
	    when().
	    	post("/get_total_works").
 		    
		then().
		    statusCode(200).
	//	    body("data.id[1]", equalTo(8)). 
		    
//		    body("data.work_type", hasItems("Source","Pumps","Switch Room","Rising Main","ESR","Distribution Networks","Miscellaneous")).
	     	log().all();
		
	}
}
