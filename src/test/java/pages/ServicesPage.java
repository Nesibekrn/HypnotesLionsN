package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ServicesPage extends CommonPage {

    @FindBy(xpath = "//a[normalize-space()='Services']")
    public WebElement servicesButton;

    @FindBy(xpath = "//span[normalize-space()='Group Session']")
    public WebElement groupSessionButton;

    @FindBy(xpath = "(//div[contains(text(), 'Regular')])[2]")
    public WebElement regularButton;

    @FindBy(xpath = "(//span[contains(text(),'Add New Group Session')])[1]")
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

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "(//span[contains(text(),'Cancel')])[3]")
    public WebElement cancelButton;

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

    @FindBy(xpath = "(//span[@class='ant-select-arrow'])[2]")
    public WebElement selectLocationSelectArrow;



}
