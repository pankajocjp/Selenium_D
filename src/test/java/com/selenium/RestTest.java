package com.selenium;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.*;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

public class RestTest {
	
	
	
	
	@Test
	void m1() {
		
		Response response=
		
				
				given()
				
				.when()
				.get("https://reqres.in/api/users?page=2");
		
		
		ResponseBody s=response.getBody();
		String r=s.toString();
		//System.out.println("Data = "+s.asPrettyString());
		System.out.println("Data = "+response.getBody().asPrettyString());
		
				
		
		
		
	}

}
