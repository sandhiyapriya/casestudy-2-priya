$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:priya5/6.feature");
formatter.feature({
  "name": "login",
  "description": "i want to login",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "success",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "login",
  "keyword": "Given "
});
formatter.match({
  "location": "demo31.login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "priya",
        "nivi"
      ]
    },
    {
      "cells": [
        "janu",
        "tamil"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "demo31.enter_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close",
  "keyword": "And "
});
formatter.match({
  "location": "demo31.close()"
});
formatter.result({
  "status": "passed"
});
});