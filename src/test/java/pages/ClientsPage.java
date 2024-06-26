package pages;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.zh_cn.假如;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static utilities.ReusableMethods.waitFor;

public class ClientsPage extends CommonPage {

    @FindBy(xpath = "//a[@href='/dashboard/clients']")
    public WebElement clients_button;

    @FindBy(xpath = "//input[@data-test-id='loginAsClientPage_email']")
    public WebElement loginEmail07;
    @FindBy(xpath = "//input[@data-test-id='loginAsClientPage_password']")
    public WebElement loginPassword07;

    @FindBy(xpath = "(//span[text()='Login'])[2]")
    public WebElement loginPourEntrerLeSite07;
    @FindBy(xpath = "//input[@id='register_guardianEmail']")
    public WebElement guardienEmail;
    @FindBy(css = "div.selected-flag")
    public WebElement phoneCode_dropDown;
    @FindBy(xpath = "//li[@class='country']//span[contains(@class,'dial-code')]")
    public List<WebElement> phoneDialCode;
    @FindBy(xpath = "//li[@class='country']")
    public List<WebElement> phoneFlag_Dropdown;

    @FindBy(xpath = "//input[@id='register_guardianName']")
    public WebElement guardienName51;
    @FindBy(xpath = "//a[text()='Clients']")
    public WebElement dashboardClients51;

    @FindBy(xpath = "//span[text()='Add New Client']")
    public WebElement addNewClients51;
    @FindBy(xpath = "//input[@id='register_firstName']")
    public WebElement addFirstName51;
    @FindBy(xpath = "//input[@id='register_middleName']")
    public WebElement addMiddleName51;
    @FindBy(xpath = "//input[@id='register_lastName']")
    public WebElement lastName51;

    @FindBy(xpath = "//input[@id='register_email']")
    public WebElement addEmail51;

    @FindBy(xpath = "//h2[@class='ant-typography css-aqx16b']")
    public WebElement clientName51;

    @FindBy(xpath = "//div[text()='Male']")
    public WebElement addGenderMale51;
    @FindBy(xpath = "//input[@id='register_gender']")
    public WebElement addGender51;

    @FindBy(xpath = "//input[@id='register_zipCode']")
    public WebElement addZipCode51;

    @FindBy(xpath = "//input[@id='register_occupation']")
    public WebElement addOccupation51;

    @FindBy(xpath = "//input[@class='form-control false']")
    public WebElement phoneList51;

    @FindBy(xpath = "//input[@list='countryData']")
    public WebElement addCountry51;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement addState51;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement addCity51;

    @FindBy(xpath = "//*[@id='register_address']")
    public WebElement addAdress51;

    //@FindBy(xpath = "//input[@type='checkbox']")
    @FindBy(xpath = "//input[@class='ant-checkbox-input']")
    public WebElement addShowExtra51;
    @FindBy(xpath = "(//input[@class='form-control false'])[2]")
    public WebElement addEmergencyContacPhonet51;
    @FindBy(xpath = "//input[@id='register_emergencyContactRelationship']")
    public WebElement addRelationShip51;
    @FindBy(xpath = "//input[@id='register_doctorName']")
    public WebElement primaryDoctorName51;
    @FindBy(xpath = "//div[@class='selected-flag open']")
    public WebElement flagOpens51;

    @FindBy(xpath = "//input[@class='search-box']")
    public WebElement flagOpenSearch51;

    @FindBy(css = "div.selected_flag")
    public WebElement phoneCode51;
    @FindBy(xpath = "//li[@class='country']//span")
    public List<WebElement> phoneFlagUlkeler51;
    @FindBy(xpath = "(//span[@class='ant-select-selection-item'])[2]")
    public WebElement timeZone51;

    @FindBy(xpath = "//input[@id='register_guardianEmail']")
    public WebElement guardianEmail51;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement save51;

    // @FindBy(xpath ="//span[@class='ant-typography ant-typography-success css-aqx16b']" )
    //public WebElement viewDetailsButton;

