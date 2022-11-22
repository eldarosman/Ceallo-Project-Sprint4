  @talkModuleTag
Feature: Talk Module Functionality
  Agile story: As a user, I should be able to create/delete conversation groups
  and chat with other co-workers under Talk Module

  @CEA-1084 @smoke
Scenario: User can create a new group conversation by adding other users
  Given user is on Talk page
  When user create new group conversation
  And user add other users
  Then new group conversation is created

  @CEA-1085
Scenario: User can can see the participants of the conversation
  Given user is on Talk page
  When user click on conversation
  Then user can see the participants of the conversation

  @CEA-1086
Scenario: User can remove any participant from the conversation
  Given user is on Talk page
  When user click on conversation
  Then user can remove any participant from the conversation

  @CEA-1087
Scenario: User can send messages by typing inside the inputbox
  Given user is on Talk page
  When user click on conversation
  And user type a massage inside the inputbox
  Then user can send this massage

  @CEA-1088
 Scenario: User can delete any group conversation previously created
   Given user is on Talk page
   When user click on conversation
   Then user can delete this conversation