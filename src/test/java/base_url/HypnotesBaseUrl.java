package base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import static utilities.Authentication.generatePhpSessid;
import static utilities.Authentication.generetaPhpSessidGroupSession;

public class HypnotesBaseUrl {
    public static RequestSpecification specFormData;
    public static RequestSpecification specFormDataGroupSession;

    public static void hypnotesSetUpFormData() {
        specFormData = new RequestSpecBuilder().
                addHeader("Cookie", generatePhpSessid()).
                        setBaseUri("https://test.hypnotes.net/").
                build();
    }
    public static void hypnotesSetUpFormDataForGroupSession(){
        specFormDataGroupSession=new RequestSpecBuilder().
                addHeader("Cookie",generetaPhpSessidGroupSession()).
                setBaseUri("https://test.hypnotes.net/").
                build();
    }
}
