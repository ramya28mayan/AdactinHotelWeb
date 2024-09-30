Feature: Verifying the booking hotel functionality in Adactin Hotel

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
      | IronmanCaptain | DLXY5Q   |

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
      | IronmanCaptain | DLXY5Q   |

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
      | IronmanCaptain | DLXY5Q   |
      
      
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
      | IronmanCaptain | DLXY5Q   |
      
      
      @adactin_Booked_Iternary
  Scenario Outline: Verify User is able Select Product after Login
    Given User should launch the browser
    When User should write "<username>" and "<password>"
    And User should click the login button
    Then User should verify success message after login
    And User should search the hotel
    And User should select the hotel
    And User should book the hotel
    Then User should get the booking confirmation along with the orderID
    And Search for the order ID in the list of Booked Iternary
    #And User should logoff

    Examples: 
      | username       | password |
      | IronmanCaptain | DLXY5Q   |
      
