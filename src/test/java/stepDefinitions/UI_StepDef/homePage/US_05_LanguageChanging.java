package stepDefinitions.UI_StepDef.homePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;

public class US_05_LanguageChanging extends CommonPage {
    @When("The user clicks usa flag language button")
    public void theUserClicksUsaFlagLanguageButton() {
        getHomePage().languageButton.click();
        ReusableMethods.waitFor(2);
    }

    @Then("The user verify navbar buttons if they are visible and English")
    public void theUserVerifyNavbarButtonsIfTheyAreVisibleAndEnglish() {
        Assert.assertTrue(getHomePage().features.isDisplayed());
        Assert.assertTrue(getHomePage().Pricing.isDisplayed());
        Assert.assertTrue(getHomePage().resources.isDisplayed());
        Assert.assertTrue(getHomePage().contactUs.isDisplayed());
        Assert.assertTrue(getHomePage().loginButton.isDisplayed());
        Assert.assertTrue(getHomePage().SignUPForFree.isDisplayed());
    }

    @And("The user clicks features button and verify if all the features are English")
    public void theUserClicksFeaturesButtonAndVerifyIfAllTheFeaturesAreEnglish() {
        getHomePage().features.click();
        String feauture = "Features";
        String test1 = getHomePage().features.getText();
        Assert.assertEquals(feauture,test1);

    }

    @And("The user clicks Pricing button and verify if the page is English")
    public void theUserClicksPricingButtonAndVerifyIfThePageIsEnglish() {
    }

    @And("The user clicks Resources button and verify if all resources are English")
    public void theUserClicksResourcesButtonAndVerifyIfAllResourcesAreEnglish() {
    }

    @And("The user clicks Contact us button and verify if the page is English")
    public void theUserClicksContactUsButtonAndVerifyIfThePageIsEnglish() {
    }

    @And("The user clicks Login button and verify the page is English")
    public void theUserClicksLoginButtonAndVerifyThePageIsEnglish() {
    }

    @And("The user clicks Sign up for free button and varify the page is English")
    public void theUserClicksSignUpForFreeButtonAndVarifyThePageIsEnglish() {
    }

    @When("The user clicks Turkiye flag language button")
    public void theUserClicksTurkiyeFlagLanguageButton() {
    }

    @Then("The user verify navbar buttons if they are visible and Turkish")
    public void theUserVerifyNavbarButtonsIfTheyAreVisibleAndTurkish() {
    }

    @And("The user clicks features button and verify if all the features are Turkish")
    public void theUserClicksFeaturesButtonAndVerifyIfAllTheFeaturesAreTurkish() {
    }

    @And("The user clicks Pricing button and verify if the page is Turkish")
    public void theUserClicksPricingButtonAndVerifyIfThePageIsTurkish() {
    }

    @And("The user clicks Resources button and verify if all resources are Turkish")
    public void theUserClicksResourcesButtonAndVerifyIfAllResourcesAreTurkish() {
    }

    @And("The user clicks Contact us button and verify if the page is Turkish")
    public void theUserClicksContactUsButtonAndVerifyIfThePageIsTurkish() {
    }

    @And("The user clicks Login button and verify the page is Turkish")
    public void theUserClicksLoginButtonAndVerifyThePageIsTurkish() {
    }

    @And("The user clicks Sign up for free button and varify the page is Turkish")
    public void theUserClicksSignUpForFreeButtonAndVarifyThePageIsTurkish() {
    }

    @When("The user clicks Germany flag language button")
    public void theUserClicksGermanyFlagLanguageButton() {
    }

    @Then("The user verify navbar buttons if they are visible and German")
    public void theUserVerifyNavbarButtonsIfTheyAreVisibleAndGerman() {
    }

    @And("The user clicks features button and verify if all the features are German")
    public void theUserClicksFeaturesButtonAndVerifyIfAllTheFeaturesAreGerman() {
    }

    @And("The user clicks Pricing button and verify if the page is German")
    public void theUserClicksPricingButtonAndVerifyIfThePageIsGerman() {
    }

    @And("The user clicks Resources button and verify if all resources are German")
    public void theUserClicksResourcesButtonAndVerifyIfAllResourcesAreGerman() {
    }