    // @FindBy(xpath ="(//span[@class='ant-typography ant-typography-success css-aqx16b'])[1]")
    //public WebElement viewDetailsButton;

    @FindBy(xpath = "//span[@data-test-id='dashboard_clients_sessions']")
    public WebElement sessionsButton;

    @FindBy(xpath = "(//button[@class='ant-btn css-aqx16b ant-btn-primary'])[1]")
    public WebElement addNewSessionButton;


    @FindBy(xpath = "(//label[@style='color: rgb(0, 0, 0); font-size: 1.1rem; margin-top: 10px;'])[1]")
    public WebElement dateButton;

    @FindBy(xpath = "//label[@style='color: rgb(0, 0, 0); font-size: 1.1rem; margin-top: 20px; margin-bottom: 10px;']")
    public WebElement associatedIssues;


    @FindBy(xpath = "//label[normalize-space()='Key Points:']")
    public WebElement keyPoint;


    @FindBy(xpath = "//label[normalize-space()='After Thoughts:']")
    public WebElement afterThought;


    @FindBy(xpath = "//label[normalize-space()='Applications & Suggestions:']")
    public WebElement applicationsSuggestions;


    @FindBy(xpath = "//label[normalize-space()='Attachments:']")
    public WebElement attachments;


    @FindBy(xpath = "//label[normalize-space()='Voice Notes:']")
    public WebElement voiceNotes;

    @FindBy(xpath = "//span[normalize-space()='Add New Client']")
    public WebElement addNewClientButton;
    @FindBy(xpath = "//span[normalize-space()='Export Client']")
    public WebElement importClientButton;
    @FindBy(xpath = "//span[@data-test-id='dashboard_referAFriend_button']")
    public WebElement referAFriendButton;
    @FindBy(xpath = "//div[text()='Get 100% referral bonus *']")
    public WebElement referAFriendPageTitle;

    @FindBy(xpath = " //button[@class='ant-btn css-aqx16b ant-btn-default ant-btn-icon-only']")
    public WebElement copiedReferenceURL;

    @FindBy(xpath = "//div[@class='ant-message-notice ant-message-notice-success css-15rg2km']")
    public WebElement paymentURLMessage;

    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement input_email;
    @FindBy(xpath = "(//button[@class='ant-btn css-aqx16b ant-btn-primary'])[2]")
    public WebElement sendInvitationButton;
    @FindBy(xpath = "//div[@class='ant-message-custom-content ant-message-success']")
    public WebElement emailSentMessage;
    @FindBy(xpath = "//div[@data-test-id='start_meeting_button']")
    public WebElement startMeetingButton;

    @FindBy(xpath = "(//button[@class='ant-btn css-aqx16b ant-btn-circle ant-btn-primary ant-btn-lg ant-btn-icon-only'])[3]")
    public WebElement accountActivityButton;
    @FindBy(xpath = "//span[text()='Mark all as read']")
    public WebElement markAllRead;

    @FindBy(xpath = "//span[text()='See all Account Activity']")
    public WebElement seeAllAccountActivity;
    @FindBy(xpath = "//span[text()='Yes']")
    public WebElement confirmYesButton;
    @FindBy(xpath = "//span[@class='ant-avatar ant-avatar-circle css-aqx16b']")
    public WebElement accountIcon;
    @FindBy(xpath = "(//div[@class='ant-dropdown css-aqx16b ant-dropdown-placement-bottomRight'])[1]")
    public List<WebElement> accountIconDropdown;

    public void companyAndItemsAreVisible(DataTable elements) {
        List<String> title = elements.asList();
        for (String e : title) {
            System.out.println(e);
        }
        for (int i = 1; i <= accountIconDropdown.size() - 1; i++) {
            System.out.println(accountIconDropdown.get(i).getText());

            Assert.assertEquals(accountIconDropdown.get(i).getText(), title.get(i));
        }

        waitFor(5);

    }


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


    @FindBy(xpath = "//h5[contains(text(),\"John Moon\")]")
    public WebElement importedClient;


