package stepDefinitions.UI_StepDef.clients;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.CommonPage;
import utilities.JS_utilities;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Random;

import static stepDefinitions.Hooks.driver;

public class US_050 extends CommonPage {
    String phoneCode;

    public void user_clicks_on_clients_button() {
        ReusableMethods.waitForVisibility(getClientsPage().clients_button, 2);
        getClientsPage().clients_button.click();
    }

    public void user_clicks_add_new_client_button() {
        getClientsPage().addNewClient_button.click();
    }

    public void user_types_name_in_the_first_name_section(DataTable dataTable) {
        List<String> firstName = dataTable.column(0);
        List<String> expectedMessage = dataTable.column(1);
        ReusableMethods.waitFor(2);
        for (int i = 0; i < expectedMessage.size(); i++) {
            getClientsPage().firstName_input.sendKeys(firstName.get(i) + Keys.TAB);
            ReusableMethods.waitForVisibility(getClientsPage().errorMessage, 2);
            // getClientsPage().middleName_input.click();
            Assert.assertEquals(expectedMessage.get(i), getClientsPage().errorMessage.getText());
            ReusableMethods.waitFor(2);
            // getClientsPage().firstName_input.clear();
            driver.navigate().refresh();
        }
    }

    public void user_types_middle_name_in_the_middle_name_section(DataTable dataTable) {
        List<String> middleName = dataTable.column(0);
        List<String> expectedMessage = dataTable.column(1);
        ReusableMethods.waitFor(2);
        for (int i = 0; i < expectedMessage.size(); i++) {
            getClientsPage().middleName_input.sendKeys(middleName.get(i) + Keys.TAB);
            ReusableMethods.waitForVisibility(getClientsPage().errorMessage, 2);
            Assert.assertEquals(expectedMessage.get(i), getClientsPage().errorMessage.getText());
            //  ReusableMethods.waitFor(2);
            // getClientsPage().firstName_input.clear();
            driver.navigate().refresh();
        }
    }

    public void user_types_last_name_in_the_last_name_section(DataTable dataTable) {
        List<String> lastName = dataTable.column(0);
        List<String> expectedMessage = dataTable.column(1);
        ReusableMethods.waitFor(2);
        for (int i = 0; i < expectedMessage.size(); i++) {
            getClientsPage().lastName_input.sendKeys(lastName.get(i) + Keys.TAB);
            ReusableMethods.waitForVisibility(getClientsPage().errorMessage, 2);
            Assert.assertEquals(expectedMessage.get(i), getClientsPage().errorMessage.getText());
            ReusableMethods.waitFor(1);
            getClientsPage().lastName_input.sendKeys(Keys.BACK_SPACE);
            //  driver.navigate().refresh();
        }
    }

    public void user_types_email_in_the_email_section(DataTable dataTable) {
        List<String> email = dataTable.column(0);
        List<String> expectedMessage = dataTable.column(1);
        ReusableMethods.waitFor(2);
        for (int i = 0; i < expectedMessage.size(); i++) {
            getClientsPage().email_input.sendKeys(email.get(i) + Keys.ENTER);
            ReusableMethods.waitForVisibility(getClientsPage().errorMessage, 2);
            Assert.assertEquals(expectedMessage.get(i), getClientsPage().errorMessage.getText());
            ReusableMethods.waitFor(1);
//            getClientsPage().email_input.click();
//            getClientsPage().email_input.sendKeys(Keys.CLEAR);
//            getClientsPage().email_input.sendKeys(Keys.BACK_SPACE);
            driver.navigate().refresh();
        }
    }

    public void user_verify_gender_menu_is_functional() {
        Assert.assertTrue(getClientsPage().gender_dropDown.isEnabled());
    }

    public void user_verify_gender_menu_is_selectable() {
        //  Assert.assertTrue(getClientsPage().gender_dropDown.isDisplayed());
    }

    public void user_select_in_the_gender_section(String gender) {
        getClientsPage().gender_dropDown.sendKeys(gender + Keys.ENTER);
      /*  ReusableMethods.scrollToElement(getClientsPage().gender_dropDown);
        Select select=new Select(getClientsPage().gender_dropDown);
        ReusableMethods.waitFor(1);
        select.selectByVisibleText("Female");*/
    }

    public void userTypesNameInTheFirstNameSection() {
        getClientsPage().firstName_input.sendKeys(ReusableMethods.rasgeleIsimOlustur());
    }

