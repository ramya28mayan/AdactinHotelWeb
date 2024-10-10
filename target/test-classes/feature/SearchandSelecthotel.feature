 Feature: Verifying the search and select hotel functionality in Adactin Hotel
 @adactin_Search_Hotel
  Scenario Outline: Verify User is able Select Product after Login
    Given User should launch the browser
    When User should write "<username>" and "<password>"
    And User should click the login button
    Then User should verify success message after login
    And User should search the hotel
    And User should logoff

    Examples: 
      | username       | password |
      | IronmanCaptain | Y00899   |

  @adactin_Select_Hotel
  Scenario Outline: Verify User is able Select Product after Login
    Given User should launch the browser
    When User should write "<username>" and "<password>"
    And User should click the login button
    Then User should verify success message after login
    And User should search the hotel
    And User should select the hotel
    And User should logoff

    Examples: 
      | username       | password |
      | IronmanCaptain | Y00899   |

  @adactin_Book_Hotel
  Scenario Outline: Verify User is able Select Product after Login
    Given User should launch the browser
    When User should write "<username>" and "<password>"
    And User should click the login button
    Then User should verify success message after login
    And User should search the hotel
    And User should select the hotel
    And User should book the hotel
    And User should logoff

    Examples: 
      | username       | password |
      | IronmanCaptain | Y00899   |
      
      
      @adactin_Booking_Confirmation
  Scenario Outline: Verify User is able Select Product after Login
    Given User should launch the browser
    When User should write "<username>" and "<password>"
    And User should click the login button
    Then User should verify success message after login
    And User should search the hotel
    And User should select the hotel
    And User should book the hotel
    Then User should get the booking confirmation along with the orderID
    And User should logoff

    Examples: 
      | username       | password |
      | IronmanCaptain | Y00899   |
      


  