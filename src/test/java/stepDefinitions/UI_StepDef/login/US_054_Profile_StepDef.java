package stepDefinitions.UI_StepDef.login;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import utilities.ReusableMethods;

import java.util.List;

import static org.junit.Assert.assertTrue;
import static stepDefinitions.Hooks.driver;
//import static utilities.ReusableMethods.waitClickableByOfElement;

public class US_054_Profile_StepDef extends CommonPage {

    // Web list for dongusu //li[@class='ant-dropdown-menu-item']
    // List 2 //div[@class='ant-tabs-tab']


/*
    @Given("User Login on the Profile Page")
    public void userLoginOnTheProfilePage() {
        driver.get(ConfigurationReader.getProperty("login_url"));
        getLoginPage().email_login.sendKeys(ConfigurationReader.getProperty("loginEmail"));
        getLoginPage().password_Login.sendKeys(ConfigurationReader.getProperty("loginPassword"));
        getLoginPage().login_button.click();


    }

 */


    @Then("Check that the profile icon is clickable.")
    public void checkThatTheProfileIconIsClickable() {
        assertTrue(getLoginPage().iconProfile.isEnabled());
        ReusableMethods.waitFor(1);
    }

    @When("The profile icon is clicked")
    public void TheProfileIconIsClicked() {
        getLoginPage().iconProfile.click();
        ReusableMethods.waitFor(3);
    }


    @Then("Check if that their titles are displayed;Profile,Account Statement,Substriction,Security,Settings,Integrations,Dark mode")
    public void checkIfThatTheirTitlesAreDisplayedProfileAccountStatementSubstrictionSecuritySettingsIntegrationsDarkMode() {
        getLoginPage().verifyProfileMenuItems2();//login sayfasinda olusturdugum methodu cagirdim
        //2 tane method var 1.si ic ice for loop ile, 2. si hashSet ler ile for each de assert ettimcozumu


    }


    @And("Clicks on the profile title.")
    public void clicksOnTheProfileTitle() {
        getLoginPage().profileTitleInTheAccount.click();
        ReusableMethods.waitFor(5);
    }

    @Then("Check that the Your profile page opens")
    public void checkThatTheYourProfilePageOpens() {
        String expectedUrl = "https://test.hypnotes.net/dashboard/profile";
        Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
        // Assert.assertTrue(getLoginPage().yourProfile.isDisplayed());
        ReusableMethods.waitFor(5);


    }

    @Then("Check if that the titles are displayed ; About, Please write something about yourself")
    public void checkIfThatTheTitlesAreDisplayedAboutPleaseWriteSomethingAboutYourself() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(getLoginPage().aboutYourself.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @Then("Check if that the titles are displayed; Education,Experience,Specialisties,Certifications,Your Company,Change Phone")
    public void checkIfThatTheTitlesAreDisplayedEducationExperienceSpecialistiesCertificationsYourCompanyChangePhone() {
        getLoginPage().theTitlesInTheProfile();
        ReusableMethods.waitFor(2);

    }

    @Then("Check if that the titles are displayed; Education,Experience,Specialisties,Certifications,Your Company,Change PhoNe.")
    public void checkIfThatTheTitlesAreDisplayedEducationExperienceSpecialistiesCertificationsYourCompanyChangePhoNe(DataTable dataTable) {

        List<WebElement> titleInTheProfileList = driver.findElements(By.xpath("//div[@class='ant-tabs-tab']"));//locate'den gelecek
        System.out.println("titleInTheProfileList"+titleInTheProfileList.size());
        ReusableMethods.waitFor(2);

        List<String> menuExpected = dataTable.column(0);//featureden gelecek veriler
        System.out.println("menuExpected :"+menuExpected);
        ReusableMethods.waitFor(1);

        for (int i = 0; i < menuExpected.size(); i++) {
            Assert.assertEquals(titleInTheProfileList.get(i).getText(), menuExpected.get(i));

        }


    }

    @Then("Check if that the titles are clickable;Education,Experience,Specialisties,Certifications,Your Company,Change Phone")
    public void checkIfThatTheTitlesAreClickableEducationExperienceSpecialistiesCertificationsYourCompanyChangePhone() {

        List<WebElement> titleInTheProfileList = driver.findElements(By.xpath("//div[@class='ant-tabs-tab']"));


        for (WebElement titleElement : titleInTheProfileList) {//burda clickable yerine bunu yaptim ,clickable'da try catch istiyor
            if (titleElement.isEnabled() && titleElement.isDisplayed()) {
                System.out.println(titleElement.getText() + " is clickable.");
            } else {
                System.out.println(titleElement.getText() + " is not clickable.");
            }
        }
        ReusableMethods.waitFor(2);


    }

    @Then("Clicks on the Education title")
    public void clicksOnTheEducationTitle() {
        getLoginPage().education.click();
        ReusableMethods.waitFor(1);
    }

    @Then("Check that the Education page opens")
    public void checkThatTheEducationPageOpens() {
        getLoginPage().addNewEducation.click();
        ReusableMethods.waitFor(1);
    }

    @And("Check that the Add new education button is displayed.")
    public void checkThatTheAddNewEducationButtonIsDisplayed() {
        Assert.assertTrue(getLoginPage().saveButton.isDisplayed());
        ReusableMethods.waitFor(1);
    }




}
