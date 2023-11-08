package stepDefinitions.UI_StepDef.clients;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CommonPage;
import utilities.JS_utilities;
import utilities.ReusableMethods;

public class US_76 extends CommonPage {
    String element ="123";
    @Given("User clicks clients button")
    public void userClicksClientsButton() {
      getClientsPage().clients_button.click();

    }

    @Then("User clicks on client name")
    public void userClicksOnClientName() {
        getClientsPage().firstClient.click();


        }

    @And("User clicks on invoices button")
    public void userClicksOnInvoicesButton() {
        ReusableMethods.waitForPageToLoad(2);
        getClientsPage().invoices.click();
    }

    @Then("User clicks on invoiceNo section an write something")
    public void userClicksOnInvoiceNoSectionAnWriteSomething() {
        ReusableMethods.scrollToBottom();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(getClientsPage().invoiceNo.isEnabled());
        getClientsPage().invoiceNo.click();
        ReusableMethods.waitFor(1);
        JS_utilities.typeWithJS(getClientsPage().invoiceNo,element);

    }

    @And("User clicks on invoice date section and change the date")
    public void userClicksOnInvoiceDateSectionAndChangeTheDate() {
        Assert.assertTrue(getClientsPage().invoiceDate.isEnabled());
        getClientsPage().invoiceDate.click();
        getClientsPage().invoiceDate1.click();

    }

    @Then("User clicks on due date section and change the date")
    public void userClicksOnDueDateSectionAndChangeTheDate() {
        Assert.assertTrue(getClientsPage().dueDate.isEnabled());
        getClientsPage().dueDate.click();
        getClientsPage().dueDate1.click();

    }
}
