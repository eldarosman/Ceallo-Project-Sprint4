Feature: Contacts Module Functionality

  User Story :
  As a user, I should be able to create a new contact and edit/delete any contact under Contacts module

  Acceptance Criteria:
  User can create a new contact
  User can see all the contacts as a list inside the middle column and total number of the contacts near the “All Contacts” tab
  User can change the profile picture of any contact with a previously uploaded picture by using “Choose from files” option
  User can delete any selected contact

  Scenario: User can create a new contact
    Given user is on the contact module
    When user clicks new contact icon
    Then verify new contact was created