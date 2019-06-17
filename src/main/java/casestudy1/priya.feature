
Feature: adding a new product to Testme application 
user has to login as admin in testme application .


  Scenario:user has to login as admin
  Given i have to enter url and open web
  Then i have to enter username as admin
  And i have to enter an admin password
  And i have to click on login button 
  Scenario: admin has to add a product
  Then i have to enter all mandatory details
  And i click on addproduct button
  And i click on signout
  