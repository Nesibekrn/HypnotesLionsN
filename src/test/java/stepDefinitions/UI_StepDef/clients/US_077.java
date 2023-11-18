package stepDefinitions.UI_StepDef.clients;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import utilities.ReusableMethods;

public class US_077 extends CommonPage {
    @Then("user verifies item description,Qty,Rate field is functional")
    public void userVerifiesItemDescriptionQtyRateFieldIsFunctional() {
        getClientsPage().itemDescriptionField.isEnabled();
        getClientsPage().qytRateField.forEach(WebElement::isEnabled);
    }

    @And("user verifies Amount,Sub Total Sale Tax and Total field is functional and giving correct result")
    public void userVerifiesAmountSubTotalSaleTaxAndTotalFieldIsFunctionalAndGivingCorrectResult() {
        getClientsPage().itemDescriptionField.sendKeys("Stress Management");
        getClientsPage().qytRateField.get(0).sendKeys(Keys.BACK_SPACE);
        ReusableMethods.waitFor(2);

        getClientsPage().qytRateField.get(0).sendKeys("2");
        ReusableMethods.waitFor(2);

        String qyt= getClientsPage().qytRateField.get(0).getAttribute("value");



      String rate= getClientsPage().qytRateField.get(1).getAttribute("value");

        double expectedAmount=Integer.parseInt(qyt)*
                Double.parseDouble(rate);

        Assert.assertEquals(expectedAmount,Double.parseDouble(getClientsPage().amountSubtotalSaleTax.get(0).getText()),0.01);
        Assert.assertEquals(getClientsPage().totalField.getText(),getClientsPage().amountSubtotalSaleTax.get(0).getText());


    }
       int a;
    int b;
    @When("user clicks Add Line Item")
    public void userClicksAddLineItem() {
        a= getClientsPage().addLineItemList.size();
        getClientsPage().addLineItem.click();
        ReusableMethods.waitFor(2);

    }
    @Then("user verifies that a new item description field is created")
    public void userVerifiesThatANewItemDescriptionFieldIsCreated() {
        b= getClientsPage().addLineItemList.size();
       Assert.assertTrue(b-a>0);
    }

    @And("user verifies that Notes area The Terms & Conditions field is functional and writable")
    public void userVerifiesThatNotesAreaTheTermsConditionsFieldIsFunctionalAndWritable() {
     getClientsPage().notesTermsTextarea.get(0).sendKeys("Have nice day");
     getClientsPage().notesTermsTextarea.get(1).sendKeys("Please be on time for your appointment");
     ReusableMethods.waitFor(2);
    }



}
