
@tag
Feature: adding a new product to Testme application 
user has to login as admin in testme application .

  @tag1
  Scenario: user has to login as admin
  Given i have to enter url and open web
  Then i have to enter username as admin
  And i have to enter an admin password
  And i have to click on login button 
  Then i have to enter all mandatory details
  And i click on addproduct button
  Then i need to enter username as user
  And i have to enter an user password
  And i have to click on login button 
  And i have to select product
  Then i have to add to cart
  