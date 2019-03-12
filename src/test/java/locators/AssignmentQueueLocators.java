package locators;

public interface AssignmentQueueLocators {

	public static final String SA_ASSIGN_REQUEST = "//div[@class='button-group pull-right']/button[text()='Assign Request to Analyst']";

	public static final String SA_EDIT_PRIORITY = "//div[@class='button-group pull-right']/button[text()='Edit Priority/Size']";

	public static final String SA_ASSIGN_TO_ANALYST = "//div[@id='analyst']/div//input";

	public static final String SA_ASSIGN_SAVE = "//button[@id='saveAssignedAnalyst']";

	public static final String SA_ASSIGNMENT_PAGE = "//div[@class='h5 space-top space-bottom']";

	public static final String SA_MANAGE_FOCUS_AREA = "//ul/li[text()='Manage Focus Areas']";

	public static final String SA_ENTER_INPUT_TAG = "//div[@class='input-group']/input";

	public static final String SA_SAVE_FOCUS_AREA = "//button[@id ='saveFocusArea']";

	public static final String SA_REMOVE_FOCUS_AREA = "//form/div[2]/div[2]//span[text()='Test Tag']/i";

	public static final String SA_FOCUS_AREA_ADDED = "//form/div[2]/div[2]//span[text()='Test Tag']";

	public static final String SA_ANALYST_FOCUS_AREA = "//ul/li[text()='Analyst Focus Areas']";

	public static final String SA_SEARCH_ANALYST = "//input[@id ='analystExpertiseQuickSearch']";

	public static final String SA_SELECT_ANALYST = "//div[@class='space-top']//div[@ref='eBodyViewportWrapper']//div[@role='row'][1]";

	public static final String SA_ASSIGN_FOCUS_AREA = "//div[@class='space-top']//div[@class ='button-group pull-right']/button";

	public static final String SA_SELECT_FOCUS_AREA = "//div[@id = 'focusAreas']/..//input";

	public static final String SA_ADD_FOCUS_AREA_SAVE = "//button[@id = 'assignExpertise']";

	public static final String SA_VALIDATE_FOCUS_AREA_ADDED = "//div[@class='space-top']//div[@ref='eBodyViewportWrapper']//div[@role='row'][1]/div[3]//span";

	public static final String SA_ASSIGNMENT_SEARCH = "//input[@id ='assignmentQueueQuickSearch']";

}
