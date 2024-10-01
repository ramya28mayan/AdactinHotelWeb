@tag1
Feature: Verifying the booking functionality 
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
    And User should logoff

    Examples: 
      | username       | password |
      | IronmanCaptain | DLXY5Q   |
