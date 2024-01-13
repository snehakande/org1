Feature: Test Facebook application

  Scenario Outline: Test Register page Functionality
    Given user is on register page
    When user enter "<firstname>" , "<lastname>" and "<username>"
    And user select "<date>" , "<month>" and "<year>"
    And user select "<gender>"

    Examples: 
      | firstname | lastname | username         | date | month | year | gender |
      | Sagar     | Pote     | Sagar@gmail.com  |   10 | Jan   | 2010 | male   |
      | abc1      | Pote1    | Sagar1@gmail.com |   20 | Mar   | 2011 | male   |
      | abc2      | Pote2    | Sagar2@gmail.com |   30 | Jun   | 2011 | male   |
      | abc3      | Pote3    | Sagar3@gmail.com |   22 | Dec   | 2013 | male   |
