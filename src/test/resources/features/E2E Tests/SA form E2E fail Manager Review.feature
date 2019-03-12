@Test3932
Feature: Login to application and run E2E journey for Manager fail review

  Background: Login to SA Application
    Given I login "BusinessUser"to SA

  Scenario Outline: Submit a form with BIA overall rating as Major and complete the form submission
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
    Then I select "<P3M type>" and project type from dropdown
    When I select "<Under NDA>"&"<New Project>" and enter description
    When I fill in all other deatills in information in project info section
    Then I click Next button
    When I fill in deatils to upload Documents
    When I fill in deatils to Add link files
    Then I answer all questions in design documents section
    Then I click Next button
    When I fill in SaInfo page details
    When I select system developemt type as "<Stategic>"deployed
    When I select project developemt area as "<Development Area>"
    Then I select "<System>" RBS teams develop
    Then I click Next button
    Then I select "<System hosting>" option from dropdown
    Then I select "<System accessbility>" and system "<deployed>" fields
    Then I click Next button
    When I select dropdown for who will "<Admin>" and maintain system
    When I select dropdown for will the system "<Connect>" to other Systems
    When I select dropdown for system send or recive "<Email>"
    When I select dropdown for "<System Users>" section
    Then I click Next button
    When I select "<Privacy>" Impact Assessment
    When I select "<Resilience>" Tire Assessments
    Then I click Submit button
    Then I validate Request "<Status>"
    Then I click on Logout button

    Examples: 
      | Overall Rating | data classification | NewSA   | Status     | New Project | Under NDA       | P3M type | Development Area | System                     | System hosting   | System accessbility      | deployed | Admin       | Connect          | System Users   | Privacy           | Resilience        | Email    |
      | Major          | Secret              | Test_19 | Unassigned | New system  | No NDA required | Project  | Off the shelf    | Internal development teams | Internal hosting | Is accessible externally | EMEA     | RBS central | internal systems | Internal users | PIA not available | RIA not available | No Email |

  Scenario Outline: Complete the Manager fail review
    When I select "manager" user
    When I select request and assign to analyst
    When I select "analyst" user
    When I test analyst journey
    When I complete Scoping stage
    When I click on Threats Tab
    Then I Add and Delete threrat and check it's count
    When I click on Controls Tab
    When I "<review>" controls and save the details
    Then I click PoseQuistions
    When I select "Business" user
    Then I answer the questions posed by analyst
    When I select "analyst" user
    Then I answer findings overlay for all control notmet cases
    Then I Fill in All details and generate SA Report
    Then I send report to "<Analyst>" for Peer Review "Pass"
    Then I send report to "<manager>" review
    When I select "manager" user
    Then I complete the manager review and mark it to pass
    Then I Complete the "Fail"

    Examples: 
      | Analyst       | manager       | review     |
      | Raju Kakumanu | Raju Kakumanu | inProgress |
