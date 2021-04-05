Feature: test

  Background: common tag
    Given a user enter "https://youtube.com"

  Scenario: sumaNumber
    When a user add 2
    Then the result should be 4