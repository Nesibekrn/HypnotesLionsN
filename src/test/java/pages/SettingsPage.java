package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SettingsPage extends CommonPage{
   @FindBy(xpath = "//a[@href='/dashboard/settings']")
   public WebElement settingsButton;

   @FindBy(xpath = "//div[@class='ant-switch-handle']")
   public WebElement flexStart;

   @FindBy(xpath = "//div[@class='ant-message-notice-content']")
   public WebElement flexStartMessage;

   @FindBy(xpath = "//input[@data-test-id='calendar_settingsForm_off_day']")
    public List<WebElement> dayOff;

   @FindBy(xpath = "//button[@data-test-id='calendar_settingsForm_blockTimeBtn']")
    public List<WebElement> addNewBlockTime;

   @FindBy(xpath = "//div[@data-test-id='settings_recurringBlockTmeModal_selectTimeStart']")
   public WebElement blockTimeFrom;

   @FindBy(xpath = "//input[@aria-activedescendant='rc_select_31_list_0']")
   public WebElement timeFirst;

   @FindBy(xpath = "//div[@data-test-id='settings_recurringBlockTmeModal_selectTimeEnd']")
   public WebElement blockTimeTo;

   @FindBy(xpath = "//input[@aria-activedescendant='rc_select_32_list_0']")
   public WebElement timeSecond;

   @FindBy(xpath = "//button[@data-test-id='settings_recurringBlockTmeModal_addButton']")
   public WebElement addButton;

   @FindBy(xpath = "//span[@class='ant-modal-close-x']")
   public WebElement xButton;

   @FindBy(xpath = "//input[@data-test-id='calendar_settingsForm_client_limit']")
    public List<WebElement> maxAppointments;

   @FindBy(xpath = "//button[@data-test-id='calendar_settingsForm_saveBtn']")
    public WebElement saveSettings;
}
