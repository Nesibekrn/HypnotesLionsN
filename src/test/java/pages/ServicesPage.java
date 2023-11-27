package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    public List<WebElement> listMeeting = List.of(StandardOnlineOrInPerson, phoneConsultation);

    @FindBy(id = "price")
    public WebElement PriceUSD;

    @FindBy(id = "duration")
    public WebElement InputDuration;
    @FindBy(xpath = "//div[@title='130']")
    public WebElement ddValueOfDuration;

    @FindBy(xpath = "//div[@id='duration_help']/div")
    public WebElement warningMessageForDuration;


    @FindBy(xpath = "(//input[@class='ant-input-number-input'])[2]")
    public WebElement BufferTimeBeforeAppointment;

    @FindBy(xpath = "(//input[@class='ant-input-number-input'])[3]")
    public WebElement BufferTimeAftereAppointment;

    @FindBy(id = "bufferTime")
    public WebElement AdvanceNoticeService;

    @FindBy(xpath = "((//div[@class='ant-input-number-handler-wrap'])[4]/span)[1]")
    public WebElement upArrow;

    @FindBy(xpath = "((//div[@class='ant-input-number-handler-wrap'])[4]/span)[2]")
    public WebElement downArrow;

    @FindBy(xpath = "//button[@data-test-id='price_switch_packageForm']")
    public WebElement switchButtonForShowService;


    @FindBy(xpath = "//button[@data-test-id='paymentRequired_switch_packageForm']")
    public WebElement switchButtonForPaymentReqiured;


    @FindBy(xpath = "//button[@data-test-id='serviceActive_switch_packageForm']")
    public WebElement switchButtonForServiceActive;

    @FindBy(xpath = "//div[@class='ant-select ant-select-in-form-item ant-select-status-success css-aqx16b ant-select-multiple ant-select-allow-clear ant-select-show-arrow ant-select-show-search']")
    public WebElement RequiredFormsandeSignDocuments;


    @FindBy(xpath = "//div[@class='ant-select-item ant-select-item-option ant-select-item-option-active']/div")
    public WebElement pdfFile;

    @FindBy(xpath = " (//span[@class='ant-select-selection-item'])[3]")
    public WebElement selectedPdfField;


    @FindBy(xpath = "//span[contains(text(),'Would you like this service to be provided online?')]")
    public WebElement Wouldyoulikethisservicetobeprovidedonline;


    @FindBy(xpath = "//input[@id='online']")
    public WebElement checkBoxOfserviceProvide;

    @FindBy(id = "totalSessions")
    public WebElement totalSessions;

    @FindBy(xpath = "((//div[@class='ant-input-number-handler-wrap'])[5]/span)[1]")
    public WebElement upArrowTotalSession;

    @FindBy(xpath = "((//div[@class='ant-input-number-handler-wrap'])[5]/span)[2]")
    public WebElement downArrowTotalSession;

    @FindBy(id = "sessionInterval")
    public WebElement sessionInterval;

    @FindBy(xpath = "((//div[@class='ant-input-number-handler-wrap'])[6]/span)[1]")
    public WebElement upArrowSessionInterval;

    @FindBy(xpath = "((//div[@class='ant-input-number-handler-wrap'])[6]/span)[2]")
    public WebElement downArrowSessionInterval;

    @FindBy(id = "description")
    public WebElement description;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    public WebElement saveButton;


    @FindBy(xpath = "//span[contains(text(),'Package has been added')]")
    public WebElement savePackageMessage;

    @FindBy(xpath = "//div[@data-test-id='services_title']")
    public List<WebElement> createdPackageInTable;


    @FindBy(xpath = "//span[contains(text(),'Cancel')]")
    public WebElement cancelButton;
    @FindBy(xpath = "(//span[@class='ant-divider-inner-text'])[2]")
    public WebElement returnAvailablePackage;

    @FindBy(xpath = "//span[text()='zeynep3 already in use!']")
    public WebElement warningMessageForExistingName;

    @FindBy(xpath = "//div[@class='ant-form-item-explain-error']")
    public List<WebElement> warningMessageList;

    public List<WebElement> inputFieldsList = List.of(InputPackageName, PriceUSD, InputDuration, BufferTimeBeforeAppointment, BufferTimeAftereAppointment, AdvanceNoticeService, totalSessions, sessionInterval, description);








    @FindBy(xpath = "//span[text()='Individual Sessions']")
    public WebElement IndividualSession;
    @FindBy(xpath = "//span[text()='Add New Individual Session']")
    public WebElement addNewIndividualSession;

    @FindBy(xpath = "//textarea[@data-test-id='new_individualForm_name']")
    public WebElement name;
    @FindBy(xpath = "(//div[@class='ant-select-selector'])[2]")
    public WebElement meetingType;

    @FindBy(xpath = "(//div [@class='ant-form-item-control-input-content']/div)[2]")
    public WebElement priceColor;

    @FindBy(xpath = "(//div[@class='ant-select-selector'])[3]")
    public WebElement duration;
    @FindBy(xpath = "(//div[@class='ant-select-item-option-content'])[4]")
    public WebElement duration45;
    @FindBy(xpath = "//button[@data-test-id='price_switch_individualForm']")
    public WebElement buttonGreen;
    @FindBy(xpath = "(//div [@class='ant-form-item-control-input-content']/div)[4]")
    public WebElement bufferTimebefore;
    @FindBy(xpath = "(//div [@class='ant-form-item-control-input-content']/div)[5]")
    public WebElement bufferTimeAfter;
    @FindBy(xpath = "((//div [@class='ant-form-item-control-input-content']/div)[6]/div/div)[1]")
    public WebElement advanceNotice;
    @FindBy(xpath = "//input [@id='bufferTime']")
    public WebElement buffertime;
    @FindBy(xpath = "(//span[@class='ant-input-number-handler ant-input-number-handler-up'])[4]")
    public WebElement advancenoticeUp;
    @FindBy(xpath = "//button[@data-test-id='paymentRequired_switch_individualForm']")
    public WebElement paimentrequiredButton;
    @FindBy(xpath = "//button[@data-test-id='serviceActive_switch_individualForm']")
    public WebElement servisActiveButton;

    @FindBy(xpath = "//body[@id='tinymce']/p")
    public WebElement TermsConditions;
    @FindBy(xpath = "//span[text()='Individual Session has been added']")
    public WebElement messageSucces;
    @FindBy(xpath = "//div[@data-test-id='services_title']")
    public List<WebElement> namelist;



    @FindBy(xpath = "//a[normalize-space()='Services']")
    public WebElement servicesButton;

    @FindBy(xpath = "//span[normalize-space()='Group Session']")
    public WebElement groupSessionButton;

    @FindBy(xpath = "(//div[contains(text(), 'Regular')])[2]")
    public WebElement regularButton;

    @FindBy(xpath = "//span[normalize-space()='Add New Group Session']")
    public WebElement addNewGroupSessionButton;

    @FindBy(xpath = "//textarea[@id='title']")
    public WebElement inputFormName;

    @FindBy(xpath = "//input[@id='price']")
    public WebElement inputPrice;

    @FindBy(xpath = "//input[@id='duration']")
    public WebElement inputDuration;

    @FindBy(xpath = "(//div[@class = 'ant-select-item ant-select-item-option'])[5]")
    public WebElement clickDurationTime;

    @FindBy(xpath = "//button[@id='showPrice']")
    public WebElement showPriceSwitch;

    @FindBy(xpath = "//button[@id='paymentRequired']")
    public WebElement paymentRequiredSwitch;

    @FindBy(xpath = "//button[@data-test-id='serviceActive_switch_sessionForm']")
    public WebElement serviceActiveSwitch;

    @FindBy(xpath = "//span[normalize-space()='Please Select Document']")
    public WebElement pleaseSelectDocument;

    @FindBy(xpath = "//div[@data-test-id='please_select_document_sessionForm']")
    public WebElement selectDocumentSessionForm;

    @FindBy(xpath = "(//div[contains(text(), 'download.pdf')])[1]")
    public WebElement selectDownloadFile;

    @FindBy(xpath = "//span[@title='download.pdf']")
    public WebElement verifySelectDownloadFile;

    @FindBy(xpath = "//span[normalize-space()='Would you like this service to be provided online?']")
    public WebElement providedOnlineTitle;

    @FindBy(xpath = "//input[@id='online']")
    public WebElement checkboxOnline;

    @FindBy(xpath = "//input[@id='attendeeLimit']")
    public WebElement inputAttendeeLimitButton;

    @FindBy(xpath = "//input[@id='sessionDate']")
    public WebElement selectSessionDate;

    @FindBy(xpath = "//input[@id='sessionTime']")
    public WebElement inputSessionTime;

    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement inputDescriptionButton;

    @FindBy(xpath = "//div[@data-test-id='services_title']")
    public WebElement groupSessionServicesTitle;

    @FindBy(xpath = "//div[@class='ant-drawer-title']")
    public WebElement addingGroupSessionTitle;

    @FindBy(xpath = "//button[@data-test-id='settings/locations/editLocationButton']")
    public WebElement editButtonInGroupSession;

    @FindBy(xpath = "//span[normalize-space()='Available Group Session']")
    public WebElement availableGroupSessionButton;

    @FindBy(xpath = "//button[@data-test-id='price_switch_sessionForm']")
    public WebElement priceSwitchButton;

    @FindBy(xpath = "//button[@data-test-id='paymentRequired_switch_sessionForm']")
    public WebElement paymentRequiredSwitchButton;

    @FindBy(xpath = "//button[@data-test-id='serviceActive_switch_packageForm']")
    public WebElement serviceActiveSwitchButton;

    @FindBy(xpath = "//div[@class='ant-message-notice-content']")
    public WebElement groupSessionHasBeenAddedMessage;

    @FindBy(xpath = "//span[normalize-space()='Select Location']")
    public WebElement selectLocationButton;

    @FindBy(xpath = "//input[@id='locationInfos']")
    public WebElement selectLocationButton2;

    @FindBy(xpath = "(//span[@class='ant-select-arrow'])[2]")
    public WebElement selectLocationSelectArrow;

    @FindBy(xpath = "(//span[@aria-label='Increase Value'])[2]")
    public WebElement maximumNumberOfAttendeesIncreaseArrow;

    @FindBy(xpath = "(//span[@aria-label='Decrease Value'])[2]")
    public WebElement maximumNumberOfAttendeesDecreaseArrow;

    @FindBy(xpath = "//div[@title='Home']")
    public WebElement sessionLocationFirstLocation;

    @FindBy(xpath = "//span[@title='Home']")
    public WebElement verifySessionLocationFirstLocation;

    @FindBy(xpath = "//a[normalize-space()='Today']")
    public WebElement dateSectionTodayButton;

    @FindBy(xpath = "//div[@class='rc-time-picker-panel-inner']//div[1]//ul[1]//li[9]")
    public WebElement hoursForSelectTimeSection;

    @FindBy(xpath = "(//li[@role='button'][normalize-space()='03'])[2]")
    public WebElement minutesForSelectTimeSection;

    @FindBy(xpath = "//li[normalize-space()='PM']")
    public WebElement pmSelectTimeSection;

    public List<WebElement> groupSessionFormInputList=List.of(inputFormName,inputPrice,inputDuration);

    @FindBy(xpath="//div[@data-test-id='services_title']")
    public List<WebElement> availableGroupSessionTitle;

 main
}
