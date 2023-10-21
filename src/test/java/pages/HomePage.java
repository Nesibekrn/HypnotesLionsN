package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonPage{
    @FindBy(xpath="//*[@data-test-id='loginScreen_logIn']")
    public WebElement loginButton;


    //Features sections locators in the footer
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


}
