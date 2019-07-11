package REST_API_DATA;


import org.json.simple.JSONObject;

public class RequestBuilder {
    public static JSONObject param;

    public static JSONObject login() {
         param = new JSONObject();
        param.put("domain", "EUROPA");
        param.put("username", "test1");
        param.put("password", "password");
        return param;
    }

}
