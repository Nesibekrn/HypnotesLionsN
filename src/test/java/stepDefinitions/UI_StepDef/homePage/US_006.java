package stepDefinitions.UI_StepDef.homePage;

import enums.COLOR;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import utilities.ConfigurationReader;
import utilities.JS_utilities;
import utilities.ReusableMethods;

import java.util.List;

import static stepDefinitions.Hooks.commonPage;
import static stepDefinitions.Hooks.driver;
import static utilities.ReusableMethods.waitFor;

public class US_006 {

    @Given("user goes to home page")
    public void user_goes_to_home_page() {
        driver.get(ConfigurationReader.getProperty("url"));

    }

    @Then("assert first header color should be white")
    public void assert_first_header_color_should_be_white() {
        // for return type ==> ctrl-alt -v ()
        String actuelTextColor = commonPage.getHomePage().listHeader.get(0).getCssValue("color");
        String expectedTextColor = "rgba(255, 255, 255, 1)";
        Assert.assertEquals(expectedTextColor, actuelTextColor);
        //2nd Way enum
        COLOR.WHITE_TEXT.assertTextColor(commonPage.getHomePage().listHeader.get(0));
        //3. Way extention
       commonPage.getHomePage().listHeader.get(0).assertTextColor(COLOR.WHITE_TEXT.getRGBA());



    }

    @Then("assert first header background color is green")
    public void assert_first_header_backround_color_is_green() {
        // enum
        COLOR.TEXT_GREEN_BACKROUND.assertBackroundColor(commonPage.getHomePage().listHeader.get(0));
        //2. way ==> extention class
       commonPage.getHomePage().listHeader.get(0).assertBackroundColor(COLOR.TEXT_GREEN_BACKROUND.getRGBA());

    }

    @And("assert {string} title is visible")
    public void assertTitleIsVisible(String title) {
        String str = commonPage.getHomePage().listTitles.get(0).getText();
        Assert.assertTrue(str.contains(title));


    }

    @When("user scroll to second header")
    public void user_scroll_to_second_header() {
        JS_utilities.scrollIntoViewJS(commonPage.getHomePage().listHeader.get(0));
        ReusableMethods.waitForVisibility(commonPage.getHomePage().listHeader.get(1), 10);
        waitFor(2);
      commonPage.getHomePage().listHeader.get(1).hoverWebElement();

        //actions.moveToElement(commonPage.getHomePage().listHeader.get(1)).build().perform();

        waitFor(2);


    }


    @Then("assert first header color should be black")
    public void assert_first_header_color_should_be_black() {
        COLOR.BlACK_TEXT.assertTextColor(commonPage.getHomePage().listHeader.get(0));


    }

    @Then("assert first header background color should be grey")
    public void assert_first_header_backround_color_should_be_grey() {
        COLOR.TEXT_GRAY_BACKROUND.assertBackroundColor(commonPage.getHomePage().listHeader.get(0));

    }

    @Then("assert  second header color should be white")
    public void assertSecondHeaderColorShouldBeWhite() {
        COLOR.WHITE_TEXT.assertTextColor(commonPage.getHomePage().listHeader.get(1));


    }

    @And("assert second header background color is green")
    public void assertSecondHeaderBackgroundColorIsGreen() {
        COLOR.TEXT_GREEN_BACKROUND.assertBackroundColor(commonPage.getHomePage().listHeader.get(1));
    }


    @And("assert {string} title_two is visible")
    public void assertTitle_twoIsVisible(String title2) {
        String str = commonPage.getHomePage().listTitles.get(1).getText();
        assert str.contains(title2);
    }


    @When("user scroll to {int}. header")
    public void userScrollToHeader(int no) {
        JS_utilities.scrollIntoViewJS(commonPage.getHomePage().listHeader.get(no - 2));
        ReusableMethods.waitForVisibility(commonPage.getHomePage().listHeader.get(no - 1), 10);
        waitFor(2);
       commonPage.getHomePage().listHeader.get(no - 1).hoverWebElement();



        waitFor(2);


    }

    @Then("assert  {int}. header color should be white")
    public void assertHeaderColorShouldBeWhite(int no) {
        COLOR.WHITE_TEXT.assertTextColor(commonPage.getHomePage().listHeader.get(no - 1));

    }

    @And("assert {int}. header background color is green")
    public void assertHeaderBackgroundColorIsGreen(int no) {
        COLOR.TEXT_GREEN_BACKROUND.assertBackroundColor(commonPage.getHomePage().listHeader.get(no - 1));

    }


    @And("assert {string} title_{int} is visible")
    public void assertTitle_IsVisible(String title3, int no) {
        String str = commonPage.getHomePage().listTitles.get(no - 1).getText();
        assert str.contains(title3);
    }

    @And("assert image{int} is visible")
    public void assertImageIsVisible(int no) {
        assert commonPage.getHomePage().images.get(no - 1).isDisplayed();

    }

    @Then("assert headers are clickable")
    public void assertHeadersAreClickable() {
        List<WebElement> headers = commonPage.getHomePage().listHeader;

        for (int i = 0; i < headers.size(); i++) {
            String title_HomePage = driver.getTitle();
            waitFor(2);
            JS_utilities.clickElementByJS(commonPage.getHomePage().listHeader.get(i));
            waitFor(1);
            String title_secondWindows = driver.getTitle();
            assert !title_secondWindows.equalsIgnoreCase(title_HomePage);
            driver.navigate().back();
            waitFor(1);


        }
    }


}
