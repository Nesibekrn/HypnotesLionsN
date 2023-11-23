package stepDefinitions.UI_StepDef.homePage;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.CommonPage;

import static stepDefinitions.Hooks.driver;

public class US_001 extends CommonPage {


    String currentUrl="";
    String expectedURL="https://test.hypnotes.net/";

    @Given("User goes to {string}")
    public void user_goes_to(String url) {
        driver.get(url);

    }
    @Given("User verify that homepage is loaded")
    public void user_verify_that_homepage_is_loaded() {
        currentUrl=driver.getCurrentUrl();
        Assert.assertEquals(expectedURL,currentUrl);



    }

}
