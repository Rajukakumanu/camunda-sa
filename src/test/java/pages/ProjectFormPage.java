package pages;

import locators.ProjectFormLocators;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UserActions;

/**
 * This Class consists of code/actions related to project form page part of
 * requester journey
 * 
 * @author kakur
 * 
 */
public class ProjectFormPage extends UserActions implements ProjectFormLocators {

	public ProjectFormPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = SA_PROJECT_DEVELOPMENT)
	WebElement projectDevValidation;

	@FindBy(xpath = SA_SYSTEM_DEVELOPMENT)
	WebElement systemdev;

	@FindBy(xpath = SA_PROJECT_DEVELOPMENT_AREAS)
	WebElement projecDevAreas;

	@FindBy(xpath = SA_OTHER_DEV_AREAS)
	WebElement otherDevAreas;

	@FindBy(xpath = SA_RBS_TEAMS)
	WebElement rbsteam;

	@FindBy(xpath = SA_THIRDPARTY_DEV)
	WebElement thirdPartyDev;

	@FindBy(xpath = SA_SYSYTEM_DEVELOPMENT)
	WebElement sysDevVal;

	@FindBy(xpath = SA_SYSYTEM_HOSTING)
	WebElement systemHosting;

	@FindBy(xpath = SA_CLOUD_PROVIDER)
	WebElement cloudProvider;

	@FindBy(xpath = SA_OTHER_CLOUD_PROVIDER)
	WebElement otherCloud;

	@FindBy(xpath = SA_EXTERNAL_CLOUD_PROVIDER)
	WebElement externalCloud;

	@FindBy(xpath = SA_SYSTEM_ACCESSBILITY)
	WebElement systemAssesbility;

	@FindBy(xpath = SA_SYSTEM_DEPLOYEDTO)
	WebElement systemDeployed;

	@FindBy(xpath = SA_SYSTEM_DEPLOYED_LOCATION)
	WebElement deployedLocation;

	@FindBy(xpath = SA_ADMINSTRATION)
	WebElement adminstrationVal;

	@FindBy(xpath = SA_ADMINSTER_AND_MAINTAIN)
	WebElement adminAndManintain;

	@FindBy(xpath = SA_EXTERNAL_THIRDPARTY)
	WebElement exteralParty;

	@FindBy(xpath = SA_SYSTEM_CONNECT)
	WebElement sysConnect;

	@FindBy(xpath = SA_SEND_RECEIVE_EMAILS)
	WebElement receiveEmails;

	@FindBy(xpath = SA_SYSTEM_USERS)
	WebElement sysUsers;

	@FindBy(xpath = SA_NUM_END_USERS)
	WebElement endUsers;

	@FindBy(xpath = SA_RELEATED_IMPACT_VAL)
	WebElement relatedImpactVal;

	@FindBy(xpath = SA_PRIVACY_IMAPCT)
	WebElement privacyImpact;

	@FindBy(xpath = SA_PIA_REFERENCE)
	WebElement piaReference;

	@FindBy(xpath = SA_RESILIENCE_IMPACT)
	WebElement resilienceImpact;

	@FindBy(xpath = SA_RIA_REFERENCE)
	WebElement riaReference;

	@FindBy(xpath = SA_RESILIENCE_TIER)
	WebElement resilienceTier;

	@FindBy(xpath = SA_SERVICE_IMPACT)
	WebElement serviceImpact;

	@FindBy(xpath = SA_SIA_REFERENCE)
	WebElement siaReference;

	@FindBy(xpath = SA_SUBMIT_OK)
	WebElement submitOk;

	public void selectSystemDevelopmentType() {
		waitForPageToLoad();
		waitForElementToLoad(projectDevValidation, "projectDevValidation", 20);
		isElementPresent(projectDevValidation, "projectDevValidation", 30);
		String projectDev = getText(projectDevValidation,
				"projectDevValidation", 20);
		log.info("print the project developemnt page is " + projectDev);
		Assert.assertTrue("Print if the document section page is not",
				projectDev.contains(getConfigProperty("ProjectDevelopment")));
		dropDownType(systemdev, "systemdev",
				getConfigProperty("SystemDevelopment"), 20);
	}

	public void selectProjectDevelopment(String devArea) {
		waitForPageToLoad();
		if (devArea.equalsIgnoreCase("Off the shelf")) {
			dropDownType(projecDevAreas, "projecDevAreas", devArea, 10);
			dropDownType(projecDevAreas, "projecDevAreas",
					getConfigProperty("ProjectDev"), 10);
			isElementEnabled(otherDevAreas, 20);
			type(otherDevAreas, "otherDevAreas",
					getConfigProperty("OtherDevelopment"), 20);

		} else {
			dropDownType(projecDevAreas, "projecDevAreas", devArea, 10);

		}
	}

	public void selectSystemTeam(String teams) {
		waitForPageToLoad();
		if (teams.equalsIgnoreCase("Internal development teams")) {
			dropDownType(rbsteam, "rbsteam", teams, 20);

		} else {
			dropDownType(rbsteam, "rbsteam", teams, 20);
			isElementEnabled(thirdPartyDev, 20);
			type(thirdPartyDev, "thirdPartyDev",
					getConfigProperty("ThirdPartyDevelopers"), 20);
		}
	}

	public void selectSystemHosting(String Hosting) {
		waitForPageToLoad();
		waitForElementToLoad(sysDevVal, "sysDevVal", 20);
		wait(3000);
		isElementPresent(sysDevVal, "sysDevVal", 30);
		String systemDev = getText(sysDevVal, "sysDevVal", 20);
		log.info("print the System hosting page is " + systemDev);
		Assert.assertTrue("Print if the document section page is not",
				systemDev.contains(getConfigProperty("SystemHosting")));
		waitForPageToLoad();
		wait(2000);
		if (Hosting.equalsIgnoreCase("Internal hosting")) {
			dropDownType(systemHosting, "systemHosting", Hosting, 10);

		} else if (Hosting.equalsIgnoreCase("Internal cloud")
				|| Hosting.equalsIgnoreCase("External cloud")) {
			dropDownType(systemHosting, "systemHosting", Hosting, 10);
			isElementPresent(cloudProvider, "cloudProvider", 20);
			dropDownType(cloudProvider, "cloudProvider",
					getConfigProperty("CloudProvider"), 20);
			isElementPresent(otherCloud, "otherCloud", 20);
			type(otherCloud, "otherCloud", getConfigProperty("CloudName"), 10);
			dropDownType(systemHosting, "systemHosting", "3rd party supplier",
					10);
			isElementPresent(externalCloud, "externalCloud", 20);
			type(externalCloud, "externalCloud",
					getConfigProperty("ExternalHostingName"), 20);

		}
	}

	public void selectAccessibility(String accessibility, String deployed) {
		dropDownType(systemAssesbility, "systemAssesbility", accessibility, 10);
		dropDownType(systemDeployed, "systemDeployed", "India", 10);

		if (deployed.equalsIgnoreCase("EMEA")) {
			dropDownType(systemDeployed, "systemDeployed", deployed, 10);

		} else {
			dropDownType(systemDeployed, "systemDeployed", deployed, 10);
			isElementPresent(deployedLocation, "deployedLocation", 10);
			type(deployedLocation, "deployedLocation",
					getConfigProperty("SyetemDeployedLocation"), 20);
		}

	}

	public void selectAdminAndMaintain(String admin) {
		waitForPageToLoad();
		waitForElementToLoad(adminstrationVal, "adminstrationVal", 20);
		wait(2000);
		isElementPresent(adminstrationVal, "adminstrationVal", 30);
		String adminPage = getText(adminstrationVal, "adminstrationVal", 20);
		log.info("print the page is " + adminPage);
		Assert.assertTrue("Print if the Adminstration section page is not",
				adminPage.contains(getConfigProperty("Administration")));
		waitForPageToLoad();
		wait(1000);
		if (admin.equalsIgnoreCase("RBS central")
				|| admin.equalsIgnoreCase("RBS Internal")) {
			isElementPresent(adminAndManintain, "adminAndManintain", 20);
			dropDownType(adminAndManintain, "adminAndManintain", admin, 20);

		} else {
			isElementPresent(adminAndManintain, "adminAndManintain", 20);
			dropDownType(adminAndManintain, "adminAndManintain", admin, 20);
			isElementPresent(exteralParty, "exteralParty", 10);
			type(exteralParty, "exteralParty",
					getConfigProperty("ThirdPartyMaintain"), 10);
		}
	}

	public void selectSystemConnect(String Connect) {
		waitForPageToLoad();
		dropDownType(sysConnect, "sysConnect", Connect, 20);
	}

	public void selectEmails(String email) {
		waitForPageToLoad();
		dropDownType(receiveEmails, "receiveEmails", email, 10);
	}

	public void selectSystemUsers(String users) {
		waitForPageToLoad();

		if (users.equalsIgnoreCase("Customers")
				|| users.equalsIgnoreCase("Third party suppliers")) {
			dropDownType(sysUsers, "sysUsers", users, 20);
			dropDownType(endUsers, "endUsers",
					getConfigProperty("NumOfEndUsers"), 10);
		} else {
			dropDownType(sysUsers, "sysUsers", users, 20);
			dropDownType(endUsers, "endUsers",
					getConfigProperty("NumOfEndUsers"), 10);
		}
	}

	public void selectPrivacyImpact(String privacy) {
		waitForPageToLoad();
		wait(2000);
		isElementPresent(relatedImpactVal, "relatedImpactVal", 30);
		String adminPage = getText(relatedImpactVal, "relatedImpactVal", 20);
		log.info("print the page is " + adminPage);
		Assert.assertTrue("Print if the Related impact page is not",
				adminPage.contains(getConfigProperty("ReleatedImpactAss")));
		if (privacy.equalsIgnoreCase("PIA not available")
				|| privacy.equalsIgnoreCase("PIA not required")) {
			isElementPresent(privacyImpact, "privacyImpact", 20);
			dropDownType(privacyImpact, "privacyImpact", privacy, 20);

		} else {
			dropDownType(privacyImpact, "privacyImpact", privacy, 20);
			isElementPresent(piaReference, "piaReference", 10);
			type(piaReference, "piaReference",
					getConfigProperty("PIAReference"), 10);
		}
	}

	public void selectResilienceImpact(String Resilience) {
		waitForPageToLoad();
		if (Resilience.equalsIgnoreCase("RIA not available")
				|| Resilience.equalsIgnoreCase("RIA not required")) {
			wait(1000);
			isElementPresent(resilienceImpact, "resilienceImpact", 20);
			dropDownType(resilienceImpact, "resilienceImpact", Resilience, 20);

		} else {
			dropDownType(resilienceImpact, "resilienceImpact", Resilience, 20);
			isElementPresent(resilienceTier, "resilienceTier", 20);
			dropDownType(resilienceTier, "resilienceTier",
					getConfigProperty("ResilienceTier"), 10);
			isElementPresent(riaReference, "riaReference", 10);
			type(riaReference, "riaReference",
					getConfigProperty("RIAReference"), 10);
		}
	}

	public void selectServiceImpact(String ServiceImpact) {
		waitForPageToLoad();
		if (ServiceImpact.equalsIgnoreCase("SIA not available")
				|| ServiceImpact.equalsIgnoreCase("SIA not required")) {
			wait(1000);
			isElementPresent(serviceImpact, "serviceImpact", 20);
			dropDownType(serviceImpact, "serviceImpact", ServiceImpact, 20);

		} else {
			dropDownType(serviceImpact, "serviceImpact", ServiceImpact, 20);
			isElementPresent(siaReference, "siaReference", 10);
			type(siaReference, "siaReference",
					getConfigProperty("SIAReference"), 10);
		}
	}

	public TableViewPage clickSubmit() {
		waitForPageToLoad();
		isElementEnabled(SAEngagementFormPage.next, 20);
		saveScreenShotToReports(new Object() {
		}.getClass().getEnclosingMethod().getName());
		click(SAEngagementFormPage.next, "next", 10);
		waitForPageToLoad();
		isElementPresent(submitOk, "submitOk", 20);
		click(submitOk, "submitOk", 20);
		TableViewPage tableViewPage = new TableViewPage(driver);
		return tableViewPage;
	}

}
