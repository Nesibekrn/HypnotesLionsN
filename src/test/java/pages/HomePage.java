package pages;

import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends CommonPage {
    @FindBy(xpath = "//*[@data-test-id='loginScreen_logIn']")
    public WebElement loginButton;

    @FindBy(xpath = "//img[@data-test-id='facebookLink_footerLogo']")
    public WebElement facebookIcon;

    @FindBy(xpath= "//img[@data-test-id='linkedinLink_footerLogo']")
    public WebElement linkedinIcon;

    @FindBy(xpath = "//img[@data-test-id='twitterLink_footerLogo']")
    public WebElement twitterIcon;

    @FindBy(xpath = "//img[@data-test-id='instagramLink_footerLogo']")
    public WebElement instagramIcon;

    @FindBy(xpath = "//*[text()='Real People, Real Feedback']")
    public WebElement testimonialsSectionText;

    @FindBy(xpath = "//h5[.='%s']/..//a")
    public WebElement allHypnoTherapyst;

    @FindBy(css = "div.swiper-button-next")
    public  WebElement nextButton;

    @FindBy(xpath = "//div[@class='swiper-button-prev']")
    public  WebElement prevButton;

    @FindBy(css = "span.swiper-pagination-bullet")
    public List<WebElement> bulletPoints;

    @FindBy(css = "h5[style='font-size: 25px; font-weight: 600; padding: 10px;']")
    public List<WebElement> listTitles;

    @FindBy(xpath = "//a[@class='ant-btn css-15rg2km ant-btn-link features-btn']")
    public List<WebElement> listHeader;

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

}
