package stepDefinitions.UI_StepDef.coupons;

import enums.Enum_Fy;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ConfigurationReader;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_046_Coupons_StepDef extends CommonPage {





    @Given("user Login")
    public void userLogin() {
        driver.get(ConfigurationReader.getProperty("hypnotes"));


        getLoginPage().Login.click();
        getLoginPage().ButtonEMAILFORLOGIN.sendKeys(Enum_Fy.THERAPIST.getUsername());
        getLoginPage().PasswordButton.sendKeys(Enum_Fy.THERAPIST.getPassword());
        getLoginPage().LoginButtonforSignIn.click();
        ReusableMethods.waitFor(1);
    }

    @When("user verifies the Coupons button is clickable and clicks")
    public void userVerifiesTheCouponsButtonIsClickableAndClicks() {
        Assert.assertTrue(getLoginPage().couponsBButton.isEnabled());
        ReusableMethods.waitFor(2);
        getLoginPage().couponsBButton.click();
        ReusableMethods.waitFor(3);
    }

    @Then("user sees the Coupons page")
    public void userSeesTheCouponsPage() {
        String expectedUrl="https://test.hypnotes.net/dashboard/coupons";
        ReusableMethods.waitFor(1);
        Assert.assertEquals(expectedUrl,driver.getCurrentUrl());

    }


}
