package org.example.restassured.qaautomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PutRequest {

    @Test
    public void testPut() {
        RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1/update/2";
        RequestSpecification requestSpecification = given();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 2);
        jsonObject.put("employee_name", "Aman");
        requestSpecification.body(jsonObject);
        requestSpecification.header("Content-Type", "application/json");
        Response response = requestSpecification.put("https://dummy.restapiexample.com/api/v1/update/2");
        System.out.println(response.getStatusCode());
    }

    @Test
    public void testUsingBDD() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 2);
        jsonObject.put("employee_name", "Aman");
        given()
                .baseUri("https://dummy.restapiexample.com/api/v1/update/2")
                .header("Content-Type", "application/json")
                .body(jsonObject)
                .when()
                .put()
                .then()
                .statusCode(200);
    }
}
