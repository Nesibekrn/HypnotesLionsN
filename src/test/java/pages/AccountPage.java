package pages;

import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

import static stepDefinitions.Hooks.driver;
import static utilities.ReusableMethods.waitFor;

public class AccountPage extends CommonPage{

//    @FindBy(xpath="//span[@class=\"ant-avatar ant-avatar-circle css-aqx16b\"]")
//    public WebElement accountLogo;

    @FindBy(xpath="//span[@class='anticon anticon-caret-down']")
    public WebElement accountLogo;

    @FindBy(linkText="Profile")
    public WebElement profile;


    @FindBy(xpath="//div[contains(text(),\"Your Company\")]")
    public WebElement yourCompanyTitle;

    @FindBy(xpath="//span[contains(text(),\"Add New Company\")]")
    public WebElement addNewCompany;

    //add new company form locators
    @FindBy(xpath="//input[@class=\"invoice_input__75vJN compTab_formInputText__ujWLR\"]")
    public List<WebElement> fields;

    @FindBy(xpath="//button[text()='Your Logo']")
    public WebElement yourLogo;
    @FindBy(xpath="//input[@class=\"invoice_imageFile__dnFWA\"]")
    public WebElement yourLogo2;

    @FindBy(xpath="//input[@class=\"invoice_imageFile__dnFWA\"]")
    public WebElement changeLogo;

    @FindBy(xpath="//input[@placeholder='Your Company']")
    public WebElement yourCompany;

    @FindBy(xpath="//input[@placeholder='Company Address']")
    public WebElement companyAddress;

    @FindBy(xpath="//input[@placeholder='City,State,Zip']")
    public WebElement cityStateZip;
    @FindBy(xpath="//input[@placeholder='Company URL']")
    public WebElement country;

    // @FindBy(xpath="//div[@data-test-id='profil_addNewCompanyPage_companyCountry_dropDown_input']/input")
    // public WebElement country;


    @FindBy(xpath="//div[@data-test-id='profil_addNewCompanyPage_companyCountry_dropDown_input']")
    public WebElement countryDD;
    @FindBy(xpath="//input[@placeholder='Company URL']")
    public WebElement companyUrl;

    @FindBy(xpath="//input[@placeholder='Company Phone']")
    public WebElement companyPhone;

    @FindBy(xpath="//input[@placeholder='Company Email']")
    public WebElement companyEmail;


    @FindBy(xpath="//select[@class=\"invoice_select__WnoPF   false\"]")
    public WebElement contryDropDownl;


    @FindBy(xpath="//span[text()='Add New Education']")
    public WebElement addNewEducation;


    @FindBy(xpath = "//div[@class='ant-row ant-form-item-row css-aqx16b']")
    public List<WebElement>titles;

    @FindBy(xpath = "//span[text()='Cancel']")
    public WebElement cancel_buton;

    @FindBy(xpath="//div[@class='ant-form-item-control-input-content']")
    public List<WebElement>selections;

    @FindBy(xpath = "//input[@data-test-id='profileMenu_addNewEducationDrawer_schoolNameInput']")
    public WebElement schoolNameField;
    @FindBy(xpath = "//input[@data-test-id='profileMenu_addNewEducationDrawer_departmentInput']")
    public WebElement departmentField;
    @FindBy(xpath = "//input[@data-test-id='profileMenu_addNewEducationDrawer_startDatePicker']")
    public WebElement startDateField;
    @FindBy(xpath = "//input[@data-test-id='profileMenu_addNewEducationDrawer_endDatePicker']")
    public WebElement endDateField;
    @FindBy(xpath = "//textarea[@data-test-id='profileMenu_addNewEducationDrawer_descriptionInput']")
    public WebElement descriptionField;
    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveButon;
    @FindBy(xpath = "//span[text()='Education has been added']")
    public WebElement addedPopUpMessage;
    @FindBy(xpath = "//span[@aria-label='edit']")
    public WebElement editButon;
    @FindBy(xpath = "//span[text()='Education has been updated']")
    public WebElement updatedMessage;
    @FindBy(xpath = "//span[@aria-label='delete']")
    public WebElement deleteButon;
    @FindBy(xpath = "//div[text()='Are you sure you wish to delete this item?']")
    public WebElement deletePopUpMessage;
    @FindBy(xpath = "//span[text()='OK']")
    public WebElement ok_buton;
    @FindBy(xpath = "//span[text()='Education has been deleted']")
    public WebElement hasBeenDeletePopUp;
    @FindBy(xpath = "//input[@value='Turkey']")
    public WebElement selectedDDvalueforCountry;
    @FindBy(xpath = "(//div[@class='ant-tabs-tab'])[3]")
    public WebElement certificationButton;
    @FindBy (xpath="//button[@class='ant-btn css-aqx16b ant-btn-primary tab_certf__LJZfW']")
    public WebElement addNewCertificateButton;
    @FindBy (xpath="//div[text()='Remote Therapy Certificate']")
    public WebElement remoteTherapyCertificate;
    @FindBy (xpath="//div[@class='ant-drawer-title']")
    public WebElement addLicenseOrCertificate;
    @FindBy (xpath="//div[@class='ant-form-item-control-input']")
    public WebElement addLicenseOrCertificateInputTitles;
    @FindBy (xpath="//input[@id='title']")
    public WebElement titleTextBox;
    @FindBy (xpath="//input[@id='organization']")
    public WebElement issuingOrgTextBox;
    @FindBy (id="date")
    public WebElement issueDateTextBox;
    @FindBy (xpath="//div[normalize-space()='10']")
    public WebElement dayArrow;
    @FindBy (xpath="//input[@id='publicUrl']")
    public WebElement credentialUrl;
    @FindBy (xpath="//span[text()='Cancel']")
    public WebElement cancelButton;

    @FindBy (xpath="//span[text()='Save']")
    public WebElement saveButton;
    @FindBy (xpath="//button[@type='submit']")
    public WebElement saveButtonClick;
    @FindBy (xpath="//span[text()='Certificate has been added']")
    public WebElement certificateAddedMessage;

    public void saveAndCancelButtonClick(String button){
        WebElement clickButtons= driver.findElement(By.xpath("//span[text()='" + button + "']"));
        clickButtons.isEnabled();
    }

    public void setAddLicenseOrCertificateInputTitles(){
       titleTextBox.sendKeys("Canadian Certified Counsellor");
       issuingOrgTextBox.sendKeys("RMFT");
       ReusableMethods.waitFor(3);
       issueDateTextBox.click();
       dayArrow.click();
       credentialUrl.sendKeys("https://www.crpo.ca/");
    }


}