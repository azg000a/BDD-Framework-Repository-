Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Ahmad.Ghafoor@tekschool.us' and password 'Afghan1!'
    And User click on login button
    And User should be logged into Account

  @smokey
  Scenario: Verify User can update Profile information
    When User click on Account option
    And User update Name 'AhmadGhafoo' and Phone '5713950257'
    And User click on Update button
    Then user profile information should be updated

  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previous Password | newPassword | confirmPassword |
      | value             | value       | value           |
    And User click on Change Password button
    Then a message should be displayed 'Password Updated Successfully'

  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber | nameOnCard | expirationMonth | expirationYear | secuirtyCode |
      | value      | value      | value           | value          | value        |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added successfully'

  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And User edit information with below data
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
      | value      | value      | value           | value          | value        |
    And User click on Update your card button
    Then a message should be displayed 'Payment Method updated successfully'

  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then Payment details should be removed

  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And User fill new address form with below information
      | country | fullName | phoneNumber | streetAddress | apt   | city  | state | zipCode |
      | value   | value    | value       | value         | value | value | value | value   |
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully'

  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And User fill new address form with below information
      | country | fullName | phoneNumber | streetAddress | apt   | city  | state | zipCode |
      | value   | value    | value       | value         | value | value | value | value   |
    And User click update Your Address button
    Then A message should be displayed 'Address Updated Successfully'

  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
