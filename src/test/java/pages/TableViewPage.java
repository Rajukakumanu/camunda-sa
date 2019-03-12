package pages;

import java.io.File;

import locators.TableViewLocators;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UserActions;

/**
 * This class consists of all the actions related to TableViewPage and reading
 * locators from TableViewLocators
 * 
 * @author kakur
 * 
 */
public class TableViewPage extends UserActions implements TableViewLocators {

	public static String rStatus;
	public static WebElement saRequestStatus;

	public TableViewPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = SA_DOWNLOAD_LINK)
	WebElement pdfDownload;

	@FindBy(xpath = SA_DOCUMENTS)
	WebElement documents;

	@FindBy(xpath = SA_REQUEST)
	public static WebElement request;

	@FindBy(xpath = SA_PDFLINK)
	public static WebElement pdfLink;

	public void clickFileDownload() {
		waitForPageToLoad();
		click(saRequestStatus, "saRequestStatus", 20);
		isElementEnabled(pdfDownload, 20);
		click(pdfDownload, "pdfDownload", 30);
		wait(2000);
		readPDFDocument();
		Assert.assertTrue("content of the is pdf is not matched with ",
				readPDFDocument().contains("Security Assessment"));
		File file = getLatestFilefromDir(desDir);
		log.info("file path is: " + getLatestFilefromDir(desDir));
		if (file.delete()) {
			log.info(file.getName() + " is deleted!");
		} else {
			log.info("Delete operation is failed.");
		}
	}

	public void CheckFinalReport() {
		waitForPageToLoad();
		click(viewRequestButton, "viewRequestButton", 20);
		waitForPageToLoad();
		wait(2000);
		isElementEnabled(pdfLink, 20);
		click(pdfLink, "pdfLink", 30);
		wait(2000);
		readPDFDocument();
		Assert.assertTrue("content of the is pdf is not matched with ",
				readPDFDocument().contains("Security Architecture "));

		File file = getLatestFilefromDir(desDir);
		log.info("file path is: " + getLatestFilefromDir(desDir));
		if (file.delete()) {
			log.info(file.getName() + " is deleted!");
		} else {
			log.info("Delete operation is failed.");
		}
	}

	public String checkRequestStatus(String status) {
		waitForPageToLoad();
		if (status.equalsIgnoreCase("Complete, not required")) {
			type(quickSearch, "quickSearch", RequestCompletePage.minorSA, 20);
			waitForPageToLoad();
			saveScreenShotToReports(new Object() {
			}.getClass().getEnclosingMethod().getName());
			saRequestStatus = driver
					.findElement(By
							.xpath("//div[@ref='eBodyViewportWrapper']//div[@role='row']/div[text()='"
									+ RequestCompletePage.minorSA
									+ "']/../div[3]"));
		} else {
			type(quickSearch, "quickSearch", ProjectInfoPage.latestSA, 20);
			waitForPageToLoad();
			saveScreenShotToReports(new Object() {
			}.getClass().getEnclosingMethod().getName());
			saRequestStatus = driver
					.findElement(By
							.xpath("//div[@ref='eBodyViewportWrapper']//div[@role='row']/div[text()='"
									+ ProjectInfoPage.latestSA + "']/../div[3]"));
		}
		click(saRequestStatus, "saRequestStatus", 30);
		wait(3000);
		return rStatus;
	}

	public void validateRequestStatus(String status) {
		waitForPageToLoad();
		getSaStatus(status);
		saveScreenShotToReports(new Object() {
		}.getClass().getEnclosingMethod().getName());

	}

	public void clickViewAndNavToDocuments() {
		waitForPageToLoad();
		click(saRequestStatus, "saRequestStatus", 20);
		click(viewRequestButton, "viewRequestButton", 20);
		waitForPageToLoad();
		nativeClick(documents, "documents", 20);
	}

}