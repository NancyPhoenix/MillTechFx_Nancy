package com.milltech.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VerifyingApiTest {


    Response response;


    @Given("User makes a GET request to https://api.zippopotam.us/")
    public void user_makes_a_get_request_to_https_api_zippopotam_us_end_point() {


    }

    @When("User enters  {string} and {string} as parameters")
    public void user_enters_and_as_parameters(String countryCode, String postalCode) {

        response = given().log().all().accept(ContentType.JSON).
                pathParam("postCode", postalCode).pathParam("countryCode", countryCode)
                .when().get("{CountryCode}/{postalCode}");

    }

    @Then("User gets Status code {int}")
    public void userGetsStatusCode(int arg0) {
        response.then().assertThat().statusCode(200);

    }
    @And("User gets content type application json")
    public void userGetsContentTypeApplicationJson() {
        response.then().assertThat().contentType("application/json");
    }



    @Then("User gets postCode country countryAbbrevation and places in response body")
    public void user_gets_post_code_country_country_abbrevation_and_places_in_response_body() {

        response.then().body(contains("post code", "country", "country abbreviation", "places"));
    }

//_______________________________________________________________________________________



    @Then("User gets  postcode in response body")
    public void userGetsPostCodeInResponseBody() {


    }


    @When("User makes a GET request to {string}")
    public void userMakesAGETRequestTo(String arg0) {

    }


    @When("User makes a request to {string}")
    public void userMakesARequestTo(String arg0) {

    }

    @And("User enters wrong {string}")
    public void userEntersWrong(String arg0) {

    }

    @Then("User gets {int} error")
    public void userGetsError(int arg0) {

    }


    @When("User searches for GU{int} for Great Britain")
    public void userSearchesForGUForGreatBritain(int arg0) {

    }

    @Then("{int} places are returned")
    public void placesAreReturned(int arg0) {

    }

    @And("they are all in the state of England")
    public void theyAreAllInTheStateOfEngland() {

    }

    @And("each one has a place name, longitude, state, state abbreviation and latitude")
    public void eachOneHasAPlaceNameLongitudeStateStateAbbreviationAndLatitude() {
    }



}
