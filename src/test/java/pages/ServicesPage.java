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

    public List<WebElement> listMeeting=List.of(StandardOnlineOrInPerson,phoneConsultation);

    @FindBy(id="price")
    public WebElement PriceUSD;

    @FindBy(id= "duration")
    public WebElement InputDuration;
    @FindBy(xpath="//div[@title='130']")
    public WebElement ddValueOfDuration;

    @FindBy(xpath="//div[@id='duration_help']/div")
    public WebElement warningMessageForDuration;


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

    @FindBy(xpath="//div[@class='ant-select ant-select-in-form-item ant-select-status-success css-aqx16b ant-select-multiple ant-select-allow-clear ant-select-show-arrow ant-select-show-search']")
    public WebElement RequiredFormsandeSignDocuments;


    @FindBy(xpath="//div[@class='ant-select-item ant-select-item-option ant-select-item-option-active']/div")
    public WebElement pdfFile;

    @FindBy(xpath=" (//span[@class='ant-select-selection-item'])[3]")
    public WebElement selectedPdfField;


    @FindBy(xpath="//span[contains(text(),'Would you like this service to be provided online?')]")
    public WebElement Wouldyoulikethisservicetobeprovidedonline;


    @FindBy(xpath="//input[@id='online']")
    public WebElement checkBoxOfserviceProvide;

    @FindBy(id="totalSessions")
    public WebElement totalSessions;

    @FindBy(xpath="((//div[@class='ant-input-number-handler-wrap'])[5]/span)[1]")
    public WebElement upArrowTotalSession;

    @FindBy(xpath="((//div[@class='ant-input-number-handler-wrap'])[5]/span)[2]")
    public WebElement downArrowTotalSession;

    @FindBy(id="sessionInterval")
    public WebElement sessionInterval;

    @FindBy(xpath="((//div[@class='ant-input-number-handler-wrap'])[6]/span)[1]")
    public WebElement upArrowSessionInterval;

    @FindBy(xpath="((//div[@class='ant-input-number-handler-wrap'])[6]/span)[2]")
    public WebElement downArrowSessionInterval;

    @FindBy(id="description")
    public WebElement description;

    @FindBy(xpath="//span[contains(text(),'Save')]")
    public WebElement saveButton;


    @FindBy(xpath="//span[contains(text(),'Package has been added')]")
    public WebElement savePackageMessage;

    @FindBy(xpath="//div[text()='steel1']")
    public WebElement createdPackageInTable;



    @FindBy(xpath="//span[contains(text(),'Cancel')]")
    public WebElement cancelButton;
    @FindBy(xpath="(//span[@class='ant-divider-inner-text'])[2]")
    public WebElement returnAvailablePackage;

    @FindBy(xpath="//span[text()='zeynep3 already in use!']")
    public WebElement warningMessageForExistingName;

    @FindBy(xpath="//div[@class='ant-form-item-explain-error']")
    public List<WebElement> warningMessageList;

    public List<WebElement> inputFieldsList=List.of(InputPackageName,PriceUSD,InputDuration,BufferTimeBeforeAppointment,BufferTimeAftereAppointment,AdvanceNoticeService,totalSessions,sessionInterval,description);


}
