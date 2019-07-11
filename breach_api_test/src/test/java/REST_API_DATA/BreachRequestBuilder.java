package REST_API_DATA;


import org.json.simple.JSONObject;

import java.util.List;

public class BreachRequestBuilder {

    private JSONObject jsonObject = new JSONObject();

    public BreachRequestBuilder() {
    }

    public BreachRequestBuilder(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public BreachRequestBuilder withAboutYou(String user) {
        JSONObject aboutYou = new JSONObject();
        aboutYou.put("submitterRacf", user);
        aboutYou.put("submitterFullName", "Test User");
        aboutYou.put("submitterEmail", "Test Email");
        aboutYou.put("submitterManagerEmail", "Test Email");
        jsonObject.put("aboutYou", aboutYou);
        return this;
    }

    public BreachRequestBuilder whoIdentifiedSection(String identifier) {
        JSONObject whoIdentified = new JSONObject();
        whoIdentified.put("identifyType", identifier);
        jsonObject.put("whoIdentifiedBreach", whoIdentified);
        return this;
    }

    public BreachRequestBuilder whatHappenedSection(String individuals, String records, List<String > country){
        JSONObject whatHappened = new JSONObject();
        whatHappened.put("numberOfIndividualsImpacted",individuals);
        whatHappened.put("numberOfRecordsImpacted",records);
        whatHappened.put("whereCountries",country);
        jsonObject.put("whatHappened",whatHappened);
        return this;
    }

    public BreachRequestBuilder breachCategorySection(){
        JSONObject breachCategory = new JSONObject();
        breachCategory.put("breachCategory","compromisedDetails");
        breachCategory.put("breachSubCategory","discussedDetails");
        jsonObject.put("breachCategoryData",breachCategory);
        return this;
    }

    public BreachRequestBuilder aboutBreachData(Boolean harmMatrix){
        JSONObject breachData = new JSONObject();
        breachData.put("aboutBreachData.'basicPersonal.ageDob'",harmMatrix);
        breachData.put("aboutBreachData.'basicPersonal.contactDetails'",harmMatrix);
        breachData.put("aboutBreachData.'account.transactionInfo'",harmMatrix);
        breachData.put("aboutBreachData.'account.balanceHistory'",harmMatrix);
        breachData.put("aboutBreachData.'account.limits'",harmMatrix);
        breachData.put("aboutBreachData.'account.cardRelated'",harmMatrix);
        jsonObject.put("aboutBreachData",breachData);
        return this;
    }

    public BreachRequestBuilder withBreachStatus(String status) {
        jsonObject.put("breachStatus", status);
        return this;

    }

    public JSONObject build() {
        return jsonObject;
    }

}
