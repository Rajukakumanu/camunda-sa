package pages;

import locators.SAEngagementFormLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UserActions;

/**
 * This class consists of all the actions we do in LoggedinHomepage and reading
 * locators from LoggedInHomePageLocators
 * 
 * @author kakur
 * 
 */
public class SAEngagementFormPage extends UserActions implements
		SAEngagementFormLocators {
	public static WebDriver driver;
	public static String latestSA;

	public SAEngagementFormPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = SA_CREATE_NEW_REQUEST)
	WebElement createNewRequest;

	@FindBy(xpath = SA_BIA_CONFIDENCE_RATING)
	WebElement confidenceRating;

	@FindBy(xpath = SA_ISABIALINK)
	WebElement isbiaLink;

	@FindBy(xpath = SA_ACCOUNTABLE_EXECUTIVE)
	WebElement accountableExecutive;

	@FindBy(xpath = SA_BIA_INTIGRITY_RATIG)
	WebElement intigrityRating;

	@FindBy(xpath = SA_AVAILABILITY_RATING)
	WebElement availRating;

	@FindBy(xpath = SA_OVERALL_RATING)
	WebElement overallRating;

	@FindBy(xpath = SA_DATA_CLASSIFICATION)
	WebElement dataClassification;

	@FindBy(xpath = SA_CONTINUE)
	public static WebElement next;

	@FindBy(xpath = SA_ASSET_ID)
	WebElement assetID;

	@FindBy(xpath = SA_PROJECT_NAME)
	WebElement projectName;

	@FindBy(xpath = PREVIOUS_SA)
	WebElement previousSA;

	@FindBy(xpath = SA_NEW_PROJECT)
	WebElement newProject;

	@FindBy(xpath = SA_MOST_RECENT_SA)
	WebElement recentSA;

	public void clickSAButton() {
		waitForPageToLoad();
		click(createNewRequest, "createNewRequest", 10);
	}

	public void enterisBiaRef() {
		waitForPageToLoad();
		type(isbiaLink, "isbiaLink", getConfigProperty("BIARefenence"), 10);
	}

	public void selectBIArating(String dropDown) {
		waitForPageToLoad();
		isElementPresent(confidenceRating, "confidenceRating", 30);
		dropDownType(confidenceRating, "confidenceRating",
				getConfigProperty("ConfidenceRating"), 20);
		isElementPresent(intigrityRating, "intigrityRating", 30);
		dropDownType(intigrityRating, "intigrityRating",
				getConfigProperty("IntegrityRating"), 20);
		isElementPresent(availRating, "availRating", 30);
		dropDownType(availRating, "availRating",
				getConfigProperty("AvailabilityRating"), 20);
		isElementPresent(overallRating, "overallRating", 30);
		dropDownType(overallRating, "overallRating", dropDown, 20);

	}

	public void selectDataClassification(String dropDown) {
		waitForPageToLoad();
		isElementPresent(dataClassification, "dataClassification", 30);
		dropDownType(dataClassification, "dataClassification", dropDown, 20);

	}

	public void enterAccountableExe() {
		waitForPageToLoad();
		type(accountableExecutive, "accountableExecutive",
				getConfigProperty("AccountableExecutive"), 10);
	}

	public void enterInfoForNewSA(String pName) {
		waitForPageToLoad();
		type(assetID, "assetID", getConfigProperty("AssetID"), 10);
		type(projectName, "projectName", pName, 10);
	}

	public void enterInfoForPreviousSA(String project) {
		waitForPageToLoad();
		if (project.equalsIgnoreCase("New system")) {
			dropDownType(newProject, "newProject", project, 10);

		} else {
			dropDownType(newProject, "newProject", project, 10);
		}
	}

	public void selectPreviousSA(String mostRecentSA) {
		waitForPageToLoad();
		dropDownType(recentSA, "recentSA", mostRecentSA, 10);
	}

	public void clickProjectDataContinue(String workflow) {
		waitForPageToLoad();
		try {
			isElementEnabled(next, 30);
			click(next, "next", 30);
			wait(2);
			saveScreenShotToReports(new Object() {
			}.getClass().getEnclosingMethod().getName());
			if (workflow.equalsIgnoreCase("Minor")) {
				RequestCompletePage completePage = new RequestCompletePage(
						driver);
			} else {
				ProjectInfoPage projetInfoPage = new ProjectInfoPage(driver);
			}
		} catch (Exception e) {
			log.error(e.getStackTrace());
		}
	}

}
