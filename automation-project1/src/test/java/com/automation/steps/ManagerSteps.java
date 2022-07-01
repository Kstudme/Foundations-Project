package com.automation.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManagerSteps {

    @Given("the manager is on the login page")
    public void the_employee_is_on_the_login_page() {
        // when telling selenium to get a local file you have to add File:// to the start of the url
        TestRunner.driver.get("File://C:/Users/nirlo/OneDrive/Desktop/Project 1/Webpages/login.html");
    }

    @When("the manager clicks the login button")
    public void the_manager_clicks_the_login_button() {
        TestRunner.manager.clickButton();
    }

    /*
     * These steps are already available from the LoginSteps class
     */
    // @When("the manager enters his correct username")
    // public void the_manager_enters_his_correct_username() {
    //     TestRunner.login.enterUsername("NClervil");
    // }

    // @When("the manager enters his correct password")
    // public void the_manager_enters_his_correct_password() {
    //     TestRunner.login.enterPassword("Manager");
    // }

    // @Then("the manager should be logged in to the manager home page")
    // public void the_manager_should_be_logged_in_to_the_manager_home_page() {
    //     // this method checks that my simulated manager has actually ended up on the manager page
    //     TestRunner.wait.until(ExpectedConditions.titleIs("Wayne Enterprise's Manager Homepage"));
    //     String title = TestRunner.driver.getTitle();
    //     Assert.assertEquals("Wayne Enterprise's Manager Homepage", title);
    // }

    /*
        Tester steps below
    
    
    @When("the tester enters his correct username")
    public void the_tester_enters_his_correct_username() {
        TestRunner.login.enterUsername("TPoinville");
    }

    @When("the tester enters his correct password")
    public void the_tester_enters_his_correct_password() {
        TestRunner.login.enterPassword("Tester");
    }
    
    @Then("the tester should be logged in to the tester home page")
    public void the_tester_should_be_logged_in_to_the_tester_home_page() {
        TestRunner.wait.until(ExpectedConditions.titleIs("Tester Page"));
        String title = TestRunner.driver.getTitle();
        Assert.assertEquals("Tester Page", title);
    }
    */
    @Given("the manager is on the manager homepage")
    public void the_manager_is_on_the_manager_homepage() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        // Happens via the previous login steps...
        String title = TestRunner.driver.getTitle();
        Assert.assertEquals("Wayne Enterprise's Manager Homepage", title);
        
    }
    
     
    @When("the manager enters a defect")
    public void the_manager_enters_a_defect() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        TestRunner.manager.enterDefect("TESTING DEFECT SYSTEM");
    }

    // Choose calendar date
    @When("the manager selects a date")
    public void the_manager_selects_date() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        TestRunner.manager.enterDate("06-28-2022");
    }

    // Steps to reproduce....
    @When("the manager enters a step to reproduce")
    public void the_manager_enters_a_step_to_reproduce() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        TestRunner.manager.enterStepsToReproduce("Domain Name");
    }
    


    @When("the manager assigns a tester to the defect")
    public void the_manager_assigns_a_tester_to_the_defect() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        //System.out.println(testerSelectInput);
        TestRunner.manager.testerSelect("TPoinville"); 
    }
    @When("the manager clicks the assign button")
    public void the_manager_clicks_the_assign_button() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        TestRunner.manager.clickButton();
    }
    @Then("the defect is assign to the tester")
    public void the_defect_is_assign_to_the_tester() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        String title = TestRunner.driver.getTitle();
        Assert.assertEquals("Wayne Enterprise's Manager Homepage", title);
    }  
}