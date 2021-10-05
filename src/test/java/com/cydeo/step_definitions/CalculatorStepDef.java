package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDef {

    @Given("calculator app is open")
    public void calculator_app_is_open() {
        System.out.println("Given the calculator app is open");
    }
    @When("I add {int} by {int}")
    public void i_add_by(Integer num1, Integer num2) {
        System.out.println("When I add "+num1+" and "+num2);
    }
    @Then("I should get the result {int} displayed")
    public void i_should_get_the_result_displayed(Integer result) {
        System.out.println("Then I should get the result = "+result);
        System.out.println("-----------------------------------");
    }

}
