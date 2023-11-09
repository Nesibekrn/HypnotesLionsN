package stepDefinitions.UI_StepDef.clients;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

import java.io.File;

import static stepDefinitions.Hooks.driver;
import static utilities.ReusableMethods.waitFor;

public class US_079 extends CommonPage {

    @Given("the user clicks on client title on the left menu")
    public void the_user_clicks_on_client_title_on_the_left_menu() {
        getClientsPage().clients_button.click();
        waitFor(2);
        try{
            getClientsPage().cancelButtonForUpgradeNow.click();
            waitFor(2);
        }catch (Exception e){
            System.out.println("There is no insurance plan yet");
        }


    }
    @Then("Import Client button is displayed")
    public void import_client_button_is_displayed() {
        System.out.println(getClientsPage().importClientsButton.getText());
        Assert.assertTrue(getClientsPage().importClientsButton.getText().contains("Import Client"));
        waitFor(2);
    }
    @Then("the user is able to open to the relavant page once clicked on the import client button")
    public void the_user_is_able_to_open_to_the_relavant_page_once_clicked_on_the_import_client_button() {
getClientsPage().importClientsButton.click();
waitFor(2);
        System.out.println(getClientsPage().chooseImportMethodWindow.getText());

Assert.assertTrue(getClientsPage().chooseImportMethodWindow.getText().contains("Choose Import Method"));
    }


    @Given("the user clicks on the import client button")
    public void the_user_clicks_on_the_import_client_button() {
        getClientsPage().importClientsButton.click();

        waitFor(2);
    }
    @Given("the user clicks Easy Practice on the choose import method window")
    public void the_user_clicks_easy_practice_on_the_choose_import_method_window() {
        getClientsPage().easyPracticeMethod.click();
        waitFor(2);
    }
    @Given("the user selects a csv file")
    public void the_user_selects_a_csv_file() {
        File logoPath=new File("src/test/resources/Upload Images/clients.csv");
        String path = logoPath.getAbsolutePath();
        getClientsPage().chooseFileForEasyPractice.sendKeys(path);
        waitFor(2);
    }
    @Then("the user clicks on the upload button")
    public void the_user_clicks_on_the_upload_button() {
      getClientsPage().uploadButtonForEasyPractice.click();
      waitFor(1);
      driver.navigate().refresh();

        try{
            getClientsPage().cancelButtonForUpgradeNow.click();
            waitFor(1);
        }catch (Exception e){
            System.out.println("There is no insurance plan yet");
        }
        }


    @Then("user is able to view imported clients on the page")
    public void user_is_able_to_view_imported_clients_on_the_page() {
       String clientName="John Moon";
       waitFor(3);
        Assert.assertEquals(clientName,getClientsPage().importedClient.getText());
    }
}
