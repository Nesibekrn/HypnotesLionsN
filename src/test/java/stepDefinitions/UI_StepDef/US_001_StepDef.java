package stepDefinitions.UI_StepDef;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CommonPage;

import static stepDefinitions.Hooks.driver;

public class US_001_StepDef extends CommonPage {
    @Given("User goes to {string}")
    public void user_goes_to(MysqlxDatatypes.Scalar.String Url) {
      driver.get("Url");
    }

    @Then("User clicks login button")
    public void userClicksLoginButton() {
      getHomePage().loginButton.click();
    }
}
