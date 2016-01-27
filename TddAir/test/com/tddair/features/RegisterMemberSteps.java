package com.tddair.features;

import com.tddair.TddAirApplication;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterMemberSteps
{
    private TddAirApplication app = new TddAirApplication();

    @When("^the customer provides a username not already in use$")
    public void the_customer_provides_a_username_not_already_in_use() throws Throwable
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^system should allow the Member to claim the username\\.$")
    public void system_should_allow_the_Member_to_claim_the_username() throws Throwable
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^the customer provides an email address not already in use$")
    public void the_customer_provides_an_email_address_not_already_in_use() throws Throwable
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the system should allow the Member to claim that email address\\.$")
    public void the_system_should_allow_the_Member_to_claim_that_email_address() throws Throwable
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^the customer registers as a Member$")
    public void the_customer_registers_as_a_Member() throws Throwable
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the system should assign the Member (\\d+) bonus miles$")
    public void the_system_should_assign_the_Member_bonus_miles(int arg1) throws Throwable
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the system should assign the Member untested status\\.$")
    public void the_system_should_assign_the_Member_untested_status() throws Throwable
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^the customer provides a username already in use$")
    public void the_customer_provides_a_username_already_in_use() throws Throwable
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the system should show an error message and prompt for a different username\\.$")
    public void the_system_should_show_an_error_message_and_prompt_for_a_different_username() throws Throwable
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^the customer provides an email address already in use$")
    public void the_customer_provides_an_email_address_already_in_use() throws Throwable
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the system should show an error message and prompt for a different email address\\.$")
    public void the_system_should_show_an_error_message_and_prompt_for_a_different_email_address() throws Throwable
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^the customer provides an invalid email address$")
    public void the_customer_provides_an_invalid_email_address() throws Throwable
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the system should show an error message and prompt for a correct email address\\.$")
    public void the_system_should_show_an_error_message_and_prompt_for_a_correct_email_address() throws Throwable
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
