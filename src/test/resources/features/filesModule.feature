Feature:  Deleted Files Tab Functionality under Files Module
  Agile story: As a user, when i am able to see all deleted files and delete or restore them permanently under the
  Deleted files tab

  @CEA-1126
  Scenario: Search most recent deleted file in the first line of the deleted file list
    When user click Deleted files button
    Then user should see most recent deleted file in the first line of the deleted file list

  @CEA-1127
  Scenario: Order the all deleted files by newest to oldest or visa versa
    When user on Delete files button and click
    And user click Deleted button
    Then user should see ordering all deleted files by newest to oldest or vista versa

  @CEA-1128
  Scenario:  Ordering  alphabetically all the deleted files based on their names
    When user is on Deleted file page
    And user clicks Name button
    Then user should see ordering  alphabetically all the deleted files based on their names

  @CEA-1129
  Scenario: Deleting File
    When user is on Deleted file page
    And click three dots icon
    And user click Delete files button
    Then user should see the file is deleted

  @CEA-1130 @smoke
  Scenario: Restoring File
    When user is on Deleted files page
    And user click Restore button
    Then user should see file is restore