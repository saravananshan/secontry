$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:casestudy/Testme.feature");
formatter.feature({
  "name": "Test Me",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "the user opens the Testme app",
  "keyword": "Given "
});
formatter.match({
  "location": "Caseexecute.the_user_opens_the_Testme_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the signup button",
  "keyword": "When "
});
formatter.match({
  "location": "Caseexecute.click_on_the_signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the sign up page opens",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters username \"saravana\"",
  "keyword": "And "
});
formatter.match({
  "location": "Caseexecute.user_enters_username(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters first name \"dab\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters last name \"god\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters password \"qwerty\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters confirm password \"qwerty\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters gender as male",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters email \"abcd@qwerty.com\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters mobile number \"1234567890\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "enters adress \"25/6 chennai\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters selects security question",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enters answer \"sydney\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "register button is clicked",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});