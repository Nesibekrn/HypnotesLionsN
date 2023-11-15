package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ServicesPage extends CommonPage {

    @FindBy(xpath = "//a[contains(text(),'Services')]")
    public WebElement serviceButton;

    @FindBy(xpath = "//span[contains(text(),'Packages')]")
    public WebElement PackagesButton;

    @FindBy(xpath = "//span[contains(text(),'Add New Package')]")
    public WebElement AddNewPackagesButton;

    @FindBy(xpath = "//div[contains(text(),'Adding Package')]")
    public WebElement AddingNewPackageForm;

    @FindBy(xpath = "//textarea[@placeholder='Please enter Form Name']")
    public WebElement InputPackageName;


    @FindBy(xpath = "//div[text()='Please enter Form Name']")
    public WebElement warningMessageForPackageName;


    @FindBy(xpath = "//span[@title='Standard (Online or in-person)']")
    public WebElement StandardOnlineOrInPerson;

    @FindBy(xpath = "//div[@title='Phone Consultation']")
    public WebElement phoneConsultation;


    @FindBy(id="price")
    public WebElement PriceUSD;

    @FindBy(id= "duration")
    public WebElement InputDuration;

    @FindBy(xpath="(//input[@class='ant-input-number-input'])[2]")
    public WebElement BufferTimeBeforeAppointment;

    @FindBy(xpath="(//input[@class='ant-input-number-input'])[3]")
    public WebElement BufferTimeAftereAppointment;

    @FindBy(id="bufferTime")
    public WebElement AdvanceNoticeService;

    @FindBy(xpath="((//div[@class='ant-input-number-handler-wrap'])[4]/span)[1]")
    public WebElement upArrow;

    @FindBy(xpath="((//div[@class='ant-input-number-handler-wrap'])[4]/span)[2]")
    public WebElement downArrow;

    @FindBy(xpath="//button[@data-test-id='price_switch_packageForm']")
    public WebElement switchButtonForShowService;


    @FindBy(xpath="//button[@data-test-id='paymentRequired_switch_packageForm']")
    public WebElement switchButtonForPaymentReqiured;


    @FindBy(xpath="//button[@data-test-id='serviceActive_switch_packageForm']")
    public WebElement switchButtonForServiceActive;

    @FindBy(xpath="//span[contains(text(),'Please Select Document')]")
    public WebElement RequiredFormsandeSignDocuments;

    @FindBy(xpath="//span[contains(text(),'Would you like this service to be provided online?')]")
    public WebElement Wouldyoulikethisservicetobeprovidedonline;



    @FindBy(id="totalSessions")
    public WebElement totalSessions;

    @FindBy(id="sessionInterval")
    public WebElement sessionInterval;

    @FindBy(id="description")
    public WebElement description;

    @FindBy(xpath="//span[contains(text(),'Save')]")
    public WebElement saveButton;

    @FindBy(xpath="//span[contains(text(),'Cancel')]")
    public WebElement cncelButton;
    @FindBy(xpath="//div[@class='ant-form-item-explain-error']")
    public List<WebElement> warningMessageList;

    public List<WebElement> inputFieldsList=List.of(InputPackageName,PriceUSD,InputDuration,BufferTimeBeforeAppointment,BufferTimeAftereAppointment,AdvanceNoticeService,totalSessions,sessionInterval,description);


}
