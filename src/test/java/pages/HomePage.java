package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends CommonPage{
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
    @FindBy(xpath = "//span[@data-test-id='loginScreen_contactUs']")
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















    @FindBy(xpath ="//div[text()='Calendar']")
    public WebElement calendar;

    @FindBy(xpath ="//div[contains(text(),'Services')]")
    public WebElement services;

    @FindBy(xpath ="//div[contains(text(),'eSign and Document Storage')]")
    public WebElement eSignDocumentStorage;

    @FindBy(xpath ="//div[contains(text(),'Notifications & Reminders')]")
    public WebElement NotificationsReminders;

    @FindBy(xpath ="//div[contains(text(),'Multiple Payment Service Options')]")
    public WebElement MultiplePaymentServiceOptions;

    @FindBy(xpath ="//div[contains(text(),'Billing and Invoicing')]")
    public WebElement BillingInvoicing;

    @FindBy(xpath ="//div[contains(text(),'Free Secure Telehealth Video Conferencing')]")
    public WebElement FreeSecureTelehealthVideoConferencing;

    @FindBy(xpath ="//div[contains(text(),'Customize Your Scheduler & URL')]")
    public WebElement CustomizeYourSchedulerURL;

    @FindBy(xpath ="//div[contains(text(),'Custom Forms & Documents')]")
    public WebElement CustomFormsDocuments;

    @FindBy(xpath ="//div[contains(text(),'Multiple Locations')]")
    public WebElement MultipleLocations;

    @FindBy(xpath ="//div[contains(text(),'Multiple Providers')]")
    public WebElement MultipleProviders;

    @FindBy(xpath ="//div[contains(text(),'Dashboard & Reporting')]")
    public WebElement DashboardReporting;


    @FindBy(xpath ="//div[contains(text(),'Client Portal')]")
    public WebElement ClientPortal;

    @FindBy(xpath ="//div[contains(text(),'Biofeedback/Emotion-Detection')]")
    public WebElement BiofeedbackEmotionDetection;

    @FindBy(xpath ="//div[contains(text(),'Handwriting to Text Conversion')]")
    public WebElement HandwritingtoTextConversion;

    @FindBy(xpath ="//div[contains(text(),'3rd Party Integration')]")
    public WebElement thirdrdPartyIntegration;
    @FindBy(xpath ="//div[contains(text(),'Industry Required Client Notes')]")
    public WebElement IndustryRequiredClientNotes;


    @FindBy(xpath ="//span[contains(text(),'Newsletter')]")
    public WebElement scrollElement;

    @FindBy(xpath="//body/div[@id='__next']/div[1]/div[2]/div[2]")
    public List<WebElement> feature1;
    @FindBy(xpath="//body/div[@id='__next']/div[1]/div[2]/div[3]")
    public List<WebElement> feature2;



}
