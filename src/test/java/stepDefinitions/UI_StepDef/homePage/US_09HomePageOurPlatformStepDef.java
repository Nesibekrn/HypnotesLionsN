package stepDefinitions.UI_StepDef.homePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.CommonPage;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.JS_utilities;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_09HomePageOurPlatformStepDef  {
    HomePage homePage=new HomePage();

    @Given("User goes to home page")
    public void userGoesToHomePage() {
        driver.get(ConfigurationReader.getProperty("url"));

    }

    @When("The user sees our platform section at the button of the page")
    public void theUserSeesOurPlatformSectionAtTheBottomOfThePage() {
  JS_utilities.scrollDownByJS();
  ReusableMethods.waitFor(2);
      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0, 500)");
  Assert.assertTrue(homePage.ourPlatform.isDisplayed());



    }

    @Then("The user verifies that the product demo button is visible and clickable")
    public void theUserVerifiesThatTheProductDemoButtonIsVisibleAndClickable() {
Assert.assertTrue(homePage.productDemo.isDisplayed());
Boolean product=homePage.productDemo.isDisplayed();
      Assert.assertTrue(homePage.productDemo.);
    }

    @And("The user clicks on the product demo button, the user sees the relevant page.")
    public void theUserClicksOnTheProductDemoButtonTheUserSeesTheRelevantPage() {

    }

    @Then("The user verifies that the How Does Hypnotes Work? button is visible and clickable")
    public void theUserVerifiesThatTheHowDoesHypnotesWorkButtonIsVisibleAndClickable() {

    }

    @And("The user clicks on the product How Does Hypnotes Work?, the user sees the relevant page.")
    public void theUserClicksOnTheProductHowDoesHypnotesWorkTheUserSeesTheRelevantPage() {

    }

    @Then("The user verifies that the Pricing button is visible and clickable")
    public void theUserVerifiesThatThePricingButtonIsVisibleAndClickable() {

    }

    @And("The user clicks on the product Pricing, the user sees the relevant page.")
    public void theUserClicksOnTheProductPricingTheUserSeesTheRelevantPage() {

    }

    @Then("The user verifies that the HIPAA Compliance button is visible and clickable")
    public void theUserVerifiesThatTheHIPAAComplianceButtonIsVisibleAndClickable() {

    }

    @And("The user clicks on the product HIPAA Compliance, the user sees the relevant page.")
    public void theUserClicksOnTheProductHIPAAComplianceTheUserSeesTheRelevantPage() {

    }

    @Then("The user verifies that the Secure Login, Account Verification & Data Storage button is visible and clickable")
    public void theUserVerifiesThatTheSecureLoginAccountVerificationDataStorageButtonIsVisibleAndClickable() {

    }

    @And("The user clicks on the product Secure Login, Account Verification & Data Storage, the user sees the relevant page.")
    public void theUserClicksOnTheProductSecureLoginAccountVerificationDataStorageTheUserSeesTheRelevantPage() {

    }



    @Then("The user verifies that the Get Started For Free button is visible and clickable")
    public void theUserVerifiesThatTheGetStartedForFreeButtonIsVisibleAndClickable() {

    }

    @And("The user clicks on the Get Started For Free, the user sees the relevant page.")
    public void theUserClicksOnTheGetStartedForFreeTheUserSeesTheRelevantPage() {

    }


    @Then("The user verifies that the Reviews\\/Testimonials button is visible and clickable{int}")
    public void theUserVerifiesThatTheReviewsTestimonialsButtonIsVisibleAndClickable(int arg0) {

    }

    @And("The user clicks on the Reviews\\/Testimonials, the user sees the relevant page{int}")
    public void theUserClicksOnTheReviewsTestimonialsTheUserSeesTheRelevantPage(int arg0) {

    }

    @Then("The user verifies that the Reviews Testimonials button is visible and clickable")
    public void theUserVerifiesThatTheReviewsTestimonialsButtonIsVisibleAndClickable() {

    }

    @And("The user clicks on the Reviews Testimonials, the user sees the relevant page")
    public void theUserClicksOnTheReviewsTestimonialsTheUserSeesTheRelevantPage() {
    }
}
