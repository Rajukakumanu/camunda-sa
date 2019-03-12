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
		"html:target/cucumber-parallel/Runner2/1.html",
		"json:target/cucumber-parallel/Runner2/1.json",
		"json:maven-cucumber-report/cucumber-json-report/cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-parallel/Extend-reports/Runner2/report.html" }, tags = { "@Test3910,@Test3911,@Test3912,@Test3913,@Test3914,@Test3934,@Test3935,@Test3936,@Test3937" })
public class TestRunner2 {

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(System.getProperty("user.dir")
				+ File.separator + "src" + File.separator + "test"
				+ File.separator + "resources" + File.separator + "ConfigFiles"
				+ File.separator + "extent-config.xml"));

	}

}