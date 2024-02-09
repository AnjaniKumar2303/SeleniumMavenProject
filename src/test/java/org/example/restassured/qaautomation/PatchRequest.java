package org.example.restassured.qaautomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class PatchRequest {

    @Test
    public void testget() {
        RestAssured.baseURI = "https://reqres.in/api/users/2";
        RequestSpecification requestSpecification = RestAssured.given();
        Response response = requestSpecification.get();
        response.prettyPrint();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "William");
    }

    @Test
    public void testPatch() {
        RestAssured.baseURI = "https://reqres.in/api/users/2";
        RequestSpecification requestSpecification = RestAssured.given();
        Response response = requestSpecification.get();
        response.prettyPrint();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("first_name", "William");
        requestSpecification.header("Content-Type", "application/json");
        requestSpecification.body(jsonObject);
        requestSpecification.patch();
    }



}
