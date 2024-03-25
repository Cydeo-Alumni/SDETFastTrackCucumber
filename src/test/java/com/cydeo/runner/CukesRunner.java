package com.cydeo.runner;


import io.cucumber.junit.*;
import io.cucumber.plugin.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html"
        },
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = false,
        tags = ""
)
public class CukesRunner {
}
