package stepDefinitions.UI_StepDef.coupons;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CouponsPage;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_046_Coupons_StepDef {

CouponsPage couponsPage=new CouponsPage();
LoginPage loginPage=new LoginPage();


    @Given("user Login")
    public void userLogin() {
        driver.get(ConfigurationReader.getProperty("hypnotes"));

        loginPage.Login.click();
        loginPage.ButtonEMAILFORLOGIN.sendKeys(ConfigurationReader.getProperty("loginEmail"));
        loginPage.PasswordButton.sendKeys(ConfigurationReader.getProperty("loginPassword"));
        loginPage.LoginButtonforSignIn.click();
        ReusableMethods.waitFor(1);
    }

    @When("user verifies the Coupons button is clickable and clicks")
    public void userVerifiesTheCouponsButtonIsClickableAndClicks() {
        Assert.assertTrue(couponsPage.CouponsButton.isEnabled());
        ReusableMethods.waitFor(2);
        couponsPage.CouponsButton.click();
        ReusableMethods.waitFor(3);
    }

    @Then("user sees the Coupons page")
    public void userSeesTheCouponsPage() {
        String expectedUrl="https://test.hypnotes.net/dashboard/coupons";
        Assert.assertEquals(expectedUrl,driver.getCurrentUrl());

    }


}
