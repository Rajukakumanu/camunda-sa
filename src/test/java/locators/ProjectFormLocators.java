package locators;

/**
 * This interface contains all locators for project form tab
 * 
 * @author kakur
 * 
 */
public interface ProjectFormLocators {
	// Project Developement Page

	public static final String SA_PROJECT_DEVELOPMENT = "//div[@class='card-title h5'][text()='Project Development']";

	public static final String SA_SYSTEM_DEVELOPMENT = "//div[@id='sysDevType']/div//input";

	public static final String SA_PROJECT_DEVELOPMENT_AREAS = "//div[@id='projDevAreas']/div//input";

	public static final String SA_OTHER_DEV_AREAS = "//input[@id='otherDevArea']";

	public static final String SA_RBS_TEAMS = "//div[@id='sysDev']/div//input";

	public static final String SA_THIRDPARTY_DEV = "//input[@id='nameOfThirdParty']";

	// System Development page Locators
	public static final String SA_SYSYTEM_DEVELOPMENT = "//div[@class='card-body']/div[@class='card-title h5']";

	public static final String SA_SYSYTEM_HOSTING = "//div[@id='systemHosting']/div//input";

	public static final String SA_CLOUD_PROVIDER = "//div[@id='externalCloudProvider']/div//input";

	public static final String SA_OTHER_CLOUD_PROVIDER = "//input[@id='nameOfThirdPartyCloudProvider']";

	public static final String SA_EXTERNAL_CLOUD_PROVIDER = "//input[@id='externalThirdPartyHostingName']";

	public static final String SA_SYSTEM_ACCESSBILITY = "//div[@id='sysAccessibility']/div//input";

	public static final String SA_SYSTEM_DEPLOYEDTO = "//div[@id='sysDeployedTo']/div//input";

	public static final String SA_SYSTEM_DEPLOYED_LOCATION = "//input[@id='otherSysDeploy']";

	// Adminstation Page
	public static final String SA_ADMINSTRATION = "//div[@class='card-body']/div[@class='card-title h5']";

	public static final String SA_ADMINSTER_AND_MAINTAIN = "//div[@id='adminOptions']/div//input";

	public static final String SA_EXTERNAL_THIRDPARTY = "//input[@id='nameOfExternalAdmin']";

	public static final String SA_SYSTEM_CONNECT = "//div[@id='connectOptions']/div//input";

	public static final String SA_SEND_RECEIVE_EMAILS = "//div[@id='sendReceiveEmail']/div//input";

	public static final String SA_SYSTEM_USERS = "//div[@id='userFacingOptions']/div//input";

	public static final String SA_NUM_END_USERS = "//div[@id='numUsers']/div//input";

	// Related Impact Assessments page locators
	public static final String SA_RELEATED_IMPACT_VAL = "//div[@class='card-body']/div[@class='card-title h5']";

	public static final String SA_PRIVACY_IMAPCT = "//div[@id='piaAssessment']/div//input";

	public static final String SA_PIA_REFERENCE = "//input[@id='piaReference']";

	public static final String SA_RESILIENCE_IMPACT = "//div[@id='riaAssessment']/div//input";

	public static final String SA_RIA_REFERENCE = "//input[@id='riaReference']";

	public static final String SA_RESILIENCE_TIER = "//div[@id='resilienceTier']/div//input";

	public static final String SA_SERVICE_IMPACT = "//div[@id='siaAssessment']/div//input";

	public static final String SA_SIA_REFERENCE = "//input[@id='siaReference']";

	public static final String SA_SUBMIT_OK = "//button[text()='OK']";

}
