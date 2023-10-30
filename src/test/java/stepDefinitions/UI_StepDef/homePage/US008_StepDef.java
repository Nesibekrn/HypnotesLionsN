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

import static stepDefinitions.Hooks.driver;

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
        getHomePage().assertBackgroundColour("rgba(127, 127, 127, 1)", getHomePage().bulletPoints.get(0));
        ReusableMethods.waitForVisibility(getHomePage().nextButton,5);
        ReusableMethods.clickWithTimeOut(getHomePage().nextButton, 3);
        getHomePage().assertBackgroundColour("rgba(0, 0, 0, 1)", getHomePage().bulletPoints.get(0));
    }

    @Then("assert testimonials has changed by prev button")
    public void assertTestimonialsHasChangedByPrevButton() {
        JS_utilities.scrollAndClickWithJS(getHomePage().bulletPoints.get(0));
        getHomePage().assertBackgroundColour("rgba(127, 127, 127, 1)", getHomePage().bulletPoints.get(0));
        ReusableMethods.waitForVisibility(getHomePage().prevButton, 5);
        ReusableMethods.clickWithTimeOut(getHomePage().prevButton, 7);
        getHomePage().assertBackgroundColour("rgba(0, 0, 0, 1)", getHomePage().bulletPoints.get(0));
    }

    @When("User should see the Hypnotherapist's {string} {int}")
    public void userShouldSeeTheHypnotherapistS(String tName, int slideNumber) {
        String HypnotherapistNameXpath = "//h5[.='%s']";
        ReusableMethods.clickWithTimeOut(getHomePage().bulletPoints.get(slideNumber), 3);
        String xpath = String.format(HypnotherapistNameXpath, tName);
        ReusableMethods.waitForVisibility(driver.findElement(By.xpath(xpath)), 5);
        ReusableMethods.verifyElementDisplayed(driver.findElement(By.xpath(xpath)));
        String actualThName = driver.findElement(By.xpath(xpath)).getText();
        Assert.assertEquals(actualThName, tName);
    }

    @When("theraphyst SC accounts should be unique with {string} {int}")
    public void theraphystSCAccountsShouldBeUniqueWith(String tName, int slideNumber) {
        ReusableMethods.clickWithTimeOut(getHomePage().bulletPoints.get(slideNumber), 3);
        String thrapistSocMediaAccount = "//h5[.='%s']/..//a";
        String xpath = String.format(thrapistSocMediaAccount, tName);
        List<WebElement> scmElements = Driver.getDriver().findElements(By.xpath(xpath));
        List<String> scmActualLinks = scmElements.stream().map(e -> e.getAttribute("href")).collect(Collectors.toList());
        Set<String> scmExpectedList = new HashSet<>(scmActualLinks);
        System.out.println("scmLinks = " + scmActualLinks);
        System.out.println("scmElements = " + scmElements);
        Assert.assertEquals(scmExpectedList.size(), scmActualLinks.size());
    }
}
