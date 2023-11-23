package stepDefinitions.UI_StepDef.account;

import io.cucumber.java.en.Then;
import pages.CommonPage;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US_058 extends CommonPage {
    @Then("user click the certifications button")
    public void userClickTheCertificationsButton() {

        getAccountPage().certificationButton.click();
    }

    @Then("user verifies that the add new certificate button should be visible.")
    public void userVerifiesThatTheAddNewCertificateButtonShouldBeVisible() {
       assertTrue(getAccountPage().addNewCertificateButton.isDisplayed());
    }
    @Then("Verify that the attached certificate is visible.")
    public void verifyThatTheAttachedCertificateIsVisible() {
        getAccountPage().remoteTherapyCertificate.isDisplayed();
    }
    @Then("user click the add new certificate button")
    public void userClickTheAddNewCertificateButton() {
        getAccountPage().addNewCertificateButton.click();
    }
    @Then("Verify that add license  or certification screen should be visible")
    public void verifyThatAddLicenseOrCertificationScreenShouldBeVisible() {
        getAccountPage().addLicenseOrCertificate.isDisplayed();
    }
    @Then("Verify that all input title should be visible")
    public void verifyThatAllInputTitleShouldBeVisible() {
       assertTrue(getAccountPage().addLicenseOrCertificateInputTitles.isDisplayed());
    }

    @Then("Verify that the {string} and Cancel buttons are functional")
    public void verifyThatTheAndCancelButtonsAreFunctional(String buttons) {
        getAccountPage().saveAndCancelButtonClick(buttons);
    }
    @Then("user enter the valid info to the certification field")
    public void userEnterTheValidInfoToTheCertificationField() {
        ReusableMethods.waitFor(2);
        getAccountPage().setAddLicenseOrCertificateInputTitles();

    }
    @Then("User click the save button")
    public void userClickTheButton() {
        getAccountPage().saveButtonClick.click();
    }
    @Then("Verify that certificate is added successfully message")
    public void verifyThatCertificateIsAddedSuccessfullyMessage() {
        ReusableMethods.waitForVisibility(getAccountPage().certificateAddedMessage,4);
        assertTrue(getAccountPage().certificateAddedMessage.isDisplayed());
    }

}
