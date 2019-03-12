package locators;

/**
 * @author kakur This analyst journey page consists of all analyst jouney
 *         locators across all pages
 */
public interface AnalystQueueLocators {

	public static final String SA_ANALYST_THREATS = "//li[@role ='tab'][text() ='Threats']";

	public static final String SA_ANALYST_THREATPAGEVAL = "//div[@class='button-align']/button";

	public static final String SA_THREAT_DELETE_OK = "//button[@class='btn btn-sm btn-primary btn btn-secondary'][text() ='Ok']";

	public static final String SA_ADD_THREAT = "//button[@name='addThreat']";

	public static final String SA_ENTER_THREAD = "//div[@class='modal-content']//div[@class='rt-thead -filters']//div[3]/input";

	public static final String SA_ANALYST_CHECKBOX = "//div[@class='modal-content']//div[@class='rt-tbody']//input[@type='checkbox']";

	public static final String SA_THREAD_SUBMIT = "//div[@class='modal-content']//button[@name='submit']";

	public static final String SA_SELECT_ROWS = "//span[@class='select-wrap -pageSizeOptions']/select";

	public static final String SA_LOGOUT = "//span[@class='zb-nav-item-label pointer']";

	public static final String SA_SAID = "//div[@class ='react-tabs']/div[@class='pull-right text-info space-top']";

	public static final String SA_ANALYST_CONTROLS = "//li[@role ='tab'][text() ='Controls']";

	public static final String SA_EDIT_CONTROLS = "//div[@role='grid']//button[@name ='editControl']";

	public static final String SA_REMOVE_CONTROLS = "//div[@role='grid']//div[@class='rt-tr-group'][1]//button[@id='remove']";

	public static final String SA_REMOVE_REASON = "//div[@role='grid']//input[@id='notrelevant']";

	public static final String SA_REMOVE_SUBMIT = "//div[@class =' text-center']/button[@name='removeControl']";

	public static final String SA_ADD_CONTROL = "//th/button[@name='addControl']";

	public static final String SA_ANALYST_NEXT = "//div[@class ='-next']/button";

	public static final String SA_ANALYST_PREVIOUS = "//div[@class ='-previous']/button";

	public static final String SA_THREAT = "//div[@role='grid']//div[@class='rt-tr-group'][1]/div/div[2]";

	public static final String SA_THREAT_BUTTON = "//div[@role='grid']//div[@class='rt-tr-group'][1]//button";

	public static final String SA_ANALYST_MYASSIGNMENTS = "//ul[@role='tablist']/li[text()='My Assignments ']";

	public static final String SA_CONTROLTEXT_RESPONSE = "//div//textarea[not(@disabled)]";

	public static final String SA_CONTROL_MET = "//div[@id ='controlMetStatus']/..//input";

	public static final String SA_CONTROL_PAGE_VAl = "//h5/span/text()";

	public static final String SA_MARK_AS_COMPLETE = "//button[@id='overlay']";

	public static final String SA_SCOPE_PAGE_INFO = "//div[text() ='Scope of SA']";

	public static final String SA_ANALYST_SCOPE = "//li[@role ='tab'][text() ='Scope']";

	public static final String SA_SCOPE_TEXT = "//textarea[@class ='form-control']";

	public static final String SA_SCOPE_PENTEST = "//input[@id='penTestRef']";

	public static final String SA_SCOPE_SAVE = "//button[@id='btnSaveAnalystScope']";

	public static final String SA_GOTO_FINDINGS = "//button[@id ='goFindings']";

	public static final String SA_CONTROL_NOTMET = "//li[@role ='tab'][text() ='Controls Not Met']";

	public static final String SA_POSE_QUESTION = "//button[@id='poseQuestion']";

	public static final String SA_EDIT_FINDINGS = "//button[contains(@id, 'editFinding')]";

	public static final String SA_FINDINGS_INPUTTEXT = "//input[contains(@class,'form-control')][not(@disabled)]";

	public static final String SA_FINDINGS_CONTROLS_TEXT = "//textarea[contains(@class,'form-control')][not(@disabled)]";

	public static final String SA_FINDINGS_CONFIDENTIALITY_RATING = "//div[@id ='confidentialityRating']/div//input";

	public static final String SA_FINDINGS_INTEGRITY_RATING = "//div[@id ='integrityRating']/div//input";

	public static final String SA_FINDINGS_PENTESTING = "//div[@id ='penTestFinding']/div//input";

	public static final String SA_FINDINGS_EXCEPTION_POLICY = "//div[@id ='exceptionPolicy']/div//input";

