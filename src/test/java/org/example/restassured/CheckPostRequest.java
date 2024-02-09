package org.example.restassured;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class CheckPostRequest {

    @Test
    public void testPost() {
        RestAssured.baseURI = "https://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification request = RestAssured.given();

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("", "");


    }

}
