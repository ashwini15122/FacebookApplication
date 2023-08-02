Feature: Test Facebook Registration Application

  Scenario Outline: Test facebook registration page
    Given User is on registration on "chrome"
    
    Then User enter valid "<firstname>" and "<lastname>" and "<email>" and "<password>" and "<birthdaydate>" and "<birthdaymonth>" and "<birthdayyear>" and "<gender>"

    Examples: 
      | firstname | lastname | email     | password | birthdaydate | birthdaymonth | birthdayyear | gender |
      | abc1      | xyz1     | abc1@.com |     1234 |            5 | Aug           |         1997 | male   |
      | abc2      | xyz2     | acb2@.com |    12345 |           22 | Dec           |         2000 | female |
    
  