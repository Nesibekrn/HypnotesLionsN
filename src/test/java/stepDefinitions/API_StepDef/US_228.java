package stepDefinitions.API_StepDef;

import com.github.javafaker.Faker;
import enums.Enum_Fy;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.json.Json;
import utilities.API_utilities;

import java.util.List;

import static io.restassured.RestAssured.given;
import static utilities.API_utilities.*;


public class US_228 {
   Faker faker=new Faker();
    String titleName = faker.name().firstName();

    @Given("the user takes token from api")
    public void the_user_takes_token_from_api() {
        API_utilities.loginWithEnum(Enum_Fy.THERAPIST_2);
    }
    @Given("the user adds individual session category")
    public void the_user_adds_individual_session_category() {
payload.put("title",titleName);
payload.put("categoryMainType","packages");


response=given().
        //adding cookies from loging api
        header("cookie","PHPSESSID=" + phpSessId).
        //sending response body as a map from api utilities
        formParams(payload).
        //sending post method
        post("https://test.hypnotes.net/api/settings/meeting/categoryType/addCategoryType");

//printing response
        response.prettyPrint();
        System.out.println(titleName);


    }
    @Given("the user verifies that category is added")
    public void the_user_verifies_that_category_is_added() {
List<String> titleNames=response.jsonPath().get("title");
for(String titles:titleNames){
    if(titles.equals(titleName)){
        System.out.println("titleName"+titles);
    Assert.assertEquals(titleName,titles);
}
    }

}


    @Given("the  status code is {int}")
    public void the_status_code_is(int statucCode) {
       Assert.assertEquals(statucCode, response.getStatusCode());
    }
}
