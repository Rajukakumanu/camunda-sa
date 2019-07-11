@Authentication
Feature: Login

  Background: user log into breach App
    Given a user is login to app

  Scenario: 
    When check the hello URI is working
    Then the status code is 200 and validate the response

  #Scenario: verify permissions
    When the permission URI has all the permissions listed
    Then the status code is 200 and validate the response
    #And check the permissions returned
