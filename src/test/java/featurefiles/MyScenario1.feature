@smoke
@regression
@sanity

Feature: Validate the Login Functionality of application
  @test1
  Scenario Outline: To check the login functionality of application with correct credentials
    Given User opens the web application in the browser
    And User will enter the "<username>"
    And User will enter the "<password>"
    When User will click on login button
    Then User will be able to login in the homepage of the application
    Then User will be able to see the details

    Examples: 
      | username | password  |
      | saurabh  | test@1234 |
      | shivam   | test@2234 |
      | gaurav   | test@3234 |

  @test2
  Scenario: To check the login functionality of application with incorrect credentials
    Given User opens the web application in the browser
    And User will enter the username
    And User will enter the password
    When User will click on login button
    Then User will be getting appropriate error message
    
  Scenario: Validate login functionality keeping valid userid and wrong password
  Given User opens the web application in the browser
  And User will enter the "Nilima"
  And User will enter the "test@1654"
  When User will click on login button
  Then User will be getting appropriate error message
