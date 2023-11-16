package stepDefinitions.UI_StepDef.clients;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import utilities.JS_utilities;
import utilities.ReusableMethods;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static stepDefinitions.Hooks.driver;

public class US_066StepDef extends CommonPage{
    @When("user clicks clients name")
    public void userClicksClientsName() {
       // JS_utilities.scrollIntoViewJS(clientsPage.clientFatma);
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
        ReusableMethods.waitFor(2);
        Assert.assertEquals("Not Paid",getClientsPage().paymentStatusText.get(0).getText());
    }

    @And("user verify that Sorting buttons is giving correct result")
    public void userVerifyThatSortingButtonsIsGivingCorrectResult() {
       getClientsPage().paymentsSection.click();

        List<Date> dates = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        for (WebElement dateElement : getClientsPage().appointmentDates) {
            String dateText = dateElement.getText();
            try {
                Date date = dateFormat.parse(dateText);
                dates.add(date);

            } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
        System.out.println(dates);
        // Compare the dates and assert descending order
         for (int i = 1; i < dates.size(); i++) {
                    Assert.assertTrue("Dates are not in descending order",dates.get(i).compareTo(dates.get(i - 1)) <=0);
                }
        // Compare the dates and assert ascending order

        getClientsPage().dateSortDescending.click();
         ReusableMethods.waitFor(2);
        (getClientsPage().dateSortDescending).click();

         ReusableMethods.waitFor(5);


        List<Date> dates1 = new ArrayList<>();

        for (WebElement dateElement1 : driver.findElements(By.xpath("//span[@class='ant-tag ant-tag-success css-aqx16b']"))) {
            String dateText1 = dateElement1.getText();
            try {
                Date date1 = dateFormat.parse(dateText1);
                dates1.add(date1);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        System.out.println(dates1);


        for (int i = 1; i < dates1.size(); i++) {

            Assert.assertTrue("Dates are not in ascending order",dates1.get(i).compareTo(dates1.get(i - 1)) >=0);

        }
        getClientsPage().sortingButtons.get(1).click();
        ReusableMethods.waitFor(2);
        getClientsPage().sortingCheckBox.get(1).click();
        getClientsPage().okButton.click();
        Assert.assertTrue(getClientsPage().serviceText.getText()
                .contains(getClientsPage().sortingServicesText.get(0).getText()));




    }
        }






