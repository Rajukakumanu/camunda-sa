@Test3911
Feature: Login to Application and Submit SA Form with BIA rating as MAjor with project as change to existing systems with No Previous SA and fill the form to be draft status

  Background: Login to SA Application
    Given I login "BusinessUser"to SA

  Scenario Outline: Submit a form with BIA overall rating as Major with project as change to existing systems and leave the reuest in draft status
    When I select "Business" user
    When I click on  "Create New SA Request" button
    When I enter "<ISBIA LINK>"
    When I select "<Overall Rating>" from dropdown
    When I select "<data classification>" from dropdown list
    When I enter "<ISBIA Account Executive>" in textbox
    When I enter details about "<NewSA>"
    When I select "<New Project>" and fill in necessary fields
    When I click on continue Button where overall rating is"<Major>"
    When I enter oracle project code
    When I select "<P3M type>" and project type from dropdown
    When I select "<Under NDA>"&"<New Project>" and enter description
    When I fill in all other deatills in information in project info section
    Then I click Next button
    When I fill in deatils to upload Documents
    When I fill in deatils to Add link files
    When I add and delete Additional Contact from the form
    Then I answer all questions in design documents section
    Then I click Next button
    Then I click on Myrequest Tab
    Then I validate Request "<Status>"
    Then I click on Logout button

    Examples: 
      | Overall Rating | data classification | NewSA   | Status | New Project | Under NDA       | P3M type |
      | Major          | Secret              | Test_02 | Draft  | Change to   | No NDA required | Project  |
 