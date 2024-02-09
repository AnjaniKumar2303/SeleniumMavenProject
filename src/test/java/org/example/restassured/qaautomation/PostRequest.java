package org.example.restassured.qaautomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class PostRequest {

    @Test
    public void testPostRequest1() {
        RestAssured.baseURI = "https://reqres.in/";
        String endpoint = "api/users";
        RequestSpecification requestSpecification = RestAssured.given();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "abc");
        jsonObject.put("job", "tester");
        requestSpecification.body(jsonObject);
        requestSpecification.header("Content-Type", "application/json");
        Response response = requestSpecification.post(endpoint);
        System.out.println(response.getStatusCode());
    }

    @Test
    public void testPostRequest2() {
        RestAssured.baseURI = "https://dummy.restapiexample.com/api";
        String endpoint = "/v1/create";
        RequestSpecification requestSpecification = RestAssured.given();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "apitest");
        jsonObject.put("salary", "5000");
        jsonObject.put("age", "30");
        requestSpecification.body(jsonObject);
        requestSpecification.header("Content-Type", "application/json");
        Response response = requestSpecification.post(endpoint);
        System.out.println(response.getStatusCode());
    }

    @Test
    public void testPostRequest3() {
        RestAssured.baseURI = "https://dummy.restapiexample.com/api";
        String endpoint = "/v1/create";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "apitest");
        jsonObject.put("salary", "5000");
        jsonObject.put("age", "30");

        given()
                .baseUri("https://dummy.restapiexample.com/api")
                .header("Content-Type", "application/json")
                .body(jsonObject)
                .post(endpoint)
                .then()
                .statusCode(200);

    }
}
