
Feature: Adding to Favorites/Rename/Comment on File module functionality
  Agile story: As a user, I should be able to add a file to favorites, rename any file and give some comments on any file.
  AC1. User can add any file to favorites from its own three dots menu
  AC2. User can rename any file from its own three dots menu
  AC3. User can put some comments on any file from the file details menu opened right side
  AC4. User can delete the comments made on any file from the file details menu opened right side

  @CEA-1114 @1 @wip @smoke
  Scenario: Adding of any file to favorites verification
    When user clicks Add to favorites
    Then folder should be added to favorites

  @CEA-1115 @2 @wip
  Scenario: Renaming of any file verification
    When user clicks Rename
    And user enters a New name for file or folder and presses Enter key
    Then user should be able to see a changed name of file or folder

  @CEA-1116 @3 @wip
  Scenario: Adding of some comments on any file verification
    When user clicks Details
    And user clicks Comments
    And user enters a New comment text for file or folder and presses Enter key
    Then user should be able to see a recently written comment

  @CEA-1117 @4 @wip
  Scenario: Deleting of any comment verification
    When user clicks on three dot icon near the comment that should be deleted
    And user clicks on delete comment button
    Then comment should be deleted