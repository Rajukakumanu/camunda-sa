@Breach
Feature: Create Breach record

  #Background: User on Breach record API page


  Scenario: Fill in Mandatory fields of about you section
    Given user creates breach record
    When user fill in aboutYou section mandatory fields
    And user fill in whoIdentified section mandatory fields
    And user fill in what happened section mandatory fields
    And user not fill in what happened section mandatory fields
    And user fill in breach category data section mandatory fields
    And user get risk score

 # Scenario: pass null value in mandatory fields of about you section
   # When user not gill in aboutYou section mandatory fields

