Feature: Login

  Scenario Outline: Login with valid credentials
    Given I am on the Snipe It App Demo Login page
    When I set the username to '<username>'
    And I set the password to '<password>'
    And I click button Login
    Then Dashboard page is open
    And "Success: You have successfully logged in." message is displayed

    Examples:
      | username  | password  |
      | admin | password   |