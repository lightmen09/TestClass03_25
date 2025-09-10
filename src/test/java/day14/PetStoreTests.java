package day14;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PetStoreTests {

    private static RequestSpecification requestSpec;
    private static ResponseSpecification responseSpec;

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";

        requestSpec = new RequestSpecBuilder()
                .setBasePath("/pet")
                .setContentType(ContentType.JSON)
                .build();

        responseSpec = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectContentType(ContentType.JSON)
                .build();
    }

    @Test
    public void testAddPet() {
        String newPet = """
            {
              "id": 123456,
              "name": "Barsik",
              "status": "available"
            }
            """;

        given()
                .spec(requestSpec)
                .body(newPet)
                .when()
                .post()
                .then()
                .spec(responseSpec)
                .header("Content-Type", containsString("application/json"))
                .body("name", equalTo("Barsik"))
                .body("status", equalTo("available"));
    }

    @Test
    public void testGetPetById() {
        given()
                .spec(requestSpec)
                .when()
                .get("/123456")
                .then()
                .spec(responseSpec)
                .header("Content-Type", containsString("application/json"))
                .body("id", equalTo(123456))
                .body("name", equalTo("Barsik"));
    }

    @Test
    public void testUpdatePet() {
        String updatedPet = """
            {
              "id": 123456,
              "name": "BarsikUpdated",
              "status": "sold"
            }
            """;

        given()
                .spec(requestSpec)
                .body(updatedPet)
                .when()
                .put()
                .then()
                .spec(responseSpec)
                .header("Content-Type", containsString("application/json"))
                .body("name", equalTo("BarsikUpdated"))
                .body("status", equalTo("sold"));
    }

    @Test
    public void testFindPetsByStatus() {
        given()
                .spec(requestSpec)
                .queryParam("status", "available")
                .when()
                .get("/findByStatus")
                .then()
                .spec(responseSpec)
                .header("Content-Type", containsString("application/json"))
                .body("status", everyItem(equalTo("available")));
    }

    @Test
    public void testDeletePet() {
        given()
                .spec(requestSpec)
                .when()
                .delete("/123456")
                .then()
                .statusCode(200)
                .header("Content-Type", containsString("application/json"))
                .body("message", equalTo("123456"));
    }
}
