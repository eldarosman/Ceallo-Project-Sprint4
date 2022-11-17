@taskModule
Feature: Task module functionality
  User Story :  As a user, I should be able to create a new task list
                or a single task and add any task to completed
                and importants tasks list.
  Acceptance Criteria:
      User can create a new list of tasks**
      User can create a new task
      User can add any task to the list of completed tasks by clicking on the checkbox near the task name
      User can add any task to the list of important tasks by clicking on the star icon on the right side of task line
      User can see the number of all uncompleted tasks next to the Current tab

  @CEA-1097
  Scenario: User should be able to create a new list of tasks
    Given user on the Tasks module
    When user click on Add List button
    And user enters name of List "Pizza List"
    And user click on Save button
    Then user should see just created list "Pizza List" in page

  @CEA-1098
  Scenario: User should be able to create new task
    Given user on the Tasks page
    When user click on "Pizza List"
    And user enters a new task "Peperoni"
    Then user should see a new task in List

  @CEA-1099
  Scenario: Verifying adding any task to the important tasks
    Given user on the Tasks page
    When user click on "Pizza List"
    And user click on the star icon
    And user click "Important" navigation list
    Then user should see "Peperoni" task

  @CEA-1100 @smoke
  Scenario: Verifying numbers of uncompleted tasks
    Given user on the Tasks page
    Then user sees numbers of uncompleted tasks in current tab

  @CEA-1101
  Scenario: completing task functionality
    Given user on the Tasks page
    When user click on "Pizza List"
    And user click on checkbox
    And user click on "Completed" navigation list
    Then user should see "Peperoni" task

