package com.jjm.testcases;

import static io.restassured.RestAssured.given;

import org.apache.poi.util.SystemOutLogger;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class GetVillagesTest {

	@Test
	public void getVillages() {

		JSONObject request = new JSONObject();

		request.put("user_id", "79");
//		request.put("job ", "teacher");

//		System.out.println(request);
		System.out.println(request.toJSONString());

		given().
	    	header("Content-Type", "application/json").
	    	
	    when().
	    	post("https://uat-jaljeevan.choicetechlab.com/api/get_villages").
		then().
			statusCode(200).
		    log().all();
	}
}
