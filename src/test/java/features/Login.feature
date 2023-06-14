Feature: Login Functionality Checking

  @Release
  Scenario Outline: Check login Empty Data
    Given Enter username "<Email>"
    And Enter password "<Password>"
    When click on login button
    Then Error message should be displayed


    Examples:
      | Email | Password |
      |       |          |

  @Release
  Scenario Outline: Check empty username & valid password
    Given Enter username "<Username>"
    And Enter password "<Password>"
    When click on login button
    Then Error message should be displayed

    Examples:
      | Username | Password    |
      |          | SPOLAR@2022 |