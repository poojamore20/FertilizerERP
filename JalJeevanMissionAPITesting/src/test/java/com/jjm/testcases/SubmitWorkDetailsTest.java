package com.jjm.testcases;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class SubmitWorkDetailsTest {
	@Test
	public void submitWorkDetails() {

		
		
		JSONObject request = new JSONObject();
		
		request.put("work_id", "79");
		request.put("work_progress", "100");
		request.put("files[]", "79");
		request.put("remark", "Reported work progress by API Automation");
		request.put("date", "2022-06-22");
		request.put("latitude", "17.633717");
		request.put("longitude", "74.788589");
		request.put("time", "16:45");
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().
	    	header("Content-Type","application/json"). 
	    	contentType(ContentType.JSON).accept(ContentType.JSON).body(request.toJSONString()).
//         	param("username","superadmin@gmail.com").
//         	param("password","choice@123").
 		    
	    when().
	    	post("/submit_work_details").
 		    
		then().
		    statusCode(200).
	//	    body("data.id[1]", equalTo(8)). 
		    
//		    body("data.work_type", hasItems("Source","Pumps","Switch Room","Rising Main","ESR","Distribution Networks","Miscellaneous")).
	     	log().all();
		
	}

}
