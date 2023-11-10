package stepDefinitions.UI_StepDef.homePage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;

public class US_011 extends CommonPage {

    @Then("User navigates to the Footer Section")
    public void UsernavigatestotheFooterSection() {
        getHomePage().goAllTheWayDown();
    }

    @Then("Verify that Help&Support header and its elements are visible.")
    public void verifyThatHelpSupportHeaderAndItsElementsAreVisible() {
        Assert.assertTrue(getHomePage().helpSupportHeader.isDisplayed());
        Assert.assertTrue(getHomePage().helpSupportHelpCenter.isDisplayed());
        Assert.assertTrue(getHomePage().helpSupportFaqs.isDisplayed());
        Assert.assertTrue(getHomePage().helpSupportBlog.isDisplayed());
        Assert.assertTrue(getHomePage().helpSupportFindATherapist.isDisplayed());
    }

    @And("Verify that Help&Support elements are clickable and relevant page should be displayed.")
    public void verifyThatHelpSupportElementsAreClickableAndRelevantPageShouldBeDisplayed() {
        getHomePage().helpSupportElementsClick();
    }

    @Then("Verify that Company header and its elements are visible.")
    public void verifyThatCompanyHeaderAndItsElementsAreVisible(DataTable items) {
        getHomePage().companyAndItemsAreVisible(items);
    }

    @Then("Verify that Company elements are clickable and relevant page should be displayed.")
    public void verifyThatCompanyElementsAreClickableAndRelevantPageShouldBeDisplayed() {
        getHomePage().companyElementsClick();
    }


}
