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

   @FindBy(xpath = "(//div[@class='ant-select-item ant-select-item-option' and contains(@title, '05:00 AM')])[1]")
   public WebElement timeFirst;

   @FindBy(xpath = "//div[@data-test-id='settings_recurringBlockTmeModal_selectTimeEnd']")
   public WebElement blockTimeTo;

   @FindBy(xpath = "//div[@class='ant-select-item ant-select-item-option' and contains(@title, '06:30 AM')]")
   public List<WebElement> timeSecond;

   @FindBy(xpath = "//button[@data-test-id='settings_recurringBlockTmeModal_addButton']")
   public WebElement addButton;

   @FindBy(xpath = "//span[@class='ant-modal-close-x']")
   public WebElement xButton;

   @FindBy(xpath = "//div[@class='ant-picker ant-picker-range css-aqx16b ant-picker-disabled']")
   public WebElement blockTime;

   @FindBy(xpath = "//input[@data-test-id='calendar_settingsForm_client_limit']")
    public List<WebElement> maxAppointments;

   @FindBy(xpath = "//input[@data-test-id='calendar_settingsForm_number_client_limit']")
   public WebElement maxAppointmentNumber;

   @FindBy(xpath = "//button[@data-test-id='calendar_settingsForm_saveBtn']")
    public WebElement saveSettings;

   @FindBy(xpath = "//button[@data-test-id='settings_scheduling&Calendar_calendarDisplay_blockTimeColorButton']")
   public WebElement blockTimeColor;

   @FindBy(xpath = "//div[@id='rc-tabs-24-tab-2']")
   public WebElement calendarDisplay;

   @FindBy(xpath = "//div[@id='rc-tabs-27-tab-3']")
   public WebElement timeZone;

   @FindBy(xpath = "//div[@class='ant-select ant-select-lg css-aqx16b ant-select-single ant-select-show-arrow ant-select-show-search']")
   public WebElement timeZoneArea;

   @FindBy(xpath = "//div[@style='display: flex; align-items: center; justify-content: space-between; flex-wrap: wrap;']")
   public List<WebElement> newyorkTime;

   //div[@class='ant-typography ant-typography-ellipsis ant-typography-single-line ant-typography-ellipsis-single-line timezone-select css-aqx16b']

   @FindBy(xpath = "//div[@label='(UTC-04:30) Venezuela Standard Time - America/Caracas']")
   public WebElement venezuelaTime;

   @FindBy(xpath = "//span[@data-test-id='settings_scheduling&Calender_schedulerUrl']")
   public WebElement schedulerUrl;

   //td[@class='ant-descriptions-item-content']

   @FindBy(xpath = "//button[@class='ant-btn css-aqx16b ant-btn-primary ant-btn-background-ghost']")
   public WebElement customizeUrl;

   @FindBy(xpath = "//input[@data-test-id='calendar_settingsForm_schedulerUrl']")
   public WebElement changeUrl;

   @FindBy(xpath = "//button[@id='schedulerButton']")
   public WebElement changeSchedularLink;




}
