Feature: Test facebook application

  Scenario: Test Register page FB functionality
    Given user is on the register page
    When user enter valid firstname, lastname , username and password
      | Pooja | Mane | pooja@gmail.com | Pooja@123 |
    And user select valid DOB
      | 15 | Feb | 2001 |
    And user select the gender
      | gender |
      | female   |
