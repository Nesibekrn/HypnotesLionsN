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
    @FindBy(xpath = "//div[text()='Help & Support']")
    public WebElement helpAndSupport;



}
