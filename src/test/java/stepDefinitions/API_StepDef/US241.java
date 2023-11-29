package stepDefinitions.API_StepDef;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class US241 {
    private String phpsessid;
    Response response;
    @Given("therapist user is authenticated")
    public void therapistUserIsAuthenticated() {
        Map<String, String> payload = new HashMap<>();
        payload.put("username", "hypnotes2022tr1@gmail.com");
        payload.put("password", "Aydinlik123/");
        Response rs = RestAssured.given().contentType(ContentType.JSON)
                .body(payload)
                .post("https://test.hypnotes.net/api/login");
        Assert.assertEquals(rs.statusCode(), 200);
        Assert.assertTrue(rs.jsonPath().getBoolean("authenticated"));
        Assert.assertTrue(rs.jsonPath().getBoolean("isVerified"));
        phpsessid = rs.getCookie("PHPSESSID");
    }
    @When("user hits the get coupon end points")
    public void userHitsTheGetCouponEndPoints() {

        String cookie = "_gcl_au=1.1.1322318388.1696958790; _ga=GA1.3.451942996.1696958793; _fbp=fb.1.1697806224721.946616575; _gid=GA1.3.451339020.1700967431; _ga=GA1.1.451942996.1696958793; csrfToken=d52945.Zfya2ihZVAMewWiSGpffzS5F6nL3KstfU6yz4TJBlGE.XZL_vBw3ZG5VlVrDcqTtgl8znTqucIUFHP_boloYrBkMq96wGw4iS1uUCw; PHPSESSID=" + phpsessid + "; _ga_TMNT8VC3SD=GS1.1.1701194568.126.1.1701195099.50.0.0";
        response = RestAssured.given().contentType(ContentType.JSON)
                .header("cookie", cookie)
                .post("https://test.hypnotes.net/api/promoCode/getCoupons");
        Assert.assertEquals(response.statusCode(), 200);
        response.body().prettyPrint();

    }

    @Then("user should be able to get coupons")
    public void userShouldBeAbleToGetCoupons() {

        response.then().body("", instanceOf(ArrayList.class));
        List<Map<String, Object>> coupns = response.jsonPath().getList("");
        assertFalse(coupns.isEmpty());
        for (Map<String, Object> coupon : coupns) {
            assertTrue(coupon.containsKey("id"));
            assertTrue(coupon.containsKey("code"));
            assertTrue(coupon.containsKey("startsAt"));
            Map<String,Object> startsAt = (Map<String, Object>) coupon.get("startsAt");
            assertTrue(startsAt.containsKey("date"));
            assertTrue(startsAt.containsKey("timezone_type"));
            assertTrue(startsAt.containsKey("timezone"));
            assertTrue(coupon.containsKey("endsAt"));
            Map<String,Object> endsAt = (Map<String, Object>) coupon.get("endsAt");
            assertTrue(endsAt.containsKey("date"));
            assertTrue(endsAt.containsKey("timezone_type"));
            assertTrue(endsAt.containsKey("timezone"));
            assertTrue(coupon.containsKey("numberOfUsers"));
            assertTrue(coupon.containsKey("categories"));
            assertTrue(coupon.containsKey("discount"));
            assertTrue(coupon.containsKey("discountType"));
            assertTrue(coupon.containsKey("numberOfUsage"));
            assertTrue(coupon.containsKey("description"));

        }
        response.then().assertThat().body("[0].categories",instanceOf(ArrayList.class));
    }
}
