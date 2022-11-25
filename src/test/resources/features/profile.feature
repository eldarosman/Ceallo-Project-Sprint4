Feature: Ceallo user profile feature

  Background: user logged in user profile
    Given user click user profile button
    When user click Settings button
  @CEA-1066  @wip
  Scenario: User can see at least following titles inside personal info
  under Profile Settings page;         =>Full name/Email/Phone Number
    Then user verify that full name, email and phonenumber

  @CEA-1067  @smoke
  Scenario:User can change Full name info under Profile Settings page
    Given user enters name into Full name inputbox
    When user verify the name in the inputbox

  @CEA-1068  @smoke
  Scenario: User can make "Phone number" info as private under Profile Settings page
    Given user click phone number s Private button


  @CEA-1069
  Scenario: User can see the current local time under the Local dropdown
    Given user verify that local time appears
    