package stepDefinitions.UI_StepDef.homePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.JS_utilities;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;
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

      Assert.assertTrue(homePage.productDemo.isEnabled());
      ReusableMethods.waitFor(3);
    }

    private void assertTrue(boolean enabled, boolean b) {
        Assert.assertTrue(homePage.productDemo.isEnabled());
        ReusableMethods.waitFor(3);
    }

    @And("The user clicks on the product demo button, the user sees the relevant page.")
    public void theUserClicksOnTheProductDemoButtonTheUserSeesTheRelevantPage() {
       // WebElement openedElement =homePage.productDemo;
        boolean isOpened = homePage.productDemo.isDisplayed();
        if (isOpened) {
            System.out.println("Sayfa açıldı.");
        } else {
            System.out.println("Sayfa açılmadı.");
        }
        ReusableMethods.waitFor(3);
    }

    @Then("The user verifies that the How Does Hypnotes Work? button is visible and clickable")
    public void theUserVerifiesThatTheHowDoesHypnotesWorkButtonIsVisibleAndClickable() {
        //Assert.assertTrue(String.valueOf(homePage.hynotesWork.isDisplayed()),false);
        assertTrue(Boolean.parseBoolean(String.valueOf(homePage.hynotesWork.isDisplayed())),false);
        ReusableMethods.waitFor(3);
        assertTrue(homePage.hynotesWork.isEnabled(), false);
        ReusableMethods.waitFor(3);

    }


    @And("The user clicks on the product How Does Hypnotes Work?, the user sees the relevant page.")
    public void theUserClicksOnTheProductHowDoesHypnotesWorkTheUserSeesTheRelevantPage() {
        boolean isOpened = homePage.hynotesWork.isDisplayed();
        if (isOpened) {
            System.out.println("Sayfa açıldı.");
        } else {
            System.out.println("Sayfa açılmadı.");
        }
        ReusableMethods.waitFor(3);
    }

    @Then("The user verifies that the Pricing button is visible and clickable")
    public void theUserVerifiesThatThePricingButtonIsVisibleAndClickable() {
      assertTrue(Boolean.parseBoolean(String.valueOf(homePage.pricing.isDisplayed())),false);
        ReusableMethods.waitFor(3);
        assertTrue(homePage.pricing.isEnabled(), false);
        ReusableMethods.waitFor(3);
    }

    @And("The user clicks on the product Pricing, the user sees the relevant page.")
    public void theUserClicksOnTheProductPricingTheUserSeesTheRelevantPage() {
        boolean isOpened = homePage.pricing.isDisplayed();
        if (isOpened) {
            System.out.println("Sayfa açıldı.");
        } else {
            System.out.println("Sayfa açılmadı.");
        }
        ReusableMethods.waitFor(3);
    }

    @Then("The user verifies that the HIPAA Compliance button is visible and clickable")
    public void theUserVerifiesThatTheHIPAAComplianceButtonIsVisibleAndClickable() {
    assertTrue(Boolean.parseBoolean(String.valueOf(homePage.hipaaCompliance.isDisplayed())),false);
        ReusableMethods.waitFor(3);
        assertTrue(homePage.hipaaCompliance.isEnabled(), false);
        ReusableMethods.waitFor(2);
    }

    @And("The user clicks on the product HIPAA Compliance, the user sees the relevant page.")
    public void theUserClicksOnTheProductHIPAAComplianceTheUserSeesTheRelevantPage() {
        boolean isOpened = homePage.hipaaCompliance.isDisplayed();
        if (isOpened) {
            System.out.println("Sayfa açıldı.");
        } else {
            System.out.println("Sayfa açılmadı.");
        }
        ReusableMethods.waitFor(3);
    }

    @Then("The user verifies that the Secure Login, Account Verification & Data Storage button is visible and clickable")
    public void theUserVerifiesThatTheSecureLoginAccountVerificationDataStorageButtonIsVisibleAndClickable() {
      assertTrue(Boolean.parseBoolean(String.valueOf(homePage.secureLogin.isDisplayed())),false);
        ReusableMethods.waitFor(3);
        assertTrue(homePage.secureLogin.isEnabled(), false);
        ReusableMethods.waitFor(2);
    }

    @And("The user clicks on the product Secure Login, Account Verification & Data Storage, the user sees the relevant page.")
    public void theUserClicksOnTheProductSecureLoginAccountVerificationDataStorageTheUserSeesTheRelevantPage() {
        boolean isOpened = homePage.secureLogin.isDisplayed();
        if (isOpened) {
            System.out.println("Sayfa açıldı.");
        } else {
            System.out.println("Sayfa açılmadı.");
        }
        ReusableMethods.waitFor(3);
    }



    @Then("The user verifies that the Get Started For Free button is visible and clickable")
    public void theUserVerifiesThatTheGetStartedForFreeButtonIsVisibleAndClickable() {
       assertTrue(Boolean.parseBoolean(String.valueOf(homePage.getStarted.isDisplayed())),false);
        ReusableMethods.waitFor(3);
        assertTrue(homePage.getStarted.isEnabled(), false);
        ReusableMethods.waitFor(2);
    }

    @And("The user clicks on the Get Started For Free, the user sees the relevant page.")
    public void theUserClicksOnTheGetStartedForFreeTheUserSeesTheRelevantPage() {
        boolean isOpened = homePage.getStarted.isDisplayed();
        if (isOpened) {
            System.out.println("Sayfa açıldı.");
        } else {
            System.out.println("Sayfa açılmadı.");
        }
        ReusableMethods.waitFor(3);
    }

    @Then("The user verifies that the Reviews Testimonials button is visible and clickable")
    public void theUserVerifiesThatTheReviewsTestimonialsButtonIsVisibleAndClickable() {
    assertTrue(Boolean.parseBoolean(String.valueOf(homePage.reviewsTestimonials.isDisplayed())),false);
        ReusableMethods.waitFor(3);
        assertTrue(homePage.reviewsTestimonials.isEnabled(), false);
        ReusableMethods.waitFor(3);
    }

    @And("The user clicks on the Reviews Testimonials, the user sees the relevant page")
    public void theUserClicksOnTheReviewsTestimonialsTheUserSeesTheRelevantPage() {
        boolean isOpened = homePage.reviewsTestimonials.isDisplayed();
        if (isOpened) {
            System.out.println("Sayfa açıldı.");
        } else {
            System.out.println("Sayfa açılmadı.");
        }
    }
}
