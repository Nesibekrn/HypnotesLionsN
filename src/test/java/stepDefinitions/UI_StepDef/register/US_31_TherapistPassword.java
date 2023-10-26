package stepDefinitions.UI_StepDef.register;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.CommonPage;

import static HypnotesLionsN.extensions.org.openqa.selenium.WebElement.WebElementsExtention.assertTextColor;
import static utilities.ReusableMethods.waitFor;

public class US_31_TherapistPassword extends CommonPage {
    @When("user types lowercase {string} in the password field")
    public void userTypesLowercaseInThePasswordField(String letter) {
        getRegisterPage().inputPassword.click();
        waitFor(2);


        getRegisterPage().inputPassword.sendKeys(letter);
        waitFor(3);




    }

    @Then("the expression A lowercase letter returns green")
    public void theExpressionALowercaseLetterReturnsGreen() {
        String actualTextColor=getRegisterPage().lowercaseExpression.getCssValue("color");
        System.out.println(actualTextColor);
       String expectedColor = "rgba(35, 108, 47, 1)";
        Assert.assertEquals(expectedColor, actualTextColor);

    }
}

