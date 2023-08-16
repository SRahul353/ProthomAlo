Feature: HomePage Functionality Checking


  @Release
  Scenario: Verify that the Home page is displayed correctly.
    Given Verify that the Home page is displayed correctly

  @Release
  Scenario: Verify that the Prothom Alo Application Title displayed correctly.
    Given Verify that the Home page is displayed correctly
    Then Verify that the Prothom Alo Application Title displayed correctly.

  @Release
  Scenario: Verify that the Top navigation bar is displayed correctly
    Given Verify that the Home page is displayed correctly
    Then Verify that the Prothom Alo Application Title displayed correctly.
    And Verify that the Top navigation bar is displayed correctly

  @Release
  Scenario: Verify that the side navigation bar is showing and work properly
    Given Verify that the Home page is displayed correctly
    Then Verify that the Prothom Alo Application Title displayed correctly.
    And Verify that the Ham burger icon is displayed correctly
    When Click on the Ham burger icon
    Then Verify that the side navigation bar displayed correctly
    And Verify that the Home Menu is available on side navigation bar
    When Click on Home Menu on side navigation bar
    Then Verify that the Home page is displayed correctly

  @Release
  Scenario: Verify that the Search News is work properly
    Given Verify that the Home page is displayed correctly
    Then Verify that the Prothom Alo Application Title displayed correctly.
    And Verify that the Search icon is displayed correctly
    When Click on Search icon
    Then Verify that the Search field displayed correctly
    And Input "news" keyword in the Search field
    When Click on Search Button
    Then Verify that the Search result Page is displayed correctly