    @FindBy(xpath = "//span[contains(text(),'View Details')]")
    public WebElement viewDetailsButton;

    @FindBy(xpath = "(//a[@data-test-id='view_details_button_clientsPage'])[2]")
    public WebElement viewDetailsSecondClientButton;

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

    @FindBy(css = "select.invoice_select__WnoPF")
    public WebElement dropDownCountrySelectcss;

    @FindBy(xpath = "//input[@value='Australia']")
    public WebElement selectCountry;

    @FindBy(xpath = "//input[@placeholder='Phone']")
    public WebElement inputPhone;
    @FindBy(xpath = "//span[text()='Cancel']")
    public WebElement cancelButtonForUpgradeNow;

    @FindBy(xpath = "//span[.='Send a New Document']")
    public WebElement sendANewDocumentButton;

    @FindBy(css = "[data-icon=\"plus-circle\"]")
    public WebElement attachments_plusCircleIcon;

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

    @FindBy(xpath = "//a[@href='/dashboard/services']")
    public WebElement services_button;


    @FindBy(xpath = "//span[text()='Client Info']")
    public List<WebElement> clientInfoSectionBtn;

    @FindBy(xpath = "//span[text()='Hypnotes Scheduler']")
    public WebElement hypnotesSchedulerSection;

    @FindBy(xpath = "//input[@id='register_gender']")
    public WebElement genderSec51;

    @FindBy(xpath = "//a[@href='/dashboard/settings']")
    public WebElement settings_button;

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

    //@FindBy(css="div.ant-select-item ant-select-item-option")
    // @FindBy(xpath = "//li[@class='country']")
    // public List<WebElement> phoneFlag_Dropdown;
    // @FindBy(xpath = "//li[@class='country']//span[contains(@class,'dial-code')]")
    // public List<WebElement> phoneDialCode;

//    @FindBy(css="div.ant-select-item ant-select-item-option")
//    public List<WebElement> phoneFlag_Dropdown;


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

    @FindBy(xpath = "//button[@class='ant-btn css-aqx16b ant-btn-default ant-btn-block']")
    public List<WebElement> sendClientList;
    @FindBy(xpath = "//button[@class='ant-btn css-aqx16b ant-btn-primary ant-btn-block']")
    public List<WebElement> convertTextList;
    @FindBy(xpath = "//button[@class='ant-btn css-aqx16b ant-btn-primary ant-btn-block ant-btn-dangerous']")
    public List<WebElement> deleteButtonList;
    @FindBy(xpath = "//div[@style='text-overflow: ellipsis; overflow: hidden;']")
    public List<WebElement> copytextList;
    @FindBy(xpath = "//div[@class='ant-message-custom-content ant-message-success']")
    public WebElement messageSucces;
    @FindBy(xpath = "//img[@alt='avatar']")
    public WebElement uploadedImage;
    //@FindBy(xpath = "//div[@class='ant-select-item ant-select-item-option']")
    @FindBy(css = "div.ant-select-item ant-select-item-option")
    public List<WebElement> timeZone_List;
    @FindBy(xpath = "//a[@href='/dashboard/clients']")
    public WebElement clientBut;
    @FindBy(xpath = "(//h5)[1]")
    public WebElement listClient;
    @FindBy(xpath = "//input[@data-test-id='search_clients_input']")
    public WebElement searchClientButton;
    @FindBy(xpath = "(//span[@class='ant-select-selection-item'])[2]")
    public WebElement sortByButton;
    @FindBy(xpath = "//label[@ for='inputGroupSelect01']")
    public WebElement sortByButton2;
    @FindBy(xpath = "//span[@class='text-center text-muted']")
    public WebElement sortByDate;
    @FindBy(xpath = "//span[@style='font-size: 12px;']")
    public WebElement lesDates;//buda "2 hour ago" seklindeki tarih
    @FindBy(xpath = "//div[@class='ant-tooltip-inner']")
    public WebElement lesDates2;//bu net tarih


