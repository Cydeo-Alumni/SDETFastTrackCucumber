package com.cydeo.step_definitions;

import com.cydeo.pages.*;
import com.cydeo.utilities.*;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;

public class WebTableLoginSteps {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("User goes to web table page")
    public void user_goes_to_web_table_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("User enters username")
    public void user_enters_username() {
        loginPage.userNameInput.sendKeys(ConfigurationReader.getProperty("username"));
    }
    @When("User enters password")
    public void user_enters_password() {
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
    }
    @When("User click login button")
    public void user_click_login_button() {
        loginPage.loginButton.click();
    }
    @Then("User is on dashboard")
    public void user_is_on_dashboard() {
        dashboardPage.allOrderLink.isDisplayed();
    }
}
