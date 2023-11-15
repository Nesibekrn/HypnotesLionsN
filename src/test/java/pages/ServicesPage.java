package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ServicesPage extends CommonPage {

    @FindBy(xpath = "//a[normalize-space()='Services']")
    public WebElement servicesButton;

    @FindBy(xpath = "//span[normalize-space()='Group Session'] ")
    public WebElement groupSessionButton;

    @FindBy(xpath = "(//span[contains(text(),'Add New Group Session')])[1]")
    public WebElement addNewGroupSessionButton;

    @FindBy(xpath = "//textarea[@id='title']")
    public WebElement inputFormName;

    @FindBy(xpath = "//input[@id='price']")
    public WebElement inputPrice;

    @FindBy(xpath = "//input[@id='duration']")
    public WebElement inputDuration;

    @FindBy(xpath = "//button[@id='showPrice']")
    public WebElement showPriceSwitch;

    @FindBy(xpath = "//button[@id='paymentRequired']")
    public WebElement paymentRequiredSwitch;

    @FindBy(xpath = "//button[@id='bookable']")
    public WebElement serviceActiveSwitch;

    @FindBy(xpath = "//span[normalize-space()='Please Select Document']")
    public WebElement PleaseSelectDocument;

    @FindBy(xpath = "//span[normalize-space()='Would you like this service to be provided online?']")
    public WebElement checkBoxProvidedOnline;

    @FindBy(xpath = "//input[@id='attendeeLimit']")
    public WebElement inputAttendeeLimitButton;

    @FindBy(xpath = "//input[@id='sessionDate']")
    public WebElement selectSessionDate;

    @FindBy(xpath = "//input[@id='sessionTime']")
    public WebElement inputSessionTime;

    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement inputDescriptionButton;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@data-test-id='services_title']")
    public WebElement groupSessionServicesTitle;

    @FindBy(xpath = "//div[@class='ant-drawer-title']")
    public WebElement addingGroupSessionTitle;














}