    @FindBy(xpath = "//div[@class=\"view invoices_w55__ZZ_5p\"]/input")
    public List<WebElement> invoiceClientInfo;

    @FindBy(xpath = "(//input[@class='invoice_input__75vJN  '])[1]")
    public WebElement ddCountryWithoutSelect;
    @FindBy(xpath = "//h5[text()='Fatma butterfly']")
    public WebElement clientFatma;

    @FindBy(xpath = "//span[@data-test-id='dashboard_clients_payments']")
    public WebElement paymentsSection;

    @FindBy(xpath = "//div[@aria-selected='true']")
    public WebElement selectedPaymentSection;

    @FindBy(xpath = "//th[@aria-label='Date']/*[@class='ant-table-filter-column']")
    public WebElement dateSortDescending1;
    @FindBy(xpath = "//*[@aria-sort='ascending']")
    public WebElement dateAscending;
    @FindBy(xpath = "//*[@aria-sort='descending']")
    public WebElement dateDescending;
    @FindBy(xpath = "//div[@class='ant-switch-handle']")
    public List<WebElement> paymentSwitchButton;
    @FindBy(xpath = "//span[@class='ant-tag ant-tag-red css-aqx16b']")
    public List<WebElement> paymentStatusText;
    @FindBy(xpath = "//span[@class='ant-dropdown-trigger ant-table-filter-trigger']")
    public List<WebElement> sortingButtons;

    @FindBy(xpath = "//input[@type='checkbox']")
    public List<WebElement> sortingCheckBox;
    @FindBy(xpath = "//span[@class='ant-checkbox-inner']")
    public List<WebElement> sortingServicesText;

    @FindBy(xpath = "//button[@class='ant-btn css-aqx16b ant-btn-primary ant-btn-sm']")
    public WebElement okButton;
    @FindBy(xpath = "//span[@class='ant-tag ant-tag-orange css-aqx16b']")
    public WebElement serviceText;
    @FindBy(xpath = "//span[@class='ant-tag ant-tag-success css-aqx16b']")
    public List<WebElement> appointmentDates;

    @FindBy(xpath = "(//input[@type='search'])[2]")
    public WebElement itemDescriptionField;
    @FindBy(xpath = "//input[@class='invoice_input__75vJN invoices_boldDark__jRBno invoices_darkRight__o078y']")
    public List<WebElement> qytRateField;

    @FindBy(xpath = "//span[@class='span invoices_boldDark__jRBno']")
    public List<WebElement> amountSubtotalSaleTax;
    @FindBy(xpath = "//span[@class='span invoices_darkBoldRight__p5p6Q']")
    public WebElement totalField;
    //textarea[@class='ant-input css-aqx16b invoice_input__75vJN  w-100']
    @FindBy(xpath = "//button[@class='invoices_link__01VJH']")
    public WebElement addLineItem;
    @FindBy(xpath = "//div[@class='view invoices_row__5b9py d-flex']")
    public List<WebElement> addLineItemList;

    @FindBy(xpath = "//textarea[@class='ant-input css-aqx16b invoice_input__75vJN  w-100']")
    public List<WebElement> notesTermsTextarea;


    @FindBy(xpath = "//option[@value='Turkey']")
    public WebElement selectedCountry;

    @FindBy(xpath = "//span[text()='Cancel']")
    public WebElement cancelPopUpButton;
    @FindBy(xpath = "//button[@id='editBtn']")
    public WebElement editButton;
    @FindBy(xpath = "//input[@id='client_middleName']")
    public WebElement middleNameEdit;
    @FindBy(xpath = "//span[@class='ant-checkbox css-aqx16b ant-checkbox-checked']")
    public WebElement showOtherFieldsClickedEdit;
    @FindBy(xpath = "//input[@class='ant-checkbox-input']")
    public WebElement showOtherFieldsNonClickedEdit;


    @FindBy(xpath = "//input[@id='client_guardianEmail']")
    public WebElement guardianEmailEdit;

