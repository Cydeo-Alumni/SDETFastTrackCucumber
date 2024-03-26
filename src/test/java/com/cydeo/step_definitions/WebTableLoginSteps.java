package com.cydeo.step_definitions;

import com.cydeo.pages.*;
import com.cydeo.utilities.*;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;

import java.util.*;

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

    @When("User enters wrong username")
    public void user_enters_wrong_username() {
        loginPage.userNameInput.sendKeys("wrong user name");
    }
    @When("User enters wrong password")
    public void user_enters_wrong_password() {
        loginPage.passwordInput.sendKeys("wrong password");
    }
    @Then("User sees warning  popup")
    public void user_sees_warning_popup() {
        loginPage.popUp.isDisplayed();
    }

    @When("User enters {string}")
    public void user_enters(String credential) {

        switch (credential){
            case "username":
                loginPage.userNameInput.sendKeys(ConfigurationReader.getProperty("username"));
                break;
            case "password":
                loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
                break;
        }
    }

    @When("User enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        loginPage.userNameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
    }

    @When("User enters below credentials")
    public void user_enters_below_credentials(Map<String, Object> credentials) {
        //{"username":"Test","password":"Tester"}
        loginPage.userNameInput.sendKeys(credentials.get("username").toString());
        loginPage.passwordInput.sendKeys(credentials.get("password").toString());
        loginPage.loginButton.click();
    }


}
