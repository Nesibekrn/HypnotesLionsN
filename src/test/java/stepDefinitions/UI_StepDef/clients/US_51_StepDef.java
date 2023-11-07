package stepDefinitions.UI_StepDef.clients;

import com.github.javafaker.Faker;
import enums.USER_INFO;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import utilities.ReusableMethods;

import java.security.Key;
import java.util.List;
import java.util.Map;

public class US_51_StepDef extends CommonPage {
    Faker faker = new Faker();



    @Then("The user clicks on the client button.")
    public void theUserClicksOnTheClientButton() {
        getClientsPage().dashboardClients51.click();
        ReusableMethods.waitFor(2);
    }

    @Then("The user clicks on the add new client button.")
    public void theUserClicksOnTheAddNewClientButton() {
        getClientsPage().addNewClients51.click();
        ReusableMethods.waitFor(2);
    }

    @Then("The user enters data into the FirstName, LastName, Email, Gender, Phone, Occupation, Zip code, Country, State, City, address, Timezone fields.")
    public void theUserEntersDataIntoTheFirstNameLastNameEmailGenderPhoneOccupationZipCodeCountryStateCityAddressTimezoneFields(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

      String isim=data.get(0).get("FirstName");

        data.get(0).get("LastName");
        data.get(0).get("Email");
        data.get(0).get("Gender");
        faker.name().firstName();
        faker.name().lastName();
        faker.internet().emailAddress();
        faker.demographic().sex();
        ReusableMethods.waitFor(2);


    }

    @When("User clicks the Show Extra Fields field")
    public void userClicksTheShowExtraFieldsField() {
        getClientsPage().addShowExtra51.click();
        ReusableMethods.waitFor(2);
    }

    @Then("User enters a phone number in the Emergency Contact Phone field")
    public void userEntersAPhoneNumberInTheEmergencyContactPhoneField() {
        getClientsPage().phoneList51.get(1).sendKeys("+33", Keys.ENTER);
        ReusableMethods.waitFor(2);
        getClientsPage().flagOpenSearch51.sendKeys("+33", Keys.ENTER);
    }

    @Then("User enters data in the Emergency Contact Relationship field")
    public void userEntersDataInTheEmergencyContactRelationshipField() {
        getClientsPage().addRelationShip51.sendKeys("Kardesi", Keys.ENTER);
        ReusableMethods.waitFor(1);
    }

    @Then("User enters email in the Primary Physician Family Doctor Name field")
    public void userEntersEmailInThePrimaryPhysicianFamilyDoctorNameField() {
        getClientsPage().primaryDoctorName51.sendKeys("Alfred Halffrod", Keys.ENTER);
        ReusableMethods.waitFor(1);
    }

    @Then("User enters data in the Guardian Name field")
    public void userEntersDataInTheGuardianNameField() {
        getClientsPage().guardienName51.sendKeys("Alfred Halffrod", Keys.ENTER);
        ReusableMethods.waitFor(1);
    }

    @Then("User enters phone number in the Guardian Phone field")
    public void userEntersPhoneNumberInTheGuardianPhoneField() {
        getClientsPage().phoneList51.get(4).sendKeys("Alfred Halffrod", Keys.ENTER);
        ReusableMethods.waitFor(1);
    }

    @Then("User enters email address in the Guardian Email field")
    public void userEntersEmailAddressInTheGuardianEmailField() {
        faker.internet().emailAddress();
        ReusableMethods.waitFor(1);
    }

    @Then("User selects an image for the Profile image field")
    public void userSelectsAnImageForTheProfileImageField() {
        faker.internet().image();
        ReusableMethods.waitFor(3);
    }

    @Then("User clicks the save button")
    public void userClicksTheSaveButton() {
        getClientsPage().save51.click();
        ReusableMethods.waitFor(3);
    }

    @Then("The user should be able to see the customer he added")
    public void theUserShouldBeAbleToSeeTheCustomerHeAdded() {

 WebDriver driver = null; // Web sürücüsünü tanımlayın (Web sayfasını kontrol etmek için)


        // Müşteri adını veya benzersiz kimlik bilgisini aldığınızı varsayalım (örneğin, müşteri adı "John Smith")
        String customerName = "John Smith";

        // Müşteri listesini kontrol edin ve müşterinin adının listeye ekli olduğunu doğrulayın
        WebElement customerList = driver.findElement(By.id("customerList")); // Müşteri listesi elementini bulun
        String customerListText = customerList.getText();

        // Müşteri adının listeye ekli olduğunu kontrol edin
        if (customerListText.contains(customerName)) {
            System.out.println("Müşteri " + customerName + " listeye eklenmiştir.");
        } else {
            System.out.println("Müşteri " + customerName + " listeye eklenmemiştir.");
        }
    


    }


}


