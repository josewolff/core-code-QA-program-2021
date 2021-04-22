@outline
Feature: CREATE NEW ACCOUNT TEST

  Background: Go to the page
    Given that we create a new account on "http://localhost:7000/register.html"


  Scenario Outline: Complete form
    When we add the firstname as <firstname>
    And we add the lastname as <lastname>
    And we add the email as <email>
    And we add the password as <password>
    And we add the repeat password as <repeatPassword>
    And we clicks the register account button
    Then the page should have the url <expectedUrl>
    Examples:
      | firstname | lastname  |     email       | password   | repeatPassword | expectedUrl  |
      | "GERSON"  | "BELTRAN" | "G.B@GMAIL.COM" | "PASSWORD" | "PASSWORDS"    | "/login.html"|
      | ""        | "BELTRAN" | "G.B@GMAIL.COM" | "PASSWORD" | "PASSWORDS"    | "/login.html"|
      | "GERSON"  | ""        | "G.B@GMAIL.COM" | "PASSWORD" | "PASSWORDS"    | "/login.html"|
      | "GERSON"  | "BELTRAN" | ""              | "PASSWORD" | "PASSWORDS"    | "/login.html"|


