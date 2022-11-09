Feature: Ceallo app login feature
  @Ceallo
  Scenario: User login with valid credentials
    When user click on the login icon
    And user enters username and password
    Then user should see Dashboard
  @Ceallo
  Scenario: User can upload a file
    Given user click + button in files page
    When user click upload file button
  @Ceallo
  Scenario: User can create a new folder
    When user click New folder button
    Then user types a folder name

  Scenario: User can move or copy any selected item to any folder
    Given user select a file in a folder
    When user click threeDots sign
    Then user click Move or copy button
    And user select a folder to move or copy
    And user click Copy to  or Move to button