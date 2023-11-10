package stepDefinitions.UI_StepDef.clients;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;

public class US_066StepDef extends CommonPage{
    @When("user clicks clients name")
    public void userClicksClientsName() {
        getClientsPage().clientFatma.click();
    }

    @And("user clicks Payments section")
    public void userClicksPaymentsSection() {
        getClientsPage().paymentsSection.click();
    }

    @Then("user verify that Payments page is open")
    public void userVerifyThatPaymentsPageIsOpen() {
        Assert.assertEquals("true",getClientsPage().selectedPaymentSection.getAttribute("aria-selected"));
    }

    @And("user verify that payment status can be updated")
    public void userVerifyThatPaymentStatusCanBeUpdated() {
        getClientsPage().paymentSwitchButton.get(0).click();

    }

    @And("user verify that updated Payment status is seen on the Appointment page.")
    public void userVerifyThatUpdatedPaymentStatusIsSeenOnTheAppointmentPage() {
        getClientsPage().appointmentsButton.click();
       Assert.assertEquals("Not paid",getClientsPage().paymentStatusText.get(0).getText());
    }

    @And("user verify that Sorting buttons is giving correct result")
    public void userVerifyThatSortingButtonsIsGivingCorrectResult() {

    }
}
