Feature: Web Table Login With Parameters

  Background:
    Given User goes to web table page

  @db
  Scenario: login with parameters
    When User enters "username"
    And User enters "password"
    And User click login button
    Then User is on dashboard



  Scenario: login with 2 parameters
    When User enters "Test" and "Tester"
    And User click login button
    Then User is on dashboard