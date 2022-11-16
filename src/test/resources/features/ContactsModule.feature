Feature: Contacts Module Functionality

  User Story :
  As a user, I should be able to create a new contact and edit/delete any contact under Contacts module

  Acceptance Criteria:
  User can create a new contact
  User can see all the contacts as a list inside the middle column and total number of the contacts near the “All Contacts” tab
  User can change the profile picture of any contact with a previously uploaded picture by using “Choose from files” option
  User can delete any selected contact

  Background: For scenarios in the feature file user is expected to be on the Contacts module
    Given user is on the contact module

  @CEA-1092 @smoke
  Scenario: User can create a new contact
    When user clicks new contact icon
    Then verify new contact was created

  @CEA-1094
  Scenario: User can see the contacts and number of contacts
    When user is on the contact module
    Then verify user can see the list of contacts and number of contacts

  @CEA-1095 @smoke
  Scenario: User can delete any selected contact
    When user clicks contact options
    And user click delete option
    Then verify contact was deleted

  @CEA-1096
  Scenario: User can change profile picture with the existing options
    When user clicks picture options
    And user clicks choose from files option
    And user chooses an option
    And user clicks choose button
    Then verify the picture is displayed