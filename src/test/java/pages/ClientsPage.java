package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.*;

public class ClientsPage extends CommonPage {

    @FindBy(xpath = "//a[@href='/dashboard/clients']")
    public WebElement clients_button;

    @FindBy(xpath = "//span[text()='Import Client']")
    public WebElement importClientsButton;

    @FindBy(xpath = "//div[text()='Choose Import Method']")
    public WebElement chooseImportMethodWindow;

    @FindBy(xpath = "//span[contains(text(),'EasyPractice')]")
    public WebElement easyPracticeMethod;

    @FindBy(xpath = "//input[@class=\"custom-file-input\"]")
    public WebElement chooseFileForEasyPractice;

    @FindBy(xpath = "//span[text()='Upload']")
    public WebElement uploadButtonForEasyPractice;


    @FindBy(xpath = "//h5[contains(text(),\"Zeynep butterfly\")]")
    public WebElement importedClient;

    @FindBy(xpath = "//span[text()='Cancel']")
    public WebElement cancelPopUpButton;
    @FindBy(xpath = "//span[contains(text(),'View Details')]")
    public WebElement viewDetailsButton;

    @FindBy(xpath = "//span[@data-test-id='dashboard_clients_appointments']")
    public WebElement appointmentsButton;

    @FindBy(xpath = "//span[normalize-space()='Pending Appointments']")
    public WebElement pendingAppointmentsText;

    @FindBy(xpath = "//span[normalize-space()='Past Appointments']")
    public WebElement pastAppointmentsText;

    @FindBy(xpath = "(//span[@class='ant-table-column-title'])[1]")
    public WebElement pendingAppointmentsSortButton;

    @FindBy(xpath = "(//span[@class='ant-table-column-title'])[2]")
    public WebElement pastAppointmentsSortButton;

    @FindBy(xpath = "//span[@data-test-id='dashboard_clients_invoices']")
    public WebElement invoicesButton;

    @FindBy(xpath = "//input[@tabindex='-1']")
    public WebElement inputYourLogoButton;

    @FindBy(xpath = "//textarea[@placeholder='Your Company']")
    public WebElement inputYourCompanyButton;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement inputTherapistName;

    @FindBy(xpath = "//input[@placeholder='Company Address']")
    public WebElement inputCompanyAddress;

    @FindBy(xpath = "(//input[@placeholder='City,State,Zip'])[1]")
    public WebElement inputCityStateZip;

    @FindBy(xpath = "//select[@class='invoice_select__WnoPF   false']")
    public WebElement dropDownCountrySelect;

    @FindBy(xpath = "(//input[@class='invoice_input__75vJN  '])[1]")
    public WebElement dropDownCountryWithoutSelect;

    @FindBy(xpath = "//input[@value='Australia']")
    public WebElement selectCountry;

    @FindBy(xpath = "//input[@placeholder='Phone']")
    public WebElement inputPhone;
    @FindBy(xpath = "//span[text()='Cancel']")
    public WebElement cancelButtonForUpgradeNow;

    @FindBy(xpath = "//span[@data-test-id='dashboard_clients_sessions']")
    public WebElement sessionButon;
    @FindBy(xpath = "//span[text()='Delete Session']")
    public WebElement deleteSessionButton;
    @FindBy(xpath = "//div[@class='ant-popconfirm-buttons']")
    public WebElement yesNo_buttons;
    @FindBy(xpath = "//span[text()='Yes']")
    public WebElement yesButton;
    @FindBy(xpath = "//a[text()='Clients']")
    public WebElement clientsButton;
    @FindBy(xpath = "//span[text()='Session has been deleted']")
    public WebElement deletedPOPUPMessage;
    @FindBy(xpath = "//div[@class='ant-popconfirm-message-title']")
    public WebElement deletedMessage;
    @FindBy(xpath = "//span[text()='Add New Session']")
    public WebElement addNewSession;

    @FindBy(xpath = "//a[text()='Clients']")
    public WebElement clientSectionBtn;

    @FindBy(xpath = "//span[text()='Schedule an Appointment']")
    public List<WebElement> scheduleAnAppointment;

    @FindBy(xpath = "//a/h5")
    public List<WebElement> clientsNames;

    @FindBy(xpath = "//a/span[.='View Details']")
    public List<WebElement> viewDetailsBtns;

