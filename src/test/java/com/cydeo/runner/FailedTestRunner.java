package com.cydeo.runner;


import io.cucumber.junit.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "com/cydeo/step_definitions"
)
public class FailedTestRunner {
}
