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

   @FindBy(xpath = "//button[@aria-label='Close']")
   public WebElement xButton;

   @FindBy(xpath = "//div[@class='ant-picker ant-picker-range css-aqx16b ant-picker-disabled']")
   public WebElement blockTime;

   @FindBy(xpath = "//input[@data-test-id='calendar_settingsForm_client_limit']")
    public List<WebElement> maxAppointments;

   @FindBy(xpath = "//input[@data-test-id='calendar_settingsForm_number_client_limit']")
   public List<WebElement> maxAppointmentNumber;

   @FindBy(xpath = "//button[@data-test-id='calendar_settingsForm_saveBtn']")
    public WebElement saveSettings;

   @FindBy(xpath = "//button[@data-test-id='settings_scheduling&Calendar_calendarDisplay_blockTimeColorButton']")
   public WebElement blockTimeColor;

   @FindBy(xpath = "//span[@data-test-id='settings_scheduling&Calender_calendarDisplay']")
   public WebElement calendarDisplay;

   @FindBy(xpath = "//span[@data-test-id='settings_scheduling&Calender_timezone']")
   public WebElement timeZone;

   @FindBy(xpath = "//div[@data-test-id='settings_scheduling&Calendar_timeZone_timeZoneSelectDropDown']")
   public WebElement timeZoneArea;

   @FindBy(xpath = "//div[@class='ant-select-item-option-content']")
   public List<WebElement> newyorkTime;


   @FindBy(xpath = "//span[@data-test-id='settings_scheduling&Calender_schedulerUrl']")
   public WebElement schedulerUrl;


   @FindBy(xpath = "//button[@class='ant-btn css-aqx16b ant-btn-primary ant-btn-background-ghost']")
   public WebElement customizeUrl;

   @FindBy(xpath = "//input[@data-test-id='calendar_settingsForm_schedulerUrl']")
   public WebElement changeUrl;

   @FindBy(xpath = "//button[@id='schedulerButton']")
   public WebElement changeSchedularLink;

   @FindBy(xpath = "//div[@class='ant-message-custom-content ant-message-success']")
   public WebElement successMessage;

   @FindBy(xpath = "//button[@data-test-id='settings_scheduling&Calendar_calendarDisplay_packagesColorButton']")
   public WebElement packagesColor;

   @FindBy(xpath = "//button[@data-test-id='settings_scheduling&Calendar_calendarDisplay_individualSessionsColorButton']")
   public WebElement individualSessions;

   @FindBy(xpath = "//button[@data-test-id='settings_scheduling&Calendar_calendarDisplay_groupSessionsColorButton']")
   public WebElement groupSessions;

   @FindBy(xpath = "//button[@data-test-id='settings_scheduling&Calendar_calendarDisplay_hypnotesEventsColorButton']")
   public WebElement hypnotesEvents;

   @FindBy(xpath = "//button[@data-test-id='settings_scheduling&Calendar_calendarDisplay_googleEventsColorButton']")
   public WebElement googleEvents;

   @FindBy(xpath = "//button[@data-test-id='settings_scheduling&Calendar_calendarDisplay_canceledMeetingsColorButton']")
   public WebElement canceledMeetings;

   @FindBy(xpath = "//input[@class='color_colorInputServiceSettings___xPkQ']")
   public WebElement colorSkalasi;

   @FindBy(xpath = "//button[@class='ant-btn css-aqx16b ant-btn-primary ant-btn-block']")
   public WebElement saveColor;











}
