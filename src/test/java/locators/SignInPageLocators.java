package locators;

/**
 * This interface consists all the {@link SignInPageLocators}
 * 
 * @author kakur
 * 
 */
public interface SignInPageLocators {

	public static final String SA_USER_TXT_BOX = "//input[@placeholder ='User Name']";

	public static final String SA_PWD_TXT_BOX = "//input[@placeholder ='Password']";

	public static final String SA_SUBMIT_BUTTON = "//div[@class='buttons space-top space-bottom']/button[@type='submit']";

	public static final String SA_USER_BUTTON = "//span[@class='zb-nav-item-label']//button";

	public static final String SA_BUSINESS_USER = "//div[@data-placement ='bottom-start']/button[1]";

	public static final String SA_MANAGER_USER = "//div[@data-placement ='bottom-start']/button[3]";

	public static final String SA_ANALYST_USER = "//div[@data-placement ='bottom-start']/button[2]";

}
