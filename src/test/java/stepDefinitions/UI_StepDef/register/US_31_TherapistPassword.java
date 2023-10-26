package stepDefinitions.UI_StepDef.register;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.CommonPage;

import static HypnotesLionsN.extensions.org.openqa.selenium.WebElement.WebElementsExtention.assertTextColor;
import static utilities.ReusableMethods.waitFor;

public class US_31_TherapistPassword extends CommonPage {
    @When("the expression A lowercase letter returns green")
    public void userTypesLowercaseInThePasswordField(String letter) {
        getRegisterPage().inputPassword.click();
        waitFor(2);


        getRegisterPage().inputPassword.sendKeys("xx");
        waitFor(3);




    }

    @Then("the expression {string} returns green")
    public void theExpressionALowercaseLetterReturnsGreen() {
        String actualTextColor=getRegisterPage().lowercaseExpression.getCssValue("color");
        System.out.println(actualTextColor);
       // String expectedColor = "";
        //Assert.assertEquals(expectedColor, actualTextColor);

    }
}
