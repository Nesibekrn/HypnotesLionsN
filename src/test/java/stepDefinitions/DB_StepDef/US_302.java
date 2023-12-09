package stepDefinitions.DB_StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static utilities.API_utilities.*;
import static utilities.DB_utilities.*;

public class US_302 {

    int idCoupon;

    @When("the user sends posts request to add new coupon")
    public void theUserSendsPostsRequestToAddNewCoupon() {
        payload.put("promoCode","Hello");
        payload.put("startedAt","Thu, 14 Dec 2023 12:38:22 GMT");
        payload.put("enddedAt","Thu, 16 Dec 2023 12:38:22 GMT");
        payload.put("usersLimit","5");
        payload.put("discountType","percentage");
        payload.put("discountRate","10");
        payload.put("category","8064");
        payload.put("description","undefined");

        response=given()
                .header("cookie", "PHPSESSID=" + phpSessId)
                .formParams(payload)
                .post("https://test.hypnotes.net/api/promoCode/add");
        response.prettyPrint();
        idCoupon=response.jsonPath().getInt("promoCode.id");

        Assert.assertEquals(true, response.jsonPath().getBoolean("success"));


    }

    @Then("the user finds a coupon")
    public void theUserFindsACoupon() throws SQLException {
        statement=connection.createStatement();
        resultSet =statement.executeQuery("select * from coupons order by id desc limit 1");
        resultSet.next();
    }

    @Then("the user validates data")
    public void theUserValidatesData() throws SQLException {
        Assert.assertEquals(idCoupon,resultSet.getInt(1));
    }
    @And("user delete coupon in API")
    public void userDeleteCouponInAPI() {
        payload.put("couponId",idCoupon);
        response=given()
                .header("cookie", "PHPSESSID=" + phpSessId)
                .formParams(payload)
                .post("https://test.hypnotes.net/api/promoCode/deleteCoupon");
        response.prettyPrint();

    }


}
