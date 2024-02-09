package org.example;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RestAssuredClass {

    @Test
    public void testRestAssured() {
        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, "");
        String contentType = response.header("Content-Type");
        String server = response.header("Server");
        Headers headers = response.headers();
        //System.out.println("Response=>" + response.prettyPrint());
        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(response.getStatusLine(), "HTTP/1.1 200 OK");
        for(Header header : headers) {
            System.out.println("key : " + header.getName() + "      Value : + " + header.getValue());
        }
    }
}
