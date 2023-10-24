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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static stepDefinitions.Hooks.driver;

public class US_09HomePageOurPlatformStepDef {
    HomePage homePage = new HomePage();

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

    @Then("The user verifies that the product demo button is visible and clickable,the user sees the relevant page.")
    public void theUserVerifiesThatTheProductDemoButtonIsVisibleAndClickable() {
        Assert.assertTrue(homePage.productDemo.isDisplayed());
        ReusableMethods.waitFor(2);
        homePage.productDemo.click();
            String productDemoUrl = "https://test.hypnotes.net/register";
            ReusableMethods.waitFor(4);
            assertEquals(driver.getCurrentUrl(), productDemoUrl);
        ReusableMethods.waitFor(3);
        }
    @When("The user verifies that the How Does Hypnotes Work button is visible and clickable,the user sees the relevant page")
    public void theUserVerifiesThatTheHowDoesHypnotesWorkButtonIsVisibleAndClickable() {
        Assert.assertTrue(homePage.hynotesWork.isDisplayed());
        ReusableMethods.waitFor(4);
        homePage.hynotesWork.click();
        String productDemoUrl = "https://test.hypnotes.net/how-it-works";
        ReusableMethods.waitFor(3);
        assertEquals(driver.getCurrentUrl(), productDemoUrl);
        ReusableMethods.waitFor(3);

    }

    @Then("The user verifies that the Pricing button is visible and clickable,the user sees the relevant page.")
    public void theUserVerifiesThatThePricingButtonIsVisibleAndClickable() {
        assertTrue(homePage.pricing.isDisplayed());
        ReusableMethods.waitFor(3);
        homePage.pricing.click();
        ReusableMethods.waitFor(2);
        String pricingUrl = "https://test.hypnotes.net/pricing";
        ReusableMethods.waitFor(3);
        assertEquals(driver.getCurrentUrl(), pricingUrl);
        ReusableMethods.waitFor(3);
    }


    @Then("The user verifies that the HIPAA Compliance button is visible and clickable,the user sees the relevant page.")
    public void theUserVerifiesThatTheHIPAAComplianceButtonIsVisibleAndClickable() {
        assertTrue(homePage.hipaaCompliance.isDisplayed());
        ReusableMethods.waitFor(2);
        homePage.hipaaCompliance.click();
        String hipaUrl = "https://test.hypnotes.net/features/hipaa-security";
        ReusableMethods.waitFor(3);
        assertEquals(driver.getCurrentUrl(), hipaUrl);
        ReusableMethods.waitFor(2);
    }



    @Then("The user verifies that the Secure Login, Account Verification & Data Storage button is visible and clickable, the user sees the relevant page.")
    public void theUserVerifiesThatTheSecureLoginAccountVerificationDataStorageButtonIsVisibleAndClickable() {
        assertTrue(homePage.secureLogin.isDisplayed());
        ReusableMethods.waitFor(2);
        homePage.secureLogin.click();
        String secureUrl = "https://test.hypnotes.net/features/hipaa-security";
        ReusableMethods.waitFor(3);
        assertEquals(driver.getCurrentUrl(), secureUrl);
        ReusableMethods.waitFor(2);
    }

    @Then("The user verifies that the Get Started For Free button is visible and clickable,the user sees the relevant page.")
    public void theUserVerifiesThatTheGetStartedForFreeButtonIsVisibleAndClickable() {
        assertTrue(homePage.getStarted.isDisplayed());
        ReusableMethods.waitFor(2);
        homePage.getStarted.click();
        String getStartedFreeUrl = "https://test.hypnotes.net/register";
        ReusableMethods.waitFor(3);
        assertEquals(driver.getCurrentUrl(), getStartedFreeUrl);
        ReusableMethods.waitFor(2);
    }
    @Then("The user verifies that the Reviews Testimonials button is visible and clickable,the user sees the relevant page.")
    public void theUserVerifiesThatTheReviewsTestimonialsButtonIsVisibleAndClickable() {
        assertTrue(homePage.reviewsTestimonials.isDisplayed());
        ReusableMethods.waitFor(2);
        homePage.reviewsTestimonials.click();
        String reviewUrl = "https://test.hypnotes.net/#reviewRow";
        ReusableMethods.waitFor(2);
        assertEquals(driver.getCurrentUrl(), reviewUrl);

        ReusableMethods.waitFor(2);
    }


    }
