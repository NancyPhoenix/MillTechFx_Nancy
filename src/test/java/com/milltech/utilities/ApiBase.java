package com.milltech.utilities;

import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;

public class ApiBase {

    @BeforeAll
    public static void init() {

        baseURI = "http://api.zippopotam.us";
        basePath= "/us";

    }
}
