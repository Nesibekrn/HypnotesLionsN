package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.Hooks;
import utilities.Driver;

import java.util.List;

public class HomePage extends CommonPage {
    Hooks hooks = new Hooks();
    WebDriver driver = null;

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@data-test-id='loginScreen_logIn']")
    public WebElement loginButton;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div[1]/div[1]")
    public WebElement ourPlatform;//09
    @FindBy(xpath = "//div[text()='Product Demo']")
    public WebElement productDemo;//09
    @FindBy(xpath = "//div[@href='/how-it-works']")
    public WebElement hynotesWork;//09
    @FindBy(xpath = "//div[@href='/pricing']")
    public WebElement pricing;//09
    @FindBy(xpath = "//div[text()='HIPAA Compliance']")
    public WebElement hipaaCompliance;//09

    @FindBy(xpath = "//div[text()='Secure Login, Account Verification & Data Storage']")
    public WebElement secureLogin;//09
    @FindBy(xpath = "//div[text()='Reviews/Testimonials']")
    public WebElement reviewsTestimonials;//09
    @FindBy(xpath = "//div[text()='Get Started For Free']")
    public WebElement getStarted;//09


    @FindBy(xpath = "//div[text()='Calendar']")
    public WebElement calendar;

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


    // @FindBy(xpath = "//span[text()='Pricing']")
    // public WebElement pricing07;

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
@FindBy(xpath = "//a[text()='Get Started Now']")
public List<WebElement> listPricingGetStartedNow07;
}
