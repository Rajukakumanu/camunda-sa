package stepdefination;

import java.io.File;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import utilities.EventHandler;
import utilities.UserActions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * ThisClass consists of project start and end methods for browser and logs
 * Initialise
 * 
 * @author kakur
 * 
 */
public class Hooks {

	public static WebDriver driver;
	public static String CHROME_DRIVER_VERSION = "2_33";
	public static Logger log = Logger.getLogger("");

	/**
	 * Project Start is to initialise the project and launch the browser
	 * 
	 */

	@Before
	public void projectStart() {

		String chromepath = System.getProperty("user.dir") + File.separator
				+ "Drivers" + File.separator + "chromedriver_"
				+ CHROME_DRIVER_VERSION + ".exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		ChromeOptions chromeOptions = new ChromeOptions();
		String downloadFilepath = "C:\\Users\\Public";
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadFilepath);
		chromeOptions.setExperimentalOption("prefs", chromePrefs);
		if (System.getenv("ModeOfExecution").equalsIgnoreCase("linear")) {

			System.setProperty("webdriver.chrome.driver",
					"Drivers/chromedriver_2_37.exe");
			chromeOptions
					.setExperimentalOption("useAutomationExtension", false);
			chromeOptions.setBinary("Drivers/Applications/chrome.exe");
			driver = new ChromeDriver(chromeOptions);
		} else {
			chromeOptions.addArguments("--no sandbox Mode");
			driver = new ChromeDriver(chromeOptions);
		}
		PropertyConfigurator
				.configure(UserActions
						.getFileInputStream("src/test/resources/ConfigFiles/log4j.properties"));
		log.info("Launching Chrome Browser");
		EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
		EventHandler handler = new EventHandler();
		eventDriver.register(handler);
		driver = eventDriver;
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	/**
	 * Project last is to do things after the test is completed
	 * 
	 * @param scenario
	 */
	@After
	public void projectLast(Scenario scenario) {
		if (scenario.isFailed()) {
			UserActions.saveScreenShotToReports("FailureScreenShot");
			final byte[] screenshot = ((TakesScreenshot) driver)
					.getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}
		driver.manage().deleteAllCookies();
		driver.quit();
	}
}
