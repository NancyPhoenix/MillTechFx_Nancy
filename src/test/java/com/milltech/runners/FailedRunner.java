package com.milltech.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/milltech/stepdef",
        features = "@target/rerun.txt"
)

public class FailedRunner {
}
