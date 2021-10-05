package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatingStepDef {

    @Given("Nemo is hungry")
    public void nemo_is_hungry() {
        System.out.println("This is @Given code: nemo_is_hungry");
    }

    @When("he eats {int} cucumbers")
    public void he_eats_cucumbers(Integer quantity) {
        System.out.println("This is @When code: he_eats_cucumbers: "+quantity);
    }

    @Then("he will be full")
    public void he_will_be_full() {
        System.out.println("This is @Then code: he_will_be_full");
    }

    @Then("he faints")
    public void he_faints() {
        System.out.println("This is @Then code: he_faints");
    }

}
