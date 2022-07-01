package com.automation.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TesterSteps {

    @Given("the tester is on the login page")
    public void the_tester_is_on_the_login_page() {
        // when telling selenium to get a local file you have to add File:// to the start of the url
        TestRunner.driver.get("File://C:/Users/nirlo/OneDrive/Desktop/Project 1/Webpages/login.html");
    }

    
    //@When("the tester enters his correct username")
    //public void the_tester_enters_his_correct_username() {
        //TestRunner.login.enterUsername("TPoinville");
    

    //@When("the tester enters his correct password")
    //public void the_tester_enters_his_correct_password() {
        //TestRunner.login.enterPassword("Tester");
    
    


@When("the tester clicks the login button")
public void the_tester_clicks_the_login_button() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
    TestRunner.login.clickButton();  
}


@When("the tester is on the tester page")
public void the_tester_is_on_the_tester_page() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
    String title = TestRunner.driver.getTitle();
        Assert.assertEquals("Tester Page", title);
}

@When("the tester clicks the Accept button for the defect")
public void the_tester_clicks_the_accept_button_for_the_defect() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
    TestRunner.tester.clickButton();
}
@Then("the defect should be moved to the Current Defect Status table")
public void the_defect_should_be_moved_to_the_Current_Defect_Status_table() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}


@When("the tester clicks the Decline button for the defect")
public void the_tester_clicks_the_Decline_button_for_the_defect() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
    TestRunner.tester.clickButton();
}
@Then("the defect is no longer in current defect status table")
public void the_defect_is_no_longer_in_current_defect_status_table() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

}