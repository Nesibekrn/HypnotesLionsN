package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.*;
public class ClientsPage extends CommonPage {



    @FindBy(xpath = "//a[@href='/dashboard/clients']")
    public WebElement clients_button;
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

    @FindBy(xpath = "  //span[text()='Payment url  copied to clipboard.']")
    public WebElement paymentURLMessage;

    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement email_input;
    @FindBy(xpath = "(//button[@class='ant-btn css-aqx16b ant-btn-primary'])[2]")
    public WebElement sendInvitationButton;
    @FindBy(xpath = "//span[text()='Email sent.']")
    public WebElement emailSentMessage;
    @FindBy(xpath = " //a[@href='https://meet.hypnotes.net/']")
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

    @FindBy(xpath = "//ul[@class='ant-dropdown-menu ant-dropdown-menu-root ant-dropdown-menu-vertical ant-dropdown-menu-light css-aqx16b']")
    public WebElement accountDropDown;




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

    @FindBy(xpath = "//button[normalize-space()='Your Logo']")
    public WebElement yourLogoButton;

    @FindBy(xpath = "//textarea[@placeholder='Your Company']")
    public WebElement yourCompanyButton;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement inputTherapistName;

    @FindBy(xpath = "//input[@placeholder='Company Address']")
    public WebElement inputCompanyAddress;

    @FindBy(xpath = "(//input[@placeholder='City,State,Zip'])[1]")
    public WebElement inputCityStateZip;

    @FindBy(xpath = "(//input[@class='invoice_input__75vJN  '])[1]")
    public WebElement dropDownCountry;

    @FindBy(xpath = "//input[@placeholder='Phone']")
    public WebElement inputPhone;
    @FindBy(xpath = "//span[text()='Cancel']")
    public WebElement cancelButtonForUpgradeNow;

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

}
