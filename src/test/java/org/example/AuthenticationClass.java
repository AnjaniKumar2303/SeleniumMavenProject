package org.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.net.URL;

public class AuthenticationClass {

    @Test
    public void testBasicAuthentication() {
        RestAssured.baseURI = "https://postman-echo.com/basic-auth";
        RequestSpecification request = RestAssured.given().auth().basic("postman", "password");
        Response response = request.get();
        ResponseBody responseBody = response.getBody();
        System.out.println(response.getStatusLine());
        System.out.println(response.getStatusCode());
    }

    @Test
    public void testPreemptiveAuthentication() {
        RestAssured.baseURI = "https://postman-echo.com/basic-auth";
        RequestSpecification requestSpecification = RestAssured.given().auth().preemptive().basic("postman", "password");
        Response response = requestSpecification.get();
        System.out.println(response.getStatusLine());
    }

    @Test
    public void testDigestAuthentication() {
        RestAssured.baseURI = "https://postman-echo.com/basic-auth";
        RequestSpecification requestSpecification = RestAssured.given().auth().digest("postman", "password");
        Response response = requestSpecification.get();
        System.out.println(response.getStatusLine());
    }
}
