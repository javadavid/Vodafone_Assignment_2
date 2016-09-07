$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Test login",
  "description": "",
  "id": "test-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login Failure",
  "description": "",
  "id": "test-login;login-failure",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I open the Vodafone website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I navigate to MyVodafone page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I navigate to Login page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I try to login with invalid credentials",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should see the following error message",
  "keyword": "Then ",
  "doc_string": {
    "content_type": "",
    "line": 9,
    "value": "Your email address is not registered for My Vodafone."
  }
});
formatter.match({
  "location": "WebsiteAutomationSteps.given_I_navigate_to_the_vodafone_url()"
});
formatter.result({
  "duration": 13083657240,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteAutomationSteps.when_I_navigate_to_MyVodafone_page()"
});
formatter.result({
  "duration": 1829998898,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteAutomationSteps.navigate_to_Login_page()"
});
formatter.result({
  "duration": 6909589332,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteAutomationSteps.login_to_myvodafone_with_invalid_credentials()"
});
formatter.result({
  "duration": 1742241217,
  "status": "passed"
});
formatter.match({
  "location": "WebsiteAutomationSteps.then_I_Should_get_error_message(String)"
});
formatter.result({
  "duration": 148247173,
  "status": "passed"
});
});