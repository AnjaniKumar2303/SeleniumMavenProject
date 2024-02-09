package org.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class RestAssuredPost {

    @Test
    public void testPost() {
        RestAssured.baseURI ="https://demoqa.com/Account/v1";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
        requestParams.put("userName", "user1");
        requestParams.put("password", "pass1");
        Response response = request.post("/Account/v1/User");
        System.out.println(response.prettyPrint());
        ResponseBody responseBody = response.getBody();
    }
}
