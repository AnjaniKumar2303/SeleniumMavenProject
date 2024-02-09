package org.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class SerializeJsonClass {

    @Test
    public void serializeJson() {
        RestAssured.baseURI = "https://demoqa.com";
        RequestSpecification request = RestAssured.given();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("userName", "Amit");
        jsonObject.put("password", "Amit@1234");
        request.body(jsonObject.toString());
        Response response = request.post("/Account/v1/User");
        System.out.println(response.prettyPrint());


    }
}
