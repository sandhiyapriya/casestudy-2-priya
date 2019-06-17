
Feature: user want to add category 
as a admin user want to add some categor
  @tag1
  Scenario: user adding a category
    Given i want to open url
    And login in testme as admin
   And mandatory fields 
  |Category Name |Product Name|
  |sports        |football    |
  |sports        |volleyball  |
    Then add some category