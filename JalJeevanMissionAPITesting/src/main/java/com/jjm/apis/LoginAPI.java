package com.jjm.apis;

import org.jsoup.helper.HttpConnection.Response;

public class LoginAPI {

public void doLogin() {
		
		
//		// Create a request specification 
//		RequestSpecification request= RestAssured.given();
//		
//		//Adding URI
//		request.baseUri("https://uat-jaljeevan.choicetechlab.com/api");
//		
//		// Calling GET method on URI. After hitting we get Response
//		Response response = request.get();
//		
//		// Let's print response body.
//		String resString = response.asString();
//		System.out.println("Respnse Details : " + resString);
// 
//		/*
//		 * To perform validation on response like status code or value, we need to get
//		 * ValidatableResponse type of response using then() method of Response
//		 * interface. ValidatableResponse is also an interface.
//		 */
//		ValidatableResponse valRes = response.then();
//		// It will check if status code is 200
//		valRes.statusCode(200);
//		// It will check if status line is as expected
//		valRes.statusLine("HTTP/1.1 200 OK");
}

}
