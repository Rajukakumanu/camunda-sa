package utilities;

import io.restassured.http.Cookie;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.json.simple.JSONObject;
import org.junit.Assert;

import stepdefination.Hooks;

/**
 * This User actions class consists of all the common actions/Methods used for
 * this SA Application project
 * 
 * @author kakur
 * 
 */

public class UserActions {

	public static Properties properties = new Properties();
	public static java.util.logging.Logger log = Hooks.log;
	public static JSONObject request;
	public static Response response;
	public static Cookie sessionCookie;

	/**
	 * gets specified property value from TestData.properties file
	 * 
	 * @param sKey
	 *            return {@link String}
	 */
	public static String getConfigProperty(String sKey) {

		String sKeyValue = null;
		try {
			FileInputStream inputStream = new FileInputStream(new File(
					System.getProperty("user.dir") + File.separator + "src"
							+ File.separator + "test" + File.separator
							+ "resources" + File.separator + "TestData"
							+ File.separator + "env.properties"));
			properties.load(inputStream);
			sKeyValue = properties.getProperty(sKey);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		return sKeyValue;
	}

}