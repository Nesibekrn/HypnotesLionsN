package stepDefinitions.UI_StepDef.clients;

import enums.USER_INFO;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;
import utilities.ReusableMethods;

public class US_51_StepDef extends CommonPage {
        @When("User logs in as therapist")
        public void userLogsInAsTherapist() {
               getHomePage().loginEmail07.sendKeys(USER_INFO.THERAPIST_CREDENTIALS.therapist_email);
                ReusableMethods.waitFor(2);
                getHomePage().loginPassword07.sendKeys(USER_INFO.THERAPIST_CREDENTIALS.therapist_password);

        }

        @Then("The user clicks on the client button.")
        public void theUserClicksOnTheClientButton() {
        }

        @Then("The user clicks on the add new client button.")
        public void theUserClicksOnTheAddNewClientButton() {
        }

        @Then("The user enters data into the FirstName, LastName, Email, Gender, Phone, Phone, Occupation, Zip code, Country, State, City, address, Timezone fields.")
        public void theUserEntersDataIntoTheFirstNameLastNameEmailGenderPhonePhoneOccupationZipCodeCountryStateCityAddressTimezoneFields() {
        }

        @When("User clicks the Show Extra Fields field")
        public void userClicksTheShowExtraFieldsField() {
        }

        @Then("User enters a phone number in the Emergency Contact Phone field")
        public void userEntersAPhoneNumberInTheEmergencyContactPhoneField() {
        }

        @Then("User enters data in the Emergency Contact Relationship field")
        public void userEntersDataInTheEmergencyContactRelationshipField() {
        }

        @Then("User enters email in the Primary Physician Family Doctor Name field")
        public void userEntersEmailInThePrimaryPhysicianFamilyDoctorNameField() {
        }

        @Then("User enters data in the Guardian Name field")
        public void userEntersDataInTheGuardianNameField() {
        }

        @Then("User enters phone number in the Guardian Phone field")
        public void userEntersPhoneNumberInTheGuardianPhoneField() {
        }

        @Then("User enters email address in the Guardian Email field")
        public void userEntersEmailAddressInTheGuardianEmailField() {
        }

        @Then("User selects an image for the Profile image field")
        public void userSelectsAnImageForTheProfileImageField() {
        }

        @Then("User clicks the save button")
        public void userClicksTheSaveButton() {
        }

        @Then("The user should be able to see the customer he added")
        public void theUserShouldBeAbleToSeeTheCustomerHeAdded() {
        }
    }


