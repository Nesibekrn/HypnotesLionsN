package stepDefinitions.UI_StepDef.homePage;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.CommonPage;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.actions;
import static utilities.JS_utilities.scrollAndClickWithJS;

public class US_04_Language extends CommonPage {
    @Then("The user clicks the language button")
    public void the_user_clicks_the_language_button() {
        getHomePage().languageButton.click();
        ReusableMethods.waitFor(5);

    }
    @Then("If the user click USA flag language should be English")
    public void if_the_user_click_usa_flag_language_should_be_english() {
        //ReusableMethods.wait.until(ExpectedConditions.elementToBeClickable(getHomePage().usaFlag));
        ReusableMethods.waitFor(5);
        //actions.moveToElement(getHomePage().usaFlag).perform();
        //ReusableMethods.hover(getHomePage().usaFlag);
         scrollAndClickWithJS(getHomePage().usaFlag);

        String pageSlogan = "Hypnotes Does All The Things";
        Assert.assertEquals(getHomePage().sayfaSlogani.getText(),pageSlogan);
        System.out.println("test gecti");


    }
    @Then("If the user click Turkiye flag language should be Turkish")
    public void if_the_user_click_turkiye_flag_language_should_be_turkish() {
        ReusableMethods.waitFor(5);
        //actions.moveToElement(getHomePage().languageButton).perform();
        getHomePage().languageButton.click();
        //ReusableMethods.wait.until(ExpectedConditions.elementToBeClickable(getHomePage().turkiyeFlag));
        //ReusableMethods.waitForClickablility((By) getHomePage().turkiyeFlag,5);
        ReusableMethods.waitFor(5);
        //actions.moveToElement(getHomePage().turkiyeFlag).perform();
        ReusableMethods.hover(getHomePage().turkiyeFlag);
        //scrollAndClickWithJS(getHomePage().turkiyeFlag);
        //getHomePage().turkiyeFlag.click();
        String sayfaSloganim ="Hypnotes Her Seyi Yapar";
        Assert.assertEquals(getHomePage().sayfaSlogani.getText(),sayfaSloganim);



    }
    @Then("If the user click Germany flag language should be German")
    public void if_the_user_click_germany_flag_language_should_be_german() {
        actions.moveToElement(getHomePage().languageButton).perform();
        getHomePage().languageButton.click();
        //ReusableMethods.wait.until(ExpectedConditions.elementToBeClickable(getHomePage().germanyFlag));
        //ReusableMethods.waitForClickablility((By) getHomePage().germanyFlag,5);
        ReusableMethods.waitFor(5);
        actions.moveToElement(getHomePage().germanyFlag).perform();
        getHomePage().germanyFlag.click();
        String motto = "Hypnotes macht alles möglich";
        Assert.assertEquals(getHomePage().sayfaSlogani.getText(),motto);

    }
    @Then("If the user click France flag language should be French")
    public void if_the_user_click_france_flag_language_should_be_french() {
        actions.moveToElement(getHomePage().languageButton).perform();
        getHomePage().languageButton.click();
        //ReusableMethods.wait.until(ExpectedConditions.elementToBeClickable(getHomePage().franceFlag));
        ReusableMethods.waitFor(5);
        actions.moveToElement(getHomePage().franceFlag).perform();
        getHomePage().franceFlag.click();
        String leSlogan="Hypnotes fait tout ce qu'il faut";
        Assert.assertEquals(getHomePage().sayfaSlogani.getText(),leSlogan);

    }

    @Then("If the user click Russia flag language should be Russian")
    public void if_the_user_click_russia_flag_language_should_be_russian() {
        actions.moveToElement(getHomePage().languageButton).perform();
        getHomePage().languageButton.click();
        //ReusableMethods.wait.until(ExpectedConditions.elementToBeClickable(getHomePage().russiaFlag));
        ReusableMethods.waitFor(5);
        actions.moveToElement(getHomePage().russiaFlag).perform();
        getHomePage().russiaFlag.click();
        String russianSlogan = "Hypnotes делает все возможное";
        Assert.assertEquals(getHomePage().sayfaSlogani.getText(),russianSlogan);

    }
    @Then("If the user click Spain flag language should be Spanish")
    public void if_the_user_click_spain_flag_language_should_be_spanish() {
        actions.moveToElement(getHomePage().languageButton).perform();
        getHomePage().languageButton.click();
       // ReusableMethods.wait.until(ExpectedConditions.elementToBeClickable(getHomePage().spainFlag));
        ReusableMethods.waitFor(5);
        actions.moveToElement(getHomePage().spainFlag).perform();
        getHomePage().spainFlag.click();
        String spanishSlogan = "Hypnotes hace de todo";
        Assert.assertEquals(getHomePage().sayfaSlogani.getText(),spanishSlogan);

    }


}
