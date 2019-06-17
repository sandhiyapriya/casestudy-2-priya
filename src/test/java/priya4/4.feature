
Feature: login testme app
i want to login testme application

  @tag1 @tag3
  Scenario: successfull login
  Given enter username as "priya"
  And enter password as "nivi"
  Then click on Login button
  @tag1 @tag3
 Scenario: successfull product
  Given i need to enter product name as "headphone"
  And add a product to cart as 1
  And make payment
  @tag3
  Scenario: payment made
  Given i need to click bank as " canara"
  And click on continue
  
  @tag4
  Scenario: logout
  Given i need to close th browser
  