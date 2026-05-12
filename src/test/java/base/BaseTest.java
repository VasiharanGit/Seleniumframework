package base;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

import utils.ConfigReader;

public class BaseTest {

    public static RequestSpecification reqSpec;

    public static void setup() {

        reqSpec = new RequestSpecBuilder()
                .setBaseUri(ConfigReader.get("baseURL"))
                .addHeader("x-api-key", ConfigReader.get("apiKey"))
                .addHeader("Content-Type", "application/json")
                .build();
    }
}