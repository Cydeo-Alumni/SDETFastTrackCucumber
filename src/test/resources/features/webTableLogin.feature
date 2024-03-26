Feature: Login to web table page

  Background:
    Given User goes to web table page

 @smoke @regression
  Scenario: login with valid credentials
    When User enters username
    And User enters password
    And User click login button
    Then User is on dashboard

  @smoke
  Scenario: login with invalid credentials
    When User enters wrong username
    And User enters wrong password
    And User click login button
    Then User sees warning  popup







