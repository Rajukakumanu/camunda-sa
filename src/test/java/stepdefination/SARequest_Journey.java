package stepdefination;

import org.openqa.selenium.WebDriver;

import pages.AnalystQueuePage;
import pages.AssignmentQueuePage;
import pages.ProjectFormPage;
import pages.ProjectInfoPage;
import pages.RequestCompletePage;
import pages.SAEngagementFormPage;
import pages.SignInPage;
import pages.TableViewPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * This class consists of all the Step definitions for the test steps in feature
 * files
 * 
 * @author kakur
 * 
 */
public class SARequest_Journey {

	private WebDriver driver = Hooks.driver;
	private SignInPage signInPage;
	private SAEngagementFormPage saEngagementFormPage;
	private TableViewPage tableViewPage;
	private ProjectInfoPage projectInfoPage;
	private RequestCompletePage completePage;
	private ProjectFormPage projectFormPage;
	private AssignmentQueuePage assignmentQueuePage;
	private AnalystQueuePage analystQueuePage;

	@Given("^I login \"([^\"]*)\"to SA$")
	public void i_login_to_SA(String journey) throws Throwable {
		signInPage = new SignInPage(driver);
		signInPage.enterCredentialsAndLogin(journey);
	}

	@When("^I click on  \"([^\"]*)\" button$")
	public void i_click_on_button(String arg1) throws Throwable {
		saEngagementFormPage = new SAEngagementFormPage(driver);
		saEngagementFormPage.clickSAButton();
	}

	@When("^I enter \"([^\"]*)\"$")
	public void Enter_ISBIA_LINK(String AccText) throws Throwable {
		saEngagementFormPage.enterisBiaRef();
	}

	@When("^I select \"([^\"]*)\" from dropdown$")
	public void i_select_from_dropdown(String dropdown) throws Throwable {
		saEngagementFormPage.selectBIArating(dropdown);

	}

	@When("^I select \"([^\"]*)\" from dropdown list$")
	public void i_select_from_dropdown_list(String dropdown) throws Throwable {
		saEngagementFormPage.selectDataClassification(dropdown);
	}

	@When("^I enter \"([^\"]*)\" in textbox$")
	public void i_enter_in_textbox(String AccText) throws Throwable {
		saEngagementFormPage.enterAccountableExe();
	}

	@When("^I enter details about \"([^\"]*)\"$")
	public void i_enter_details_about(String pName) throws Throwable {
		saEngagementFormPage.enterInfoForNewSA(pName);
	}

	@When("^I select \"([^\"]*)\" and fill in necessary fields$")
	public void i_select_and_fill_in_necessary_fields(String NewProject)
			throws Throwable {
		saEngagementFormPage.enterInfoForPreviousSA(NewProject);
	}

	@When("^I select \"([^\"]*)\" from drop down$")
	public void i_select_from_drop_down(String arg1) throws Throwable {
	}

	@When("^I click on continue Button where overall rating is\"([^\"]*)\"$")
	public void i_click_on_continue_Button_where_overall_rating_is(String ISABIA)
			throws Throwable {
		saEngagementFormPage.clickProjectDataContinue(ISABIA);
	}

	@Then("^I check form is complete$")
	public void i_check_form_is_complete() throws Throwable {
		completePage = new RequestCompletePage(driver);
		completePage.validateFormIsComplete();
	}

	@Then("^I click on Logout button$")
	public void i_click_on_Logout_button() throws Throwable {
	}

	@When("^I enter oracle project code$")
	public void i_enter_oracle_project_code() throws Throwable {
		projectInfoPage = new ProjectInfoPage(driver);
		projectInfoPage.enterOracleCode();

	}

	@When("^I select \"([^\"]*)\" and project type from dropdown$")
	public void i_select_and_project_type_from_dropdown(String option)
			throws Throwable {
		projectInfoPage.enterP3mAndProjectType(option);
	}

	@When("^I select \"([^\"]*)\"&\"([^\"]*)\" and enter description$")
	public void i_select_and_enter_description(String dropdown,
			String projectType) throws Throwable {
		projectInfoPage.selectUnderNDAOtherFields(dropdown, projectType);
	}

	@When("^I fill in all other deatills in information in project info section$")
	public void i_fill_in_all_other_deatills_in_information_in_project_info_section()
			throws Throwable {
		projectInfoPage.enterAllOtherProjectInfo();
	}

	@When("^I fill in deatils to upload Documents$")
	public void i_fill_in_deatils_to_upload_Documents() throws Throwable {
		projectInfoPage.uploadDocument();
	}

	@When("^I fill in deatils to Add link files$")
	public void i_fill_in_deatils_to_Add_link_files() throws Throwable {
		projectInfoPage.addLinkfiles();
	}

	@Then("^I answer all questions in design documents section$")
	public void i_answer_all_questions_in_design_documents_section()
			throws Throwable {
		projectInfoPage.answerDesignDocuments();
	}

	@Then("^I click Next button$")
	public void i_click_Next_button() throws Throwable {
		projectInfoPage.clickNext();
	}

