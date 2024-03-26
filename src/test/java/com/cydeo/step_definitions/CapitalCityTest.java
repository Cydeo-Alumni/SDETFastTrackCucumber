package com.cydeo.step_definitions;

import com.cydeo.pages.*;
import com.cydeo.utilities.*;
import io.cucumber.java.en.*;
import org.junit.*;
import org.openqa.selenium.*;

public class CapitalCityTest {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("User goes to Google.com")
    public void user_goes_to_google_com() {
        Driver.getDriver().get(ConfigurationReader.getProperty("google"));
    }

    @When("User search for capital of {string}")
    public void user_search_for_capital_of(String countryName) {
        googleSearchPage.searchBar.sendKeys("capital city of " + countryName + Keys.ENTER);
    }

    @Then("User should see capital city as {string}")
    public void user_should_see_capital_city_as(String capitalCity) {
        BrowserUtils.waitFor(2);
        Assert.assertEquals(googleSearchPage.capitalName.getText(),capitalCity);
    }
}
