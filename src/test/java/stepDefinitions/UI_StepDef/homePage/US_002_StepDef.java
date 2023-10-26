package stepDefinitions.UI_StepDef.homePage;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;


import static stepDefinitions.Hooks.commonPage;

public class US_002_StepDef {


    @Then("assert Features, Pricing, Resources  ,Contact Us ,Language,Login, Sign Up for Free headings should be visible")
    public void assertFeaturesPricingResourcesContactUsLanguageLoginSignUpForFreeHeadingsShouldBeVisible() {


        assert commonPage.getHomePage().features.isDisplayed();
        assert commonPage.getHomePage().Pricing.isDisplayed();
        assert commonPage.getHomePage().resources.isDisplayed();
        assert commonPage.getHomePage().contactUs.isDisplayed();
        assert commonPage.getHomePage().language.isDisplayed();
        assert commonPage.getHomePage().loginButton.isDisplayed();
        assert commonPage.getHomePage().SignUPForFree.isDisplayed();


    }

    @And("assert Features, Pricing, Resources  ,Contact Us ,Language, Login, Sign Up for Free headings should be clickable")
    public void assertFeaturesPricingResourcesContactUsLanguageLoginSignUpForFreeHeadingsShouldBeClickable() {
        commonPage.getHomePage().features.click();
        assert commonPage.getHomePage().featuresText.isDisplayed();
        commonPage.getHomePage().Pricing.click();
        assert commonPage.getHomePage().pricingText.isDisplayed();
        commonPage.getHomePage().resources.click();
        assert commonPage.getHomePage().ressourcesText.isDisplayed();
        commonPage.getHomePage().contactUs.click();
        assert commonPage.getHomePage().contactUsText.isDisplayed();
        assert commonPage.getHomePage().language.isEnabled();
        assert commonPage.getHomePage().loginButton.isEnabled();
        assert commonPage.getHomePage().SignUPForFree.isEnabled();


    }


}
