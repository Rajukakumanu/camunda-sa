@Test
Feature: Login to Application and Submit SA Form with BIA rating as Minor and complete the form submission

  Background: Login to SA Application
    Given I login "BusinessUser"to SA

  Scenario Outline: As a Manager and Analyst complete the request via Risk accepted
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
    Then I Complete the "Pass"
    When I select "analyst" user
    Then I send report to Business review
    When I select "Business" user
    Then I review the report as business user and mark it to pass
    Then I answer findings "<mitigated>"
    Then I validate Request "<Status>"
    Then I Downlaod and validate the report genearted

    Examples:
      | Analyst       | manager       | mitigated | review     | Status   |
      | Raju Kakumanu | Raju Kakumanu | No       | inProgress | Complete |