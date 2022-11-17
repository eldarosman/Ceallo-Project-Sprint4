@CEA-1125
Feature: Notes Module Functionality

  User Story:As a user, I should be able to create/delete any note and see the details of the note.

  Scenario: User should be able to create a new note
    When user clicks on the notes module
    And user click on the + button
    Then user should be able to see the new note added

  Scenario: User should be able to see the number of letters and words that the note includes under the note title when clicked on the details of the note
    When user clicks one note
    And user clicks on the dots in the right corner
    And user clicks on the details
    Then user should be able to see the number of letters and words under the note title

@smoke
  Scenario: User should be able to add any note to the favorites
   When  user clicks note module
    And user clicks new note button
    And user clicks on the dots butoon
    And user clicks on the favorite option
    Then user should be able to see the note added to favorite


  Scenario: User should be able to  create a new category by passing a new category name from inside the notes details
  When user clicks note module
    When user clicks to dots button
    And user clicks to the note details
    And types a new category name and clicks enter
    Then user should be able to see the new category was added in the category column


  Scenario: User should be able to delete any note
  When user clicks on the note module
  When user clicks on the dots of the note
    And user clicks on the delete option
    Then user should be able to see a message in the right corner and the note removed



