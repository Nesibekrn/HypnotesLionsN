package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashboardPage extends CommonPage{

    @FindBy(xpath = "//a[@href='/dashboard']")
    public WebElement DashboardButton;


    @FindBy(css = "span.ant-menu-title-content>[href$='/email-sms']")
    public WebElement email_smsLink_therapistDashboard;

    @FindBy(xpath = "//*[text()='Yes']")
    public WebElement timeZonePopUp_yesButton;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/div/div[2]/button[2]")
    public WebElement timeZoneYesButton;

    @FindBy(xpath = "//span[@class='ant-avatar ant-avatar-circle css-aqx16b']")
    public WebElement sectionButton;

    @FindBy(xpath = "//a[@data-test-id='profile_link_profilMenuDropDown']")
    public WebElement profileButton;

    @FindBy(xpath = "//div[@id='rc-tabs-0-tab-3']")
    public WebElement specialtiesButton;

    @FindBy(xpath = "//button[@data-test-id='profile_addNewSpeciality_button']")
    public WebElement addNewSpecialityButton;

    @FindBy(xpath = "//div[@data-test-id='profile_addNewSpeciality_dropDown']")
    public WebElement specialityDropdownMenu;

    @FindBy(xpath = "//div[@title='Addictions']")
    public WebElement addictions;

    @FindBy(xpath = "//div[@title='Abandonment']")
    public WebElement abondonment;

    @FindBy(xpath = "//div[@title='Aggression']")
    public WebElement aggression;

    @FindBy(xpath = "//div[@title='Anger']")
    public WebElement anger;

    @FindBy(xpath = "//div[@title='Anxiety']")
    public WebElement anxiety;

    @FindBy(xpath = "//div[@title='Assertiveness']")
    public WebElement assertivenes;

    @FindBy(xpath = "//div[@title='Athletic Abilities']")
    public WebElement athleticAbilities;

    @FindBy(xpath = "//div[@title='Attitude Adjustment']")
    public WebElement attiduteAdjustment;

    @FindBy(xpath = "//button[@class='ant-btn css-aqx16b ant-btn-primary']")
    ////button[@class='ant-btn css-aqx16b ant-btn-primary']
    public WebElement specialitySaveButton;

    @FindBy(xpath = "//div[@class='ant-message-notice-content']")
    public WebElement messageSpeciality;

    @FindBy(xpath = "//button[@class='ant-modal-close']")
    public WebElement xButton;

    @FindBy(xpath = "//span[@class='anticon anticon-delete']")
    public List<WebElement> delete;


    @FindBy(xpath = "//button[@class='ant-btn css-aqx16b ant-btn-primary ant-btn-sm']")
    public WebElement deleteOk;

    @FindBy(xpath = "//span[@class='ant-tag ant-tag-processing css-aqx16b']")
    public WebElement totalSpecialties;

    @FindBy(xpath = "//li[@data-menu-id='rc-menu-uuid-12163-9-/dashboard/calendar']")
    public WebElement calendar;








}
