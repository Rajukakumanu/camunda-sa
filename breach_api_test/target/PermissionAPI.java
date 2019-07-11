package Rest_API_Files;

import utilities.UserActions;

public class PermissionAPI extends UserActions {

	public static void checkPermission() {
		request.contentType("application/json");
		response = request.cookie(sessionCookie).when().get(getConfigProperty("Permission"));
		System.out.println("check the response :" + response.prettyPrint());

	}

	public void hello() {
		request.contentType("application/json");
		response = request.cookie(sessionCookie).when().get(getConfigProperty("helloUI"));
		System.out.println("check the response :" + response.prettyPrint());

	}
}
