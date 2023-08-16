Feature: Login Functionality Checking

  @Release
    Scenario: Verify that the Login page is displayed correctly.
    Given Verify that the Home page is displayed correctly
    Then Verify that the Login Option is displayed correctly
    When Click on Login Option
    Then Verify that the Login page is displayed correctly



  @Release
  Scenario Outline: Check login Functionality with Empty Data
    Given Verify that the Home page is displayed correctly
    Then Verify that the Login Option is displayed correctly
    When Click on Login Option
    Then Verify that the Login page is displayed correctly
    And Verify that the Email field displayed correctly
    And Enter username "<Email>"
    And Verify that the password field displayed correctly
    And Enter password "<Password>"
    And Verify that the login button displayed correctly
    When click on login button
    Then Error message should be displayed

    Examples:
      | Email | Password |
      |       |          |

  @Release
  Scenario Outline:  Check login Functionality with empty username & valid password
    Given Verify that the Home page is displayed correctly
    Then Verify that the Login Option is displayed correctly
    When Click on Login Option
    Then Verify that the Login page is displayed correctly
    And Verify that the Email field displayed correctly
    And Enter username "<Email>"
    And Verify that the password field displayed correctly
    And Enter password "<Password>"
    And Verify that the login button displayed correctly
    When click on login button
    Then Error message should be displayed

    Examples:
      | Email | Password    |
      |       | asdfgh1234 |

  @Release
  Scenario Outline:  Check login Functionality with valid username & empty password
    Given Verify that the Home page is displayed correctly
    Then Verify that the Login Option is displayed correctly
    When Click on Login Option
    Then Verify that the Login page is displayed correctly
    And Verify that the Email field displayed correctly
    And Enter username "<Email>"
    And Verify that the password field displayed correctly
    And Enter password "<Password>"
    And Verify that the login button displayed correctly
    When click on login button
    Then Error message should be displayed

    Examples:
      | Email                  | Password |
      | saharahul353@gmail.com |          |

  @Release
  Scenario Outline:  Check login Functionality with valid username & password
    Given Verify that the Home page is displayed correctly
    Then Verify that the Login Option is displayed correctly
    When Click on Login Option
    Then Verify that the Login page is displayed correctly
    And Verify that the Email field displayed correctly
    And Enter username "<Email>"
    And Verify that the password field displayed correctly
    And Enter password "<Password>"
    And Verify that the login button displayed correctly
    When click on login button
    Then Verify that the Home page is displayed correctly

    Examples:
      | Email                  | Password   |
      | saharahul353@gmail.com | asdfgh1234 |