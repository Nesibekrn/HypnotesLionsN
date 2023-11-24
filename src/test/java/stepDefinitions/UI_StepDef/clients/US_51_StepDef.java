package stepDefinitions.UI_StepDef.clients;

import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.CommonPage;
import utilities.JS_utilities;
import utilities.ReusableMethods;

import javax.swing.*;
import java.util.List;
import java.util.Random;

import static utilities.ReusableMethods.waitFor;

public class US_51_StepDef extends CommonPage {
    Faker faker = new Faker();
    String name;
    String lastName;
    String email;
    Action actions;
    String phoneNo;

    @Then("The user clicks on the client button.")
    public void theUserClicksOnTheClientButton() {
   getClientsPage().dashboardClients51.click();
   ReusableMethods.waitFor(2);
    }

    @Then("The user clicks on the add new client button.")
    public void theUserClicksOnTheAddNewClientButton() {
        getClientsPage().addNewClients51.click();
        waitFor(2);
    }

    @Then("The user enters data into the FirstName, LastName, Email")
    public void theUserEntersDataIntoTheFirstNameLastNameEmail() {
        name = faker.name().firstName();
        getClientsPage().addFirstName51.sendKeys(name);
        waitFor(1);
        lastName = faker.name().lastName();
        getClientsPage().lastName51.sendKeys(lastName);
        waitFor(1);
        email = faker.internet().emailAddress();
        getClientsPage().addEmail51.sendKeys(email);
        waitFor(3);
        getClientsPage().genderSec51.click();
        waitFor(1);
        getClientsPage().addGenderMale51.click();
        waitFor(3);


    }

//  @Then("The user enters data into the Gender, Phone, Occupation, Zip code, Country, State, City, address, Timezone fields.")
 //  public void theUserEntersDataIntoTheFirstNameLastNameEmailGenderPhoneOccupationZipCodeCountryStateCityAddressTimezoneFields(DataTable dataTable) {


    @When("The user enters data into the Gender, Phone, Occupation, Zip code, Country, State, City, address.")
    public void theUserEntersDataIntoFields(DataTable dataTable) {
        List<String> data = dataTable.column(1);
        waitFor(1);
        getClientsPage().phoneList51.click();
        ReusableMethods.scrollToElement(getClientsPage().phoneList51);
        waitFor(2);
        String phone = data.get(0);
        getClientsPage().phoneCode_dropDown.click();
        Random random=new Random();
        int flagIndex=random.nextInt(getClientsPage().phoneFlag_Dropdown.size());
        phoneNo=getClientsPage().phoneDialCode.get(flagIndex).getText();
        JS_utilities.clickWithJS(getClientsPage().phoneFlag_Dropdown.get(flagIndex));
        waitFor(2);
        getClientsPage().phoneList51.sendKeys(phone);
        waitFor(3);
        String occupation = data.get(1);
        getClientsPage().addOccupation51.sendKeys(occupation);
        waitFor(1);
        String zipCode = data.get(2);
        getClientsPage().addZipCode51.sendKeys(zipCode);
        waitFor(1);
        String country = data.get(3);
        getClientsPage().addCountry51.sendKeys(country);
        waitFor(1);
        String state = data.get(4);
        getClientsPage().addState51.sendKeys(state);
        waitFor(1);
        String city = data.get(5);
        getClientsPage().addCity51.sendKeys(city);
        waitFor(2);
        String address = data.get(6);
        getClientsPage().addAdress51.sendKeys(address);
        waitFor(2);

        getClientsPage().timeZone51.click();
        waitFor(2);
        getClientsPage().timeZone51.click();
        waitFor(5);

    }


    /*
          List<String> dataAddNew=dataTable.column(1);
          getClientsPage().phoneList51.get(1).sendKeys(dataAddNew.get(0));
          getClientsPage().addOccupation51.get(0).sendKeys(dataAddNew.get(1));
          getClientsPage().phoneList51.get(1).sendKeys(dataAddNew.get(2));
          getClientsPage().phoneList51.get(1).sendKeys(dataAddNew.get(3));
          getClientsPage().addOccupation51.sendKeys("QA",Keys.ENTER);
          getClientsPage().addZipCode51.sendKeys("13013",Keys.ENTER);

          getClientsPage().addCountry51.sendKeys("France",Keys.ENTER);

          getClientsPage().addState51.sendKeys("Bouche Du Rhone",Keys.ENTER);
          getClientsPage().addCity51.sendKeys("Marseille",Keys.ENTER);
          getClientsPage().addAdress51.sendKeys("Marseille Batiment c32",Keys.ENTER);
          getClientsPage().timeZone51.click();

          ReusableMethods.waitFor(2);


      }


     */
    @When("User clicks the Show Extra Fields field")
    public void userClicksTheShowExtraFieldsField() {
        JS_utilities.scrollToBottom();
        waitFor(2);
        ReusableMethods.scrollToElement(getClientsPage().addShowExtra51);
        waitFor(3);
        getClientsPage().addShowExtra51.click();
        waitFor(3);
    }

    @Then("User enters a phone number in the Emergency Contact Phone field")
    public void userEntersAPhoneNumberInTheEmergencyContactPhoneField() {

        getClientsPage().phoneCode_dropDown.click();
        Random random=new Random();
        int flagIndex=random.nextInt(getClientsPage().phoneFlag_Dropdown.size());
        phoneNo=getClientsPage().phoneDialCode.get(flagIndex).getText();
        JS_utilities.clickWithJS(getClientsPage().phoneFlag_Dropdown.get(flagIndex));
        ReusableMethods.waitFor(2);

    }

    @Then("User enters data in the Emergency Contact Relationship field")
    public void userEntersDataInTheEmergencyContactRelationshipField() {
        getClientsPage().addRelationShip51.sendKeys("Kardesi", Keys.ENTER);
        waitFor(2);
    }

    @Then("User enters email in the Primary Physician Family Doctor Name field")
    public void userEntersEmailInThePrimaryPhysicianFamilyDoctorNameField() {
        getClientsPage().primaryDoctorName51.sendKeys("Alfred Halffrod", Keys.ENTER);
        waitFor(2);
    }

    @Then("User enters data in the Guardian Name field")
    public void userEntersDataInTheGuardianNameField() {
        getClientsPage().guardienName51.sendKeys("Alfred Halffrod", Keys.ENTER);
        waitFor(2);
    }

    @Then("User enters phone number in the Guardian Phone field")
    public void userEntersPhoneNumberInTheGuardianPhoneField() {
        getClientsPage().phoneList51.sendKeys("Alfred Halffrod", Keys.ENTER);
        waitFor(2);
    }

    @Then("User enters email address in the Guardian Email field")
    public void userEntersEmailAddressInTheGuardianEmailField() {
        String emailGuardien = faker.internet().emailAddress();
        getClientsPage().guardienEmail.sendKeys(emailGuardien);

        waitFor(2);
    }


    @Then("User clicks the save button")
    public void userClicksTheSaveButton() {
        getClientsPage().save51.click();
        waitFor(3);
    }

    @Then("The user should be able to see the customer he added")
    public void theUserShouldBeAbleToSeeTheCustomerHeAdded() {

        Assert.assertTrue(getClientsPage().clientName51.getText().contains(name +" "+ lastName));


    }


}


