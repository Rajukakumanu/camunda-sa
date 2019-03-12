package pages;

import locators.SignInPageLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UserActions;

/**
 * This class consists of all the actions related to SignInPage and reading
 * locators from SignInPageLocators
 * 
 * @author kakur
 * 
 */
public class SignInPage extends UserActions implements SignInPageLocators {

	public SignInPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = SA_USER_TXT_BOX)
	WebElement userTextBox;

	@FindBy(xpath = SA_PWD_TXT_BOX)
	WebElement pwdTxtBox;

	@FindBy(xpath = SA_SUBMIT_BUTTON)
	WebElement submitButton;

	@FindBy(xpath = SA_USER_BUTTON)
	WebElement user;

	@FindBy(xpath = SA_BUSINESS_USER)
	WebElement businessUser;

	@FindBy(xpath = SA_MANAGER_USER)
	WebElement managerUser;

	@FindBy(xpath = SA_ANALYST_USER)
	WebElement analystUser;

	public void enterCredentialsAndLogin(String user)
			throws InterruptedException {
		getToUrl(System.getenv("AppURL"));
		log.info(driver.getCurrentUrl());
		waitForPageToLoad();
		if (user.equalsIgnoreCase("BusinessUser")) {
			type(userTextBox, "userTextBox", getConfigProperty("Username"), 10);
			type(pwdTxtBox, "pwdTxtBox",
					decryptXOR(getConfigProperty("Password"), "demo"), 10);
			isElementEnabled(submitButton, 10);
			click(submitButton, "submitButton", 10);
			waitForPageToLoad();
			saveScreenShotToReports(new Object() {
			}.getClass().getEnclosingMethod().getName());

		}
	}

	public void selectUser(String role) {
		waitForPageToLoad();
		if (role.equalsIgnoreCase("manager")) {
			waitForPageToLoad();
            wait(2000);
			click(user, "user", 20);
			click(managerUser, "managerUser", 20);

			AssignmentQueuePage assignmentPage = new AssignmentQueuePage(driver);
		}
		if (role.equalsIgnoreCase("analyst")) {
		    waitForPageToLoad();
		    wait(2000);
			click(user, "user", 20);
			click(analystUser, "analystUser", 20);
			AnalystQueuePage analystPage = new AnalystQueuePage(driver);

		} else if (role.equalsIgnoreCase("Business")) {
            waitForPageToLoad();
            wait(1000);
			click(user, "user", 20);
			click(businessUser, "businessUser", 20);

			SAEngagementFormPage pageObject = new SAEngagementFormPage(driver);
		}

	}

}