    @FindBy(xpath = "//div[@class='ant-popconfirm-message-title']")
    public WebElement ConfirmMessageTitle_Edit;
    @FindBy(xpath = "//div[@class='ant-message-custom-content ant-message-success']")
    public WebElement succesfullyUpdatedEdit;


    ///save51;

    // yesButton;


    @FindBy(css = "[href=\"/dashboard/clients/2830\"]")
    public WebElement firstClientsName;
    @FindBy(css = "[data-test-id=\"dashboard_clients_clientInfo\"]")
    public WebElement clientInfoText;
    @FindBy(css = ".anticon.anticon-plus-circle")
    public WebElement plusCircleIcon_Attachments;
    @FindBy(xpath = "//label[text()=\"Attachments\"]")
    public WebElement getAttachmentsText;
    @FindBy(css = ".custom-file>label")
    public WebElement chooseFileText;
    @FindBy(xpath = "//input[@class='custom-file-input']")
    public WebElement chooseFileInput;
    @FindBy(css = ".ant-btn-dangerous span")
    public WebElement deleteSessionBtn;
    @FindBy(xpath = "//div[@class='ant-message-notice-content']")
    public WebElement fileAddedMessage;
    @FindBy(xpath = "//div[@class='ant-popconfirm-buttons']//button[2]/span")
    public WebElement yesButton_toDeleteSession;


