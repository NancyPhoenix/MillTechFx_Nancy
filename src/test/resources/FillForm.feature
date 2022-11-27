#To Do - Convert following requirement into a testable feature
Feature: Filling and submitting the form feature verification
  User Story: I want to fill in and submit the form on the demoqa.com website with the details:
  First Name - Jane
  Last name - Smith
  Email address - automation-test@tester.com
  Phone number - 1234567891
  So that I can make sure the form is being completed and showing the correct user details
  As an automation tester
  I want to be able complete the above scenario by passing in an array of user details and submit the form for each of these users
  So that I can make this feature run for any amount of user details passed in


  Scenario Outline:User should be able to pass in an array of user details and submit the form for each of these users
    Given user is on the demoqa.com website
    When user selects the forms
    And user selects practice forms

    When user enters the first name "<firstName>"
    And user enters the last name "<lastName>"
    And user enters the email adress "<email>"
    And user selects the "<gender>"
    And user enters the phone number "<phoneNumber>"


    When user submits the form
    Then user verifies the form is completed and showing the correct user details

    Examples:
      |firstName|lastName|email|phoneNumber|gender|
      |Jane|Smith|automation-test@tester.com|1234567891|Female|
      |John|Chan|automation-test2@tester.com|9876543211|Male  |
