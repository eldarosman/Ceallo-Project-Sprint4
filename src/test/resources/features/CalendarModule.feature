@CEA-1124
Feature: Display all type of calendar and create/delete event through Monthly Calendar
  User Story: As a user, I should be able to see Daily-Weekly-Monthly calendar view and create a new event under the Calendar module



  @CEA-1119
  Scenario: User can display daily calendar view
    When User can click Calendar on Module, click dropdown Menu and select Day Option
    Then User can see daily calendar

  @CEA-1120
  Scenario: User can display weekly calendar view
    When User can click Calendar on Module, click Dropdown Menu and select Week Option
    Then User can see weekly calendar

  @CEA-1121
  Scenario: User can display monthly calendar view
    When User can click Calendar on Module, click dropdown Menu and select Month Option
    Then User can see monthly calendar


  @CEA-1122 @smoke
  Scenario: User can create a new event and see it on the related day through the Monthly Calendar view
    When User can click new event and give name
    Then User can see the event on monthly calendar view

  @CEA-1123 @smoke
  Scenario: User can delete the event
    When User can click event name on calendar and delete it
    Then User can see calendar that event is deleted