    @And("The user clicks Contact us button and verify if the page is German")
    public void theUserClicksContactUsButtonAndVerifyIfThePageIsGerman() {
    }

    @And("The user clicks Login button and verify the page is German")
    public void theUserClicksLoginButtonAndVerifyThePageIsGerman() {
    }

    @And("The user clicks Sign up for free button and varify the page is German")
    public void theUserClicksSignUpForFreeButtonAndVarifyThePageIsGerman() {
    }

    @When("The user clicks France flag language button")
    public void theUserClicksFranceFlagLanguageButton() {
    }

    @Then("The user verify navbar buttons if they are visible and French")
    public void theUserVerifyNavbarButtonsIfTheyAreVisibleAndFrench() {
    }

    @And("The user clicks features button and verify if all the features are French")
    public void theUserClicksFeaturesButtonAndVerifyIfAllTheFeaturesAreFrench() {
    }

    @And("The user clicks Pricing button and verify if the page is French")
    public void theUserClicksPricingButtonAndVerifyIfThePageIsFrench() {
    }

    @And("The user clicks Resources button and verify if all resources are French")
    public void theUserClicksResourcesButtonAndVerifyIfAllResourcesAreFrench() {
    }

    @And("The user clicks Contact us button and verify if the page is French")
    public void theUserClicksContactUsButtonAndVerifyIfThePageIsFrench() {
    }

    @And("The user clicks Login button and verify the page is French")
    public void theUserClicksLoginButtonAndVerifyThePageIsFrench() {
    }

    @And("The user clicks Sign up for free button and varify the page is French")
    public void theUserClicksSignUpForFreeButtonAndVarifyThePageIsFrench() {
    }

    @When("The user clicks Russia flag language button")
    public void theUserClicksRussiaFlagLanguageButton() {
    }

    @Then("The user verify navbar buttons if they are visible and Russian")
    public void theUserVerifyNavbarButtonsIfTheyAreVisibleAndRussian() {
    }

    @And("The user clicks features button and verify if all the features are Russian")
    public void theUserClicksFeaturesButtonAndVerifyIfAllTheFeaturesAreRussian() {
    }

    @And("The user clicks Pricing button and verify if the page is Russian")
    public void theUserClicksPricingButtonAndVerifyIfThePageIsRussian() {
    }

    @And("The user clicks Resources button and verify if all resources are Russian")
    public void theUserClicksResourcesButtonAndVerifyIfAllResourcesAreRussian() {
    }

    @And("The user clicks Contact us button and verify if the page is Russian")
    public void theUserClicksContactUsButtonAndVerifyIfThePageIsRussian() {
    }

    @And("The user clicks Login button and verify the page is Russian")
    public void theUserClicksLoginButtonAndVerifyThePageIsRussian() {
    }

    @And("The user clicks Sign up for free button and varify the page is Russian")
    public void theUserClicksSignUpForFreeButtonAndVarifyThePageIsRussian() {
    }

    @When("The user clicks Spain flag language button")
    public void theUserClicksSpainFlagLanguageButton() {
    }

    @Then("The user verify navbar buttons if they are visible and Spanish")
    public void theUserVerifyNavbarButtonsIfTheyAreVisibleAndSpanish() {
    }

    @And("The user clicks features button and verify if all the features are Spanish")
    public void theUserClicksFeaturesButtonAndVerifyIfAllTheFeaturesAreSpanish() {
    }

    @And("The user clicks Pricing button and verify if the page is Spanish")
    public void theUserClicksPricingButtonAndVerifyIfThePageIsSpanish() {
    }

    @And("The user clicks Resources button and verify if all resources are Spanish")
    public void theUserClicksResourcesButtonAndVerifyIfAllResourcesAreSpanish() {
    }

    @And("The user clicks Contact us button and verify if the page is Spanish")
    public void theUserClicksContactUsButtonAndVerifyIfThePageIsSpanish() {
    }

    @And("The user clicks Login button and verify the page is Spanish")
    public void theUserClicksLoginButtonAndVerifyThePageIsSpanish() {
    }

    @And("The user clicks Sign up for free button and varify the page is Spanish")
    public void theUserClicksSignUpForFreeButtonAndVarifyThePageIsSpanish() {
    }
}
