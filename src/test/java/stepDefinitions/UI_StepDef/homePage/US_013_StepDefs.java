package stepDefinitions.UI_StepDef.homePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.JS_utilities;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_013_StepDefs extends CommonPage {
    @When("user enters valid email in the Newsletter section")
    public void userEntersValidEmailInTheNewsletterSection() {

        getHomePage().inputEmailFooter.sendKeys("pendryski@digdig.org");
    }

    @And("users clicks on signUp button at the bottom of the home page")
    public void usersClicksOnSignUpButtonAtTheBottomOfTheHomePage() {
        getHomePage().signUpButtonFooter.click();
    }

    @When("user scroll to bottom of the page")
    public void userScrollToBottomOfThePage() {
        JS_utilities.scrollToBottom();
    }

    @Then("user verifies that social media icon visible and clickable")
    public void userVerifiesThatSocialMediaIconVisibleAndClickable() {

        Assert.assertTrue(getHomePage().faceBookIcon.isDisplayed());
        Assert.assertTrue(getHomePage().linkedinIcon.isDisplayed());
        Assert.assertTrue(getHomePage().xIcon.isDisplayed());
        Assert.assertTrue(getHomePage().instagramIcon.isDisplayed());
        Assert.assertTrue(getHomePage().faceBookIcon.isEnabled());
        Assert.assertTrue(getHomePage().linkedinIcon.isEnabled());
        Assert.assertTrue(getHomePage().xIcon.isEnabled());
        Assert.assertTrue(getHomePage().instagramIcon.isEnabled());

    }

    @And("user verifies that each social media button leads to the company's official related social media page")
    public void userVerifiesThatEachSocialMediaButtonLeadsToTheCompanySOfficialRelatedSocialMediaPage() {
        JS_utilities.clickElementByJS(getHomePage().faceBookIcon);
        ReusableMethods.waitFor(5);
        String currentUrl= driver.getCurrentUrl();
        String expectedUrl="https://www.facebook.com/hypnotesinc";
        Assert.assertEquals(expectedUrl,currentUrl);
        driver.navigate().back();
        ReusableMethods.waitFor(3);
       // driver.get("https://test.hypnotes.net/");

        JS_utilities.clickElementByJS(getHomePage().linkedinIcon);
        ReusableMethods.waitFor(3);
        String linkedinUrl= driver.getCurrentUrl();
        String expectedUrl1="https://www.linkedin.com/company/hypnotes/";
        Assert.assertEquals(expectedUrl1,linkedinUrl);
        driver.navigate().back();
        ReusableMethods.waitFor(3);

        JS_utilities.clickElementByJS(getHomePage().xIcon);
        ReusableMethods.waitFor(5);
        String xUrl= driver.getCurrentUrl();
        String expectedUrl2="https://twitter.com/i/flow/login?redirect_after_login=%2FHypnotesInc";
        Assert.assertEquals(expectedUrl2,xUrl);
        driver.navigate().back();
        ReusableMethods.waitFor(3);


        JS_utilities.clickElementByJS(getHomePage().instagramIcon);
        ReusableMethods.waitFor(5);
        String instaUrl= driver.getCurrentUrl();
        String expectedUrl3="https://www.instagram.com/hypnotesinc/";
        Assert.assertEquals(expectedUrl3,instaUrl);



    }
}
