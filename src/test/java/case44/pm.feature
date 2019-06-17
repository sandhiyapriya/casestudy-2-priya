

Feature: user want to add category 
as a admin user want to add some category
  @tag1
  Scenario: user adding a category
    Given i want to open url
    And login in testme as admin
    And i write category name as"Electronics"
    And i write sub-category as "Head Phone"
    And i write product name as "Jabra 11"
    And i write price as "$300"
    And i write quantity as "10"
    And i write brand as "Jabra"
    And i write description as "Head Phone suitable for office"
    Then add some category