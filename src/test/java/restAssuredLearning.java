//
//import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;
//
//public class restAssuredLearning {
//    public static void main(String[] args) {
//
//        given()
//	        .header("x-api-key", "reqres_0bae5c0af347444d888bac5d46349fbc")
//	        .header("Content-Type", "application/json")
//        .when()
//            .get("https://reqres.in/api/users/2")
//        .then()
//            .statusCode(200)
//            .body("data.id", equalTo(2))
//            .body("data.first_name", equalTo("Janet"))
//        	.log().all();
//
//        System.out.println("GET Test Passed");
//    }
//}
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class restAssuredLearning {

    public static void main(String[] args) {

        // Request Body
        String requestBody = "{\n" +
                "    \"name\": \"Vasi\",\n" +
                "    \"job\": \"QA Engineer\"\n" +
                "}";

        given()
                .header("x-api-key", "reqres_0bae5c0af347444d888bac5d46349fbc")
                .header("Content-Type", "application/json")
                .body(requestBody)

        .when()
                .post("https://reqres.in/api/users")

        .then()
                .statusCode(201)
                .body("name", equalTo("Vasi"))
                .body("job", equalTo("QA Engineer"))
                .log().all();

        System.out.println("POST Test Passed");
    }
}