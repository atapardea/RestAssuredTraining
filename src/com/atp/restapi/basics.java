package com.atp.restapi;

import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;


import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class basics {

	
	//@Test
	public void firstTest() {
		
		
		/*
		 *  given().
		 *  		request headers()
		 *  		parameters ()
		 * 			cookies ()
		 *	when ()
		 *			get(resource)
		 * 			post(resource)
		 * 			put(resource)
		 *	then () 
		 *			assert ()
		 *
		 *	extract()
		 *			getResource()
		 *
		 */
		
		
		
	RestAssured.baseURI="https://maps.googleapis.com";
	
	

		given().
			param("query","restaurants+in+Sydney").
			param("key","AIzaSyDzDxQiRZn3125gbC-9Wc23AswLSMuud_w").
		when().
			get("maps/api/place/textsearch/json").
		then().
			assertThat().statusCode(200).
			and().contentType(ContentType.JSON).
			and().body("results[0].name",equalTo( "Tetsuya's Restaurant")).
			and().body("results[0].id", equalTo("827f1ac561d72ec25897df088199315f7cbbc8ed")).
			and().header("Server", "pablo");
	
	}

	
	@Test
	public void postRequest () {
		
		
//		given().
//				queryParam("key","AIzaSyDzDxQiRZn3125gbC-9Wc23AswLSMuud_w").
//				body();
//		when().
		
	}
	
}
