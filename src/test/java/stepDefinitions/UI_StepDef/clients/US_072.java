package stepDefinitions.UI_StepDef.clients;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.waitFor;

public class US_072 extends CommonPage {
    @When("user clicks on the client name")
    public void user_clicks_on_the_client_name() {
        getClientsPage().firstClientsName.click();

    }
    @Then("user should be able access Client Info page")
    public void user_should_be_able_access_client_info_page() {
        Assert.assertEquals("Client Info", getClientsPage().clientInfoText.getText());

    }
    @Then("user should be able to see Attachments in the added session")
    public void user_should_be_able_to_see_attachments_in_the_added_session() {
        Assert.assertEquals("Attachments:", getClientsPage().getAttachmentsText.getText());



    }
    @When("user clicks on the plus circle icon under attachments")
    public void user_clicks_on_the_plus_circle_icon_under_attachments() {
        getClientsPage().plusCircleIcon_Attachments.click();

    }
    @Then("user should be able to see choose file button")
    public void user_should_be_able_to_see_choose_file_button() {
        Assert.assertEquals("Choose file",getClientsPage().chooseFileText.getText());

    }

    @Then("user adds a new file")
    public void user_adds_a_new_file() {
        String projectPath=System.getProperty("user.dir");
        String filePath="src/test/resources/Abstraction_1.pdf";
        String fullPath=projectPath+"/"+filePath;
        waitFor(3);
        getClientsPage().chooseFileInput.sendKeys(fullPath);


    }

    @Then("user verifies the success message is {string}")
    public void userVerifiesTheSuccessMessageIs(String expectedMessage) {
         ReusableMethods.waitForVisibility(getClientsPage().fileAddedMessage,1);
        Assert.assertEquals(expectedMessage,getClientsPage().fileAddedMessage.getText());
        waitFor(2);
        getClientsPage().deleteSessionBtn.click();
        getClientsPage().yesButton_toDeleteSession.click();
    }
}
