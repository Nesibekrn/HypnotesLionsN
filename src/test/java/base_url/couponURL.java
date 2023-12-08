package base_url;

import enums.Enum_Fy;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import utilities.API_utilities;

public class couponURL {

    public static RequestSpecification specData;

    public static void therapistLogin(){

        specData=new RequestSpecBuilder().
                setContentType(ContentType.URLENC).
                addHeader("Cookie", "PHPSESSID=" + API_utilities.loginWithEnum(Enum_Fy.THERAPIST_2))
                .setBaseUri("https://test.hypnotes.net/api/").build();

    }

}
