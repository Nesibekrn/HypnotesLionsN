package stepDefinitions.UI_StepDef.register;

import io.cucumber.java.en.Then;
import pages.CommonPage;
import org.junit.Assert;

public class US_031 extends CommonPage {


    @Then("Verify that the color of messages for {string} and {string} and {string} and {string} and {string}")
    public void verify_that_the_color_of_messages_for_and_and_and_and(String Chars, String lower, String upper, String numb, String special) {

        String pass = Chars+lower+upper+numb+special;
        getRegisterPage().input_password.clear();


        String redColor = "rgba(255, 0, 0, 1)";
        String greenColor = "rgba(35, 108, 47, 1)";
        String actualColor;

        actualColor = getRegisterPage().numberValidation.getCssValue("color");
        Assert.assertEquals(redColor, actualColor);

        getRegisterPage().input_password.sendKeys(pass);

        if (pass.length()<8 | pass.length()>50){
            actualColor = getRegisterPage().characterValidation.getCssValue("color");
            Assert.assertEquals(redColor, actualColor);
        } else {
            actualColor = getRegisterPage().characterValidation.getCssValue("color");
            Assert.assertEquals(greenColor, actualColor);
        }

        if (lower.isEmpty()) {
            actualColor = getRegisterPage().lowercaseLetterValidation.getCssValue("color");
            Assert.assertEquals(redColor, actualColor);
        } else {
            actualColor = getRegisterPage().lowercaseLetterValidation.getCssValue("color");
            Assert.assertEquals(greenColor, actualColor);
        }

        if (upper.isEmpty()) {
            actualColor = getRegisterPage().uppercaseValidation.getCssValue("color");
            Assert.assertEquals(redColor, actualColor);
        } else {
            actualColor= getRegisterPage().uppercaseValidation.getCssValue("color");
            Assert.assertEquals(greenColor, actualColor);
        }

        actualColor = getRegisterPage().numberValidation.getCssValue("color");
        Assert.assertEquals(greenColor, actualColor);

        if (special.isEmpty()) {
            actualColor = getRegisterPage().specialCharacterValidation.getCssValue("color");
            Assert.assertEquals(redColor, actualColor);
        } else {
            actualColor = getRegisterPage().specialCharacterValidation.getCssValue("color");
            Assert.assertEquals(greenColor, actualColor);
        }

    }

    @Then("Verify that the sign up button for Password is clickable for only {string} is True")
    public void verify_that_the_sign_up_button_for_password_is_clickable_for_only_is_true(String isVal) {
        if (isVal.equals("F")) {
            Assert.assertFalse("Sign Up button is not clickable", getRegisterPage().button_signUp.isEnabled());
        } else {
            Assert.assertTrue("Sign Up button is clickable", getRegisterPage().button_signUp.isEnabled());
        }
    }}

