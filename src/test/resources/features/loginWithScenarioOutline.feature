Feature: Login with scenario outline

  Scenario Outline: with scenario outline
    Given User goes to web table page
    When User enters "<username>"
    And User enters "<password>"
    And User click login button
    Then User is on dashboard

    Examples:
      | username | password |
      | Test     | Tester   |
      | Test1    | Tester1  |
      | Test2    | Tester2  |