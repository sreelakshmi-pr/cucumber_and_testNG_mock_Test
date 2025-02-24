package com.automation.TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue ="com.automation.Steps",
        plugin = {"json:target/cucumber.json"}
)

public class TestRunner {

}


