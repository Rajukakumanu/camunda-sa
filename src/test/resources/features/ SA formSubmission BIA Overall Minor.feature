@Test3910
Feature: Login to Application and Submit SA Form with BIA rating as Minor and complete the form submission

  Background: Login to SA Application
    Given I login "BusinessUser"to SA

  Scenario Outline: Submit a form with BIA overall rating as Minor and complete the form submission
    When I select "Business" user
    When I click on  "Create New SA Request" button
    When I enter "<ISBIA LINK>"
    When I select "<Overall Rating>" from dropdown
    When I select "<data classification>" from dropdown list
    When I enter "<ISBIA Account Executive>" in textbox
    When I enter details about "<NewSA>"
    When I select "<New Project>" and fill in necessary fields
    When I click on continue Button where overall rating is"<Minor>"
    Then I check form is complete
    Then I validate Request "<Status>"
    Then I download report and validate
    Then I click on Logout button

    Examples: 
      | Overall Rating | data classification | NewSA   | Status                 | New Project |
      | Minor          | Internal            | Test_01 | Complete, not required | New system  |

