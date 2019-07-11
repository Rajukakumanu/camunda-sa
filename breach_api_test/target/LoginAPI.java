package Rest_API_Files;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import javafx.util.Pair;
import org.junit.Assert;
import utilities.UserActions;
import REST_API_DATA.RequestBuilder;

import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.equalTo;

/**
 * This class consists of all the actions related to LoginAPI and reading
 * locators from SignInPageLocators
 * 
 * @author kakur
 */
public class LoginAPI extends UserActions {

	public void loginToBreach() {
		if (UserActions.sessionCookie != null) {
			return;
		}

		RestAssured.baseURI = getConfigProperty("signInURI");
		request = RestAssured.given();
		request.contentType("application/json");
		request.body(RequestBuilder.loginBody().toJSONString());
		response = request.when().post(getConfigProperty("signInURI"));
		sessionCookie = response.getDetailedCookie("JSESSIONID");
		System.out.println("check the response  :" + response.prettyPrint());
		String emailVerify = response.jsonPath().get("email");
		System.out.println("Check the email displayed is : " + emailVerify);


	}

	private void return400ForPost(BreachDTO dto, List<Pair<String, String>> assertions) {
		ValidatableResponse putResponse = given().contentType(JSON)
				.body(dto)
				.when()
				.post("/api/breach")
				.then()
				.statusCode(400)
				.and();
		assertions.forEach(pair -> putResponse.body(pair.getKey(), equalTo(pair.getValue())));
	}

	 /* public Response putBreachBuilder(String section, String user, int status) throws Exception {
        parser = new JSONParser();
        json = (JSONObject) parser.parse(createResponse.getBody().asString());
        json.put(section, new BreachRequestBuilder().aboutYou(user));
        putResponse = given().body(json)
                .contentType("application/json")
                .when().put("https://gdpr-breaches-dev.apps.dev-pcf.lb1.rbsgrp.net/api/breach/" + Integer.parseInt(idVar))
                .then()
                .statusCode(status)
                .log().body()
                .extract().response();
        return putResponse;
    }

    public String getBreachBuilder() {
        getResponse = given()
                .contentType("application/json")
                .when().get("https://gdpr-breaches-dev.apps.dev-pcf.lb1.rbsgrp.net/api/breach/" + Integer.parseInt(idVar))
                .then()
                .statusCode(HttpStatus.SC_OK)
                .log().body()
                .extract().response()
                .asString();
        return getResponse;
    }*/

    /*public Response createBreach() {
        createResponse = given().body(new BreachRequestBuilder().aboutYou(""))
                .contentType("application/json")
                .when().post(getConfigProperty("BreachApi"))
                .then()
                .statusCode(HttpStatus.SC_CREATED)
                .log().body()
                .extract().response();
        idVar = createResponse.jsonPath().get("id").toString();
        log.info("print id created " + idVar);
        return createResponse;
    }

   /* public void set_about_you_all_mandatory_fields() throws Exception {
        String putAboutYou = putBreachBuilder("aboutYou", "Raj", 200).asString();
        getBreachBuilder();
        assertThat(putAboutYou, equalTo(getBreachBuilder()));
    }

    public void return_400_with_mission_name_in_about_you_section() throws Exception {
         putBreachBuilder("aboutYou", "", 400);



        //log.info("putBadAboutYou" + putBadAboutYou);*/

}
