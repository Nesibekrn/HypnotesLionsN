package stepDefinitions.UI_StepDef.homePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.Driver;
import utilities.JS_utilities;
import utilities.ReusableMethods;

public class US_003 extends CommonPage {

    @Then("User navigates to the bottom of the page")
    public void userNavigatesToTheBottomOfThePage() {
        JS_utilities.scrollToBottom();
    }

    @Then("User should see the Facebook icon")
    public void userShouldSeeTheFacebookIcon() {

       ReusableMethods.waitForVisibility(getHomePage().facebookIcon, 5);
        ReusableMethods.verifyElementDisplayed(getHomePage().facebookIcon);

    }

    @And("User see LinkedIn icon")
    public void userSeeLinkedInIcon() {
        ReusableMethods.waitForVisibility(getHomePage().linkedinIcon, 5);
        ReusableMethods.verifyElementDisplayed(getHomePage().linkedinIcon);

    }

    @And("User should see the instagram icon")
    public void userShouldSeeTheXIcon() {
        ReusableMethods.waitForVisibility(getHomePage().twitterIcon, 5);
        ReusableMethods.verifyElementDisplayed(getHomePage().twitterIcon);
    }

    @And("User should see the Instagram icon")
    public void userShouldSeeTheInstagramIcon() {
        ReusableMethods.waitForVisibility(getHomePage().instagramIcon, 5);
        ReusableMethods.verifyElementDisplayed(getHomePage().instagramIcon);
    }

    @Then("facebook icon should be clickable")
    public void facebookIconShouldBeClickable() {
        ReusableMethods.waitForClickability(getHomePage().facebookIcon, 5);
        Assert.assertTrue("Facebook icon is clickable",getHomePage().facebookIcon.isEnabled());
    }

    @When("User clicks facebook icon")
    public void userClicksFacebookIcon() {
        ReusableMethods.clickWithTimeOut(getHomePage().facebookIcon,3);
    }

    @Then("twitter icon should be clickable")
    public void twitterIconShouldBeClickable() {
        ReusableMethods.waitForClickability(getHomePage().twitterIcon,5);
      // ReusableMethods.waitForClickablility(By.xpath("//img[@data-test-id='twitterLink_footerLogo']"),3);
        Assert.assertTrue("Facebook icon is clickable",getHomePage().twitterIcon.isEnabled());
    }

    @When("User clicks twitter icon")
    public void userClicksTwitterIcon() {
        ReusableMethods.clickWithTimeOut(getHomePage().twitterIcon,3);
    }

    @Then("linkedin icon should be clickable")
    public void linkedinIconShouldBeClickable() {
        ReusableMethods.waitForClickability(getHomePage().linkedinIcon,5);
       // ReusableMethods.waitForClickablility(By.xpath("//img[@data-test-id='linkedinLink_footerLogo']"),3);
        Assert.assertTrue("Linkedin icon is clickable",getHomePage().linkedinIcon.isEnabled());

    }

    @When("User clicks linkedin icon")
    public void userClicksLinkedinIcon() {
        ReusableMethods.clickWithTimeOut(getHomePage().linkedinIcon,3);
    }

    @Then("instagram icon should be clickable")
    public void instagramIconShouldBeClickable() {
        ReusableMethods.waitForClickability(getHomePage().instagramIcon,5);
       // ReusableMethods.waitForClickablility(By.xpath("//img[@data-test-id='instagramLink_footerLogo']"),3);
        Assert.assertTrue("Instagram icon is clickable",getHomePage().instagramIcon.isEnabled());
    }

    @When("User clicks instagram icon")
    public void userClicksInstagramIcon() {
        ReusableMethods.clickWithTimeOut(getHomePage().instagramIcon,3);
    }

    @Then("User should be taken to the company-related {string}")
    public void userShouldBeTakenToTheCompanyRelated(String PageUrl) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(PageUrl, actualUrl);
    }
}
