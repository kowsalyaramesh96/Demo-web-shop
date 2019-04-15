$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/feature/Login.feature");
formatter.feature({
  "name": "LoginFeature",
  "description": "  This feature deals with the login functionality of the application",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login to google",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePage.iNavigateToTheLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click registeration link",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterPage.registerationlnk()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Registeration Details",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterPage.registerationpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Continue",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterPage.click_on_Continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Books and checkout",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterPage.click_on_Books()"
});
formatter.result({
  "status": "passed"
});
});