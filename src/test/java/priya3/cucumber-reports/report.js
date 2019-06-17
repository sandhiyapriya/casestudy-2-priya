$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:priya3/3.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "I want to enter username \"\u003cu_name\u003e\" in username field",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter password \"\u003cpassword\u003e\" in password field",
  "keyword": "When "
});
formatter.step({
  "name": "clock on login",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "u_name",
        "password"
      ]
    },
    {
      "cells": [
        "priya",
        "abc"
      ]
    },
    {
      "cells": [
        "nivas",
        "xyz"
      ]
    },
    {
      "cells": [
        "janu",
        "tamizh"
      ]
    },
    {
      "cells": [
        "saro",
        "loose"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "I want to enter username \"priya\" in username field",
  "keyword": "Given "
});
formatter.match({
  "location": "demo16.i_want_to_enter_username_in_username_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password \"abc\" in password field",
  "keyword": "When "
});
formatter.match({
  "location": "demo16.i_enter_password_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clock on login",
  "keyword": "Then "
});
formatter.match({
  "location": "demo16.clock_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "I want to enter username \"nivas\" in username field",
  "keyword": "Given "
});
formatter.match({
  "location": "demo16.i_want_to_enter_username_in_username_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password \"xyz\" in password field",
  "keyword": "When "
});
formatter.match({
  "location": "demo16.i_enter_password_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clock on login",
  "keyword": "Then "
});
formatter.match({
  "location": "demo16.clock_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "I want to enter username \"janu\" in username field",
  "keyword": "Given "
});
formatter.match({
  "location": "demo16.i_want_to_enter_username_in_username_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password \"tamizh\" in password field",
  "keyword": "When "
});
formatter.match({
  "location": "demo16.i_enter_password_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clock on login",
  "keyword": "Then "
});
formatter.match({
  "location": "demo16.clock_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "I want to enter username \"saro\" in username field",
  "keyword": "Given "
});
formatter.match({
  "location": "demo16.i_want_to_enter_username_in_username_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password \"loose\" in password field",
  "keyword": "When "
});
formatter.match({
  "location": "demo16.i_enter_password_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clock on login",
  "keyword": "Then "
});
formatter.match({
  "location": "demo16.clock_on_login()"
});
formatter.result({
  "status": "passed"
});
});