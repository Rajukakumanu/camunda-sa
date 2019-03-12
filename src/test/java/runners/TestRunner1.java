package runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * This runner file consists of all the test case scenario's Tags and report
 * triggering
 * 
 * @author kakur
 * 
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\features", glue = { "stepdefination" }, plugin = {
		"pretty",
		"html:target/cucumber-parallel/Runner1/1.html",
		"json:target/cucumber-parallel/Runner1/1.json",
		"json:maven-cucumber-report/cucumber-json-report/cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-parallel/Extend-reports/Runner1/report.html" }, tags = { "@Test3934,@Test3915,@Test3916,@Test3930,@Test3931,@Test3932,@Test3933,@Test3920,@Test3921,@Test3922" })
public class TestRunner1 {
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(System.getProperty("user.dir")
				+ File.separator + "src" + File.separator + "test"
				+ File.separator + "resources" + File.separator + "ConfigFiles"
				+ File.separator + "extent-config.xml"));

	}

}