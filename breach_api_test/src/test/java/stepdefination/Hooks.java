package stepdefination;

import java.util.logging.Logger;

import com.mongodb.MapReduceCommand;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.restassured.RestAssured;
import utilities.UserActions;

/**
 * ThisClass consists of project start and end methods for browser and logs
 * Initialise
 *
 * @author kakur
 */
public class Hooks {

    public static Logger log = Logger.getLogger("");

    /**
     * Project Start is to initialise the project and launch the browser
     */


    /**
     * Project last is to do things after the test is completed
     *
     * @param scenario
     */
   /* @After
    public void projectLast(Scenario scenario) {

        if (scenario.isFailed()) {
            UserActions.saveScreenShotToReports("FailureScreenShot");
            final byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(MapReduceCommand.OutputType.BYTES);
            scenario.embed(screenshot,
                    "image/png");
        }
        driver.manage().deleteAllCookies();
        driver.quit();

    }*/
}
