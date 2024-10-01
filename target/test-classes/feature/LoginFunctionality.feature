Feature: Verifying the login functionality in Adactin Hotel

  @adactin_Login_logout
  Scenario Outline: Verify the Login and Logout Funtionality
    Given User should launch the browser
    When User should write "<username>" and "<password>"
    And User should click the login button
    Then User should verify success message after login
    And User should logoff

    Examples: 
      | username       | password |
      | IronmanCaptain | DLXY5Q   |

 
 @adactin_InvalidLogin_logout
  Scenario Outline: Verify the Login and Logout Funtionality
    Given User should launch the browser
    When User should write correct "<username>" and wrong "<password>"
    And User should click the login button
    Then User should validate the error message 
    And User should logoff

    Examples: 
      | username       | password |
      | IronmanCaptain | wrongpassword|
      
      
      
 @adactin_InvalidLogin_logout
  Scenario: Verify the forgot password Funtionality
    Given User should launch the browser
    When User click on forgot password
    Then Print the error message

    
 
      
    
      
