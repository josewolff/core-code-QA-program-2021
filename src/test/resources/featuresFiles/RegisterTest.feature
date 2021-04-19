Feature: myFirstTest

  Scenario: Missing the firstName Field
    Given a user goes to "http://localhost:7000/register.html"
    When the user fills the firstname with "milo"
    And the user fills the lastname with "milo"
    And the user fills the email with "milo@core-core.com"
    And the user fills the passwords with "milo12345"
    And the user fills the repeat password with "milo12345"
    And clicks the Register account
    Then the user should be redirected to "/login.html"


  Scenario: Missing the firstName Field2
    Given a user goes to "http://localhost:7000/register.html"
    When the user fills the firstname with "milo"
    And the user fills the lastname with "milo"
    And the user fills the email with "milo@core-core.com"
    And the user fills the repeat password with "milo12345"
    And clicks the Register account
    Then the user should be redirected to "/login.html"


  Scenario: Missing the firstName Field2
    Given a user goes to "http://localhost:7000/register.html"
    When the user fills the firstname with "milo"
    And the user fills the lastname with "milo"
    And the user fills the passwords with "milo12345"
    And the user fills the repeat password with "milo12345"
    And clicks the Register account
    Then the user should be redirected to "/login.html"