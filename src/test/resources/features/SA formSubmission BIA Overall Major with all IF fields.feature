@Test3916
Feature: Login to Application and Submit SA Form with BIA rating as Major and cover all If fields to complete the form submission

  Background: Login to SA Application
    Given I login "BusinessUser"to SA

  Scenario Outline: Submit a form with BIA overall rating as Major and cover all IF fields complete the form submission
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
    When I select "<Services>" Impact Assessement
    Then I click Submit button
    Then I validate Request "<Status>"
    Then I click on Logout button

    Examples: 
      | Overall Rating | data classification | NewSA   | Status     | New Project | Under NDA       | P3M type | Development Area | System                    | System hosting | System accessbility      | deployed | Admin             | Connect                | System Users | Privacy                | Resilience             | Services               | Email    |
      | Major          | Secret              | Test_07 | Unassigned | Change to   | No NDA required | Project  | Database         | External development team | Internal cloud | Is accessible externally | Other    | Third party admin | external cloud systems | Customers    | PIA has been completed | RIA has been completed | SIA has been completed | No Email |
