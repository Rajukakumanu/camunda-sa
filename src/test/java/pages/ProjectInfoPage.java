package pages;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import locators.ProjectInfoLocators;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UserActions;

/**
 * This class consists of all the actions related to ProjectInfoPage and reading
 * locators from ProjectInfoLocators
 * 
 * @author kakur
 * 
 */
public class ProjectInfoPage extends UserActions implements ProjectInfoLocators {

	public static WebDriver driver;
	private static String filepath;
	private static int Addbutton;
	private static int addLinkFiles;
	public static String SaText;
	public static String latestSA;

	public ProjectInfoPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = SA_PROJECT_INFO)
	WebElement projectInfo;

	@FindBy(xpath = SA_ORACLE_TECH_MISCODE)
	WebElement oracleCode;

	@FindBy(xpath = SA_P3M_TYPE)
	WebElement p3mType;

	@FindBy(xpath = SA_UNDER_NDA)
	WebElement underNDA;

	@FindBy(xpath = SA_CURRENT_P3PM_PROJECT)
	WebElement p3pmProject;

	@FindBy(xpath = SA_CURRENT_P3PM_PROGRAMME)
	WebElement p3pmProgramme;

	@FindBy(xpath = SA_PROJECT_DESC)
	WebElement projectDescription;

	@FindBy(xpath = SA_CHANGE_DESC)
	WebElement changeDescription;

	@FindBy(xpath = SA_SYSTEM_OWING_DIVISON)
	WebElement systemOwing;

	@FindBy(xpath = SA_LEGAL_ENTITIES_COVERED)
	WebElement legalEntities;

	@FindBy(xpath = SA_RING_FENCING)
	WebElement ringFencing;

	@FindBy(xpath = SA_PROJECT_MANAGER)
	WebElement projectManager;

	@FindBy(xpath = SA_TECH_SME)
	WebElement technologySME;

	@FindBy(xpath = SA_PROJECT_INFO_TEXTFIELDS)
	List<WebElement> projectInfoTextFields;

	@FindBy(xpath = SA_PROJECT_AUDIT_FINDING)
	WebElement projectAuditFinding;

	@FindBy(xpath = SA_AUDIT_FINDING_FIXES)
	WebElement auditFindingFixes;

	@FindBy(xpath = SA_DOCUMENTS_SECTION)
	WebElement docuemntSection;

	@FindBy(xpath = SA_REGULATORY)
	WebElement regulatory;

	@FindBy(xpath = SA_UPLOAD_BUTTON)
	WebElement uploadButton;

	@FindBy(xpath = SA_UPLOAD_DOC_NAME)
	WebElement uploadDocName;

	@FindBy(xpath = SA_UPLOAD_DOC)
	WebElement uploadDoc;

	@FindBy(xpath = SA_UPLOAD_SUBMIT)
	WebElement uploadSubmit;

	@FindBy(xpath = SA_LINK_SUBMIT)
	WebElement linkSubmit;

	@FindBy(xpath = SA_HIGHLEVEL_DESIGN)
	WebElement hldAvailable;

	@FindBy(xpath = SA_SME_REVIEW_HLD)
	WebElement hldReview;

	@FindBy(xpath = SA_TSDD_AVAILABLE)
	WebElement tsddAvailable;

	@FindBy(xpath = SA_SME_REVIEW_TSDD)
	WebElement tsddReview;

	@FindBy(xpath = SA_ADD_LINK_BUTTON)
	WebElement linkButton;

	@FindBy(xpath = SA_LINK_NAME)
	WebElement linkName;

	@FindBy(xpath = SA_LINK_URL)
	WebElement linkUrl;

	@FindBy(xpath = SA_SNOW_LINK)
	WebElement addSnowLink;

	@FindBy(xpath = SA_INFO_PAGE_VAL)
	WebElement saInfovalidation;

	@FindBy(xpath = SA_INFO_PROJECT_BOARDS)
	WebElement projectBoards;

	@FindBy(xpath = SA_ADDITIONAL_CONTACT_ADD)
	WebElement addButton;

	@FindBy(xpath = SA_CONTACT_NAME)
	WebElement contactName;

	@FindBy(xpath = SA_CONTACT_TITLE)
	WebElement contactTitle;

	@FindBy(xpath = SA_ADDITIONAL_EMAIL)
	WebElement contactEmail;

	@FindBy(xpath = SA_ADDITIONAL_SAVE)
	WebElement contactsave;

	@FindBy(xpath = SA_ADDITIONAL_DELETE)
	WebElement contactDelete;

	@FindBy(xpath = SA_ADDITIONAL_CONTACT_LIST)
	List<WebElement> contactsList;

	@FindBy(xpath = SA_ADD_LINK_LIST)
	List<WebElement> addLinkList;

	@FindBy(xpath = SA_CONTACT_EDIT)
	WebElement contactsEdit;

	@FindBy(xpath = SA_CONTACT_TEXT_VAL)
	WebElement contactText;

	@FindBy(xpath = SA_ORP_REFERENCE)
	WebElement orpReference;

	@FindBy(xpath = SA_UPLOAD_DOC_LIST)
	List<WebElement> uploadList;

	@FindBy(xpath = SA_MYREQUEST)
	public static WebElement myRequest;

	@FindBy(xpath = SA_SAID_NUM)
	public static WebElement saId;

	@FindBy(xpath = SA_DOC_COUNT)
	WebElement docCount;

	public String getSaId() {
		waitForPageToLoad();
		SaText = getText(saId, "saID", 10);
		latestSA = SaText.split(":")[0];
		log.info("Print the SA ID is " + latestSA);
		return latestSA;
	}

	public void enterOracleCode() {
		waitForPageToLoad();
		waitForElementToLoad(projectInfo,"projectInfo",20);
		wait(3000);
		String projectInfoVal = getText(projectInfo, "projectInfo", 10);
		Assert.assertTrue("chekc if project info page is not", projectInfoVal
				.contentEquals(getConfigProperty("ProjectInfoValidation")));
		type(oracleCode, "oracleCode", getConfigProperty("OracleCode"), 10);
		getSaId();
	}

	public void enterP3mAndProjectType(String option) {
		waitForPageToLoad();
		dropDownType(p3mType, "p3mType", option, 10);
		waitForPageToLoad();
		getSaStatus("Draft");

	}

	public void selectUnderNDAOtherFields(String dropdown, String projectType) {
		waitForPageToLoad();
		dropDownType(underNDA, "underNDA", dropdown, 10);
		waitForElementToLoad(p3pmProject, "p3pmProject", 20);
		dropDownType(p3pmProject, "p3pmProject",
				getConfigProperty("P3PMProject"), 10);
		type(projectDescription, "projectDescription",
				getConfigProperty("ProjectDescription"), 10);
		if (projectType.equalsIgnoreCase("Change to")) {
			waitForElementToLoad(changeDescription, "changeDescription", 10);
			type(changeDescription, "changeDescription",
					getConfigProperty("ChangeDescription"), 10);
		}
	}

	public void enterAllOtherProjectInfo() throws InterruptedException {
		waitForPageToLoad();
		wait(2000);
		dropDownType(legalEntities, "legalEntities",
				getConfigProperty("LegalEntitiesCovered1"), 10);
		dropDownType(legalEntities, "legalEntities",
				getConfigProperty("LegalEntitiesCovered2"), 10);
		dropDownType(systemOwing, "systemOwing",
				getConfigProperty("SystemOwingDivision"), 20);
		dropDownType(ringFencing, "ringFencing",
				getConfigProperty("RingFencing"), 10);
		type(projectManager, "projectManager",
				getConfigProperty("ProjectManager"), 10);
		type(technologySME, "technologySME",
				getConfigProperty("TechnologySME"), 20);
		waitForPageToLoad();
		selectDatePicker();
		dropDownType(regulatory, "regulatory", "Not mandatory or regulatory",
				10);
		dropDownType(projectAuditFinding, "projectAuditFinding",
				getConfigProperty("ProjectAuditFinding"), 10);
		waitForElementToLoad(auditFindingFixes, "auditFindingFixes", 30);
		dropDownType(auditFindingFixes, "auditFindingFixes",
				getConfigProperty("AuditFindingFixes"), 10);
		type(orpReference, "orpReference", getConfigProperty("ORPReference"),
				20);
	}

	public void uploadDocument() throws InterruptedException {
		waitForPageToLoad();
		waitForElementToLoad(uploadButton,"uploadButton",20);
		wait(3000);
		saveScreenShotToReports(new Object() {
		}.getClass().getEnclosingMethod().getName());
		click(uploadButton, "uploadButton", 10);
		waitForPageToLoad();
		wait(2000);
		waitForElementToLoad(contactText,"contactText",20);
             isElementPresent(contactText, "contactText", 20);
          click(contactText, "contactText", 20);
		type(uploadDocName, "uploadDocName", "demo", 10);
		filepath = System.getProperty("user.dir") + File.separator + "src"
				+ File.separator + "test" + File.separator + "resources"
				+ File.separator + "Dummy_attachment.txt";
		uploadDoc.sendKeys(filepath);
		click(uploadSubmit, "uploadSubmit", 20);
		waitForPageToLoad();
		wait(3000);
		int uplocDocSize = uploadList.size();
		log.info("Print the count of uploaded document " + uplocDocSize);
		waitForPageToLoad();
		String docText = getText(docCount, "docCount", 20);
		String uploadDocCount = docText.substring(20, 21);
		int count = Integer.parseInt(uploadDocCount);
		Assert.assertEquals(uplocDocSize, count);
	}

	public void answerDesignDocuments() throws InterruptedException {
		waitForPageToLoad();
		waitForElementToLoad(docuemntSection, "docuemntSection", 10);
		String documentVal = getText(docuemntSection, "docuemntSection", 10);
		Assert.assertTrue("Print if the document section page is not",
				documentVal.contains(getConfigProperty("Document")));
		dropDownType(hldAvailable, "hldAvailable",
				getConfigProperty("HLDDocuemnt"), 10);
		dropDownType(hldReview, "hldReview",
				getConfigProperty("SMEToReviewHLD"), 10);
		waitForPageToLoad();
		waitForElementToLoad(tsddAvailable,"tsddAvailable",20);

		dropDownType(tsddAvailable, "tsddAvailable",
				getConfigProperty("TSDDAvailable"), 10);
		dropDownType(tsddReview, "tsddReview", getConfigProperty("TSDDReview"),
				10);
		dropDownType(addSnowLink, "addSnowLink",
				getConfigProperty("AddSNowLink"), 10);
		waitForPageToLoad();
	}

	public void addLinkfiles() {
		waitForPageToLoad();
		addLinkFiles = 2;
		for (int i = 1; i <= addLinkFiles; i++) {
			wait(2000);
			waitForPageToLoad();
			waitForElementToLoad(linkButton,"linkButton",20);
			click(linkButton, "linkButton", 10);
			waitForPageToLoad();
			wait(2000);
			waitForElementToLoad(contactText,"contactText",20);
            isElementPresent(contactText, "contactText", 20);
            click(contactText, "contactText", 20);
			type(linkName, "linkName", getConfigProperty("AddLinkName"), 10);
			type(linkUrl, "linkUrl", getConfigProperty("AddLinkURL"), 10);
			isElementEnabled(linkSubmit, 10);
			click(linkSubmit, "linkSubmit", 30);
			waitForPageToLoad();
		}
		int linkfiles = addLinkList.size();
		log.info("Print the count of link files added " + linkfiles);
		for (WebElement addlink : addLinkList) {
			waitForPageToLoad();
			waitForElementToLoad(addlink,"addlink",20);
			isElementPresent(addlink, "addlink", 30);
			click(addlink, "addlink", 20);
			Set<String> st = driver.getWindowHandles();
			Iterator<String> it = st.iterator();
			String parent = it.next();
			String child = it.next();
			driver.switchTo().window(child);
			System.out.println("Returned to child");
			log.info("Print the URL of the SLX " + driver.getCurrentUrl());
			log.info("Print the Title of the new tab" + driver.getTitle());
			driver.switchTo().window(parent);
			waitForPageToLoad();

		}
	}

	public void clickNext() {
		waitForPageToLoad();
		isElementEnabled(SAEngagementFormPage.next, 20);
		wait(2000);
		saveScreenShotToReports(new Object() {
		}.getClass().getEnclosingMethod().getName());
		click(SAEngagementFormPage.next, "next", 20);

	}

	public void fillSAInfoPageDetails() throws InterruptedException {
		waitForPageToLoad();
		waitForElementToLoad(saInfovalidation,"saInfovalidation",20);
		wait(4000);
		String pageValidation = getText(saInfovalidation, "saInfovalidation",
				10);
		Assert.assertTrue("Print SA info page is not displayed",
				pageValidation.contains(getConfigProperty("SAInfoValidation")));
		selectFutureDate();
		dropDownType(projectBoards, "projectBoards",
				getConfigProperty("ProjectBoards"), 10);
	}

	public void addDeleteAdditionalContact() {
		waitForPageToLoad();
		waitForElementToLoad(addButton, "addButton", 20);
		Addbutton = 3;
		String AdditionalPoupVal = null;
		for (int i = 1; i <= Addbutton; i++) {
			waitForElementToLoad(addButton, "addButton", 20);
			click(addButton, "addButton", 10);
			AdditionalPoupVal = getText(contactText, "contactText", 20);
			Assert.assertTrue(
					"Check the add contact pop up is dispkayed with ",
					AdditionalPoupVal
							.contains(getConfigProperty("AdditionalContact")));
			type(contactName, "contactName", getConfigProperty("TestName"), 10);
			type(contactTitle, "contactTitle", getConfigProperty("Title"), 10);
			type(contactEmail, "contactEmail", getConfigProperty("Email"), 20);
			click(contactsave, "contactsave", 10);
			wait(2000);
			waitForPageToLoad();

		}
		int additionalcount = contactsList.size();
		log.info("Print the count of additional Contact" + additionalcount);
		Assert.assertEquals(additionalcount, Addbutton);
		waitForElementToLoad(contactsEdit, "contactsEdit", 20);
		click(contactsEdit, "contactsEdit", 20);
		Assert.assertTrue("Chekc the add contact pop up is dispkayed with ",
				AdditionalPoupVal
						.contains(getConfigProperty("AdditionalContact")));
		click(contactDelete, "contactDelete", 20);
		int additionalRecount = contactsList.size();
		log.info("Print the Recount of additional Contact" + additionalRecount);
		Assert.assertEquals(additionalRecount, Addbutton - 1);
	}

	public ProjectFormPage clickSaInfoNext() {
		waitForPageToLoad();
				isElementEnabled(SAEngagementFormPage.next, 20);
		saveScreenShotToReports(new Object() {
		}.getClass().getEnclosingMethod().getName());
		click(SAEngagementFormPage.next, "next", 10);
		ProjectFormPage projectFormPage = new ProjectFormPage(driver);
		return projectFormPage;
	}

	public TableViewPage clickMyrequest() {
		waitForPageToLoad();
		waitForElementToLoad(myRequest, "myRequest", 20);
		click(myRequest, "myRequest", 20);
		saveScreenShotToReports(new Object() {
		}.getClass().getEnclosingMethod().getName());
		waitForPageToLoad();
		TableViewPage tableViewPage = new TableViewPage(driver);
		return tableViewPage;
	}

}
