package org.example.restassured.qaautomation;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class GetRequest {

    @Test
    public void validateGetRequest() {
        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employees";
        RequestSpecification request = RestAssured.given();
        Response response = request.get();
        //response.prettyPrint();
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        Assert.assertEquals(response.getStatusLine(), "HTTP/1.1 200 OK");

        given()
                .when()
                .get("http://dummy.restapiexample.com/api/v1/employees")
                .then()
                .statusCode(200);
    }


    @Test
    public void validateGetRequestJson() {
        RestAssured.baseURI = "https://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification request = RestAssured.given();
        Response response = request.get();
        JsonPath jsonPath = response.jsonPath();
        String city = jsonPath.get("City");
        System.out.println(city);
    }
}
