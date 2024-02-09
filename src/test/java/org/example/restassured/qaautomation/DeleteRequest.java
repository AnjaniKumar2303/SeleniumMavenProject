package org.example.restassured.qaautomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class DeleteRequest {


    @Test
    public void deleteRequest() {
        RestAssured.baseURI = "https://dummy.restapiexample.com/api";
        RequestSpecification requestSpecification = RestAssured.given();
        Response response = requestSpecification.delete("/v1/delete/1");
        System.out.println(response.getStatusCode());
    }

}
