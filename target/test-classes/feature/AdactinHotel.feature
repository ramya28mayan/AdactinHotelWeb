Feature: Verifying the booking hotel functionality in Adactin Hotel

  @adactin_Login_logout
  Scenario Outline: Verify the Login and Logout Funtionality
    Given User should launch the browser
    When User should write "<username>" and "<password>"
    And User should click the login button
    Then User should verify success message after login
    And User should logoff

    Examples: 
      | username       | password|
      | IronmanCaptain | DLXY5Q  |

      
      @adactin_Search_Hotel
Scenario Outline: Verify User is able Select Product after Login
Given User should launch the browser
When User should write "<username>" and "<password>"
And User should click the login button
Then User should verify success message after login
And User should search the hotel

Examples:
|username|password|
|IronmanCaptain|DLXY5Q|