package stepDefinitions.UI_StepDef.documents;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.plugin.event.Node;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.ClientsPage;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_64_stepDef {
    @Given("Login as a {string}")
    public void loginAsA(String userName) {
        LoginPage loginPage = new LoginPage();
        loginPage.loginAs(userName);




    }

    @Then("the user clicks on {string} title on Dashboard menu")
    public void theUserClicksOnTitleOnDashboardMenu(String Title) throws InterruptedException {

        Driver.getDriver().findElement(By.xpath("//a[.='"+Title+"']")).click();
        Thread.sleep(1000);

    }

    @Then("the user clicks on First Client")
    public void theUserClicksOnFirstClient() throws InterruptedException {
        Driver.getDriver().findElement(By.xpath("//h5")).click();
        Thread.sleep(3000);
    }

    @Then("the user confirms {string} button and clicks")
    public void theUserConfirmsButtonAndClicks(String buttonText) throws InterruptedException {
        System.out.println("Text =" + Driver.getDriver().findElement(By.xpath("//span[.='Send a New Document']")).getText());
        Assert.assertEquals(buttonText,Driver.getDriver().findElement(By.xpath("//span[.='Send a New Document']")).getText());
        Driver.getDriver().findElement(By.xpath("//span[.='Send a New Document']")).click();
        Thread.sleep(2000);
    }

    @Then("the user click on {string} button")
    public void theUserClickOnButton(String returnButton) {
        Driver.getDriver().findElement(By.xpath("//span[.='Return']")).click();
    }
}
