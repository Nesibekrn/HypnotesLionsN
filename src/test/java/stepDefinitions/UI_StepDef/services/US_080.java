package stepDefinitions.UI_StepDef.services;

import enums.COLOR;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CommonPage;
import utilities.Driver;
import utilities.JS_utilities;
import utilities.ReusableMethods;

import java.time.Duration;
import java.time.Instant;

import static stepDefinitions.Hooks.driver;
import static utilities.ReusableMethods.*;

public class US_080 extends CommonPage {



    @When("User clicks on the Services button")
    public void userClicksOnTheServicesButton() {
        Assert.assertTrue(getClientsPage().services_button.isDisplayed());
        ReusableMethods.waitFor(2);
        getClientsPage().services_button.click();
    }

    @Then("Headers of Individual Sessions, Packages, Group Session should be visible")
    public void headersOfIndividualSessionsPackagesGroupSessionShouldBeVisible() {
        ReusableMethods.waitFor(5);
        Assert.assertTrue(getServicesPage().IndividualSessions.isDisplayed());
        Assert.assertTrue(getServicesPage().groupSessionButton.isDisplayed());
        Assert.assertTrue(getServicesPage().PackagesButton.isDisplayed());
    }

    @And("Individual Sessions should be seen as default page")
    public void individualSessionsShouldBeSeenAsDefaultPage() {
        //Assert.assertTrue(getServicesPage().IndividualSessions.isSelected());
        Assert.assertTrue(getServicesPage().addNewIndividualSession.isDisplayed());
        COLOR.INDIVIDUAL_SESSION_BUTTON.assertBorderColor(getServicesPage().IndividualSessions);
        Assert.assertTrue(getServicesPage().AvailableIndividualSession.isDisplayed());
    }

    @When("User clicks on the Individual Sessions button")
    public void userClicksOnTheIndividualSessionsButton() {

        getServicesPage().IndividualSessions.click();
    }

    @Then("New Individual Sessions and Generate Scheduler URL buttons should be visible")
    public void newIndividualSessionsAndGenerateSchedulerURLButtonsShouldBeVisible() {
        Assert.assertTrue(getServicesPage().addNewIndividualSession.isDisplayed());
        Assert.assertTrue(getServicesPage().GenerateSchedulerUrl.isDisplayed());

    }

    @And("New Individual Sessions and Generate Scheduler URL buttons should be clickable")
    public void newIndividualSessionsAndGenerateSchedulerURLButtonsShouldBeClickable() {
        Assert.assertTrue(getServicesPage().addNewIndividualSession.isEnabled());
        Assert.assertTrue(getServicesPage().GenerateSchedulerUrl.isEnabled());
    }

    @And("If there is a previously created service, it should be listed")
    public void ifThereIsAPreviouslyCreatedServiceItShouldBeListed() {

        try {
            Assert.assertTrue(getServicesPage().RegisteredServicesList.isDisplayed());
        } catch (NoSuchElementException e) {
            System.out.println("Registered services list is not displayed.");
        }
    }

    @And("Table and card buttons should be clickable")
    public void tableAndCardButtonsShouldBeClickable() {

        try {
            Assert.assertTrue(getServicesPage().ServicesTable.isEnabled());
        } catch (NoSuchElementException e) {
            System.out.println("Services Table is not enabled.");
        }

        try {
            Assert.assertTrue(getServicesPage().ServicesCard.isEnabled());
        } catch (NoSuchElementException e) {
            System.out.println("Services Card is not enabled.");
        }
    }

    @When("User clicks on the Packages button")
    public void userClicksOnThePackagesButton() {
        waitFor(3);
        getServicesPage().PackagesButton.click();
    }

    @Then("New Package and Generate Scheduler URL buttons should be visible")
    public void newPackageAndGenerateSchedulerURLButtonsShouldBeVisible() {

       Assert.assertTrue(getServicesPage().AddNewPackagesButton.isDisplayed());
       //ReusableMethods.waitFor(10);
       Assert.assertTrue(getServicesPage().GenerateSchedulerUrl2.isDisplayed());
    }

    @And("New Package and Generate Scheduler URL buttons should be clickable")
    public void newPackageAndGenerateSchedulerURLButtonsShouldBeClickable() {

        Assert.assertTrue(getServicesPage().AddNewPackagesButton.isEnabled());
        Assert.assertTrue(getServicesPage().GenerateSchedulerUrl2.isEnabled());
    }

    @When("User clicks on the Group Session button")
    public void userClicksOnTheGroupSessionButton() {

        waitFor(3);
        getServicesPage().groupSessionButton.click();
    }

    @Then("New Group Sessions and Generate Scheduler URL buttons should be visible")
    public void newGroupSessionsAndGenerateSchedulerURLButtonsShouldBeVisible() {

        Assert.assertTrue(getServicesPage().addNewGroupSessionButton.isDisplayed());
        //waitFor(3);
        Assert.assertTrue(getServicesPage().GenerateSchedulerUrl3.isDisplayed());
    }

    @And("New Group Sessions and Generate Scheduler URL buttons should be clickable")
    public void newGroupSessionsAndGenerateSchedulerURLButtonsShouldBeClickable() {

        Assert.assertTrue(getServicesPage().addNewGroupSessionButton.isEnabled());
        Assert.assertTrue(getServicesPage().GenerateSchedulerUrl3.isEnabled());
    }
}