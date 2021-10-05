Feature: Calculator

  As a user,
  I should be able to use the calculator,
  so I can do arithmetic operations.

  Scenario: Adding 2 numbers
    Given calculator app is open
    When I add 2 by 2
    Then I should get the result 4 displayed

  Scenario: Adding 2 numbers
    Given calculator app is open
    When I add 5 by 5
    Then I should get the result 10 displayed
