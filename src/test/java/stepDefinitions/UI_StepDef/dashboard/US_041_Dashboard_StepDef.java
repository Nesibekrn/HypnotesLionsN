package stepDefinitions.UI_StepDef.dashboard;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import pages.CouponsPage;
import pages.DashboardPage;
import pages.LoginPage;
import stepDefinitions.UI_StepDef.login.Lg1;
import utilities.ConfigurationReader;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_041_Dashboard_StepDef extends Lg1 {

    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage=new LoginPage();


    @Given("user Login for Dashboard")
    public void userLoginforDashboard() {
        driver.get(ConfigurationReader.getProperty("hypnotes"));

        loginPage.Login.click();
        loginPage.ButtonEMAILFORLOGIN.sendKeys(ConfigurationReader.getProperty("loginEmail"));
        loginPage.PasswordButton.sendKeys(ConfigurationReader.getProperty("loginPassword"));
        loginPage.LoginButtonforSignIn.click();
        ReusableMethods.waitFor(1);





    }

    @When("user verifies the Dashboard button is clickable and clicks")
    public void userVerifiesTheDashboardButtonIsClickableAndClicks() {
        Assert.assertTrue(dashboardPage.DashboardButton.isEnabled());
        dashboardPage.DashboardButton.click();
        ReusableMethods.waitFor(5);

    }

    @Then("user sees the Dashboard page")
    public void userSeesTheDashboardPage() {
        String expectedUrl = "https://test.hypnotes.net/dashboard";
        Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
    }
}
