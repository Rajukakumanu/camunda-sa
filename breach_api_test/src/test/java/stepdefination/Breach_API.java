package stepdefination;

import Rest_API_Files.BreachRecordAPI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.json.simple.parser.ParseException;
import utilities.UserActions;

/**
 * This class consists of all the Step definitions for the test steps in feature
 * files
 *
 * @author kakur
 */
public class Breach_API extends UserActions {
    private BreachRecordAPI breach;

    @Given("^user creates breach record$")
    public void create_breach() throws ParseException {
         breach = new BreachRecordAPI();
        breach.createBreach();

    }

    @When("^user fill in aboutYou section mandatory fields$")
    public void user_fill_in_aboutYou_section_mandatory_fields() throws Exception {
        breach.enterAboutYouFields();
    }
    @When("^user fill in whoIdentified section mandatory fields$")
    public void user_fill_in_whoIdentified_section_mandatory_fields() throws ParseException {
        breach.enter_who_identified_section();
    }

    @When("^user fill in what happened section mandatory fields$")
    public void user_fill_in_what_happened_section_mandatory_fields() throws ParseException {
        breach.enter_what_happened_section();
    }

    @When("^user not fill in what happened section mandatory fields$")
    public void user_not_fill_in_what_happened_section_mandatory_fields() throws ParseException {
        breach.return_400_on_what_happened_section();
    }

    @When("^user fill in breach category data section mandatory fields$")
    public void user_fill_in_breach_category_data_section_mandatory_fields() throws Throwable {
        breach.breachCategory();
    }

    @When("^user get risk score$")
    public void user_get_risk_score() throws Throwable {
        breach.riskScore();
    }

}


