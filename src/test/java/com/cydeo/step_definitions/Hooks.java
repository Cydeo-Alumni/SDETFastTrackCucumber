package com.cydeo.step_definitions;

import com.cydeo.utilities.*;
import io.cucumber.java.*;
import org.openqa.selenium.*;
import org.openqa.selenium.devtools.v85.network.model.*;

public class Hooks {

    @Before
    public void setUpDriver(){
        System.out.println("Driver is set up");
    }

    @After
    public void tearDown(){
        System.out.println("Driver is closing...");
        Driver.closeDriver();
    }

    @After
    public void teardownScenario(Scenario scenario){
        //System.out.println("It will be closing browser using cucumber @After each scenario");

        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }

    }
}
