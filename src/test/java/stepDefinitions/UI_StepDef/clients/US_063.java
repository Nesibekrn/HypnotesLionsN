package stepDefinitions.UI_StepDef.clients;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.CommonPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_063 extends CommonPage {

    @Then("user verifies the payment button is clickable")
    public void user_verifies_the_payment_button_is_clickable() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(getClientsPage().getPaymentButton.isEnabled());
        ReusableMethods.waitFor(1);
    }

    @Then("user clicks on the Receive Payment button and sees payment options")
    public void user_clicks_on_the_receive_payment_button_and_sees_payment_options() {
        getClientsPage().getPaymentButton.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(getClientsPage().paypalButton.isDisplayed());
        ReusableMethods.waitFor(1);
        Assert.assertTrue(getClientsPage().stripeButton.isDisplayed());
        ReusableMethods.waitFor(1);

    }

    @Then("user can see category options")
    public void user_can_see_category_options() {
        getClientsPage().peymentDropDownMenu.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(getClientsPage().peymentDropDownMenuIlkElement.isDisplayed);
        ReusableMethods.waitFor(1);
    }

    @Then("user can use the payment sections")
    public void user_can_use_the_payment_sections() {
        // Paypal a gecizor mu?
        getClientsPage().peymentDropDownMenu.click();
        getClientsPage().peymentDropDownMenuIlkElement.click();
        getClientsPage().paypalButton.click();
        ReusableMethods.waitFor(1);
        getClientsPage().goPaymentButton.click();

        ReusableMethods.switchToWindow(1);
        String istenenTitle = "Paypal";
        String mevcutTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(istenenTitle.contains(mevcutTitle));
        Driver.getDriver().close();

        // Stripe e geciyor mu?
        getClientsPage().getPaymentButton.click();
        getClientsPage().peymentDropDownMenu.click();
        getClientsPage().peymentDropDownMenuIlkElement.click();
        getClientsPage().stripeButton.click();
        ReusableMethods.waitFor(1);
        getClientsPage().goPaymentButton.click();

        ReusableMethods.switchToWindow(1);
        String istenenTitle2 = "stripe";
        String mevcutTitle2 = Driver.getDriver().getTitle();
        Assert.assertTrue(istenenTitle2.contains(mevcutTitle2));
        Driver.getDriver().close();

    }

}
