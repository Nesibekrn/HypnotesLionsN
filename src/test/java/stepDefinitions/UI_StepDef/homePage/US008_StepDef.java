package stepDefinitions.UI_StepDef.homePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import utilities.Driver;
import utilities.JS_utilities;
import utilities.ReusableMethods;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class US008_StepDef extends CommonPage {

    @Then("User should be able to see {string}")
    public void userShouldBeAbleToSee(String webElementText) {

        JS_utilities.scrollIntoViewJS(getHomePage().testimonialsSectionText);
        String actualText = getHomePage().testimonialsSectionText.getText();
        Assert.assertEquals(webElementText, actualText);
    }

    @When("User should see next button")
    public void userShouldSeeNextButton() {
        ReusableMethods.verifyElementDisplayed(getHomePage().nextButton);
    }

    @Then("next button should be clickable")
    public void nextButtonShouldBeClickable() {
        ReusableMethods.verifyElementEnabled(getHomePage().nextButton);
    }

    @And("User clicks on next button")
    public void userClicksOnNextButton() {
        ReusableMethods.clickWithTimeOut(getHomePage().nextButton, 3);
    }

    @When("User should see prev button")
    public void userShouldSeePrevButton() {
        ReusableMethods.verifyElementDisplayed(getHomePage().prevButton);
    }

    @Then("prev button should be clickable")
    public void prevButtonShouldBeClickable() {
        ReusableMethods.verifyElementEnabled(getHomePage().prevButton);
    }

    @And("User clicks on prev button")
    public void userClicksOnPrevButton() {
        ReusableMethods.clickWithTimeOut(getHomePage().prevButton, 3);
    }

    @Then("assert testimonials has changed by next button")
    public void assertTestimonialsHasChangedByNextButton() {

        JS_utilities.scrollAndClickWithJS(getHomePage().bulletPoints.get(0));

        ReusableMethods.assertBackgroundColour("rgba(127, 127, 127, 1)", getHomePage().bulletPoints.get(0));

        ReusableMethods.clickWithTimeOut(getHomePage().nextButton, 3);

        ReusableMethods.assertBackgroundColour("rgba(0, 0, 0, 1)", getHomePage().bulletPoints.get(0));

    }

    @Then("assert testimonials has changed by prev button")
    public void assertTestimonialsHasChangedByPrevButton() {

        JS_utilities.scrollAndClickWithJS(getHomePage().bulletPoints.get(0));

        ReusableMethods.assertBackgroundColour("rgba(127, 127, 127, 1)", getHomePage().bulletPoints.get(0));

        ReusableMethods.clickWithTimeOut(getHomePage().prevButton, 3);

        ReusableMethods.assertBackgroundColour("rgba(0, 0, 0, 1)", getHomePage().bulletPoints.get(0));

    }

    @When("User should see the Hypnotherapist's name {String}")
    public void userShouldSeeTheHypnotherapistSName(String tName) {

        String therapiestNameXpath = "//h5[.='%s']";

        String xpath = String.format(therapiestNameXpath, tName);

        String actualThName = Driver.getDriver().findElement(By.xpath(xpath)).getText();
        Assert.assertEquals(actualThName, tName);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath(xpath)).isDisplayed);


    }

    @When("theraphyst SC accounts should be unique")
    public void scAccountsShouldBeUnique(List<String> tNames) {
        for (String tName : tNames) {

            String thrapistSocMediaAccounts = "//h5[.='%s']/..//a";
            String xpath = String.format(thrapistSocMediaAccounts, tName);

            List<WebElement> therapystSocialMediaAccounts = Driver.getDriver().findElements(By.xpath(xpath));
            List<String> scValues = therapystSocialMediaAccounts.stream().map(e -> e.getAttribute("href")).collect(Collectors.toList());

            Set<String> scValuesInSet = new HashSet<>(scValues);
            Assert.assertEquals("number of SC accounts should be same for list and set", scValues.size(), scValuesInSet.size());
        }


    }
}
