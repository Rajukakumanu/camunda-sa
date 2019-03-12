package locators;

/**
 * @author kakur This common locatos page consists of locators which are common
 *         across all pages
 */
public interface CommonLocatorsPage {

	public static final String SA_DATE_PICKER_ICON = "//button[@class='react-date-picker__calendar-button react-date-picker__button__icon']";

	public static final String SA_MONTH_VIEW = "//div[@class ='react-calendar__month-view ']";

	public static final String SA_MONTH_LIST = "//div[@class='react-calendar__month-view ']/div//button/time";

	public static final String SA_REVIEW = "//span[@class='zb-nav-item'][1]/div/button";

	public static final String SA_SPINNING_ICON = "//div[@class='spinner text-muted']//div[text()='Processing request...']";

	public static final String SA_REQUEST_BUTTON = "//button[@id='btnViewRequest']";

	public static final String SA_QUICK_SEARCH = "//input[@id ='allRequestsQuickSearch']";

	public static final String SA_FUTURE_DATE = "//button[@class='react-calendar__navigation__arrow react-calendar__navigation__next-button']";

	public static final String SA_GOTO_FINDINGS_POPUP = "//div[@class='react-confirm-alert-button-group']/button[1]";

	public static final String SA_SAID = "//div[@class ='react-tabs']/div/span";
}
