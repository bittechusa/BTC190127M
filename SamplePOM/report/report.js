$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/bittechconsulting/Desktop/BTC190127M/SamplePOM/loginfb.feature");
formatter.feature({
  "line": 1,
  "name": "login Validation",
  "description": "",
  "id": "login-validation",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "nevigate to URL",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinatioFb.open_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinatioFb.nevigate_to_URL()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 7,
  "name": "valid credential",
  "description": "",
  "id": "login-validation;valid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user type userId and password",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should see his profile page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinatioFb.user_type_userId_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinatioFb.user_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinatioFb.user_should_see_his_profile_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "invalid credential",
  "description": "",
  "id": "login-validation;invalid-credential",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@reg"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user type \"\u003cuserId\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user should not see his profile page",
  "keyword": "Then "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "login-validation;invalid-credential;",
  "rows": [
    {
      "cells": [
        "userId",
        "password"
      ],
      "line": 22,
      "id": "login-validation;invalid-credential;;1"
    },
    {
      "cells": [
        "user1",
        "1232"
      ],
      "line": 23,
      "id": "login-validation;invalid-credential;;2"
    },
    {
      "cells": [
        "user2",
        "3524"
      ],
      "line": 24,
      "id": "login-validation;invalid-credential;;3"
    },
    {
      "cells": [
        "user3",
        "5346"
      ],
      "line": 25,
      "id": "login-validation;invalid-credential;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "nevigate to URL",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinatioFb.open_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinatioFb.nevigate_to_URL()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 23,
  "name": "invalid credential",
  "description": "",
  "id": "login-validation;invalid-credential;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@reg"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user type \"user1\" and \"1232\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user should not see his profile page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "user1",
      "offset": 11
    },
    {
      "val": "1232",
      "offset": 23
    }
  ],
  "location": "StepDefinatioFb.user_type_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinatioFb.user_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinatioFb.user_should_not_see_his_profile_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "nevigate to URL",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinatioFb.open_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinatioFb.nevigate_to_URL()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 24,
  "name": "invalid credential",
  "description": "",
  "id": "login-validation;invalid-credential;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@reg"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user type \"user2\" and \"3524\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user should not see his profile page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "user2",
      "offset": 11
    },
    {
      "val": "3524",
      "offset": 23
    }
  ],
  "location": "StepDefinatioFb.user_type_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinatioFb.user_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinatioFb.user_should_not_see_his_profile_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "nevigate to URL",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinatioFb.open_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinatioFb.nevigate_to_URL()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 25,
  "name": "invalid credential",
  "description": "",
  "id": "login-validation;invalid-credential;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@reg"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user type \"user3\" and \"5346\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user should not see his profile page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "user3",
      "offset": 11
    },
    {
      "val": "5346",
      "offset": 23
    }
  ],
  "location": "StepDefinatioFb.user_type_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinatioFb.user_click_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinatioFb.user_should_not_see_his_profile_page()"
});
formatter.result({
  "status": "skipped"
});
});