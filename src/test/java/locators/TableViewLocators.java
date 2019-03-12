package locators;

/**
 * This interface consists all the {@link TableViewLocators}
 * 
 * @author kakur
 * 
 */
public interface TableViewLocators {

	public static final String SA_DOWNLOAD_LINK = "//button[@id='downloadNotRequiredReport']";

	public static final String SA_DOCUMENTS = "//div[@class='text-center']//button[3]";

	public static final String SA_QUICK_SEARCH = "//input[@id ='allRequestsQuickSearch']";

	public static final String SA_REQUEST = "//div[@ref='eBodyViewportWrapper']//div[@role='row']/div[1]/../div[3]";

	public static final String SA_PDFLINK = "//i[@class='fa fa-download fa-fw space-left-sm']";
}
