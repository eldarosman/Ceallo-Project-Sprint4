Feature:
  Agile Story : As a user, I should be able to search file or contact from the Dashboard and see the photos under Photos Module

  Acceptance Criteria:
  AC1: User can search file typing its name through the magnifying glass icon and see the details side page of the file when clicked on it.
  AC2: User can search contacts by clicking on the contacts icon and typing its name
  AC3: User can also see the images files under the Photos module when uploaded them
  AC4: User can navigate to the Dashboard page whenever clicking the Ceallo icon at the top left corner on the page

  @CEA-1073 @1 @wip
  Scenario: File search verification
    When user click on the Search icon
    And user enters a file name PicturePhoto1
    And user click on the file name
    Then user should see a new page with the file name, size

  @CEA-1074 @2 @wip
  Scenario: Contacts search verification
    When user click on contacts searching icon
    And user enters a contact name "Ukraine Patriot"
    Then user should see the contact name

  @CEA-1075 @3 @wip
  Scenario: Uploaded images under Photos module verification
    When user click on Photo module icon
    Then user should see all the images files on that page

  @CEA-1076 @4 @wip @smoke
  Scenario: Navigating to the Dashboard page verification
    When user click on Ceallo icon at the top left corner
    Then user should see Dashboard page
