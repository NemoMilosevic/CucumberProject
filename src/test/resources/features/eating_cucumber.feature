Feature: Eating too many cucumbers may not be good for you

  Scenario: Eating a few cucumbers is not a problem
    Given Nemo is hungry
    When he eats 3 cucumbers
    Then he will be full

  Scenario: Eating too many is a problem
    Given Nemo is hungry
    When he eats 10 cucumbers
    Then he faints