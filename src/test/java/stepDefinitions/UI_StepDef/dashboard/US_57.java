package stepDefinitions.UI_StepDef.dashboard;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

public class US_57 extends CommonPage {
    @Given("User verify name button is enabled")
    public void userVerifyNameButtonIsEnabled() {
        Assert.assertTrue(getDashboardPage().sectionButton.isEnabled());
    }

    @When("User clicks name button")
    public void userClicksNameButton() {
        getDashboardPage().sectionButton.click();
    }

    @Then("User clicks profile button")
    public void userClicksProfileButton() {
        ReusableMethods.scrollAndClickWithJS(getDashboardPage().profileButton);
    }

    @And("User verify specialties button is enabled")
    public void userVerifySpecialtiesButtonIsEnabled() {
        Assert.assertTrue(getDashboardPage().specialtiesButton.isEnabled());
    }

    @Then("User clicks specialties button")
    public void userClicksSpecialtiesButton() {
        getDashboardPage().specialtiesButton.click();
    }


    @And("User verify Add New Specialty buuton is enabled")
    public void userVerifyAddNewSpecialtyBuutonIsEnabled() {
        Assert.assertTrue(getDashboardPage().addNewSpecialityButton.isEnabled());
    }

    @Then("User clicks Add New Specialty button")
    public void userClicksAddNewSpecialtyButton() {

        getDashboardPage().addNewSpecialityButton.click();
    }

    @And("User verify all specialities are clickable")
    public void userVerifyAllSpecialitiesAreClickable() {
        getDashboardPage().specialityDropdownMenu.click();
        Assert.assertTrue(getDashboardPage().abondonment.isEnabled());
        Assert.assertTrue(getDashboardPage().addictions.isEnabled());
        Assert.assertTrue(getDashboardPage().aggression.isEnabled());
        Assert.assertTrue(getDashboardPage().anger.isEnabled());
        Assert.assertTrue(getDashboardPage().anxiety.isEnabled());
        Assert.assertTrue(getDashboardPage().assertivenes.isEnabled());
        Assert.assertTrue(getDashboardPage().athleticAbilities.isEnabled());
        Assert.assertTrue(getDashboardPage().attiduteAdjustment.isEnabled());

    }

    @Then("User clicks and save some specialities")
    public void userClicksAndSaveSomeSpecialities() {
        ReusableMethods.scrollAndClickWithJS(getDashboardPage().abondonment);
        getDashboardPage().specialitySaveButton.click();
        ReusableMethods.scrollAndClickWithJS(getDashboardPage().addictions);
        getDashboardPage().specialitySaveButton.click();
        ReusableMethods.scrollAndClickWithJS(getDashboardPage().aggression);
        getDashboardPage().specialitySaveButton.click();
        ReusableMethods.scrollAndClickWithJS(getDashboardPage().anger);
        getDashboardPage().specialitySaveButton.click();
    }

    @And("User clicks X button")
    public void userClicksXButton() {
        getDashboardPage().xButton.click();

    }

    @Then("User remove some specialities from the list")
    public void userRemoveSomeSpecialitiesFromTheList() {
        getDashboardPage().delete1.click();
        getDashboardPage().deleteOk.click();
        getDashboardPage().delete1.click();
        getDashboardPage().deleteOk.click();
        getDashboardPage().delete1.click();
        getDashboardPage().deleteOk.click();
    }

    @And("User verify if Specialities section is updated")
    public void userVerifyIfSpecialitiesSectionIsUpdated() {
        
    }
}
