Feature: Sign in Feature

  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Ahmad.Ghafoor@tekschool.us' and password 'Afghan1!'
    And User click on login button
    Then User should be logged into Account

@smokey2
  Scenario Outline: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email '<email>' and password '<password>'
    And User click on login button
    Then User should be logged into Account

    Examples: 
      | email                      | password  |
      | transformers@tekschool.us  | Tek@12345 |
      | Ahmad.Ghafoor@tekschool.us | Afghan1!  |





@smokeTest
  Scenario: Verify user can create an account into Retail Website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with bellow data
      | name     | email                   | password  | confirmPassword |
      | Ahmad | Ahmad.Ghafoor1@tekschool.us | Afghan1! | Afghan1!       |
    And User click on SignUp button
    Then User should be logged into account page
