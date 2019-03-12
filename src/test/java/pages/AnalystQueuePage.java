package pages;

import java.util.List;

import locators.AnalystQueueLocators;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UserActions;

public class AnalystQueuePage extends UserActions implements
		AnalystQueueLocators {

	private static int controlcount = 0;

	private static int threadscount;

	private static WebElement analystSA;
	private static WebElement threatButton;
	private static WebElement analystReview;

	public AnalystQueuePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = SA_ANALYST_THREATPAGEVAL)
	List<WebElement> threadPageVal;

	@FindBy(xpath = SA_THREAT_DELETE_OK)
	WebElement deleteOK;

	@FindBy(xpath = SA_ADD_THREAT)
	WebElement addThread;

	@FindBy(xpath = SA_ENTER_THREAD)
	WebElement enterThread;

	@FindBy(xpath = SA_ANALYST_CHECKBOX)
	WebElement clickCheckBox;

	@FindBy(xpath = SA_THREAD_SUBMIT)
	WebElement submit;

	@FindBy(xpath = SA_SELECT_ROWS)
	WebElement selectRows;

	@FindBy(xpath = SA_ANALYST_CONTROLS)
	WebElement controlsTab;

	@FindBy(xpath = SA_EDIT_CONTROLS)
	List<WebElement> editControl;

	@FindBy(xpath = SA_REMOVE_CONTROLS)
	WebElement removeControl;

	@FindBy(xpath = SA_REMOVE_REASON)
	WebElement removeReson;

	@FindBy(xpath = SA_REMOVE_SUBMIT)
	WebElement removeSubmit;

	@FindBy(xpath = SA_ADD_CONTROL)
	WebElement addControl;

	@FindBy(xpath = SA_ANALYST_NEXT)
	WebElement analystNext;

	@FindBy(xpath = SA_THREAT)
	WebElement threat;

	@FindBy(xpath = SA_ANALYST_PREVIOUS)
	WebElement previous;

	@FindBy(xpath = SA_ANALYST_MYASSIGNMENTS)
	WebElement myAssignments;

	@FindBy(xpath = SA_CONTROLTEXT_RESPONSE)
	List<WebElement> controlText;

	@FindBy(xpath = SA_CONTROL_MET)
	WebElement controlMet;

	@FindBy(xpath = SA_CONTROL_PAGE_VAl)
	WebElement overlaypageVal;

	@FindBy(xpath = SA_MARK_AS_COMPLETE)
	WebElement markAsComplete;

	@FindBy(xpath = SA_ANALYST_SCOPE)
	WebElement scopeTab;

	@FindBy(xpath = SA_SCOPE_PAGE_INFO)
	WebElement scopeInfo;

	@FindBy(xpath = SA_SCOPE_TEXT)
	List<WebElement> scopeText;

	@FindBy(xpath = SA_SCOPE_PENTEST)
	WebElement penTest;

	@FindBy(xpath = SA_SCOPE_SAVE)
	WebElement scopeSave;

	@FindBy(xpath = SA_CONTROL_NOTMET)
	WebElement controlNotMet;

	@FindBy(xpath = SA_EDIT_FINDINGS)
	List<WebElement> editFindings;

	@FindBy(xpath = SA_FINDINGS_INPUTTEXT)
	List<WebElement> findingsInputText;

	@FindBy(xpath = SA_FINDINGS_CONTROLS_TEXT)
	List<WebElement> findingsTextArea;

	@FindBy(xpath = SA_FINDINGS_CONFIDENTIALITY_RATING)
	WebElement confidentialityRating;

	@FindBy(xpath = SA_FINDINGS_INTEGRITY_RATING)
	WebElement integrityRating;

	@FindBy(xpath = SA_FINDINGS_PENTESTING)
	WebElement penTesting;

	@FindBy(xpath = SA_FINDINGS_EXCEPTION_POLICY)
	WebElement expectionpolicy;

	@FindBy(xpath = SA_FINDINGS_LIKELIHOOD_RATING)
	WebElement likehoodRating;

	@FindBy(xpath = SA_FINDINGS_OVERALL_RATING)
	WebElement overallRating;

	@FindBy(xpath = SA_FINDINGS_AVAILABILITY_RATING)
	WebElement availabilityRating;

	@FindBy(xpath = SA_SECURITY_FINDING)
	WebElement securityFinding;

	@FindBy(xpath = SA_POSE_QUESTION)
	WebElement poseQuestions;

	@FindBy(xpath = SA_GOTO_FINDINGS)
	WebElement goToFindings;

	@FindBy(xpath = SA_QUESTIONS_POSED_VAL)
	WebElement questionsPosedVal;

	@FindBy(xpath = SA_QUESTIONS_TAB)
	WebElement questionsTab;

	@FindBy(xpath = SA_QUESTIONS_BUSINESS_RESPONSE)
	List<WebElement> questionsResponse;

	@FindBy(xpath = SA_QUESTIONS_RESUBMIT)
	WebElement submitAnswers;

	@FindBy(xpath = SA_RESUBMIT_POPUP)
	WebElement submitPopup;

	@FindBy(xpath = SA_RESPONSE)
	WebElement saResponse;

	@FindBy(xpath = SA_SELECT_LEVEL)
	WebElement selectLevel;

	@FindBy(xpath = SA_FINDINGS_PAGE)
	WebElement findingsPage;

	@FindBy(xpath = SA_ADD_FINDINGS)
	WebElement addFindings;

	@FindBy(xpath = SA_ADD_FINDING_VAL)
	WebElement findingVal;

	@FindBy(xpath = SA_FINDINGS_COMPLETE)
	WebElement findingsComplete;

	@FindBy(xpath = SA_ADD_DOCUMENT)
	List<WebElement> addDocument;

	@FindBy(xpath = SA_GENERTE_SA_REPORT)
	WebElement generateSAReportPage;

	@FindBy(xpath = SA_SEND_REPORT)
	WebElement sendReport;

	@FindBy(xpath = SA_SEND_REPORT_VAL)
	WebElement reportVal;

	@FindBy(xpath = SA_ASSIGN_ANALYST)
	WebElement assignToAnalyst;

	@FindBy(xpath = SA_ASSIGN_MANAGER)
	WebElement assignToManager;

	@FindBy(xpath = SA_REPORT_SUBMIT)
	List<WebElement> reportSubmit;

	@FindBy(xpath = SA_REVIEW_TEXT)
	List<WebElement> reviewText;

	@FindBy(xpath = SA_REQUESTER_COMMENTS)
	WebElement requesterComments;

	@FindBy(xpath = SA_RISK_EDIT)
	List<WebElement> riskEdit;

	@FindBy(xpath = SA_FINDINGS_MITIGATED)
	WebElement findingsMitigated;

	@FindBy(xpath = SA_FINDINGS_RISK_RAISED)
	WebElement riskRaised;

	@FindBy(xpath = SA_FINDINGS_RISK_SYSTEM)
	WebElement riskSystem;

	@FindBy(xpath = SA_FINDINGS_RISK_REFERENCE)
	WebElement riskreference;

	@FindBy(xpath = SA_RISK_OVERLAY_SAVE)
	WebElement riskOverlaySave;

	@FindBy(xpath = SA_FINDINGS_REQUESTER_SAVE)
	WebElement requesterSave;

	@FindBy(xpath = SA_GO_STRIGHT_TOFINDINGS)
	WebElement strightFindings;

	@FindBy(xpath = SA_CONTROL_MARKAS_COMPLETE)
	WebElement controlComplete;

	@FindBy(xpath = SA_GENERATE_SA_REPORT)
	WebElement generateSaReport;

	@FindBy(xpath = SA_MITIGATE_FINDINGS)
	WebElement mitigateFindings;

	@FindBy(xpath = SA_AMEND_FINDINGS)
	List<WebElement> amendFindings;

	@FindBy(xpath = SA_OVERLAY_CONFORMATION)
	public static WebElement overlayConfirm;

	@FindBy(xpath = SA_CONSIDER_MITIGATED)
	WebElement considerMitigated;

	@FindBy(xpath = SA_AMEND_FINDINGS_TEXT)
	WebElement findingsText;

	@FindBy(xpath = SA_FINDINGS)
	WebElement finding;

	@FindBy(xpath = SA_AMEND_FINDING_SAVE)
	WebElement amendSave;

	public void analystJourney() {
		waitForPageToLoad();
		click(myAssignments, "myAssignments", 20);
		waitForPageToLoad();
		type(quickSearch, "quickSearch", AssignmentQueuePage.newSatId, 20);
		WebElement analystSA = driver
				.findElement(By
						.xpath("//div[@ref='eBodyViewportWrapper']//div[@role='row']/div[text()='"
								+ AssignmentQueuePage.newSatId + "']/../div[3]"));

		isElementPresent(analystSA, "analystSA", 20);
		click(analystSA, "analystSA", 30);
		getSaStatus("Scoping");
		waitForPageToLoad();
		click(viewRequestButton, "viewRequestButton", 20);
		waitForPageToLoad();

	}

	public void answerScopingStage() {
		waitForPageToLoad();
		click(scopeTab, "scopeTab", 20);
		waitForPageToLoad();
		isElementEnabled(scopeInfo, 20);
		String scopePage = getText(scopeInfo, "scopeInfo", 30);
		log.info("check the Scope page is displayed " + scopePage);
		Assert.assertEquals("Scope of SA", scopePage);
		waitForPageToLoad();
		for (WebElement sText : scopeText) {
			type(sText, "sText", "This is Demo Test", 20);
		}
		type(penTest, "penTest", "This is Demo Test", 30);
		isElementPresent(scopeSave, "scopeSave", 30);
		click(scopeSave, "scopeSave", 30);
		waitForPageToLoad();

	}

	public void clickThreatTab() {
		waitForPageToLoad();
		wait(2000);
		isElementPresent(threat, "threat", 30);
		getSaStatus("Threats and Controls Analysis");
		getThreadCount();
	}

	public void clickControlTab() {
		waitForPageToLoad();
		click(controlsTab, "controlsTab", 20);
		waitForPageToLoad();
		isElementPresent(removeControl, "removeControl", 20);
		getControlCount();
	}

	public int getThreadCount() {
		waitForPageToLoad();
		selectDropdown(selectRows, 4);
		threadscount = threadPageVal.size();
		log.info("Print the num of threads triggered is " + threadscount);
		return threadscount;
	}

	public int getControlCount() {
		waitForPageToLoad();
		selectDropdown(selectRows, 5);
		controlcount = editControl.size();
		if (controlcount >= 100) {
			isElementEnabled(analystNext, 20);
			isElementPresent(removeControl, "removeControl", 20);
			click(analystNext, "analystNext", 20);
			controlcount = controlcount + editControl.size();
			log.info("Print the toatl count of the controls triggered "
					+ controlcount);
			isElementEnabled(previous, 20);
			click(previous, "previous", 20);
		} else {
			controlcount = controlcount + editControl.size();
			log.info("Print the toatl count of the controls triggered "
					+ controlcount);
		}
		return controlcount;
	}

	public void addAndDeleteControl() {
		waitForPageToLoad();
		getControlCount();
		String controlNum = getText(threat, "threat", 20);
		log.info(controlNum);
		int clearControl = 2;
		for (int i = 0; i < clearControl; i++) {
			waitForPageToLoad();
			isElementPresent(removeControl, "removeControl", 20);
			click(removeControl, "removeControl", 20);
			isElementEnabled(removeReson, 20);
			waitForPageToLoad();
			click(removeReson, "removeReson", 30);

			isElementEnabled(removeSubmit, 20);
			click(removeSubmit, "removeSubmit", 20);
			waitForPageToLoad();
		}
		waitForPageToLoad();
		click(addControl, "addControl", 20);
		waitForPageToLoad();
		waitForElementToLoad(enterThread, "enterThread", 20);
		type(enterThread, "enterThread", controlNum, 20);
		isElementPresent(clickCheckBox, "clickCheckBox", 30);
		click(clickCheckBox, "clickCheckBox", 20);
		click(submit, "submit", 20);
		waitForPageToLoad();

		Assert.assertEquals(controlcount - 1, getControlCount());
	}

	public void addAndDeleteThreat() throws InterruptedException {
		waitForPageToLoad();
		getThreadCount();
		String threadNum = getText(threat, "threat", 20);
		System.out.println(threadNum);
		int threatCount = 34;
		for (int i = 0; i < threatCount; i++) {
			waitForPageToLoad();
			threatButton = threadPageVal.get(0);
			waitForPageToLoad();
			wait(2000);
			click(threatButton, "threatButton", 10);
			click(deleteOK, "deleteOK", 20);
			waitForPageToLoad();
		}
		/*
		 * isElementPresent(threat, "threat", 30); click(threat, "threat", 20);
		 */
		waitForPageToLoad();
		waitForElementToLoad(addThread, "addThread", 20);
		isElementEnabled(addThread, 20);
		waitForPageToLoad();
		click(addThread, "addThread", 30);
		type(enterThread, "enterThread", "ACC011", 20);
		isElementEnabled(clickCheckBox, 20);
		click(clickCheckBox, "clickCheckBox", 20);
		click(submit, "submit", 20);
		waitForPageToLoad();
		wait(2000);
		// waitForElementToLoad(threatButton, "threatButton", 30);
		waitForElementToLoad(threat, "threat", 20);
		// getThreadCount();
		// Assert.assertEquals(threadscount, threadscount);
	}

	public void addThreatDeleteThreat() {
		waitForPageToLoad();
		getThreadCount();
		String threadNum = getText(threat, "threat", 20);
		System.out.println(threadNum);
		int threatCount = 2;
		for (int i = 0; i < threatCount; i++) {
			waitForPageToLoad();
			threatButton = threadPageVal.get(0);
			waitForPageToLoad();
			wait(2000);
			click(threatButton, "threatButton", 10);
			click(deleteOK, "deleteOK", 20);
			waitForPageToLoad();
		}
		isElementPresent(threat, "threat", 30);
		click(threat, "threat", 20);

		waitForPageToLoad();
		waitForElementToLoad(addThread, "addThread", 20);
		isElementEnabled(addThread, 20);
		waitForPageToLoad();
		click(addThread, "addThread", 30);
		type(enterThread, "enterThread", "ACC011", 20);
		isElementEnabled(clickCheckBox, 20);
		click(clickCheckBox, "clickCheckBox", 20);
		click(submit, "submit", 20);
		waitForPageToLoad();
		wait(2000);
		waitForElementToLoad(threatButton, "threatButton", 30);
		waitForElementToLoad(threat, "threat", 20);
		getThreadCount();
		// Assert.assertEquals(threadscount -1, threadscount);
	}

	public void reviewControls(String review) {
		waitForPageToLoad();
		selectDropdown(selectRows, 5);
		int count = 0;
		for (WebElement controls : editControl) {
			waitForPageToLoad();
			click(controls, "controls", 20);
			waitForPageToLoad();
			if (count <= 1) {
				dropDownType(controlMet, "controlMet", "No", 20);
			} else {
				dropDownType(controlMet, "controlMet", "Yes", 20);
			}
			count = count + 1;
			for (WebElement cText : controlText) {
				type(cText, "cText", "This is text", 20);
			}
			if (review.equalsIgnoreCase("inProgress")) {
				isElementEnabled(markAsComplete, 20);
				click(markAsComplete, "markAsComplete", 30);
				waitForPageToLoad();
			} else {
				isElementEnabled(controlComplete, 20);
				click(controlComplete, "controlComplete", 30);
				waitForPageToLoad();
			}

		}

		if (editControl.size() >= 100) {
			isElementEnabled(analystNext, 20);
			click(analystNext, "analystNext", 20);
			for (WebElement controls : editControl) {
				waitForPageToLoad();
				click(controls, "controls", 20);
				waitForPageToLoad();
				dropDownType(controlMet, "controlMet", "Yes", 20);
				for (WebElement cText : controlText) {
					type(cText, "cText", "This is text", 20);
				}
				if (review.equalsIgnoreCase("inProgress")) {
					isElementEnabled(markAsComplete, 20);
					click(markAsComplete, "markAsComplete", 30);
					waitForPageToLoad();
				} else {
					isElementEnabled(controlComplete, 20);
					click(controlComplete, "controlComplete", 30);
					waitForPageToLoad();
				}
			}
		}

	}

	public void markControlsToComplete() {
		waitForPageToLoad();
		selectDropdown(selectRows, 5);
		for (WebElement controls : editControl) {
			waitForPageToLoad();
			click(controls, "controls", 20);
			waitForPageToLoad();
			type(controlText.get(1), "notes", "Mark as Complate", 20);
			waitForPageToLoad();
			isElementEnabled(controlComplete, 20);
			click(controlComplete, "controlComplete", 30);
			waitForPageToLoad();
		}

		if (editControl.size() >= 100) {
			isElementEnabled(analystNext, 20);
			click(analystNext, "analystNext", 20);
			for (WebElement controls : editControl) {
				waitForPageToLoad();
				click(controls, "controls", 20);
				waitForPageToLoad();
				type(controlText.get(1), "notes", "Mark as Complate", 20);
				isElementEnabled(controlComplete, 20);
				click(controlComplete, "controlComplete", 20);
				waitForPageToLoad();
			}
		}

	}

	public void reviewControlsToNoFindings() {
		waitForPageToLoad();
		selectDropdown(selectRows, 5);
		int count = 0;
		for (WebElement controls : editControl) {
			waitForPageToLoad();
			click(controls, "controls", 20);
			waitForPageToLoad();
			dropDownType(controlMet, "controlMet", "Yes", 20);
			for (WebElement cText : controlText) {
				type(cText, "cText", "This is text", 20);
			}

			isElementEnabled(controlComplete, 20);
			click(controlComplete, "controlComplete", 30);
			waitForPageToLoad();
		}

		if (editControl.size() >= 100) {
			isElementEnabled(analystNext, 20);
			click(analystNext, "analystNext", 20);
			for (WebElement controls : editControl) {
				waitForPageToLoad();
				click(controls, "controls", 20);
				waitForPageToLoad();
				dropDownType(controlMet, "controlMet", "Yes", 20);
				for (WebElement cText : controlText) {
					type(cText, "cText", "This is text", 20);
				}
				isElementEnabled(controlComplete, 20);
				click(controlComplete, "controlComplete", 30);
				waitForPageToLoad();
			}
		}
	}

	public void clickPoseQuestions() {
		waitForPageToLoad();
		click(poseQuestions, "poseQuestions", 20);
		waitForPageToLoad();
		wait(3000);
		isElementPresent(questionsPosedVal, "questionsPosedVal", 20);
		String qPosed = getText(questionsPosedVal, "questionsPosedVal", 20);
		log.info("Print the text " + qPosed);
		Assert.assertTrue("check if the questions posed text is displayed ",
				qPosed.contains("Questions have been posed"));
		getSaStatus("Questions Posed");
		wait(2000);
	}

	public void answerQuestions() {
		waitForPageToLoad();
		type(quickSearch, "quickSearch", AssignmentQueuePage.newSatId, 20);
		click(viewRequestButton, "viewRequestButton", 20);
		waitForPageToLoad();
		click(questionsTab, "questionsTab", 20);
		isElementPresent(submitAnswers, "submitAnswers", 10);
		// isElementEnabled(selectRows, 20);
		// selectDropdown(selectRows, 5);
		for (WebElement question : questionsResponse) {
			waitForPageToLoad();
			type(question, "question", "This is response", 20);
		}
		if (questionsResponse.size() >= 100) {
			isElementEnabled(analystNext, 20);
			click(analystNext, "analystNext", 20);
			for (WebElement question : questionsResponse) {
				type(question, "question", "This is response", 20);
			}
		}
		waitForPageToLoad();
		isElementEnabled(submitAnswers, 30);
		click(submitAnswers, "submitAnswers", 20);
		isElementPresent(submitPopup, "submitPopup", 20);
		click(submitPopup, "submitPopup", 20);
		waitForPageToLoad();
		wait(2000);
	}

	public void goStrightToFindings() {
		waitForPageToLoad();
		wait(2000);
		isElementPresent(strightFindings, "strightFindings", 20);
		click(strightFindings, "strightFindings", 20);
		waitForPageToLoad();
		click(findingsPopup, "findingsPopup", 30);
		waitForPageToLoad();
		wait(3000);
		getSaStatus("Analyse Findings");
		isElementEnabled(controlNotMet, 20);
		click(controlNotMet, "controlNotMet", 20);
		waitForPageToLoad();
		for (WebElement findingoverlay : editFindings) {
			waitForPageToLoad();
			wait(2000);
			isElementPresent(findingoverlay, "findingoverlay", 30);
			click(findingoverlay, "findingoverlay", 20);
			findingsOverlay();
			waitForPageToLoad();
		}
		waitForPageToLoad();
		addFinding();
		waitForPageToLoad();
	}

	public void noFindingsNavigation() {
		waitForPageToLoad();
		wait(2000);
		isElementPresent(strightFindings, "strightFindings", 20);
		click(strightFindings, "strightFindings", 20);
		waitForPageToLoad();
		click(findingsPopup, "findingsPopup", 30);
		waitForPageToLoad();
		wait(3000);
		waitForPageToLoad();
		click(saResponse, "saResponse", 30);
		waitForPageToLoad();
		click(finding, "finding", 20);
		waitForPageToLoad();
		isElementPresent(findingsComplete, "findingsComplete", 30);
		click(findingsComplete, "findingsComplete", 20);
		waitForPageToLoad();
		getSaStatus("Generate SA Report");

	}

	public void findingsOverlay() {
		waitForPageToLoad();
		wait(2000);
		isElementPresent(confidentialityRating, "confidentialityRating", 30);
		dropDownType(confidentialityRating, "confidentialityRating", "Major",
				20);
		dropDownType(integrityRating, "integrityRating", "Major", 20);
		dropDownType(penTesting, "penTesting", "Yes", 20);
		dropDownType(expectionpolicy, "expectionpolicy", "No", 20);
		dropDownType(likehoodRating, "likehoodRating", "Low", 20);
		dropDownType(overallRating, "overallRating", "Major", 20);
		dropDownType(availabilityRating, "availabilityRating", "Major", 20);
		dropDownType(securityFinding, "securityFinding", "No", 20);
		dropDownType(selectLevel, "selectLevel", "Fraud - Internal Fraud", 20);
		for (WebElement inputText : findingsInputText) {
			type(inputText, "inputText", "input text", 10);
		}
		for (WebElement textArea : findingsTextArea) {
			type(textArea, "textArea", "input area", 10);
		}
		isElementEnabled(controlComplete, 20);
		click(controlComplete, "controlComplete", 20);
		waitForPageToLoad();
	}

	public void answerFindingsOverlay() {
		waitForPageToLoad();
		type(quickSearch, "quickSearch", AssignmentQueuePage.newSatId, 20);
		click(viewRequestButton, "viewRequestButton", 20);
		clickControlTab();
		getSaStatus("Review Answers");
		markControlsToComplete();
		wait(3000);
		click(goToFindings, "goToFindings", 20);
		waitForPageToLoad();
		click(findingsPopup, "findingsPopup", 30);
		wait(2000);
		waitForPageToLoad();
		getSaStatus("Analyse Findings");
		click(controlNotMet, "controlNotMet", 20);
		waitForPageToLoad();
		selectDropdown(selectRows, 5);
		waitForPageToLoad();
		for (WebElement finding : editFindings) {
			waitForPageToLoad();
			wait(2000);
			isElementPresent(finding, "finding", 30);
			click(finding, "finding", 20);
			findingsOverlay();
			waitForPageToLoad();
		}
		waitForPageToLoad();
	}

	public void addFinding() {
		waitForPageToLoad();
		click(saResponse, "saResponse", 30);
		waitForPageToLoad();
		click(finding, "finding", 20);
		waitForPageToLoad();
		String FindingPage = getText(findingsPage, "findingsPage", 20);
		log.info("Check the finding page is displayed" + FindingPage);
		Assert.assertTrue("print this if the findings page is not displayed",
				FindingPage.contains("Findings"));
		click(addFindings, "addFindings", 30);
		isElementEnabled(findingVal, 20);
		String FindingPageVal = getText(findingVal, "findingVal", 20);
		log.info("Check the add finding dialoge is displayed" + FindingPageVal);
		Assert.assertTrue(
				"print this if the add findings dialogue is not displayed",
				FindingPageVal.contains("Findings No SA"));
		findingsOverlay();

		click(findingsComplete, "findingsComplete", 20);
		waitForPageToLoad();
		getSaStatus("Generate SA Report");
	}

	public void generateSAReport() {
		waitForPageToLoad();
		click(generateSaReport, "generateSaReport", 20);
		waitForPageToLoad();
		isElementPresent(generateSAReportPage, "generateSAReportPage", 20);
		for (WebElement reportFields : findingsTextArea) {
			type(reportFields, "reportFields", "GENERATE REPORT", 20);
		}
		click(addDocument.get(0), "addDocument", 20);
		waitForPageToLoad();
		click(overlayConfirm, "overlayConfirm", 20);

		for (WebElement addDocFields : findingsInputText) {
			isElementPresent(addDocFields, "addDocFields", 20);
			type(addDocFields, "addDocFields", "Add document fields", 30);

		}
		click(addDocument.get(2), "Save", 20);
		waitForPageToLoad();
		wait(2000);
		isElementEnabled(addDocument.get(1), 20);
		click(addDocument.get(1), "Save Report", 20);
		waitForPageToLoad();
		getSaStatus("Review SA Report");
	}

	public void enterReviewText() {
		isElementPresent(review, "review", 20);
		clickReview();
		analystReview = driver.findElement(By
				.xpath("//button[@type='button'][text()='"
						+ AssignmentQueuePage.newSatId + "']"));
		waitForPageToLoad();
		click(analystReview, "analystReview", 30);
		waitForPageToLoad();
		WebElement reviewVal = driver.findElement(By
				.xpath("//div[@class='modal-header']/h5"));
		click(reviewVal, "reviewVal", 20);
		for (WebElement reviewInput : reviewText) {
			type(reviewInput, "reviewInput", "Review Text", 20);
		}
		waitForPageToLoad();
		isElementEnabled(reportSubmit.get(1), 20);
	}

	public void sendPeerReviewToAnalyst(String analyst, String peer) {
		waitForPageToLoad();
		click(sendReport, "sendReport", 20);
		isElementPresent(reportVal, "reportVal", 20);
		dropDownType(assignToAnalyst, "assignToAnalyst", analyst, 20);
		click(reportSubmit.get(0), "reportSubmit", 20);
		waitForPageToLoad();
		getSaStatus("Peer Review");
		waitForPageToLoad();
		enterReviewText();
		if (peer.equalsIgnoreCase("Pass")) {
			click(reportSubmit.get(1), "reportSubmit", 20);
			waitForPageToLoad();
		} else {
			click(reportSubmit.get(2), "reportSubmit", 20);
			waitForPageToLoad();
			wait(2000);
			getSaStatus("Scoping");

		}
	}

	public void reviewTask(String reviewTask) {
		waitForPageToLoad();
		if (reviewTask.equalsIgnoreCase("Pass")) {
			click(reportSubmit.get(0), "reportSubmit", 20);
			waitForPageToLoad();
		} else {
			click(reportSubmit.get(1), "reportSubmit", 20);
			waitForPageToLoad();
			wait(2000);
			getSaStatus("Scoping");

		}
	}

	public void sendReportForManagerReview(String manager) {
		waitForPageToLoad();
		wait(2000);
		getSaStatus("Passed Peer Review");
		dropDownType(assignToManager, "assignToManager", manager, 20);
		click(reportSubmit.get(0), "reportSubmit", 20);
		waitForPageToLoad();
		getSaStatus("Manager Review");
	}

	public void reviewManagerChecklist() {
		waitForPageToLoad();
		enterReviewText();
	}

	public void sendReportForBusinessReview() {
		waitForPageToLoad();
		type(quickSearch, "quickSearch", AssignmentQueuePage.newSatId, 20);
		click(viewRequestButton, "viewRequestButton", 20);
		waitForPageToLoad();
		wait(2000);
		click(saResponse, "saResponse", 30);
		waitForPageToLoad();
		getSaStatus("Passed Manager Review");
		waitForPageToLoad();
		click(reportSubmit.get(0), "reportSubmit", 20);
		wait(3000);
		waitForPageToLoad();

	}

	public void reviewReportAndAccept() {
		waitForPageToLoad();
		type(quickSearch, "quickSearch", AssignmentQueuePage.newSatId, 20);
		click(viewRequestButton, "viewRequestButton", 20);
		wait(1000);
		waitForPageToLoad();
		click(saResponse, "saResponse", 30);
		getSaStatus("Business Review");
		type(requesterComments, "requesterComments", "Approve", 20);
		click(reportSubmit.get(1), "reportSubmit", 20);
		waitForPageToLoad();
		wait(2000);
	}

	public void reviewReportAndFail() {
		waitForPageToLoad();
		type(quickSearch, "quickSearch", AssignmentQueuePage.newSatId, 20);
		click(viewRequestButton, "viewRequestButton", 20);
		wait(1000);
		waitForPageToLoad();
		click(saResponse, "saResponse", 30);
		getSaStatus("Business Review");
		type(requesterComments, "requesterComments", "Reject", 20);
		click(reportSubmit.get(0), "reportSubmit", 20);
		waitForPageToLoad();
		wait(2000);
	}

	public void findingsMitigated(String mitigated) {
		waitForPageToLoad();
		getSaStatus("Mitigate Findings");
		for (WebElement riskFindings : riskEdit) {
			waitForPageToLoad();
			wait(2000);
			click(riskFindings, "riskFindings", 20);
			if (mitigated.equalsIgnoreCase("Yes")) {
				dropDownType(findingsMitigated, "findingsMitigated", mitigated,
						20);
			} else {

				dropDownType(findingsMitigated, "findingsMitigated", mitigated,
						20);
				dropDownType(riskRaised, "riskRaised", "Yes", 20);
				dropDownType(riskSystem, "riskSystem", "PlanView", 20);
				type(riskreference, "riskreference", "Risk", 20);

			}
			waitForPageToLoad();
			isElementEnabled(riskOverlaySave, 20);
			click(riskOverlaySave, "riskOverlaySave", 30);
			waitForPageToLoad();
		}
		if (mitigated.equalsIgnoreCase("Yes")) {
			waitForPageToLoad();
			click(requesterSave, "requesterSave", 20);
			waitForPageToLoad();
		} else {
			waitForPageToLoad();
			click(requesterSave, "requesterSave", 20);
			waitForPageToLoad();

		}
	}

	public void answerAmedFindings() {
		waitForPageToLoad();
		waitForElementToLoad(quickSearch, "quickSearch", 20);
		type(quickSearch, "quickSearch", AssignmentQueuePage.newSatId, 20);
		waitForPageToLoad();
		wait(3000);
		click(viewRequestButton, "viewRequestButton", 20);
		waitForPageToLoad();
		click(saResponse, "saResponse", 30);
		waitForPageToLoad();
		isElementPresent(mitigateFindings, "mitigateFindings", 20);
		click(mitigateFindings, "mitigateFindings", 20);
		waitForPageToLoad();
		getSaStatus("Findings Mitigated");

		for (WebElement amend : amendFindings) {
			waitForPageToLoad();
			click(amend, "amend", 20);
			waitForPageToLoad();
			isElementPresent(overlayConfirm, "overlayConfirm", 20);
			click(overlayConfirm, "overlayConfirm", 20);
			dropDownType(overallRating, "overallRating", "Minor", 20);
			dropDownType(confidentialityRating, "confidentialityRating",
					"Major", 20);
			dropDownType(integrityRating, "integrityRating", "Minor", 20);
			dropDownType(availabilityRating, "availabilityRating", "Minor", 20);
			dropDownType(likehoodRating, "likehoodRating", "Low", 20);
			dropDownType(considerMitigated, "considerMitigated", "Yes", 10);
			waitForPageToLoad();
			type(findingsText, "findingsText", "This is amed findings Text", 20);
			waitForPageToLoad();
			isElementEnabled(amendSave, 20);
			click(amendSave, "amendSave", 20);
			waitForPageToLoad();
		}

		waitForPageToLoad();
		waitForElementToLoad(requesterSave, "requesterSave", 20);
		isElementEnabled(requesterSave, 20);
		click(requesterSave, "requesterSave", 30);
		waitForPageToLoad();
		wait(2000);

	}
}
