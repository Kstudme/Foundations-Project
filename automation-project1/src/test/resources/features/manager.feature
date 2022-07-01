Feature: Managers should be able to login to access their homepages

    Scenario: As a manager I want to sign in so I can view my custom homepages

        Given the manager is on the login page 
        When  the manager enters his correct username
        When  the manager enters his correct password
        When  the manager clicks the login button
        Then  the manager should be logged in to the manager home page

    Scenario: As a manager I want assign a defect to a tester

        Given the manager is on the manager homepage
        When  the manager enters a defect 
        When  the manager selects a date
        When  the manager enters a step to reproduce
        When  the manager assigns a tester to the defect
        When  the manager clicks the assign button
        Then  the defect is assign to the tester
