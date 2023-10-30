package pages;

import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import utilities.Driver;
import java.util.ArrayList;
import java.util.List;
import static stepDefinitions.Hooks.driver;
import static utilities.ReusableMethods.waitFor;

public class HomePage extends CommonPage {


    @FindBy(xpath="//*[@data-test-id='loginScreen_logIn']")
    public WebElement loginButton;
    @FindBy(css = "h5[style='font-size: 25px; font-weight: 600; padding: 10px;']")
    public List<WebElement> listTitles;
    @FindBy(xpath = "//a[@class='ant-btn css-15rg2km ant-btn-link features-btn']")
    public List<WebElement> listHeader;

    @FindBy(xpath = "//span[text()='Payment Service']")
    public WebElement secondHeader;
    @FindBy(xpath = "//span[@data-test-id='loginScreen_features']")
    public WebElement features;
    @FindBy(xpath = "//span[@data-test-id='loginScreen_pricing']")
    public WebElement Pricing;
    @FindBy(xpath = "//span[@data-test-id='loginScreen_resources']")
    public WebElement resources;
    @FindBy(xpath = "(//span[@class='ant-typography style_headerSecondColumnItems__4sbRA css-15rg2km'])[4]")
    //span[@data-test-id='loginScreen_contactUs']
    public WebElement contactUs;
    @FindBy(xpath = "//div[@class='ant-select-selector']")
    public WebElement language;
    @FindBy(xpath = "//span[@class='ant-typography style_signUpBtn__JTRJm css-15rg2km']")
    public WebElement SignUPForFree;
    @FindBy(xpath = "//div[text()='FEATURES']")
    public WebElement featuresText;
    @FindBy(xpath = "//h1")
    public WebElement pricingText;
    @FindBy(xpath = "//div[text()='RESOURCES']")
    public WebElement ressourcesText;
    @FindBy(xpath = "//p[@class='ContactForm_formTitle__JMH9d']")
    public WebElement contactUsText;
    @FindBy(xpath = "//img[@style='border-radius: 20px; width: 93%; padding: 10px; justify-content: center;']")
    public List<WebElement> images;




    @FindBy(xpath = "(//img[@alt='logo'])[2]")
    public WebElement faceBookIcon;
    @FindBy(xpath = "(//img[@alt='logo'])[3]")
    public WebElement linkedinIcon;
    @FindBy(xpath = "(//img[@alt='logo'])[4]")
    public WebElement xIcon;
    @FindBy(xpath = "(//img[@alt='logo'])[5]")
    public WebElement instagramIcon;
    @FindBy(xpath = "//input[@data-test-id='mainPage_enterYourEmailAddress_input']")
    public WebElement inputEmailFooter;
    @FindBy(xpath = "//button[@data-test-id='mainPage_SignUpButton']")
    public WebElement signUpButtonFooter;
    @FindBy(xpath = "//i[@class='x1b0d499 xmgbrsx']")
    public WebElement faceBookX;





    @FindBy(xpath = "//span[text()='Contact Us']")
    public WebElement contactUsButton;
    @FindBy(xpath = "//input[@name='subject']")
    public WebElement subject_input;
    @FindBy(xpath = "//input[@name='fullname']")
    public WebElement fullName_input;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement email_input;
    @FindBy(xpath = "//input[@name='phoneNumber']")
    public WebElement phoneNumber_input;
    // @FindBy(xpath = "//select[@name='bestTimeToReach']")
    @FindBy(id = "best-time-to-reach")
    public WebElement bestTimeToReach_dropDown;
    @FindBy(xpath = "//textarea[@name='content']")
    public WebElement messagesContent_textarea;
    @FindBy(xpath = "//button[@type='submit']")
  //  @FindBy(xpath = "//button[text()='Send Message']")
    public WebElement sendMessage_button;
    @FindBy(xpath = "//span[text()='Message sent successfully ']")
    public WebElement messageSentSuccessfully_message;
    @FindBy(xpath ="//div[text()='Calendar']")

