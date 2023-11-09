package stepDefinitions.UI_StepDef.homePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

import static utilities.JS_utilities.scrollAndClickWithJS;

public class US_004 extends CommonPage {
    @Then("The user clicks the language button")
    public void the_user_clicks_the_language_button() {
        getHomePage().languageButton.click();
        ReusableMethods.waitFor(5);

    }
    @Then("If the user click USA flag language should be English")
    public void if_the_user_click_usa_flag_language_should_be_english() {
        scrollAndClickWithJS(getHomePage().usaFlag);
        String pageSlogan = "Hypnotes Does All The Things";
        Assert.assertEquals(getHomePage().sayfaSlogani.getText(),pageSlogan);



    }
    @Then("If the user click Turkiye flag language should be Turkish")
    public void if_the_user_click_turkiye_flag_language_should_be_turkish() {
        ReusableMethods.waitFor(3);
        scrollAndClickWithJS(getHomePage().turkiyeFlag);
        ReusableMethods.waitFor(1);
        String sayfaSloganim ="Para Tasarrufu";
        Assert.assertEquals(getHomePage().paraTasarrufu.getText(),sayfaSloganim);



    }
    @Then("If the user click Germany flag language should be German")
    public void if_the_user_click_germany_flag_language_should_be_german() {
        ReusableMethods.waitFor(2);
        scrollAndClickWithJS(getHomePage().germanyFlag);
        ReusableMethods.waitFor(2);
        String motto = "Hypnotes macht alles möglich";
        Assert.assertEquals(getHomePage().sayfaSlogani.getText(),motto);

    }
    @Then("If the user click France flag language should be French")
    public void if_the_user_click_france_flag_language_should_be_french() {
        ReusableMethods.waitFor(2);
        scrollAndClickWithJS(getHomePage().franceFlag);
        ReusableMethods.waitFor(2);
        String leSlogan="Hypnotes fait tout ce qu'il faut";
        Assert.assertEquals(getHomePage().sayfaSlogani.getText(),leSlogan);

    }

    @Then("If the user click Russia flag language should be Russian")
    public void if_the_user_click_russia_flag_language_should_be_russian() {
        ReusableMethods.waitFor(2);
        scrollAndClickWithJS(getHomePage().russiaFlag);
        ReusableMethods.waitFor(2);
        String russianSlogan = "Hypnotes делает все возможное";
        Assert.assertEquals(getHomePage().sayfaSlogani.getText(),russianSlogan);

    }
    @Then("If the user click Spain flag language should be Spanish")
    public void if_the_user_click_spain_flag_language_should_be_spanish() {
        ReusableMethods.waitFor(2);
        scrollAndClickWithJS(getHomePage().spainFlag);
        ReusableMethods.waitFor(2);
        String spanishSlogan = "Hypnotes hace de todo";
        Assert.assertEquals(getHomePage().sayfaSlogani.getText(),spanishSlogan);

    }



}
