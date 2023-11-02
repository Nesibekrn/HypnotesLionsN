package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountPage extends CommonPage{

     @FindBy(xpath="//span[@class=\"ant-avatar ant-avatar-circle css-aqx16b\"]")
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

}
