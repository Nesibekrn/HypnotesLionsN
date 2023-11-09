package stepDefinitions.UI_StepDef.questionaries;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.CommonPage;
import pages.QuestionariesPage;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.*;

public class US_047 extends CommonPage {
//    @Given("User login as a therapist")
//    public void userLoginAsATherapist() {
//        ReusableMethods.clickWithTimeOut(getQuestionariesPage().loginBtnAtTheRightCorner, 3);
//        ReusableMethods.clickWithTimeOut(getQuestionariesPage().emailBtn, 3);
//        getQuestionariesPage().emailBtn.sendKeys(USER_INFO.THERAPIST.getEmail());
//        ReusableMethods.waitFor(3);
//        ReusableMethods.clickWithTimeOut(getQuestionariesPage().passwordBtn, 3);
//        getQuestionariesPage().passwordBtn.sendKeys(USER_INFO.THERAPIST.getPassword());
//        ReusableMethods.waitFor(3);
//        ReusableMethods.clickWithTimeOut(getQuestionariesPage().loginBtnWithEmail, 3);
//        ReusableMethods.waitFor(3);
//        new Actions(Driver.getDriver()).sendKeys(Keys.ESCAPE).perform();
//
//
//    }
    @When("User should see Questionnaires section")
    public void userShouldSeeQuestionnairesSection() {
       ReusableMethods.isElementPresent(getQuestionariesPage().QuestionnairesSectionBtn);
        System.out.println("url1 = " + Driver.getDriver().getCurrentUrl());
        waitFor(3);
    }

    @And("Questionnaires button should be clickable")
    public void questionnairesButtonShouldBeClickable() {
        verifyElementEnabled(getQuestionariesPage().QuestionnairesSectionBtn);
    }

    @Then("User clicks on Questionnaires section button")
    public void userClicksOnQuestionnairesSectionButton() {
        clickWithTimeOut(getQuestionariesPage().QuestionnairesSectionBtn,2);
    }
    @Then("relevant page {string} should be visible")
    public void relevantPageShouldBeVisible(String url) {
        waitFor(3);
        String url2 =Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(url2 ,url, url2);
    }

}
