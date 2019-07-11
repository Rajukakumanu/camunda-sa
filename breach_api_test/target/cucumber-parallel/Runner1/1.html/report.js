$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Authentication.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Authentication"
    }
  ]
});
formatter.before({
  "duration": 149949,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "user log into breach App",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "a user is login to app",
  "keyword": "Given "
});
formatter.match({
  "location": "Breach_API.user_login()"
});
});