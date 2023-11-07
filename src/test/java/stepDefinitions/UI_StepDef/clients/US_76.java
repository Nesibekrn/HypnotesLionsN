package stepDefinitions.UI_StepDef.clients;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CommonPage;

public class US_76 extends CommonPage {
    @Given("User clicks clients button")
    public void userClicksClientsButton() {
        getDashboardPage().getClientsPage().clients_button.click();

    }

    @Then("User clicks on client name")
    public void userClicksOnClientName() {
    }

    @And("User clicks on invoices button")
    public void userClicksOnInvoicesButton() {
    }

    @Then("User clicks on invoiceNo section an write something")
    public void userClicksOnInvoiceNoSectionAnWriteSomething() {
    }

    @And("User clicks on invoice date section and change the date")
    public void userClicksOnInvoiceDateSectionAndChangeTheDate() {
    }

    @Then("User clicks on due date section and change the date")
    public void userClicksOnDueDateSectionAndChangeTheDate() {
    }
}
