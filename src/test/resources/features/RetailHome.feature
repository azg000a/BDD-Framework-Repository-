Feature: This feature is used for testing UI of Retail page
  
  //you can reuse a specific.... ( g i v e n) when then ......many times and use the same step definition!!!

  
  Scenario: Verify user can search a product
    Given User is on retail website
    When User search for "pokemon" product
    Then The product should be displayed

  Scenario: Verify Shop by Department sidebar
    Given User is on retail website
    When User click on All section
    Then below options are present in shop by department sidebar
      | Electronics | Computers | Smart Home | Sports | Automotive |
@test
  Scenario Outline: Verify Department sidebar options
    Given User is on retail website
    When User click on All section
    And User on '<department>'
    Then below options are present in department
      | '<optionOne>' | '<optionTwo>' |

    Examples: 
      | department  | optionOne                      | optionTwo                |
      | Electronics | TV & Video                     | Video Games              |
      | Computers   | Accessories                    | Networking               |
      | Smart Home  | Smart Home Lightning           | Plugs and Outlets        |
      | Sport       | Athletic Clothing              | Exercise & Fitness       |
      | Automotive  | Automotive Parts & Accessories | MotorCycle & Powersports |
