package com.jjm.testcases;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jjm.utilities.Utilities;
import com.jjm.base.TestBase;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class LoginTest extends TestBase {

//	@BeforeClass
//	public void setup() {
//		RestAssured.baseURI = "https://reqres.in/";
//		RestAssured.basePath = "/api/";
//	}

	
//	@Test
//	public void statusCodeVerification() {
//		// request the server
//		Response response = RestAssured.get("https://uat-jaljeevan.choicetechlab.com/api/login");
//		// store the response body in string
//		String responseBody = response.getBody().asString();
//		// print the response
//		System.out.println("Response Body is =>  " + responseBody); 
//		// store the response code
//		int responseStatusCode = response.getStatusCode();
//		System.out.println("************************************************");
//		System.out.println("Status Code => " + responseStatusCode);
//		System.out.println(response.getTimeIn(TimeUnit.MILLISECONDS));
//	}
	
	//Get request
	
	@BeforeSuite
	public void setup() {
		baseURI = "https://uat-jaljeevan.choicetechlab.com/api";
	}
	
	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void login(Hashtable<String,String> data) {

		if(!data.get("runmode").equalsIgnoreCase("Y")){

			throw new SkipException("Skipping the test case as the Run mode for data set is NO");
		}
		
		JSONObject request = new JSONObject();
		
		request.put("username", data.get("username"));
		request.put("password", data.get("password"));
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().
	    	header("Content-Type","application/json"). 
	    	contentType(ContentType.JSON).accept(ContentType.JSON).body(request.toJSONString()).
//         	param("username","superadmin@gmail.com").
//         	param("password","choice@123").
 		    
	    when().
	    	post("/login").
 		    
		then().
		    statusCode(200).
	//	    body("data.id[1]", equalTo(8)). 
	//	    body("data.first_name", hasItems("Pooja","Komal","Kanika")).
	     	log().all();
		
	}

}
