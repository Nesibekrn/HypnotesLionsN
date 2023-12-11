package base_url;

import enums.Enum_Fy;
import enums.LINKS;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import utilities.API_utilities;

public class baseUrl {

    public static RequestSpecification request;

    public static void hypnotesSetUp() {
        request = RestAssured.given()
                .baseUri(LINKS.BASEURL.getLink())
                .given().header("cookie", "PHPSESSID=" + API_utilities.loginWithEnum(Enum_Fy.THERAPISTGENERAL));

    }
}
