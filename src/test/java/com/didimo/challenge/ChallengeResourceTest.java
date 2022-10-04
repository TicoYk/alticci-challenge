package com.didimo.challenge;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ChallengeResourceTest {

    @Test
    public void testAlticci$WithParam0() {
        RestAssured.given()
                .when().get("/alticci/0")
                .then()
                .statusCode(200)
                .body(is(Collections.singletonList(0).toString()));
    }

    @Test
    public void testAlticci$WithParam1() {
        RestAssured.given()
                .when().get("/alticci/1")
                .then()
                .statusCode(200)
                .body(is("[0,1]"));
    }

    @Test
    public void testAlticci$WithParam2() {
        RestAssured.given()
                .when().get("/alticci/2")
                .then()
                .statusCode(200)
                .body(is("[0,1,1]"));
    }

    @Test
    public void testAlticci$WithOfficialExampleTest() {
        RestAssured.given()
                .when().get("/alticci/10")
                .then()
                .statusCode(200)
                .body(is("[0,1,1,1,2,2,3,4,5,7,9]"));
    }

}
