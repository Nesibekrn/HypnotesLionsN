package stepDefinitions.UI_StepDef.dashboard;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;

public class US_57 extends CommonPage {
    @Given("User verify name button is enabled")
    public void userVerifyNameButtonIsEnabled() {
        ReusableMethods.waitForPageToLoad(3);
       // ReusableMethods.waitForClickability(getDashboardPage().timeZoneYesButton,1);
        try {
            getDashboardPage().timeZoneYesButton.click();
        } catch (Exception e) {
            // Hata yakalandığında buraya gelinir
            e.printStackTrace(); // Hata bilgisini konsola yazdırabilirsiniz
        } finally {
            getDashboardPage().sectionButton.click();
            // Her durumda çalışmasını istediğiniz kodları buraya ekleyebilirsiniz
            // Örneğin, kaynakları temizleme veya işlem sonrası belirli adımları gerçekleştirme gibi işlemleri burada yapabilirsiniz.
        }
        ReusableMethods.waitForVisibility(getDashboardPage().sectionButton,2);
        Assert.assertTrue(getDashboardPage().sectionButton.isEnabled());
    }

    @When("User clicks name button")
    public void userClicksNameButton() {
        ReusableMethods.waitForClickability(getDashboardPage().sectionButton,3);
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
        //ReusableMethods.waitForClickability(getDashboardPage().specialtiesButton,10);
        ReusableMethods.scrollToBottom();
        ReusableMethods.waitFor(3);
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
        ReusableMethods.waitFor(3);
        Assert.assertTrue(getDashboardPage().specialityDropdownMenu.isEnabled());
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
        //Assert.assertTrue(getDashboardPage().messageSpeciality.isDisplayed());
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
        ReusableMethods.waitFor(2);
        ReusableMethods.scrollToBottom();
        getDashboardPage().delete2.click();
        ReusableMethods.waitFor(1);
        getDashboardPage().deleteOk.click();
        getDashboardPage().delete2.click();
        getDashboardPage().deleteOk.click();
        ReusableMethods.waitFor(2);
        getDashboardPage().delete2.click();
        ReusableMethods.waitFor(1);
        getDashboardPage().deleteOk.click();
    }

    @And("User verify if Specialities section is updated")
    public void userVerifyIfSpecialitiesSectionIsUpdated() {
        String anger = "Anger";
        String specialtyText = getDashboardPage().totalSpecialties.toString();
        Assert.assertEquals(anger, specialtyText);

        
    }
}