	@Then("^I click SaInfoNext button$")
	public void i_click_SaInfoNext_button() throws Throwable {
		projectInfoPage.clickSaInfoNext();
	}

	@When("^I fill in SaInfo page details$")
	public void i_fill_in_SaInfo_page_details() throws Throwable {
		projectInfoPage.fillSAInfoPageDetails();
	}

	@When("^I add and delete Additional Contact from the form$")
	public void i_add_and_delete_Additional_Contact_from_the_form()
			throws Throwable {
		projectInfoPage.addDeleteAdditionalContact();
	}

	@When("^I select system developemt type as \"([^\"]*)\"deployed$")
	public void i_select_system_developemt_type_as_deployed(String arg1)
			throws Throwable {
		projectFormPage = new ProjectFormPage(driver);
		projectFormPage.selectSystemDevelopmentType();
	}

	@When("^I select project developemt area as \"([^\"]*)\"$")
	public void i_select_project_developemt_area_as(String devArea)
			throws Throwable {
		projectFormPage.selectProjectDevelopment(devArea);
	}

	@Then("^I select \"([^\"]*)\" RBS teams develop$")
	public void i_select_RBS_teams_develop(String teams) throws Throwable {
		projectFormPage.selectSystemTeam(teams);
	}

	@Then("^I select \"([^\"]*)\" option from dropdown$")
	public void i_select_option_from_dropdown(String Hosting) throws Throwable {
		projectFormPage.selectSystemHosting(Hosting);
	}

	@Then("^I select \"([^\"]*)\" and system \"([^\"]*)\" fields$")
	public void i_select_and_system_fields(String Accessibility, String deployed)
			throws Throwable {
		projectFormPage.selectAccessibility(Accessibility, deployed);
	}

	@When("^I select dropdown for who will \"([^\"]*)\" and maintain system$")
	public void i_select_dropdown_for_who_will_and_maintain_system(String admin)
			throws Throwable {
		projectFormPage.selectAdminAndMaintain(admin);
	}

	@When("^I select dropdown for will the system \"([^\"]*)\" to other Systems$")
	public void i_select_dropdown_for_will_the_system_to_other_Systems(
			String Connect) throws Throwable {
		projectFormPage.selectSystemConnect(Connect);
	}

	@When("^I select dropdown for \"([^\"]*)\" section$")
	public void i_select_dropdown_for_section(String users) throws Throwable {
		projectFormPage.selectSystemUsers(users);
	}

	@When("^I select \"([^\"]*)\" Impact Assessment$")
	public void i_select_Impact_Assessment(String privacy) throws Throwable {
		projectFormPage.selectPrivacyImpact(privacy);
	}

	@When("^I select \"([^\"]*)\" Tire Assessments$")
	public void i_select_Tire_Assessment(String Resilience) throws Throwable {
		projectFormPage.selectResilienceImpact(Resilience);
	}

	@When("^I select \"([^\"]*)\" Impact Assessement$")
	public void i_select_Impact_Assessement(String ServiceImpact)
			throws Throwable {
		projectFormPage.selectServiceImpact(ServiceImpact);
	}

	@Then("^I click Submit button$")
	public void i_click_Submit_button() throws Throwable {
		projectFormPage.clickSubmit();
	}

	@Then("^I validate Request \"([^\"]*)\"$")
	public void i_validate_Request(String status) throws Throwable {
		tableViewPage = new TableViewPage(driver);
		tableViewPage.checkRequestStatus(status);
		tableViewPage.validateRequestStatus(status);
	}

	@Then("^I download report and validate$")
	public void i_download_report_and_validate() throws Throwable {
		tableViewPage.clickFileDownload();
	}

	@When("^I click on Edit and navigate to Docuements page$")
	public void i_click_on_Edit_and_navigate_to_Docuements_page()
			throws Throwable {
		tableViewPage.clickViewAndNavToDocuments();
	}

	@Then("^I click on Myrequest Tab$")
	public void i_click_on_Myrequest_Tab() throws Throwable {
		tableViewPage = projectInfoPage.clickMyrequest();
	}

	@When("^I test analyst journey$")
	public void i_test_analyst_journey() throws Throwable {
		analystQueuePage = new AnalystQueuePage(driver);
		analystQueuePage.analystJourney();
	}

	@When("^I select dropdown for system send or recive \"([^\"]*)\"$")
	public void i_select_dropdown_for_system_send_or_recive(String email)
			throws Throwable {
		projectFormPage.selectEmails(email);
	}

	@When("^I select \"([^\"]*)\" user$")
	public void i_select_user(String role) throws Throwable {
		signInPage.selectUser(role);
	}

	@When("^I select request and assign to analyst$")
	public void i_select_request_and_assign_to_analyst() throws Throwable {
		assignmentQueuePage = new AssignmentQueuePage(driver);
		assignmentQueuePage.assignToAnalyst();
	}

	@When("^I click on Threats Tab$")
	public void i_click_on_Threats_Tab() throws Throwable {
		analystQueuePage.clickThreatTab();
	}

