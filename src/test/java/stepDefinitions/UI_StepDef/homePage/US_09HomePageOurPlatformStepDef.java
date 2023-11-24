package stepDefinitions.UI_StepDef.homePage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import utilities.JS_utilities;
import utilities.ReusableMethods;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.Hooks.actions;
import static stepDefinitions.Hooks.driver;

public class US_09HomePageOurPlatformStepDef extends CommonPage {


    @When("The user sees the button at the bottom of the page")
    public void theUserSeesTheButtonAtTheBottomOfThePage() {

        ReusableMethods.waitFor(3);
        // JS_utilities.scrollIntoViewJS(getHomePage().newsLetterText);JS_utilities.scrollToBottom();
        JS_utilities.scrollToBottom();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
    }

    /*
    @FindBy(xpath = "//div[text()='Features']")
        public WebElement button_FooterFeatures;
    public static void scrollToElement(WebElement element) {
            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        }
     */
    @Then("The user verifies that the  button is visible and clickable")
    public void userVerifiesButton(DataTable dataTable) {
        List<String> ourPlatform09 = dataTable.column(0);
        List<String> ourPlatformUrl = dataTable.column(1);
        ReusableMethods.waitFor(3);
        for (int i = 0; i < ourPlatform09.size(); i++) {

 WebElement button = driver.findElement(By.xpath("//div[text()='" + ourPlatform09.get(i) + "']")); // Örnek bir elementi id ile bulma
            System.out.println(button.getText());
            Assert.assertTrue(button.isDisplayed());
           // JS_utilities.scrollIntoViewJS(getHomePage().getStartedScroll);
            // JS_utilities.scrollToBottom();
            // JavascriptExecutor js = (JavascriptExecutor) driver;
              //js.executeScript("window.scrollBy(0, 500)");
              actions.sendKeys(Keys.END).perform();
            ReusableMethods.waitFor(3);
              actions.sendKeys(Keys.END).perform();
            ReusableMethods.waitFor(2);
              actions.sendKeys(Keys.END).perform();
            button.click();
            ReusableMethods.waitFor(3);
            assertEquals(ourPlatformUrl.get(i), driver.getCurrentUrl());
            ReusableMethods.waitFor(3);
            driver.navigate().back();
            ReusableMethods.waitFor(3);


        }
    }
}


