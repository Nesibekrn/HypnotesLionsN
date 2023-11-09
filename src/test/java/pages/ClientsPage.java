package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.*;

public class ClientsPage extends CommonPage {


    @FindBy(xpath = "//input[@data-test-id='loginAsClientPage_email']")
    public WebElement loginEmail07;
    @FindBy(xpath = "//input[@data-test-id='loginAsClientPage_password']")
    public WebElement loginPassword07;

    @FindBy(xpath = "(//span[text()='Login'])[2]")
    public WebElement loginPourEntrerLeSite07;
    @FindBy(xpath = "//input[@id='register_guardianEmail']")
    public WebElement guardienEmail;

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
    @FindBy(xpath = "(//input[@class='form-control false'])[2]']")
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

    @FindBy(xpath = "//input[@id='register_gender']")
    public WebElement genderSec51;

}
