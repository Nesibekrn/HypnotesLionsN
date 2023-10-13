package stepDefinitions.UI_StepDef;

import io.cucumber.java.en.Given;
import pages.CommonPage;

import static stepDefinitions.Hooks.driver;

public class US_001_StepDef extends CommonPage {
    @Given("User goes to {string}")
    public void user_goes_to(String Url) {
      driver.get(Url);
    }

}
