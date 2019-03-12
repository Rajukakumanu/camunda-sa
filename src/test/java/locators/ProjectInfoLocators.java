package locators;

/**
 * @author kakur This interface consists of all Project info page locators
 */
public interface ProjectInfoLocators {

	public static final String SA_PROJECT_INFO = "//div[text() ='Information about your project']";

	public static final String SA_SAID_NUM = "//div[@class ='react-tabs']/div/span";

	public static final String SA_ORACLE_TECH_MISCODE = "//input[@id='oracleTechMisCode']";

	public static final String SA_P3M_TYPE = "//div[@id='p3MTypeCombined']/div//input";

	public static final String SA_UNDER_NDA = "//div[@id='isUnderNda']/div//input";

	public static final String SA_CURRENT_P3PM_PROJECT = "//div[@id='currentP3mProjectPhase']/div//input";

	public static final String SA_CURRENT_P3PM_PROGRAMME = "//div[@id='p3MProgrammePhase']/div//input";

	public static final String SA_PROJECT_DESC = "//textarea[@id='projectDescription']";

	public static final String SA_CHANGE_DESC = "//textarea[@id='changeDescription']";

	public static final String SA_SYSTEM_OWING_DIVISON = "//div[@id='systemOwningDivision']/div//input";

	public static final String SA_LEGAL_ENTITIES_COVERED = "//div[@id='legalEntitiesCovered']/div//input";

	public static final String SA_RING_FENCING = "//div[@id='isRingFenced']/div//input";

	public static final String SA_PROJECT_MANAGER = "//input[@id='projectManager']";

	public static final String SA_TECH_SME = "//input[@id='technologySme']";

	public static final String SA_REGULATORY = "//div[@id='mandatoryRegulatory']/div//input";

	public static final String SA_PROJECT_AUDIT_FINDING = "//div[@id='isAuditFindingFixes']/div//input";

	public static final String SA_AUDIT_FINDING_FIXES = "//div[@id='auditFindingFixes']/div//input";

	public static final String SA_SME_ATTEND = "//div[@id='smeToAttend']/div//input";

	public static final String SA_PROJECT_INFO_TEXTFIELDS = "//input[@class='form-control form-control-sm']";

	public static final String SA_DOCUMENTS_SECTION = "//div[text()='Design Documents']";

	public static final String SA_PROJECTINFO_NEXT = "//button[@class ='space-top btn btn-primary btn-sm']";

	public static final String SA_UPLOAD_BUTTON = "//button/i[@class='fa fa-file space-right']";

	public static final String SA_UPLOAD_DOC_NAME = "//input[@name='documentName']";

	public static final String SA_UPLOAD_DOC = "//form/div[2]/div//input[@type='file']";

	public static final String SA_LINK_SUBMIT = "//button[@id='saveLink']";

	public static final String SA_UPLOAD_SUBMIT = "//button[@id='uploadDocument']";

	public static final String SA_HIGHLEVEL_DESIGN = "//div[@id='isHighLevelDesignAvailable']/div//input";

	public static final String SA_SME_REVIEW_HLD = "//div[@id='smeToReviewHld']/div//input";

	public static final String SA_ADD_LINK_BUTTON = "//button/i[@class='fa fa-link space-right']";

	public static final String SA_LINK_NAME = "//input[@name='linkName']";

	public static final String SA_LINK_URL = "//input[@name='linkUrl']";

	public static final String SA_SNOW_LINK = "//input[@id='tsddSnowLink']";

	public static final String SA_TSDD_AVAILABLE = "//div[@id='isTsddAvailable']/div//input";

	public static final String SA_SME_REVIEW_TSDD = "//div[@id='smeToReviewTsdd']/div//input";

	public static final String SA_INFO_PAGE_VAL = "//div[text() ='SA Information']";

	public static final String SA_INFO_PROJECT_BOARDS = "//div[@id='smeToAttend']/div//input";

	public static final String SA_ADDITIONAL_CONTACT_ADD = "//button[@id='addContact']";

	public static final String SA_CONTACT_TEXT_VAL = "//h5/span[@class ='text-info']";

	public static final String SA_CONTACT_NAME = "//input[@id='name']";

	public static final String SA_CONTACT_TITLE = "//input[@id='title'] ";

	public static final String SA_ADDITIONAL_EMAIL = "//input[@id='email']";

	public static final String SA_ADDITIONAL_SAVE = "//button[@class ='btn btn-sm btn-primary']";

	public static final String SA_ADDITIONAL_DELETE = "//button[@class ='btn btn-sm btn-danger'] ";

	public static final String SA_ADDITIONAL_CONTACT_LIST = "//a[@class=' badge badge-light space-left']";

	public static final String SA_ADD_LINK_LIST = "//tr/td[@class='pointer']/a";

	public static final String SA_CONTACT_EDIT = "//button[@id='editContact']";

	public static final String SA_CONTACT_DELETE = "//button[@class='btn btn-sm btn-danger']";

	public static final String SA_ORP_REFERENCE = "//input[@id='orpReference']";

	public static final String SA_UPLOAD_DOC_LIST = "//fieldset/div[@class='card card-space-top']//tbody[@class='scroll-tbody']/tr/td/a";

	public static final String SA_DOC_COUNT = "//fieldset/div[@class='card card-space-top']//span[@class='space-left text-muted']";

	public static final String SA_MYREQUEST = "//li[@role ='tab'][text() ='My Requests']";

}