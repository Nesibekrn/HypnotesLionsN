package stepDefinitions.UI_StepDef.homePage;

import enums.COLOR;
import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.ConfigurationReader;

import static stepDefinitions.Hooks.commonPage;
import static stepDefinitions.Hooks.driver;

public class Week1_us006_check_titles {

    @Given("user goes to home page")
    public void user_goes_to_home_page() {
        driver.get(ConfigurationReader.getProperty("url"));

    }

    @Then("assert first header color should be white")
    public void assert_first_header_color_should_be_white() {
        // for return type ==> ctrl-alt -v ()
        String actuelTextColor = commonPage.getHomePage().listHeader.get(0).getCssValue("color");
        String expectedTextColor = "rgba(255, 255, 255, 1)";
        Assert.assertEquals(expectedTextColor,actuelTextColor);
        //2nd Way enum
        COLOR.WHITE_TEXT.assertTextColor(commonPage.getHomePage().listHeader.get(0));



    }

    @Then("assert first header background color is green")
    public void assert_first_header_backround_color_is_green() {

    }

    @When("user scroll to first header")
    public void user_scroll_to_first_header() {

    }

    @Then("assert first header color should be black")
    public void assert_first_header_color_should_be_black() {

    }

    @Then("assert first header background color should be grey")
    public void assert_first_header_backround_color_should_be_grey() {

    }
}
