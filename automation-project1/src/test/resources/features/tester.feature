Feature:  Testers should be able to update defects so they can monitor their progress

        Scenario: As a tester I want to sign in so I can view my custom homepages

                Given the tester is on the login page 
                When  the tester enters his correct username
                When  the tester enters his correct password
                When  the tester clicks the login button
                Then  the tester should be logged in to the tester home page

        Scenario: Update from pending to accept
                Given the tester is on the tester page
                When the tester clicks the Accept button for the defect
                Then the defect should be moved to the Current Defect Status table


        Scenario: Update from pending to declined
                Given the tester is on the tester page
                When  the tester clicks the Decline button for the defect
                Then  the defect is no longer in current defect status table

        Scenario: Update from accept to rejected
                Given the tester is on the tester page
                When  the tester clicks the Accept button for the defect
                When  the defect should be moved to the Current Defect Status table
                Then  the defect is no longer in current defect status table


        Scenario: Update from accept to fixed
                Given the tester is on the tester page
                When  the tester clicks the Accept button for the defect
                When  the defect should be moved to the Current Defect Status table 
                Then  the defect is no longer in current defect status table

        Scenario: Update from accept to shelved
                Given  the tester is on the tester page
                When  the tester clicks the Accept button for the defect
                When  the defect should be moved to the Current Defect Status table 
                Then  the defect is no longer in current defect status table