	public static final String SA_FINDINGS_LIKELIHOOD_RATING = "//div[@id ='likelihoodRating']/div//input";

	public static final String SA_FINDINGS_OVERALL_RATING = "//div[@id ='overallRating']/div//input";

	public static final String SA_FINDINGS_AVAILABILITY_RATING = "//div[@id ='availabilityRating']/div//input";

	public static final String SA_SECURITY_FINDING = "//div[@id ='perimeterSecurity']/div//input";

	public static final String SA_SELECT_LEVEL = "//div[@id ='level']/div//input";

	public static final String SA_RESPONSE = "//li[text()='SA Response ']";

	public static final String SA_QUESTIONS_BUSINESS_RESPONSE = "//textarea[@class='form-control from-control-sm']";

	public static final String SA_QUESTIONS_RESUBMIT = "//button[@id ='reSubmit']";

	public static final String SA_RESUBMIT_POPUP = "//div[@class='modal-footer']/button[1]";

	public static final String SA_RESPONSE_FINDINGS = "//li[@role ='tab'][text() ='Findings']";

	public static final String SA_FINDINGS_PAGE = "//li[text()='Findings']";

	public static final String SA_ADD_FINDINGS = "//button[@id='add-findings']";

	public static final String SA_ADD_FINDING_VAL = "//div[@class='modal-content']//h5/span";

	public static final String SA_FINDINGS_COMPLETE = "//button[@id='findings-complete']";

	public static final String SA_QUESTIONS_POSED_VAL = "//table[@class='threat-control-table']/thead//div";

	public static final String SA_QUESTIONS_TAB = "//li[@role ='tab'][text() ='SA Questions']";

	public static final String SA_GENERTE_SA_REPORT = "//button[@class='btn btn-sm btn-primary']";

	public static final String SA_ADD_DOCUMENT = "//button[contains(@class,'btn btn-sm btn-primary')]";

	public static final String SA_SEND_REPORT_VAL = "//li[text()='Send Report']";

	public static final String SA_SEND_REPORT = "//li[@role ='tab'][text() ='Send Report']";

	public static final String SA_ASSIGN_ANALYST = "//div[@id='analyst']/div//input";

	public static final String SA_ASSIGN_MANAGER = "//div[@id='reviewer']/div//input";

	public static final String SA_REPORT_SUBMIT = "//button[@type ='submit']";

	public static final String SA_REVIEW_TEXT = "//td/textarea[@class='form-control from-control-sm']";

	public static final String SA_REQUESTER_COMMENTS = "//textarea[@id ='requesterComments']";

	public static final String SA_RISK_EDIT = "//button[@id='editRisk']";

	public static final String SA_FINDINGS_MITIGATED = "//div[@id='findingsMitigated']/div//input";

	public static final String SA_FINDINGS_RISK_RAISED = "//div[@id='riskRaised']/div//input";

	public static final String SA_FINDINGS_RISK_SYSTEM = "//div[@id='riskSystemUsed']/div//input";

	public static final String SA_FINDINGS_RISK_REFERENCE = "//input[@id='riskReference']";

	public static final String SA_RISK_OVERLAY_SAVE = "//button[@id='riskOverlay']";

	public static final String SA_FINDINGS_REQUESTER_SAVE = "//button[@class='btn btn-sm btn-primary mr-2']";

	public static final String SA_GO_STRIGHT_TOFINDINGS = "//button[@id ='goStraightToFindings']";

	public static final String SA_PREVIOUS = "//button[@type='button'][text() ='Previous']";

	public static final String SA_CONTROL_MARKAS_COMPLETE = "//button[@id ='markAsComplete']";

	public static final String SA_GOTO_FINDINGS_POPUP = "//div[@class='react-confirm-alert-button-group']/button[1]";

	public static final String SA_GENERATE_SA_REPORT = "//li[@role ='tab'][text() ='Generate SA Report']";

	public static final String SA_MITIGATE_FINDINGS = "//li[@role ='tab'][text() ='Mitigate Findings']";

	public static final String SA_AMEND_FINDINGS = "//button[@id='amendFindings']";

	public static final String SA_OVERLAY_CONFORMATION = "//h5/span[@class='text-info']/i";

	public static final String SA_CONSIDER_MITIGATED = "//div[@id='isFindingsConsideredMitigated']/div//input";

	public static final String SA_AMEND_FINDINGS_TEXT = "//textarea[@id='actionTaken']";

	public static final String SA_FINDINGS = "//li[@role ='tab'][text() ='Findings']";

	public static final String SA_AMEND_FINDING_SAVE = "//button[@id='save']";

}
