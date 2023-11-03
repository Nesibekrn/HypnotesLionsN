package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends CommonPage{
    @FindBy(xpath = "//button[@class='ant-btn css-15rg2km ant-btn-round ant-btn-primary ant-btn-sm ant-btn-background-ghost']")
    public WebElement timeZoneYesButton;

    @FindBy(xpath = "//span[@class='ant-avatar ant-avatar-circle css-aqx16b']")
    public WebElement sectionButton;

    @FindBy(xpath = "//li[@data-menu-id='rc-menu-uuid-86985-8-1']")
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

    @FindBy(xpath = "(//button[@class='ant-btn css-aqx16b ant-btn-primary'])[2]")
    public WebElement specialitySaveButton;

    @FindBy(xpath = "//button[@class='ant-modal-close']")
    public WebElement xButton;

    @FindBy(xpath = "//span[@class='anticon anticon-delete ant-popover-open']")
    public WebElement delete1;

    @FindBy(xpath = "//span[@class='anticon anticon-delete']")
    public WebElement delete2;

    @FindBy(xpath = "//button[@class='ant-btn css-aqx16b ant-btn-primary ant-btn-sm']")
    public WebElement deleteOk;








}
