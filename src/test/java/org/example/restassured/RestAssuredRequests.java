package org.example.restassured;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RestAssuredRequests {

    @BeforeTest
    public void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    public void testGetRequest() {
        RequestSpecification requestSpecification = RestAssured.given();
        System.out.println();
    }

}
