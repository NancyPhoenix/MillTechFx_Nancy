package com.milltech.stepdef;

import com.milltech.utilities.ApiBase;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.is;

public class ApiTest extends ApiBase {

    @Test
    public void test() {

/*
    When  User enters  "<countryCode>" and "<postalCode>" as parameters
    Then  User gets Status code 200
    And   User gets content type application json
    And   User gets "Server" equal to cloudflare in header
    And   User gets "Report-To" equal to not null
    And   User gets postCode country countryAbbrevation and places in response body
 */


        given().log().all().accept(ContentType.JSON).
                pathParam("postcode", "22031")
                .when().get("/{postalCode}")

                .then().assertThat().statusCode(200)
                .assertThat().contentType("application/json")
                .header("Server", equalTo("cloudflare"))
                .header("Report-To", notNullValue())
                .body(contains("post code", "country", "country abbreviation", "places"));

    }

}
