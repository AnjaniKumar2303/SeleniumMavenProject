package org.example;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class RestAssuredJsonResponse {

    @Test
    public void testRestAssureJsonResponse() {
        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get();
        ResponseBody responseBody = response.body();
        System.out.println(responseBody.prettyPrint());
        JsonPath jsonPath = response.jsonPath();
    }
}