	@Then("^I Add and Delete threrat and check it's count$")
	public void i_Add_and_Delete_threrat_and_check_it_s_count()
			throws Throwable {
		analystQueuePage.addAndDeleteThreat();
	}

	@When("^I click on Controls Tab$")
	public void i_click_on_Controls_Tab() throws Throwable {
		analystQueuePage.clickControlTab();
		// analystQueuePage.noQuestionsAndFindings();
	}

	@Then("^I Add and Delete controls  and check it's count$")
	public void i_Add_and_Delete_controls_and_check_it_s_count()
			throws Throwable {
		analystQueuePage.addAndDeleteControl();
	}

	@Then("^I Add a threat and a  Delete threat and check it's count$")
	public void i_Add_a_threat_and_a_Delete_threat_and_check_it_s_count() throws Throwable {
analystQueuePage.addThreatDeleteThreat();
	}

	@When("^I review request and it's controls$")
	public void i_review_request_and_it_s_controls() throws Throwable {
	}

	@When("^I add Focus Area$")
	public void i_add_Focus_Area() throws Throwable {
		assignmentQueuePage = new AssignmentQueuePage(driver);
		assignmentQueuePage.addNewFocusArea();
	}

	@When("^I Assign Focus area to analyst$")
	public void i_Assign_Focus_area_to_analyst() throws Throwable {
		assignmentQueuePage.assignFocusToAnalyst();
	}

	@When("^I Delete focus area$")
	public void i_Delete_focus_area() throws Throwable {
		assignmentQueuePage.deleteFocusArea();
	}

	@When("^I \"([^\"]*)\" controls and save the details$")
	public void i_controls_and_save_the_details(String review) throws Throwable {
		analystQueuePage.reviewControls(review);
	}

	@When("^I complete Scoping stage$")
	public void i_complete_Scoping_stage() throws Throwable {
		analystQueuePage.answerScopingStage();
	}

	@Then("^I click PoseQuistions$")
	public void i_click_PoseQuistions() throws Throwable {
		analystQueuePage.clickPoseQuestions();
	}

	@Then("^I answer the questions posed by analyst$")
	public void i_answer_the_questions_posed_by_analyst() throws Throwable {
		analystQueuePage.answerQuestions();
	}

	@Then("^I answer findings overlay for all control notmet cases$")
	public void i_answer_findings_overlay_for_all_control_notmet_cases()
			throws Throwable {
		analystQueuePage.answerFindingsOverlay();
		analystQueuePage.addFinding();
	}

	@When("^I goto findings and complete findings$")
	public void i_goto_findings_and_complete_findings() throws Throwable {
		analystQueuePage.goStrightToFindings();
	}

	@Then("^I Fill in All details and generate SA Report$")
	public void i_Fill_in_All_details_and_generate_SA_Report() throws Throwable {
		analystQueuePage.generateSAReport();
	}

	@Then("^I send report to \"([^\"]*)\" for Peer Review \"([^\"]*)\"$")
	public void i_send_report_to_for_Peer_Review(String analyst, String peer)
			throws Throwable {
		analystQueuePage.sendPeerReviewToAnalyst(analyst, peer);
	}

	@Then("^I Complete the \"([^\"]*)\"$")
	public void i_Complete_the(String reviewTask) throws Throwable {
		analystQueuePage.reviewTask(reviewTask);
	}

	@Then("^I send report to \"([^\"]*)\" review$")
	public void i_send_report_to_review(String manager) throws Throwable {
		analystQueuePage.sendReportForManagerReview(manager);

	}

	@Then("^I complete the manager review and mark it to pass$")
	public void i_complete_the_manager_review_and_mark_it_to_pass()
			throws Throwable {
		analystQueuePage.reviewManagerChecklist();
	}

	@Then("^I send report to Business review$")
	public void i_send_report_to_Business_review() throws Throwable {
		analystQueuePage.sendReportForBusinessReview();
	}

	@Then("^I review the report as business user and mark it to pass$")
	public void i_review_the_report_as_business_user_and_mark_it_to_pass()
			throws Throwable {
		analystQueuePage.reviewReportAndAccept();

	}

	@Then("^I review the report as business user and mark it to fail$")
	public void i_review_the_report_as_business_user_and_mark_it_to_fail()
			throws Throwable {
		analystQueuePage.reviewReportAndFail();
	}

	@Then("^I answer findings \"([^\"]*)\"$")
	public void i_answer_findings(String mitigated) throws Throwable {
		analystQueuePage.findingsMitigated(mitigated);
	}

	@When("^I answer amend findings and sent for business review$")
	public void i_answer_amend_findings_and_sent_for_business_review()
			throws Throwable {
		analystQueuePage.answerAmedFindings();

	}

	@When("^I review controls and mark them to No findings$")
	public void i_review_controls_and_mark_them_to_No_findings()
			throws Throwable {
		analystQueuePage.reviewControlsToNoFindings();
		analystQueuePage.noFindingsNavigation();
	}

	@Then("^I Downlaod and validate the report genearted$")
	public void i_Downlaod_and_validate_the_report_genearted() throws Throwable {
		tableViewPage.CheckFinalReport();

	}

}
