package pages;

import locators.AssignmentQueueLocators;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UserActions;

public class AssignmentQueuePage extends UserActions implements
		AssignmentQueueLocators {
	public static WebElement assignSA;
	public static String newSatId;

	public AssignmentQueuePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = SA_ASSIGN_REQUEST)
	WebElement assignRequest;

	@FindBy(xpath = SA_EDIT_PRIORITY)
	WebElement editPriority;

	@FindBy(xpath = SA_ASSIGN_TO_ANALYST)
	WebElement selectAssign;

	@FindBy(xpath = SA_ASSIGN_SAVE)
	WebElement save;

	@FindBy(xpath = SA_ASSIGNMENT_PAGE)
	WebElement assignPageVal;

	@FindBy(xpath = SA_MANAGE_FOCUS_AREA)
	WebElement manageFocusArea;

	@FindBy(xpath = SA_ENTER_INPUT_TAG)
	WebElement enterTag;

	@FindBy(xpath = SA_SAVE_FOCUS_AREA)
	WebElement saveFocusArea;

	@FindBy(xpath = SA_ANALYST_FOCUS_AREA)
	WebElement analystFocusArea;

	@FindBy(xpath = SA_SEARCH_ANALYST)
	WebElement searchAnalyst;

	@FindBy(xpath = SA_SELECT_ANALYST)
	WebElement selectAnalyst;

	@FindBy(xpath = SA_ASSIGN_FOCUS_AREA)
	WebElement clickAssignFocusArea;

	@FindBy(xpath = SA_SELECT_FOCUS_AREA)
	WebElement selectFocusArea;

	@FindBy(xpath = SA_ADD_FOCUS_AREA_SAVE)
	WebElement clickSave;

	@FindBy(xpath = SA_VALIDATE_FOCUS_AREA_ADDED)
	WebElement validateAnalystArea;

	@FindBy(xpath = SA_FOCUS_AREA_ADDED)
	WebElement checkfocusAreaAdded;

	@FindBy(xpath = SA_REMOVE_FOCUS_AREA)
	 public static WebElement removeFocusArea;

	public void assignToAnalyst() {
		waitForPageToLoad();
		isElementPresent(assignPageVal, "assignPageVal", 20);
		String assignmentPage = getText(assignPageVal, "assignPageVal", 20);
		Assert.assertTrue("Check the assigment page not is displayed",
				assignmentPage.contains("Assignment Queue"));
		waitForPageToLoad();

		WebElement assignSA = driver
				.findElement(By
						.xpath("//div[@ref='eBodyViewportWrapper']//div[@role='row']/div[text()='"
								+ ProjectInfoPage.latestSA + "']/../div[1]"));

		/*
		 * WebElement assignSA = driver .findElement(By .xpath(
		 * "//div[@class='space-bottom']//div[@ref='eBodyViewportWrapper']//div[@role='row'][1]/div[1]"
		 * ));
		 */

		log.info("Print the Request status " + assignSA);
		newSatId = getText(assignSA, "assignSA", 20);
		log.info("Print the Request status " + newSatId);
		click(assignSA, "assignSA", 20);
		click(assignRequest, "assignRequest", 30);
		dropDownType(selectAssign, "selectAssign", "Raju Kakumanu", 20);
		click(save, "save", 20);
		waitForPageToLoad();
	}

	public void addNewFocusArea() {
		waitForPageToLoad();
		isElementPresent(assignPageVal, "assignPageVal", 20);
		String assignmentPage = getText(assignPageVal, "assignPageVal", 20);
		Assert.assertTrue("Check the assigment page not is displayed",
				assignmentPage.contains("Assignment Queue"));
		click(manageFocusArea, "manageFocusArea", 20);
		type(enterTag, "enterTag", "Test Tag", 10);
		click(saveFocusArea, "saveFocusArea", 20);
		String focusAreaAdded = getText(checkfocusAreaAdded,
				"checkfocusAreaAdded", 20);
		Assert.assertTrue("Print if the Focus area is not found ",
				focusAreaAdded.contains("Test Tag"));
	}

	public void assignFocusToAnalyst() {
		waitForPageToLoad();
		click(analystFocusArea, "analystFocusArea", 20);
		type(searchAnalyst, "searchAnalyst", "Raju Kakumanu", 20);
		click(selectAnalyst, "selectAnalyst", 20);
		isElementPresent(clickAssignFocusArea, "clickAssignFocusArea", 20);
		click(clickAssignFocusArea, "clickAssignFocusArea", 30);
		dropDownType(selectFocusArea, "selectFocusArea", "Test Tag", 20);
		click(clickSave, "clickSave", 20);
		waitForPageToLoad();
		String analystFocusArea = getText(validateAnalystArea,
				"validateAnalystArea", 20);
		Assert.assertTrue("Print if the analyst Focus area is not found ",
				analystFocusArea.contains("Test Tag"));
	}

	public void deleteFocusArea() {
		waitForPageToLoad();
		click(manageFocusArea, "manageFocusArea", 20);
		click(removeFocusArea, "removeFocusArea", 20);
		waitForPageToLoad();
		click(findingsPopup, "findingsPopup", 20);
		waitForPageToLoad();

	}
}
