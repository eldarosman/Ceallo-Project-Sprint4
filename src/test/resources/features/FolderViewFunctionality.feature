Feature: Folder View Functionality
  Agile story: As a user, I should be able to change folder view order by using Name/Size/Modified buttons

  Background:
  Given: the user is on the home page.

    @CEA-1108
  Scenario: User can change folder view order by Name
    Given user is on home page
    When user navigate to Files button and clicks
    And user navigate to Name button and click
    Then User verify that user can change folder view order by Name

    @CEA-1109
  Scenario: User can change folder view order by Size
    Given user is on homePAGE
    When user navigate to Files BUTTON and clicks
    And user navigate to Size button and click
    Then User verify that user can change folder view order by Size

  @CEA-1110
  Scenario: User can change folder view order by Modified
    Given user is on HOME page
    When user navigate to Files Button and clicks
    And user navigate to Modified button and click
    Then User verify that user can change folder view order by Modified

@CEA-1111
  Scenario: User can change the folder view by clicking the toggle-view button at the right corner of all files tab screen
    Given user is on Home page
    When user navigate to FilesButton and clicks
    And user navigate to toggle-view button and click
    Then User verify that user can change the folder view by clicking the toggle-view button

  @smoke
  Scenario: User can select all the files at once and see the total values of all files in the first line when clicked on the “select all” checkbox at the left top corner of the list
    Given user is on homePage
    When user navigate to FILES button and clicks
    And user navigate to “select all” checkbox and click
    Then User verify that user can select all the files at once
    Then User verify that user can see the total values of all files
