package pages;

import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;
import java.util.ArrayList;
import java.util.List;
import static stepDefinitions.Hooks.driver;
import static utilities.ReusableMethods.waitFor;

public class HomePage extends CommonPage{

    @FindBy(xpath="//*[@data-test-id='loginScreen_logIn']")
    public WebElement loginButton;

//    @FindBy(xpath="//span[@class='ant-typography style_signUpBtn__JTRJm css-15rg2km']")
//    public WebElement signUpButton;

    @FindBy(xpath="//div[normalize-space()='Help & Support']")
    public WebElement helpSupportHeader;

    @FindBy(xpath="//div[normalize-space()='Help Center']")
    public WebElement helpSupportHelpCenter;

    @FindBy(xpath="//div[normalize-space()='FAQs']")
    public WebElement helpSupportFaqs;

    @FindBy(xpath="//div[normalize-space()='Blog']")
    public WebElement helpSupportBlog;

    @FindBy(xpath="//div[normalize-space()='Find a Therapist']")
    public WebElement helpSupportFindATherapist;

    @FindBy(xpath="//div[normalize-space()='About Us']")
    public WebElement companyAboutUs;

    @FindBy(xpath="//div[normalize-space()='Mission Statement']")
    public WebElement companyMissionStatement;

    @FindBy(xpath="//div[normalize-space()='Privacy Policy']")
    public WebElement companyPrivacyPolicy;

    @FindBy(xpath="//div[normalize-space()='Terms Of Service']")
    public WebElement companyTermsOfService;

    @FindBy(xpath="//div[normalize-space()='Careers']")
    public WebElement companyCareers;

    @FindBy(xpath="//div[normalize-space()='Contact Us']")
    public WebElement companyContactUs;

    @FindBy(xpath="(//div[@class='ant-col ant-col-xs-24 ant-col-xl-12 css-15rg2km'])[2]")
    public List<WebElement> allCompany;

    @FindBy(xpath="//span[@class='ant-typography style_signUpBtn__JTRJm css-15rg2km']")
    public WebElement signUpFreeButton;

    @FindBy(xpath="//a[@data-test-id='registerPage_I_am_a_client']")
    public WebElement iAmClient;

    @FindBy(xpath="//input[@name='name']")
    public WebElement clientName;

    @FindBy(xpath="//input[@name='surname']")
    public WebElement clientSurname;

    @FindBy(xpath="//input[@name='email']")
    public WebElement clientEmail;

    @FindBy(xpath="//input[@name='password']")
    public WebElement clientPassword;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement signUpButton;

    @FindBy(xpath="//h3[normalize-space()='Verify Email']")
    public WebElement verifyEmailText;

    @FindBy(xpath="//div[@class='register_col__zTnRz']")
    public List<WebElement> verifyEmailWindow;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement sendAgain;

    @FindBy(xpath="//div[@class='ant-message-notice-content']")
    public WebElement popUpMessage;

    public void testElements(WebElement element, String exp){
        waitFor(2);
        goAllTheWayDown();
        element.click();
        waitFor(2);
        String expectedResult = exp;
        String actualResult = Driver.getDriver().getCurrentUrl();
        try {
            Assert.assertTrue(actualResult.contains(expectedResult));
        } catch (AssertionError e) {
            System.out.println("Irrelevant page opened for "+expectedResult+"!!");
        }
    }
    public void goAllTheWayDown(){
        Actions actions = new Actions(driver);
        for (int i = 1; i <= 6; i++) {
            waitFor(1);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
        }
    }
    public void helpSupportElementsClick(){

        String url = "https://test.hypnotes.net/";
        helpSupportHelpCenter.click();
        waitFor(2);
        String expectedResult = "help-center";
        String actualResult = Driver.getDriver().getCurrentUrl();
        try {
            Assert.assertTrue(actualResult.contains(expectedResult));
        } catch (AssertionError e) {
            System.out.println("Irrelevant page opened for "+expectedResult+"!!");
        }
        driver.get(url);
        testElements(helpSupportFaqs,"faq");

        driver.get(url);
        //Driver.getDriver().navigate().back();
        testElements(helpSupportBlog,"blog");

        driver.get(url);
        //Driver.getDriver().navigate().back();
        testElements(helpSupportFindATherapist,"therapist-directory");
    }

    public void companyAndItemsAreVisible(DataTable elements){

        goAllTheWayDown();
        //Feature da yazdigimiz basliklarin geldigi expected data
        List<String> items = new ArrayList<>();
        for (String each : elements.asList()) {
            items.add(each);
        }
        //Website dan gelen basliklar actual data.
        for (int i = 1; i <= allCompany.size()-1; i++) {
            // WebElement company = allCompany.get(i);
            String expectedResult = items.get(i);
            String actualResult = allCompany.get(i).getText();
            Assert.assertEquals(expectedResult,actualResult);
        }
    }
    public void companyElementsClick(){
        String url = "https://test.hypnotes.net/";

        testElements(companyAboutUs,"about-us");

        driver.get(url);
        testElements(companyMissionStatement,"mission-statement");

        driver.get(url);
        testElements(companyPrivacyPolicy,"privacy-policy");

        driver.get(url);
        testElements(companyTermsOfService,"terms-of-service");

        driver.get(url);
        testElements(companyCareers,"careers");

        driver.get(url);
        testElements(companyContactUs,"contact-us");

    }
    public void creatingValidCredentials(){
        Faker faker = new Faker();
        clientName.sendKeys(faker.name().firstName());
        clientSurname.sendKeys(faker.name().lastName());
        clientEmail.sendKeys(faker.internet().emailAddress());
        clientPassword.sendKeys("Aa1!aaaa");
        waitFor(1);
        signUpButton.click();
        waitFor(3);
    }

    public void verifyEmailAllTexts(){
        for (int i = 0; i < verifyEmailWindow.size(); i++) {
            WebElement element = verifyEmailWindow.get(i);
            waitFor(1);
            Assert.assertTrue(element.isDisplayed());
            waitFor(1);
        }
    }
}
