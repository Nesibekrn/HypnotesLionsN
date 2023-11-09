package stepDefinitions.UI_StepDef.dashboard;

import enums.Enum_Fy;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;


import pages.LoginPage;
import stepDefinitions.UI_StepDef.login.Lg1;
import tech.grasshopper.pdf.section.dashboard.Dashboard;
import utilities.ConfigurationReader;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.commonPage;
import static stepDefinitions.Hooks.driver;

public class US_041_Dashboard_StepDef extends CommonPage{


    @Given("user Login for Dashboard")
    public void userLoginforDashboard() {

        driver.get(ConfigurationReader.getProperty("hypnotes"));
        getLoginPage().Login.click();
       getLoginPage().ButtonEMAILFORLOGIN.sendKeys(Enum_Fy.THERAPIST.getUsername());//olusturdugum enumdan cagirdim
        getLoginPage().PasswordButton.sendKeys(Enum_Fy.THERAPIST.getPassword());
        getLoginPage().LoginButtonforSignIn.click();
        ReusableMethods.waitFor(1);
    }

    @When("user verifies the Dashboard button is clickable and clicks")
    public void userVerifiesTheDashboardButtonIsClickableAndClicks() {

        Assert.assertTrue(getLoginPage().dashboardBButton.isEnabled());
        ReusableMethods.waitFor(2);
        getLoginPage().dashboardBButton.click();
        ReusableMethods.waitFor(2);


    }

    @Then("user sees the Dashboard page")
    public void userSeesTheDashboardPage() {
        String expectedUrl = "https://test.hypnotes.net/dashboard";
        Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
    }
}
