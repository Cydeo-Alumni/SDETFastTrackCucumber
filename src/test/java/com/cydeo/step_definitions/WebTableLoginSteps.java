package com.cydeo.step_definitions;

import com.cydeo.pages.*;
import com.cydeo.utilities.*;
import io.cucumber.java.en.*;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.*;

import java.io.*;
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

    @When("User get data from excel file")
    public void user_get_data_from_excel_file() throws IOException {
        String path = "C:\\Users\\Zulpikar\\Downloads\\SDETFastTrackCucumber (1)\\SDETFastTrackCucumber\\src\\test\\resources\\test.xlsx";

        FileInputStream file = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(file);
        Sheet worksheet = workbook.getSheet("test");

        String userName = worksheet.getRow(1).getCell(0).toString(); // Test
        String password = worksheet.getRow(1).getCell(1).toString(); // Tester

        loginPage.userNameInput.sendKeys(userName);
        loginPage.passwordInput.sendKeys(password);
    }


}
