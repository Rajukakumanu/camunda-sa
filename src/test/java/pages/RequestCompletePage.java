package pages;

import locators.RequestCompleteLocators;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UserActions;

public class RequestCompletePage extends UserActions implements
		RequestCompleteLocators {
	public static String completeSA;
	public static String minorSA;

	public RequestCompletePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = SA_COMPLETE_TEXT)
	WebElement complete;

	public void validateFormIsComplete() {
		waitForPageToLoad();
		waitForElementToLoad(complete,"complete",20);
		String SaComplete = getText(complete, "complete", 30);
		saveScreenShotToReports(new Object() {
		}.getClass().getEnclosingMethod().getName());
		Assert.assertTrue("print the request is not:",
				SaComplete.contains(getConfigProperty("SACompleted")));
		completeSA = getText(ProjectInfoPage.saId, "saID", 10);
		minorSA = completeSA.split(":")[0];
		log.info("Print the SA ID is " + minorSA);
		click(ProjectInfoPage.myRequest, "SA_MYREQUEST", 20);
		waitForPageToLoad();
		wait(2000);
	}
}
