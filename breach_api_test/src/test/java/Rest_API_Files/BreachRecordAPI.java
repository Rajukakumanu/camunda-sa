package Rest_API_Files;

import REST_API_DATA.BreachRequestBuilder;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import utilities.UserActions;

import java.util.Arrays;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.post;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class BreachRecordAPI extends UserActions {

    private JSONObject json;
    private Response putResponse;
    private String getResponse;
    private Response emptyBreach;


    private ExtractableResponse<Response> postRequest(JSONObject dto, int status) {
        ExtractableResponse<Response> postBreach = given().contentType("application/json").body(dto)
                .when().post(getConfigProperty("BreachApi"))
                .then().log().all().statusCode(status).extract();
        return postBreach;
    }

    public Response createBreach() {
        emptyBreach = postRequest(new BreachRequestBuilder().build(), 200).response();
        return emptyBreach;
    }

    public void enterAboutYouFields() throws ParseException {
        JSONParser parser = new JSONParser();
        json = (JSONObject) parser.parse(emptyBreach.getBody().asString());
        JSONObject dto = new BreachRequestBuilder(json)
                .withBreachStatus("FINDOUT")
                .withAboutYou("Kakur")
                .build();
        postRequest(dto, 200);

    }

    public void enter_who_identified_section() throws ParseException {
        JSONParser parser = new JSONParser();
        json = (JSONObject) parser.parse(emptyBreach.getBody().asString());
        JSONObject dto = new BreachRequestBuilder(json)
                .withBreachStatus("WHATHAPPENED")
                .whoIdentifiedSection("Customer")
                .build();
        postRequest(dto, 200);
    }

    public void enter_what_happened_section() throws ParseException {
        JSONParser parser = new JSONParser();
        json = (JSONObject) parser.parse(emptyBreach.getBody().asString());
        JSONObject dto = new BreachRequestBuilder(json)
                .withBreachStatus("TOWHOM")
                .whatHappenedSection("ONE", "Two", Arrays.asList("India", "UK"))
                .build();
        postRequest(dto, 200);
    }

    public void return_400_on_what_happened_section() throws ParseException {
        JSONParser parser = new JSONParser();
        json = (JSONObject) parser.parse(emptyBreach.getBody().asString());
        JSONObject dto = new BreachRequestBuilder(json)
                .withBreachStatus("TOWHOM")
                .whatHappenedSection(null, "Two", Arrays.asList("India", "UK"))
                .build();
        ExtractableResponse<Response> whatHappenedResponse = postRequest(dto, 400);
        String error = whatHappenedResponse.path("errors.'whatHappened.numberOfIndividualsImpacted'");
        Assert.assertEquals(whatHappenedResponse.path("errors.'whatHappened.numberOfIndividualsImpacted'"), error);
    }

    public void breachCategory() throws ParseException {
        JSONParser parser = new JSONParser();
        json = (JSONObject) parser.parse(emptyBreach.getBody().asString());
        JSONObject dto = new BreachRequestBuilder(json)
                .withBreachStatus("ABOUTBREACH")
                .breachCategorySection()
                .build();
        postRequest(dto,200);
           }

           public void riskScore()throws ParseException{
               JSONParser parser = new JSONParser();
               json = (JSONObject) parser.parse(emptyBreach.getBody().asString());
               JSONObject dto = new BreachRequestBuilder()
                       .withBreachStatus("COMMS")
                       .withAboutYou("kakur")
                       .whoIdentifiedSection("PUBLIC")
                       .whatHappenedSection("1", "1", Arrays.asList("UK", "India"))
                       .aboutBreachData(true)
                       .breachCategorySection()
                       .build();
               postRequest(dto,200);
    }

}


