package stepDefinitions.API_StepDef;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static io.restassured.RestAssured.given;

public class US_225 {
    Response response;
    JsonPath jsonPath;
    static String phpSessId ;
    static List<Integer> categoryID = new ArrayList<>();
    static Integer    createdCategoryID;


    Map<String, Object> payload = new HashMap<>();

    @Then("User get all individual session")
    public void user_get_all_individual_session() {
        response=given()
                .header("cookie","PHPSESSID="+ phpSessId)
                .post("https://test.hypnotes.net/api/settings/meeting/categoryType/getCategoryTypes");
        response.prettyPrint();
        categoryID  = response.jsonPath().getList("id");
        createdCategoryID=categoryID.get(categoryID.size()-1);
        System.out.println("intervalDateBlockID = " + categoryID );
        System.out.println("lastID = " + createdCategoryID);

    }

    @Then("Verify that all individual sessions are exist in returned response")
    public void verify_that_all_individual_sessions_are_exist_in_returned_response() {
        Assert.assertTrue(categoryID.contains(createdCategoryID));

    }
}
