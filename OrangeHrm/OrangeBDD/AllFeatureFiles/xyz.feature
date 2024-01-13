Feature: Test Facebook application

  Scenario: Test Register page Functionality
    Given user is on register page
    When user enter firstname , lastname and username
      | Sagar   | Pote   | Sagar@gmail.com   |
      | Amar    | Salve  | amar@gmail.com    |
      | Aboli   | Shinde | aboli@gmail.com   |
      | Pallavi | Shinde | pallavi@gmail.com |
    And user select dob
    And use select gender
