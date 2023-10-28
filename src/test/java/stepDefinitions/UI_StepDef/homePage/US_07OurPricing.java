package stepDefinitions.UI_StepDef.homePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import utilities.ReusableMethods;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static stepDefinitions.Hooks.driver;

public class US_07OurPricing {
    HomePage homePage = new HomePage();

    @Given("User Navigates to {string}")
    public void userNavigatesTo(String hypnotes) {

        driver.get(hypnotes);
    }



    @When("User should see our pricing button")
    public void userShouldSeeOurPricingButton() {
      //  Assert.assertTrue(homePage.pricing07.isDisplayed);
      //  ReusableMethods.waitFor(2);
    }



    @Then("User should see Essentials price package")
    public void userShouldSeeEssentialsPricePackage() {
        //lambda
        homePage.listPricing07.forEach(t -> assertTrue(t.isDisplayed));
/*
        for (WebElement listPrice : homePage.listPricing07
        ) {
            assertTrue(listPrice.isDisplayed);
            System.out.println(listPrice.getText());
        }

      //  Assert.assertTrue(homePage.essential07.isDisplayed);

 */
        ReusableMethods.waitFor(2);
    }




  // // @Then("User clicks the Get started now button in the Essentials pricing package")
  //  public void userClicksTheGetStartedNowButtonInTheEssentialsPricingPackage() {
  //    homePage.essential07.click();
  //      ReusableMethods.waitFor(2);
  //      driver.navigate().back();
  //  }

    @When("clicked the Get started now, the relevant page Essential should be displayed..")
    public void clickedTheGetStartedNowTheRelevantPageEssentialShouldBeDisplayed() {
       // String currentGetStarted = "https://test.hypnotes.net/register";
       // ReusableMethods.waitFor(2);
       //
        // assertEquals(driver.getCurrentUrl(), currentGetStarted);
     //   for (WebElement listPriceGetStarted : homePage.listPricingGetStartedNow07
       // ) {
            List<WebElement> elementList = driver.findElements(By.xpath("//a[text()='Get Started Now']"));
            ReusableMethods.waitFor(2);
          elementList.forEach(WebElement::click);
        ReusableMethods.waitFor(2);
        homePage.loginButton.click();
        ReusableMethods.waitFor(2);
        homePage.loginEmail07.sendKeys("esracagan85@gmail.com");
        ReusableMethods.waitFor(2);
        homePage.loginPassword07.sendKeys("Esra123*");
        ReusableMethods.waitFor(4);
        homePage.loginPourEntrerLeSite07.click();
        ReusableMethods.waitFor(2);
        driver.navigate().back();
       // driver.getCurrentUrl("https://test.hypnotes.net/dashboard/calendar");
        String getCurrentUrlAfterLogin = "https://test.hypnotes.net/dashboard/calendar";
        ReusableMethods.waitFor(2);
        assertEquals(driver.getCurrentUrl(), getCurrentUrlAfterLogin);



        }




}
