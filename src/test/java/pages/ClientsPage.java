package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

import static stepDefinitions.Hooks.driver;

public class ClientsPage extends CommonPage{

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




}
