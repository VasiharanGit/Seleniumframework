package tests;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import base.BaseTest;
import utils.ConfigReader;

public class UserTest extends BaseTest {

    public static void main(String[] args) {

        setup(); // initialize base URL
        //System.out.println(ConfigReader.get("baseURL"));

        given()
            .spec(reqSpec)
            
        .when()
            .get("/api/users/2")
        .then()
            .statusCode(200)
            .log().all()
            .body("data.id", equalTo(2));

        System.out.println("Framework Test Passed");
    }
}