package stepDefinitions.UI_StepDef.homePage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CommonPage;
import pages.HomePage;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static stepDefinitions.Hooks.driver;
import static utilities.ReusableMethods.waitFor;

public class US_07OurPricing extends CommonPage {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    @Given("User Navigates to {string}")
    public void userNavigatesTo(String hypnotes) {

        driver.get(hypnotes);
        waitFor(3);
    }
   @When("User should see our pricing button")
   public void userShouldSeeOurPricingButton() {
       getHomePage().pricing07.click();
       waitFor(2);
   }
   @Then("User should see the following price packages are displayed:")
   public void userShouldSeeTheFollowingPricePackages(DataTable packages) {
       List<String> list = packages.asList();
       for (int i = 0; i <= list.size() - 1; i++) {
           Assert.assertEquals(getHomePage().listPricing07.get(i).getText(), list.get(i));
           waitFor(1);
           System.out.println(getHomePage().listPricing07.get(i).getText());
           getHomePage().listPricingGetStartedNow07.get(i).click();
        getHomePage().loginButton.click();
         waitFor(2);
         getHomePage().loginEmail07.sendKeys("esracagan85@gmail.com");
         waitFor(2);
         getHomePage().loginPassword07.sendKeys("Esra123*");
         waitFor(4);
         getHomePage().loginPourEntrerLeSite07.click();
         waitFor(2);
         getHomePage().hesapE.click();
         waitFor(2);
         getHomePage().hesapLogout.click();
         waitFor(2);

          //Assert.assertTrue(getHomePage().getStartedNow.get(i).isEnabled());
          driver.navigate().to("https://test.hypnotes.net/pricing");
      }

  }


}




