package base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static utilities.Authentication.*;

public class HypnotesBaseUrl {
    public static RequestSpecification specFormData;

    public static void hypnotesSetUpFormData() {
        specFormData = new RequestSpecBuilder().
                addHeader("Cookie", generatePhpSessid()).
                        setBaseUri("https://test.hypnotes.net/").
                build();
    }
}
