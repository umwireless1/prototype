$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature/Testing1.feature");
formatter.feature({
  "name": "login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user able to login with valid username",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "navigate to the application",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps1.navigate_to_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps1.enter_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on courses",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps1.click_on_courses()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on view classes",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps1.click_on_view_classes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on content",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps1.click_on_content()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on submit",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps1.click_on_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps1.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});