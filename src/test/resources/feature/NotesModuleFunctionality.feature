Feature: Notes Module Functionality

  User Story:As a user, I should be able to create/delete any note and see the details of the note.

  Background: User is on the home page of the Ceallo app

  Scenario: User should be able to create a new note
    When user clicks to notes module
    And user click to "+" button
    And user types a  note
    Then user should be able to see the new note added


  Scenario: User should be able to add any note to the favorites
    When user clicks to the dots in the right corner
    And user clicks to the "Details" of the note
    And user clicks to the star in the left of note
    Then user should be able to see the star added to the title of the  note

  Scenario: User should be able to see the number of letters and words that the note includes under the note title when clicked on the details of the note
    When user clicks to the dots in the right corner
    And user clicks to the "Details" of the note
    Then user should be able to see the number of letters and words under the note title

  Scenario: User should be able to  create a new category by passing a new category name from inside the notes details
    When user clicks to the dots in the right corner
    And user clicks to the "Details" of the note
    And types a new category name inside the notes details  and clicks enter
    Then user should be able to see the new category was added in the category column

  Scenario: User should be able to delete any note
    When user clicks to the 3 dots in the right of the title note
    And user clicks to delete option
    Then user should be able to see a message in the right corner and the note  removed


