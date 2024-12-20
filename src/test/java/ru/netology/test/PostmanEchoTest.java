package ru.netology.test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

class PostmanEchoTest {

    @Test
    void shouldTestSomeData() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Hello World")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Hello World"))
        ;
    }
}

