Feature: Login to web table page

  Scenario: login with valid credentials
    Given User goes to web table page
    When User enters username
    And User enters password
    And User click login button
    Then User is on dashboard

    @wip
  Scenario: login with invalid credentials
    Given User goes to web table page
    When User enters wrong username
    And User enters wrong password
    And User click login button
    Then User sees warning  popup

