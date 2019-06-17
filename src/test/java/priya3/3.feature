
@tag
Feature: Title of your feature
  I want to use this template for my feature file


  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to enter username "<u_name>" in username field
    When I enter password "<password>" in password field
    Then clock on login

    Examples: 
      |u_name  | password | 
      | priya  |     abc  |
      | nivas  |     xyz  | 
      | janu   |    tamizh|
      |saro    | loose    |