    @FindBy(xpath = "(//span[@class='ant-select-selection-item'])[2]")
    public WebElement timeZone_assert;
    @FindBy(xpath = "//div[@class='ant-select-item-option-content']")
    public List<WebElement> country_Listbox;
    @FindBy(xpath = "//div[@class='ant-select-item ant-select-item-option']")
    public List<WebElement> state_Listbox;
    @FindBy(xpath = "//div[@class='ant-select-item-option-content']")
    public List<WebElement> city_Listbox;
    @FindBy(xpath = "//span[text()='No']")
    public WebElement no_Button;
    @FindBy(xpath = "//div[@class='ant-popconfirm-message-title']")
    public WebElement timeZoneWarningMessage;
    // @FindBy(xpath = "//span[text()='New Client is successfully added.']")
    @FindBy(xpath = "//div[@class='ant-message-custom-content ant-message-success']")
    public WebElement addMessage;
    @FindBy(xpath = "//div[@class='ant-card-head-title']/..//h5")
    public List<WebElement> allClients_List;
    @FindBy(css = "[data-test-id='delet_button_clientsPage']")
    public List<WebElement> deleteButtonClientsPage;
    @FindBy(xpath = "//span[text()='Client has been deleted']")
    public WebElement clientDeletedMessages;
    @FindBy(css = "[data-test-id='schedule_an_appointment_button_clientsPage']")
    public WebElement button_ScheduleAnAppointment;
    @FindBy(css = "[data-test-id='clients_scheduleAppointmentButton_serviceSelect']")
    public WebElement dropDown_ScheduleAnAppointmentServiceSelect;
    @FindBy(xpath = "//div[@class='rc-virtual-list-holder-inner']/div[contains(@class,'ant-select-item-option-grouped')]")
    public List<WebElement> serviceList;
    // @FindBy(css = "[data-test-id='clients_scheduleAppointmentButton_locationsSelect']")
    //@FindBy(xpath="//input[@id='rc_select_6']")
    @FindBy(xpath = "//span[@title='Online']")
    public WebElement dropDown_ScheduleAnAppointmentLocationsSelect;
    @FindBy(xpath = "//input[@class='ant-checkbox-input']")
    public WebElement checkbox_CollectPayment;
    @FindBy(css = "[data-test-id='clients_scheduleAppointment_showColorCodesButton']")
    public WebElement button_ShowColorCodes;
    @FindBy(id = "rc_select_39")
    public WebElement dropDown_YearSelect;
    @FindBy(id = "rc_select_40")
    public WebElement dropDown_MonthSelect;
    @FindBy(xpath = "//table[@class='ant-picker-content']")
    public WebElement calendar_whole;
    // @FindBy(css = "//td[contains(@class,'ant-picker-cell ant-picker-cell-in-view')]")
    @FindBy(xpath = "//td[@class='ant-picker-cell ant-picker-cell-in-view']")
    public List<WebElement> list_Calendar;
    @FindBy(xpath = "//input[@value='month']")
    public WebElement radio_Month;
    @FindBy(xpath = "//input[@value='year']")
    public WebElement radio_Year;
    @FindBy(xpath = "//span[@class='ant-radio-button']")
    public WebElement notCheckedMonthYear;
    @FindBy(xpath = "//span[@class='ant-radio-button ant-radio-button-checked']")
    public WebElement CheckedMonthYear;
    @FindBy(xpath = "//button[@class='ant-btn css-aqx16b ant-btn-primary ant-btn-block']")
    public List<WebElement> avaliableHours;
    @FindBy(xpath = "//div[@class='ant-card ant-card-bordered ant-card-hoverable css-aqx16b']//div")
    public WebElement documentAdd;
    @FindBy(xpath = "//a[@class='ant-btn css-aqx16b ant-btn-round ant-btn-primary']")
    public WebElement button_OpenDocument;
    @FindBy(xpath = "//button[@class='ant-btn css-aqx16b ant-btn-round ant-btn-primary']")
    public WebElement button_sendToClient;
    @FindBy(xpath = "//div[@class='ant-message-custom-content ant-message-success']")
    public WebElement message_sendDocument;
    @FindBy(xpath = "//span[text()='Next']")
    public WebElement button_Next;
    @FindBy(xpath = "//div[text()='Confirm Meeting Details']")
    public WebElement confirmMeetingDetails;
    @FindBy(xpath = "//span[text()='Notify client']/..//input")
    public WebElement checkbox_NotifyClient;
    @FindBy(id = "sendConfirmationEmail")
    public WebElement checkbox_sendAConfirmationEmail;
    @FindBy(xpath = "//span[text()='Submit']")
    public WebElement button_submit;
    @FindBy(xpath = "//div[text()='Meeting Details']")
    public WebElement addedMeetingDetails;
    @FindBy(xpath = "//div[text()='Successfully created a meeting with']")
    public WebElement addedMeetingSuccessfullyCreated;
    @FindBy(xpath = "//div[@class='ant-result-extra']")
    public WebElement meetingDetailsAll;
    @FindBy(xpath = "//span[text()='Close']")
    public WebElement buttonClose;
    @FindBy(xpath = "//span[text()='Schedule another Appointment']")
    public WebElement buttonScheduleAnotherAppointment;
    @FindBy(xpath = "//input[@id='rc_select_63']")
    public WebElement service_inputSelect2;
    @FindBy(xpath = "//button[@class='ant-btn css-aqx16b ant-btn-primary ant-btn-block']")
    public List<WebElement> avaliableHoursList;
    @FindBy(xpath = "//button[@class='ant-btn css-aqx16b ant-btn-default ant-btn-dangerous']")
    public WebElement button_cancel;
    // @FindBy(css = "data-test-id='clientsPage_upcomingMeetingButton'")
    @FindBy(xpath = "//button[@data-test-id='clientsPage_upcomingMeetingButton']")
    public WebElement button_upComingMeeting;
    @FindBy(xpath = "//div[@class='ant-drawer-title']")
    public WebElement label_ScheduleAnAppointment;
    @FindBy(xpath = "//span[text()='Meeting Time']")
    public WebElement span_MeetingTime;
    @FindBy(xpath = "//span[text()='Block Time']")
    public WebElement span_BlockTime;
    @FindBy(xpath = "//span[text()='Available Hours']")
    public WebElement span_AvailableHours;
    @FindBy(xpath = "//span[text()='Google Events']")
    public WebElement span_GoogleEvents;
    @FindBy(xpath = "//span[text()='Hypnotes Events']")
    public WebElement span_HypnotesEvents;
    @FindBy(xpath = "//span[text()='1']/..")
    public WebElement iconOne;
}