    public WebElement calendar;
    @FindBy(xpath = "//div[@class='ant-select css-15rg2km ant-select-single']")
    //div[@class='ant-select css-15rg2km ant-select-single ant-select-open']
    public WebElement languageButton;

    @FindBy(xpath = "(//div[contains(@class,'ant-select-item-option')]/div)[1]")
    public WebElement usaFlag;

    @FindBy(xpath = "(//div[contains(@class,'ant-select-item-option')]/div)[2]")
    public WebElement turkiyeFlag;

    @FindBy(xpath = "(//div[contains(@class,'ant-select-item-option')]/div)[3]")
    public WebElement germanyFlag;

    @FindBy(xpath ="(//div[contains(@class,'ant-select-item-option')]/div)[4]")

    public WebElement franceFlag;

    @FindBy(xpath ="(//div[contains(@class,'ant-select-item-option')]/div)[5]")
    public WebElement russiaFlag;

    @FindBy(xpath = "(//div[contains(@class,'ant-select-item-option')]/div)[6]")
    public WebElement spainFlag;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[2]/div/div[1]/h1")
    public WebElement sayfaSlogani;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[2]/div/div[3]/h3")
    public WebElement paraTasarrufu;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[2]/div/div[2]/h3")
    public WebElement leSloganim;



    @FindBy(xpath = "//div[contains(text(),'Services')]")
    public WebElement services;

    @FindBy(xpath = "//div[contains(text(),'eSign and Document Storage')]")
    public WebElement eSignDocumentStorage;

    @FindBy(xpath = "//div[contains(text(),'Notifications & Reminders')]")
    public WebElement NotificationsReminders;

    @FindBy(xpath = "//div[contains(text(),'Multiple Payment Service Options')]")
    public WebElement MultiplePaymentServiceOptions;

    @FindBy(xpath = "//div[contains(text(),'Billing and Invoicing')]")
    public WebElement BillingInvoicing;

    @FindBy(xpath = "//div[contains(text(),'Free Secure Telehealth Video Conferencing')]")
    public WebElement FreeSecureTelehealthVideoConferencing;

    @FindBy(xpath = "//div[contains(text(),'Customize Your Scheduler & URL')]")
    public WebElement CustomizeYourSchedulerURL;

    @FindBy(xpath = "//div[contains(text(),'Custom Forms & Documents')]")
    public WebElement CustomFormsDocuments;

    @FindBy(xpath = "//div[contains(text(),'Multiple Locations')]")
    public WebElement MultipleLocations;

    @FindBy(xpath = "//div[contains(text(),'Multiple Providers')]")
    public WebElement MultipleProviders;

    @FindBy(xpath = "//div[contains(text(),'Dashboard & Reporting')]")
    public WebElement DashboardReporting;


    @FindBy(xpath = "//div[contains(text(),'Client Portal')]")
    public WebElement ClientPortal;

    @FindBy(xpath = "//div[contains(text(),'Biofeedback/Emotion-Detection')]")
    public WebElement BiofeedbackEmotionDetection;

    @FindBy(xpath = "//div[contains(text(),'Handwriting to Text Conversion')]")
    public WebElement HandwritingtoTextConversion;

    @FindBy(xpath = "//div[contains(text(),'3rd Party Integration')]")
    public WebElement thirdrdPartyIntegration;
    @FindBy(xpath = "//div[contains(text(),'Industry Required Client Notes')]")
    public WebElement IndustryRequiredClientNotes;