    @FindBy(xpath = "//span[text()='Client Info']")
    public List<WebElement> clientInfoSectionBtn;

    @FindBy(xpath = "//span[text()='Hypnotes Scheduler']")
    public WebElement hypnotesSchedulerSection;

    @FindBy(xpath = "//a[@href=\"/dashboard/clients/2749\"]")
    public WebElement firstClient;


    @FindBy(xpath = "//span[@data-test-id=\"dashboard_clients_invoices\"]")
    public WebElement invoices;


    @FindBy(xpath = "(//div[@class='view invoices_w60__nfXh_'])[1]")
    public WebElement invoiceNo;

    @FindBy(xpath = "(//div[@class='view invoices_w60__nfXh_'])[2]")
    public WebElement invoiceDate;


    @FindBy(xpath = "//*[@title='2023-11-21']")
    public WebElement invoiceDate1;

    @FindBy(xpath = "(//div[@class='view invoices_w60__nfXh_'])[3]")
    public WebElement dueDate;

    @FindBy(xpath = "//*[@title='2023-12-25']")
    public WebElement dueDate1;


    @FindBy(xpath = "//a[@href='/dashboard/add-client']")
    public WebElement addNewClient_button;
    @FindBy(xpath = "//input[@id='register_firstName']")
    public WebElement firstName_input;
    @FindBy(xpath = "//input[@id='register_middleName']")
    public WebElement middleName_input;
    @FindBy(xpath = "//input[@id='register_lastName']")
    public WebElement lastName_input;
    @FindBy(xpath = "//input[@id='register_email']")
    public WebElement email_input;
    @FindBy(xpath = "//input[@id='register_gender']")
    public WebElement gender_dropDown;
    @FindBy(css = "div.selected-flag")
    public WebElement phoneCode_dropDown;
    @FindBy(xpath = "//input[@class='form-control false']")
    public WebElement phone_input;
    @FindBy(xpath = "//input[@id='register_occupation']")
    public WebElement occupation_input;
    @FindBy(xpath = "//input[@id='register_zipCode']")
    public WebElement zipCode_input;
    @FindBy(xpath = "//input[@name='country']")
    public WebElement country_input;
    @FindBy(xpath = "//input[@name='state']")
    public WebElement state_input;
    @FindBy(xpath = "//input[@name='city']")
    public WebElement city_input;
    @FindBy(xpath = "//input[@id='register_address']")
    public WebElement address_input;
    @FindBy(xpath = "//input[@id='register_timezone']")
    public WebElement timezone_dropDown;
    @FindBy(xpath = "//input[@type='file']")
    public WebElement uploadProfileImage_input;
    @FindBy(xpath = "//button[@class='ant-btn css-aqx16b ant-btn-primary']")
    public WebElement save_button;
    @FindBy(xpath = "//a[@class='ant-btn css-aqx16b ant-btn-default ant-btn-dangerous']")
    public WebElement cancel_button;
    @FindBy(xpath = "//input[@class='ant-checkbox-input']")
    public WebElement showExtraFields_checkbox;
    @FindBy(xpath = "//div[@class='ant-form-item-explain-error']")
    public WebElement errorMessage;
    @FindBy(xpath = "//li[@class='country']")
    public List<WebElement> phoneFlag_Dropdown;
    @FindBy(xpath = "//li[@class='country']//span[contains(@class,'dial-code')]")
    public List<WebElement> phoneDialCode;
    @FindBy(css = "div.ant-select-item ant-select-item-option")
    public List<WebElement> countryList;
    @FindBy(xpath = "//div[text()='Session  1']")
    public WebElement sessionOne;
    @FindBy(xpath = "//div[text()='Session  2']")
    public WebElement sessionTwo;
    @FindBy(xpath = "(//div[@class='ant-tabs-nav-list'])[2]//div[@role='tab']")
    public List<WebElement> sessionHeadings;

    @FindBy(id = "record-icon1787")
    public WebElement microphone;
    @FindBy(xpath = "//span[text()='Stop Recording']")
    public WebElement stopRecording;
    @FindBy(xpath = "//audio[@class='react-audio-player ']")
    public List<WebElement> audioList;
    @FindBy(xpath = "//span[text()='Recording added.']")
    public WebElement messageRecordingAdd;




}
