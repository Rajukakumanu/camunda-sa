package locators;

/**
 * This interface consists all {@link SAEngagementFormLocators}
 * 
 * @author kakur
 * 
 */
public interface SAEngagementFormLocators {

	public static final String SA_CREATE_NEW_REQUEST = "//button[@class='btn btn-primary btn-sm']";

	public static final String SA_ISABIALINK = "//input[@id='isbiaLink']";

	public static final String SA_BIA_CONFIDENCE_RATING = "//div[@id='isbiaConfidentialityRating']/div//input";

	public static final String SA_BIA_INTIGRITY_RATIG = "//div[@id='isbiaIntegrityRating']/div//input";

	public static final String SA_AVAILABILITY_RATING = "//div[@id='isbiaAvailabilityRating']/div//input";

	public static final String SA_OVERALL_RATING = "//div[@id='isbiaOverallRating']/div//input";

	public static final String SA_DATA_CLASSIFICATION = "//div[@id='isbiaDataClassification']/div//input";

	public static final String SA_ACCOUNTABLE_EXECUTIVE = "//input[@id='isbiaAccountableExe']";

	public static final String SA_ASSET_ID = "//input[@id='satAssetId']";

	public static final String SA_PROJECT_NAME = "//input[@id='projectName']";

	public static final String SA_NEW_PROJECT = "//div[@id='isExistingProject']/div//input";

	public static final String PREVIOUS_SA = "//div[@id='isPreviousSa']/div//input";

	public static final String SA_MOST_RECENT_SA = "//div[@id='mostRecentSa']/div//input";

	public static final String SA_CONTINUE = "//button[@id ='save']";

}
