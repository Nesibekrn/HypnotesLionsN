package base_url;

import enums.Enum_Fy;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import utilities.API_utilities;

public class BaseUrlQuestionner {
    public static RequestSpecification spec;

    public static void therapistSetup(){

        spec=new RequestSpecBuilder().
                setContentType(ContentType.URLENC).
                addHeader("Cookie", "PHPSESSID=" + API_utilities.loginWithEnum(Enum_Fy.GUL))
                .setBaseUri("https://test.hypnotes.net/api/").build();
    }


}
