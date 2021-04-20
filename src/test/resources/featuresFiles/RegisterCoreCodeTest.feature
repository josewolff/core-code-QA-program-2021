Feature: CREATE NEW ACCOUNT TEST

  Scenario: Fill firstname and lastname.
    Given that we create a new account on "http://localhost:7000/register.html"
    When we add the firstname as "Gerson"
    And we add the lastname as "beltran"
    Then the firstname should be a String
    And the lastname shouuld be a String