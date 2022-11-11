Feature: Online Status Functionality
  User Story :

  As a user, I should be able to change my online status and set a status message

  Acceptance Criteria:

  User can view Online Status
  User can change Online Status
  User can set a status message from any default options
  User can set a custom status message with also using any emoji option provided
  User can clear status message or set a time to clear the message automatically

  Background: For the scenarios in the feature file, user is expected to be on dashboard page
    #@CEA-1070
    #Given user is on the Ceallo dashboard page

  @CEA-1071
  Scenario: Verify if user can view Online Status
    When user clicks on the User Icon
    Then user can see current user status under the User Icon
    When user clicks on current user status
    Then verify if user can view all online status on the page

  @CEA-1072
  Scenario Outline: Verify if user can change Online Status
    When user clicks on the User Icon
    And user clicks on current user status
    And user clicks on one from the available status "<onlineStatus>"
    And user clicks on close window button
    And user clicks on the User Icon
    Then verify user can see valid user status under the user icon "<onlineStatus>"
    Examples:
      | onlineStatus   |
      | Online         |
      | Away           |
      | Invisible      |
      | Do not disturb |

  @CEA-1078
  Scenario Outline: Verify if user can set a status message from any default options
    When user clicks on the User Icon
    And user clicks on current user status
    And user chose a status message from default options "<defaultStatusMessage>"
    And user clicks on Set Status Message button
    And user clicks on the User Icon
    Then verify user can see valid user status under the user icon "<actualStatusMessage>"
    Examples:
      | defaultStatusMessage | actualStatusMessage |
      | In a meeting         | In a meeting        |
      | Commuting            | Commuting           |
      | Working remotely     | Working remotely    |
      | Out sick             | Out sick            |
      | Vacationing          | Vacationing         |

@CEA-1089
  Scenario: Verify that user can set a custom status message with also using any emoji option provided
    When user clicks on the User Icon
    And user clicks on current user status
    When user clicks on online status message input box
    And user types a custom status message "My status"
    And user clicks on emoji option menu and choose one emoji "mouse2"
    And user clicks on Set Status Message button
    And user clicks on the User Icon
    Then verify user can see valid user status under the user icon "My status"

@CEA-1090
  Scenario Outline: Verify that user can clear status message
    When user clicks on the User Icon
    And user clicks on current user status
    And user chose a status message from default options "<defaultStatusMessage>"
    And user clicks on Set Status Message button
    And user clicks on the User Icon
    And user clicks on current user status
    And user clicks on Clear status message button
    And user clicks on the User Icon
    Then verify user is not see default status "<defaultStatusMessage>" under the user icon
    Examples:
      | defaultStatusMessage |
      | In a meeting         |
      | Commuting            |
      | Working remotely     |
      | Out sick             |
      | Vacationing          |

Scenario: Verify that user can set a time to clear the message automatically
  When user clicks on the User Icon
  And user clicks on current user status
  And user chose a status message from default options "Vacationing"
  And user clicks on dropdown and choose one of the option - "Don't clear"
  And user clicks on Set Status Message button
  And user clicks on the User Icon
  And user clicks on current user status
  Then verify user can see valid option - "Don't clear" - on the clearStatusDropdown


