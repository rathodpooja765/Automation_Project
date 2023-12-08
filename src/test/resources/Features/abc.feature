Feature: Testing login page

  Scenario: check loging is sucessful with valid credential
    Given User is on login page
    When User enter username
    When User enter password
    Then Click on login butten
