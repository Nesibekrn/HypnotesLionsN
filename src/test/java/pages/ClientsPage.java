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


}