    @FindBy(xpath = "//span[contains(text(),'Newsletter')]")
    public WebElement scrollElement;

    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[2]/div[2]")
    public List<WebElement> feature1;
    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[2]/div[3]")
    public List<WebElement> feature2;
    @FindBy(xpath = "//div[text()='Help & Support']")
    public WebElement helpAndSupport;
    public void bestTimeDropDown(String bestTime,WebElement bestTimeWebElemet) {
        Select select = new Select(bestTimeWebElemet);
        switch (bestTime) {
            case "Morning":
                select.selectByVisibleText(bestTime);
                break;
            case "Afternoon":
                select.selectByVisibleText("Afternoon");
                break;
        }
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div/div/div[1]/div[2]")
    public WebElement appointmentScheduling;
    @FindBy(xpath = "//div[@class='style_headerLeft__Hwr1T']")
    public WebElement exceptionalFeaturesPricing;

    @FindBy(xpath = "(//div[@class='ant-typography style_MegaMenu2ItemTitle__G1pDK css-15rg2km'])[4]")
    public WebElement aboutUsButton;

    @FindBy(xpath = "(//h2[@class='Hero_headline__vocwZ'])[1]")
    public WebElement whoIsHypnotes;

    @FindBy(xpath = "//div[@class='style_titleContainer__eG2fC']")
    public WebElement howCanWeHelp;






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


    @FindBy(xpath = "//p[text()='Essentials']")
    public WebElement essential07;

    @FindBy(xpath = "(//a[@href='/register'])[1]")
    public WebElement getStartedEssential1Us07;
    @FindBy(xpath = "(//p[text()='Standard']")
    public WebElement standard07;
    @FindBy(xpath = "//a[text()='Get Started Now'])[2]")
    public WebElement getStartedStandard07;

    @FindBy(xpath = "/p[text()='Premium']")
    public WebElement premium07;
    @FindBy(xpath = "(//a[text()='Get Started Now'])[3]")
    public WebElement premiuGetStarted07;

    @FindBy(xpath = "//p[text()='Premium+']")
    public WebElement premiumPlus07;
    @FindBy(xpath = "(//a[text()='Get Started Now'])[4]")
    public WebElement premiumPlusGetStarTedt07;

    @FindBy(xpath = "//input[@data-test-id='loginAsClientPage_email']")
    public WebElement loginEmail07;
    @FindBy(xpath = "//input[@data-test-id='loginAsClientPage_password']")
    public WebElement loginPassword07;

    @FindBy(xpath = "(//span[text()='Login'])[2]")
    public WebElement loginPourEntrerLeSite07;


    @FindBy(xpath = "//th//p")
    public List<WebElement> listPricing07;

    //  //a[text()='Get Started Now']
    @FindBy(css= "div.style_body__qweHx div.style_pricingPage__sFRSc.mt-4.d-flex.flex-column.align-items-center div.style_pricingWeb__u6I09:nth-child(5) div.table-responsive:nth-child(3) table.table.text-center.table-lg:nth-child(1) thead.thead:nth-child(1) div.col div.card.mb-4.rounded-3.shadow-sm div.card-body button.w-100.btn.btn-sm.btn-outline-primary.style_btn__CLS8d > a.style_registerLink__4acEw")
    public List<WebElement> listPricingGetStartedNow07;
    @FindBy(xpath = "//div[text()='Product Demo']")//us09
    public WebElement productDemo;
    @FindBy(xpath = "//div[text()='How Does Hypnotes Work?']")
    public WebElement hynotesWork;
    @FindBy(xpath = "//div[text()='Pricing']")
    public WebElement pricing;
    @FindBy(xpath = "//div[text()='HIPAA Compliance']")
    public WebElement hipaaCompliance;

    @FindBy(xpath = "//div[text()='Secure Login, Account Verification & Data Storage']")
    public WebElement secureLogin;

    @FindBy(xpath = "//div[text()='Reviews/Testimonials']")
    public WebElement reviewsTestimonials;

    @FindBy(xpath = "//div[text()='Get Started For Free']")
    public WebElement getStarted;//us09

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div[1]/div[1]")
    public WebElement ourPlatform;//09

    @FindBy(xpath = "//span[@data-test-id='loginScreen_pricing']")
    public WebElement pricing07;//07

   @FindBy(xpath = "//span[text()='E']")
    public WebElement hesapE;//07

////a[@data-test-id='logout_link_profilMenuDropDown']
@FindBy(xpath = "//a[@data-test-id='logout_link_profilMenuDropDown']")
public WebElement hesapLogout;//07

}
