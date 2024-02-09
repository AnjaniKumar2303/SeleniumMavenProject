package org.example;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.List;

public class RestAssuredResponseBody {

    @Test
    public  void testResponseBody() {
        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get();
        ResponseBody responseBody = response.body();
        Headers headers = response.getHeaders();
        System.out.println(responseBody.asString());
    }
}
