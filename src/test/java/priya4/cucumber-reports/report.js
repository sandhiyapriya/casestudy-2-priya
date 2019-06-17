$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:priya4/4.feature");
formatter.feature({
  "name": "login testme app",
  "description": "i want to login testme application",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "successfull login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    },
    {
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "name": "enter username as \"priya\"",
  "keyword": "Given "
});
formatter.match({
  "location": "demo19.enter_username_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password as \"nivi\"",
  "keyword": "And "
});
formatter.match({
  "location": "demo19.enter_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Login button",
  "keyword": "Then "
});
formatter.match({
  "location": "demo19.click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "successfull product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    },
    {
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "name": "i need to enter product name as \"headphone\"",
  "keyword": "Given "
});
formatter.match({
  "location": "demo21.i_need_to_enter_product_name_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add a product to cart as 1",
  "keyword": "And "
});
formatter.match({
  "location": "demo21.add_a_product_to_cart_as(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "make payment",
  "keyword": "And "
});
formatter.match({
  "location": "demo21.make_payment()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "payment made",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "name": "i need to click bank as \" canara\"",
  "keyword": "Given "
});
formatter.match({
  "location": "demo21.i_need_to_click_bank_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on continue",
  "keyword": "And "
});
formatter.match({
  "location": "demo21.click_on_continue()"
});
formatter.result({
  "status": "passed"
});
});