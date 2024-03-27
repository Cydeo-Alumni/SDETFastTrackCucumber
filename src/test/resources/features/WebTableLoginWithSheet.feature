Feature: Login with excel data


  @excel
  Scenario: Login with excel data
    Given User goes to web table page
    When User get data from excel file
    And User click login button
    Then User is on dashboard