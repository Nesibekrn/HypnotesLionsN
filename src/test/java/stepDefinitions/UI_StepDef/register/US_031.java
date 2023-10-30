package stepDefinitions.UI_StepDef.register;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
//As a user, I should be able to check valid and invalid passwords.	When appropriate expressions are entered in the 'Password must contain the following' section, there should be a color change (red-green)
//It should not be possible to register with invalid passwords.
        //	Password must contain the following: 8-50 characters, A lowercase letter, A capital (uppercase) letter, A number, A special character
public class US_031 {
    @When("user enters a password that meets these five criteria")
    public void userEntersAPasswordThatMeetsTheseFiveCriteria() {
    }

    @And("the expression characters size returns green")
    public void theExpressionCharactersSizeReturnsGreen() {
    }

    @And("the expression A lowercase letter returns green")
    public void theExpressionALowercaseLetterReturnsGreen() {
    }

    @And("the expression A capital uppercase letter returns green")
    public void theExpressionACapitalUppercaseLetterReturnsGreen() {
    }

    @And("the expression A number  returns green")
    public void theExpressionANumberReturnsGreen() {
    }

    @And("the expression A special characterA lowercase letter returns green")
    public void theExpressionASpecialCharacterALowercaseLetterReturnsGreen() {
    }

}
