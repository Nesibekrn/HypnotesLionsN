package stepDefinitions.UI_StepDef.register;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;

import static utilities.ReusableMethods.wait;
import static utilities.ReusableMethods.waitFor;

public class US_021 extends CommonPage {
    @When("user clicks password field")
    public void userClicksPasswordField() {
        waitFor(3);
        getRegisterPage().inputPassword.click();
        waitFor(3);
    }

    @Then("the color in the characters section should be red")
    public void the_color_in_the_characters_section_should_be_red() {
        String actualColor = getRegisterPage().characterValidation.getCssValue("color");
        String expectedColor = "rgba(255, 0, 0, 1)";
        Assert.assertEquals(expectedColor, actualColor);
    }

    @And("the color in the A lowercase letter section should be red")
    public void theColorInTheALowercaseLetterSectionShouldBeRed() {
        String actualColor = getRegisterPage().lowercaseLetterValidation.getCssValue("color");
        String expectedColor = "rgba(255, 0, 0, 1)";
        Assert.assertEquals(expectedColor, actualColor);
    }

    @Then("the color in the A capital uppercase letter section should be red")
    public void the_color_in_the_a_capital_uppercase_letter_section_should_be_red() {
        String actualColor = getRegisterPage().uppercaseValidation.getCssValue("color");
        String expectedColor = "rgba(255, 0, 0, 1)";
        Assert.assertEquals(expectedColor, actualColor);
    }

    @And("the color in the A number section should be red")
    public void theColorInTheANumberSectionShouldBeRed() {
        String actualColor = getRegisterPage().numberValidation.getCssValue("color");
        String expectedColor = "rgba(255, 0, 0, 1)";
        Assert.assertEquals(expectedColor, actualColor);
    }

    @And("the color in the A special character section should be red")
    public void theColorInTheASpecialCharacterSectionShouldBeRed() {
        String actualColor = getRegisterPage().specialCharacterValidation.getCssValue("color");
        String expectedColor = "rgba(255, 0, 0, 1)";
        Assert.assertEquals(expectedColor, actualColor);
    }

    @When("the user enters a password that meets the criteria.")
    public void the_user_enters_a_password_that_meets_the_criteria() {
        getRegisterPage().inputPassword.sendKeys("Merhaba123!");

    }

    @Then("the color in the characters section should be green")
    public void the_color_in_the_characters_section_should_be_green() {
        String actualColor = getRegisterPage().characterValidation.getCssValue("color");
        String expectedColor = "rgba(35, 108, 47, 1)";
        Assert.assertEquals(expectedColor, actualColor);

    }

    @And("the color in the A lowercase letter section should be green")
    public void theColorInTheALowercaseLetterSectionShouldBeGreen() {
        String actualColor = getRegisterPage().lowercaseLetterValidation.getCssValue("color");
        String expectedColor = "rgba(35, 108, 47, 1)";
        Assert.assertEquals(expectedColor, actualColor);
    }

    @Then("the color in the A capital uppercase letter section should be green")
    public void the_color_in_the_a_capital_uppercase_letter_section_should_be_green() {
        String actualColor = getRegisterPage().uppercaseValidation.getCssValue("color");
        String expectedColor = "rgba(35, 108, 47, 1)";
        Assert.assertEquals(expectedColor, actualColor);
    }

    @And("the color in the A number section should be green")
    public void theColorInTheANumberSectionShouldBeGreen() {
        String actualColor = getRegisterPage().numberValidation.getCssValue("color");
        String expectedColor = "rgba(35, 108, 47, 1)";
        Assert.assertEquals(expectedColor, actualColor);
    }

    @And("the color in the A special character section should be green")
    public void theColorInTheASpecialCharacterSectionShouldBeGreen() {
        String actualColor = getRegisterPage().specialCharacterValidation.getCssValue("color");
        String expectedColor = "rgba(35, 108, 47, 1)";
        Assert.assertEquals(expectedColor, actualColor);
    }

    @When("user enters a password with less than eight characters")
    public void userEntersAPasswordWithLessThanEightCharacters() {
        String invalidPassword = "Hello1!";
        getRegisterPage().inputPassword.sendKeys(invalidPassword);
        Assert.assertTrue(invalidPassword.length()<=8);
        waitFor(5);
    }

    @When("user enters a password with more than fifty characters")
    public void userEntersAPasswordWithMoreThanFiftyCharacters() {
        String invalidPassword = "Aqwertyuiop[]asdfghjkl;'zxcvbnm,./1234567890-=`qwe1!";
        getRegisterPage().inputPassword.sendKeys(invalidPassword);
        Assert.assertTrue(invalidPassword.length()>=50);
        waitFor(5);
    }

    @When("user enters a password that meets all the criteria except it does not contain a lowercase letter")
    public void userEntersAPasswordThatMeetsAllTheCriteriaExceptItDoesNotContainALowercaseLetter() {
        String invalidPassword = "HELLO12!";
        getRegisterPage().inputPassword.sendKeys(invalidPassword);
        Assert.assertFalse(invalidPassword.matches(".[a-z]."));
        waitFor(5);
    }

    @When("user enters a password that meets all the criteria except it does not contain an uppercase letter")
    public void userEntersAPasswordThatMeetsAllTheCriteriaExceptItDoesNotContainAnUppercaseLetter() {
        String invalidPassword = "hello12!";
        getRegisterPage().inputPassword.sendKeys(invalidPassword);
        Assert.assertFalse(invalidPassword.matches(".[A-Z]."));
        waitFor(5);
    }

    @When("the user enters a password that meets all the criteria except it does not contain a number")
    public void theUserEntersAPasswordThatMeetsAllTheCriteriaExceptItDoesNotContainANumber() {
        String invalidPassword = "Helloworld!";
        getRegisterPage().inputPassword.sendKeys(invalidPassword);
        Assert.assertFalse(invalidPassword.matches(".\\d."));
        waitFor(5);

    }

    @When("the user enters a password that meets all the criteria except it does not contain a special character")
    public void theUserEntersAPasswordThatMeetsAllTheCriteriaExceptItDoesNotContainASpecialCharacter() {
        String invalidPassword = "Hello123";
        getRegisterPage().inputPassword.sendKeys(invalidPassword);
        Assert.assertFalse(invalidPassword.matches(".[!@#&()\\[\\]{}:;',?/~$^+=<>–]."));
        waitFor(5);
    }

}
