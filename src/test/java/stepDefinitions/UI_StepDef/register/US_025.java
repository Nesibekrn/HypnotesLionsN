package stepDefinitions.UI_StepDef.register;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.CommonPage;
import pages.LoginPage;
import pages.RegisterPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.Hooks.driver;
import static utilities.ReusableMethods.waitFor;

public class US_025 extends CommonPage {


    @Then("User is on the calender page")
    public void userIsOnTheCalenderPage() {
        String expectedUrl = "https://test.hypnotes.net/dashboard/calendar";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
}
