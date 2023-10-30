import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.RegisterPage;

public class US_031_Stepdefs extends CommonPage {

    @Then("Verify that the color of messages for {string} and {string} and {string} and {string} and {string}")
    public void verifyThatTheColorOfMessagesForAndAndAndAndAnd(String Chars, String lower, String upper, String numb, String special) {

        String pass = Chars+lower+upper+numb+special;
        getRegisterPage().input_password.clear();

        String greyColor = "rgba(255, 0, 0, 1)";
        String greenColor = "rgba(35, 108, 47, 1)";
        String actualColor;

        actualColor = getRegisterPage().numberValidation.getCssValue("color");
        Assert.assertEquals(greyColor, actualColor);

        getRegisterPage().input_password.sendKeys(pass);

        if (pass.length()<8 | pass.length()>50){
            actualColor = getRegisterPage().characterValidation.getCssValue("color");
            Assert.assertEquals(greyColor, actualColor);
        } else {
            actualColor = getRegisterPage().characterValidation.getCssValue("color");
            Assert.assertEquals(greenColor, actualColor);
        }

        if (lower.isEmpty()) {
            actualColor = getRegisterPage().lowercaseLetterValidation.getCssValue("color");
            Assert.assertEquals(greyColor, actualColor);
        } else {
            actualColor = getRegisterPage().lowercaseLetterValidation.getCssValue("color");
            Assert.assertEquals(greenColor, actualColor);
        }

        if (upper.isEmpty()) {
            actualColor = getRegisterPage().uppercaseValidation.getCssValue("color");
            Assert.assertEquals(greyColor, actualColor);
        } else {
            actualColor= getRegisterPage().uppercaseValidation.getCssValue("color");
            Assert.assertEquals(greenColor, actualColor);
        }

        actualColor = getRegisterPage().numberValidation.getCssValue("color");
        Assert.assertEquals(greenColor, actualColor);

        if (special.isEmpty()) {
            actualColor = getRegisterPage().specialCharacterValidation.getCssValue("color");
            Assert.assertEquals(greyColor, actualColor);
        } else {
            actualColor = getRegisterPage().specialCharacterValidation.getCssValue("color");
            Assert.assertEquals(greenColor, actualColor);
        }

    }

    @Then("Verify that the sign up button for Password is clickable for only {string} is True")
    public void verifyThatTheSignUpButtonForIsClickableForPasswordOnlyIsTrue(String isVal) {

        if (isVal.equals("F")) {
            Assert.assertFalse("Sign Up button is not clickable", getRegisterPage().button_signUp.isEnabled());
        } else {
            Assert.assertTrue("Sign Up button is clickable", getRegisterPage().button_signUp.isEnabled());
        }

    }

    }
