package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClientsPage extends CommonPage {
    @FindBy(xpath = "//input[@data-test-id='loginAsClientPage_email']")
    public WebElement loginEmail07;
    @FindBy(xpath = "//input[@data-test-id='loginAsClientPage_password']")
    public WebElement loginPassword07;

    @FindBy(xpath = "(//span[text()='Login'])[2]")
    public WebElement loginPourEntrerLeSite07;
  @FindBy(xpath = "//span[text()='Yes']")
    public WebElement timeZoneYes;

    @FindBy(xpath = "//a[text()='Clients']")
    public WebElement dashboardClients51;

    @FindBy(xpath = "//span[text()='Add New Client']")
    public WebElement addNewClients51;
    @FindBy(xpath = "//input[@id='register_firstName']")
    public WebElement addFirstName51;
    @FindBy(xpath = "//input[@id='register_middleName']")
    public WebElement addMiddleName51;

    @FindBy(xpath = "//input[@id='register_email']")
    public WebElement addEmail51;

    @FindBy(xpath = "//input[@id='register_gender']")
    public WebElement addGender51;

    @FindBy(xpath = "//input[@id='register_zipCode']")
    public WebElement addZipCode51;

    @FindBy(xpath = "//input[@id='register_occupation']")
    public WebElement addOccupation51;

    @FindBy(xpath = "//input[@type='tel']")
    public WebElement addPhone51;

    @FindBy(xpath = "//input[@list='countryData']")
    public WebElement addCountry51;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement addState51;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement addCity51;

    @FindBy(xpath = "//*[@id=\"register\"]/div[12]/div/div[1]/label")
    public WebElement addAdress51;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement addShowExtra51;
    @FindBy(xpath = "(//input[@class='form-control false'])[2]']")
    public WebElement addEmergencyContacPhonet51;
    @FindBy(xpath = "//input[@id='register_emergencyContactRelationship']")
    public WebElement addRelationShip51;
    @FindBy(xpath = "//input[@id='register_doctorName']")
    public WebElement primaryDoctorName51;
    @FindBy(xpath = "//*[@class='selected-flag open']")
    public WebElement flagOpen51;

@FindBy(xpath = "//input[@class='search-box']")
    public WebElement flagOpenSearch51;

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

    @FindBy(xpath = "//body/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/button[4]")
    public WebElement easyPracticeMethod;

    @FindBy(xpath = "//input[@class=\"custom-file-input\"]")
    public WebElement chooseFileForEasyPractice;

    @FindBy(xpath = "//span[text()='Upload']")
    public WebElement uploadButtonForEasyPractice;


    @FindBy(xpath = "//h5[contains(text(),\"Zeynep butterfly\")]")
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



}
