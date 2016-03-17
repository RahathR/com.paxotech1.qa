$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("heatclinicLongin.feature");
formatter.feature({
  "id": "broadleaf-commerce-login-functionality",
  "description": "",
  "name": "Broadleaf Commerce Login Functionality",
  "keyword": "Feature",
  "line": 1
});
formatter.before({
  "duration": 2959837494,
  "status": "passed"
});
formatter.scenario({
  "id": "broadleaf-commerce-login-functionality;1.-valid-user-valid-password",
  "description": "",
  "name": "1. Valid User Valid Password",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "As a  validated user",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "Browse to the application",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "Broadleaf HomePage should show",
  "keyword": "Then ",
  "line": 7
});
formatter.step({
  "name": "User click login button",
  "keyword": "When ",
  "line": 8
});
formatter.step({
  "name": "Enter \"rahath43@gmail.com\" as email address",
  "keyword": "And ",
  "line": 9
});
formatter.step({
  "name": "Enter \"abcdefg\" as password",
  "keyword": "And ",
  "line": 10
});
formatter.step({
  "name": "Click login",
  "keyword": "And ",
  "line": 11
});
formatter.step({
  "name": "valid email or password message display",
  "keyword": "Then ",
  "line": 12
});
formatter.step({
  "name": "Welcome message shows",
  "keyword": "And ",
  "line": 13
});
formatter.match({
  "location": "HeatclinicLoginStepcucumber.as_a_validated_user()"
});
formatter.result({
  "duration": 201180946,
  "status": "passed"
});
formatter.match({
  "location": "HeatclinicLoginStepcucumber.browse_to_the_application()"
});
formatter.result({
  "duration": 1008866979,
  "status": "passed"
});
formatter.match({
  "location": "HeatclinicLoginStepcucumber.broadleaf_HomePage_should_show()"
});
formatter.result({
  "duration": 58550877,
  "status": "passed"
});
formatter.match({
  "location": "HeatclinicLoginStepcucumber.user_click_login_button()"
});
formatter.result({
  "duration": 6874078549,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rahath43@gmail.com",
      "offset": 7
    }
  ],
  "location": "HeatclinicLoginStepcucumber.enter_as_email_address(String)"
});
formatter.result({
  "duration": 170853977,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcdefg",
      "offset": 7
    }
  ],
  "location": "HeatclinicLoginStepcucumber.enter_as_password(String)"
});
formatter.result({
  "duration": 167782917,
  "status": "passed"
});
formatter.match({
  "location": "HeatclinicLoginStepcucumber.click_login()"
});
formatter.result({
  "duration": 740946895,
  "status": "passed"
});
formatter.match({
  "location": "HeatclinicLoginStepcucumber.valid_email_or_password_message_display()"
});
formatter.result({
  "duration": 123898,
  "status": "passed"
});
formatter.match({
  "location": "HeatclinicLoginStepcucumber.welcome_message_shows()"
});
formatter.result({
  "duration": 98127,
  "status": "passed"
});
formatter.after({
  "duration": 348512870,
  "status": "passed"
});
});