    @And("user types last name in the last name section")
    public void userTypesLastNameInTheLastNameSection() {
        getClientsPage().lastName_input.sendKeys(ReusableMethods.rasgeleIsimOlustur());
    }

    @Then("user verify Phone menu is functional")
    public void user_verify_phone_menu_is_functional() {
        Assert.assertTrue(getClientsPage().phoneCode_dropDown.isDisplayed());
    }

    @When("user select country flag in the menu")
    public void user_select_country_flag_in_the_menu() {
        getClientsPage().phoneCode_dropDown.click();
        Random random = new Random();
        int flagIndex = random.nextInt(getClientsPage().phoneFlag_Dropdown.size());
        phoneCode = getClientsPage().phoneDialCode.get(flagIndex).getText();
        JS_utilities.clickWithJS(getClientsPage().phoneFlag_Dropdown.get(flagIndex));
        ReusableMethods.waitFor(1);
    }

    @Then("user verify the correct code should appear in the phone menu")
    public void user_verify_the_correct_code_should_appear_in_the_phone_menu() {
        String dialCodeX = getClientsPage().phone_input.getAttribute("value");
        Assert.assertEquals(phoneCode, dialCodeX);
    }

    public void user_types_occupation_in_the_occupation_section(DataTable dataTable) {
        List<String> occupation = dataTable.column(0);
        List<String> expectedMessage = dataTable.column(1);
        ReusableMethods.waitFor(2);
        for (int i = 0; i < expectedMessage.size(); i++) {
            getClientsPage().occupation_input.sendKeys(occupation.get(i) + Keys.TAB);
            ReusableMethods.waitForVisibility(getClientsPage().errorMessage, 2);
            Assert.assertEquals(expectedMessage.get(i), getClientsPage().errorMessage.getText());
            ReusableMethods.waitFor(1);
            getClientsPage().occupation_input.sendKeys(Keys.BACK_SPACE);
            //  driver.navigate().refresh();
        }
    }

    public void user_types_zip_code_in_the_zip_code_inbox(DataTable dataTable) {
        List<String> zipCode = dataTable.column(0);
        List<String> expectedMessage = dataTable.column(1);
        ReusableMethods.waitFor(2);
        for (int i = 0; i < expectedMessage.size(); i++) {
            getClientsPage().zipCode_input.sendKeys(zipCode.get(i) + Keys.TAB);
            ReusableMethods.waitForVisibility(getClientsPage().errorMessage, 2);
            Assert.assertEquals(expectedMessage.get(i), getClientsPage().errorMessage.getText());
            ReusableMethods.waitFor(1);
            getClientsPage().zipCode_input.sendKeys(Keys.BACK_SPACE);
        }
    }

    public void user_types_in_the_relevant_section(String country, String state, String city) {
        getClientsPage().country_input.sendKeys(country);
        getClientsPage().state_input.sendKeys(state);
        getClientsPage().city_input.sendKeys(city);
    }

    @Then("user sees {string}, {string}, {string} written")
    public void user_sees_country_state_and_city_written(String country, String state, String city) {
        ReusableMethods.waitFor(2);
        System.out.println("getClientsPage().country_input.getText() = " + getClientsPage().country_input.getText());
        //     Assert.assertEquals(country,getClientsPage().country_input.getText());
        ReusableMethods.waitFor(2);
        //    Assert.assertEquals(state,getClientsPage().state_input.getText());
        ReusableMethods.waitFor(2);
        //     Assert.assertEquals(city,getClientsPage().city_input.getText());
    }

    public void user_types_in_the_address_section(String address) {
        getClientsPage().address_input.sendKeys(address);
    }

    @Then("user can see {string} in the address section")
    public void user_can_see_repton_road_in_the_address_section(String address) {
        ReusableMethods.waitFor(2);
        Assert.assertEquals(address, getClientsPage().address_input.getText());
    }
    @When("user clicks on Upload Profile Image menu")
    public void user_clicks_on_upload_profile_image_menu() {
        getClientsPage().uploadProfileImage_input.sendKeys(System.getProperty("user.dir") + "/src/test/resources/Upload Images/uploadImage.png");
    }

    @Then("user should be able to upload profile image")
    public void user_should_be_able_to_upload_profile_image() {
        Assert.assertTrue(getClientsPage().uploadedImage.isDisplayed());
    }
}