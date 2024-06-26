package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class CalendarPage extends CommonPage {

    @FindBy(css = "a[href='/dashboard/calendar']")
    public WebElement calender_Btn;
    @FindBy(css = "a[href='/dashboard/calendar']")
    public WebElement calendar_buton;
    //Locators for US092
    @FindBy(css = ".fc-daygrid-day-bottom a")
    public List<WebElement> createdAppointmentsListOnCalendar;
    @FindBy(xpath = "//div[@class=\"fc-event-main\"]/div/span")
    public List<WebElement> appointmentsListAfterOneClick;
    @FindBy(css = "div.ant-drawer-title")
    public WebElement meetingDetailsText;
    @FindBy(css = "[data-test-id=\"meetDetails_googleBtn\"]")
    public WebElement googleBtnInMeetingDetails;
    @FindBy(css = "[data-test-id=\"meetDetails_outlookBtn\"]")
    public WebElement outlookBtnInMeetingDetails;

    // @FindBy(xpath = "//div[@class='fc-daygrid-day-frame fc-scrollgrid-sync-inner']")
    //
     @FindBy(xpath = "//td[@class='fc-daygrid-day fc-day fc-day-tue fc-day-future fc-day-other']//div[@class='fc-daygrid-day-frame fc-scrollgrid-sync-inner']")
    public WebElement aDateButton;

   // @FindBy(xpath = "//td[@role='gridcell']")
    //public List<WebElement> alldays;

    @FindBy(xpath = "//span[@aria-label='Increase Value']")
    public WebElement increaseNumber;
    @FindBy(xpath = "//span[@aria-label='Decrease Value']")
    public WebElement decreaseNumber;


   // @FindBy(xpath = "//div[@data-test-id=\"eventDrawer_repeatOptions\"]//div[@class='ant-select-selector']")
    //public WebElement repeatOptionsButton;

   // @FindBy(xpath = "//span[@title='Does not repeat']")
    //public WebElement repeatOptionDropdownButton;
   //  @FindBy(xpath = "//div[@class='ant-select-item-option-content']")
    //@FindBy(xpath = "//div[@class='ant-select-item ant-select-item-option']")
    //public List<WebElement> repeatOptionSelection;

    @FindBy(xpath = "//div[@data-test-id=\"eventDrawer_repeatOptions\"]//div[@class='ant-select-selector']")
    public WebElement repeatOptionsButton;
    @FindBy(xpath = "//div[@data-test-id=\"eventDrawer_repeatOptions\"]//span[@class='ant-select-selection-item']")
    public WebElement repeatOptionsButtonText;

    @FindBy(xpath = "//span[@title='Does not repeat']")
    public WebElement repeatOptionDropdownButton;
    @FindBy(xpath = "//div[@class='ant-select-item-option-content']")
    public List<WebElement> repeatOptionSelection;

    @FindBy(xpath = "//div[@id='Daily']")
    public WebElement daily;


    @FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Daily']")
    public WebElement dailyButton;

    @FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Weekly']")
    public WebElement weeklyButton;

    @FindBy(xpath = "//div[contains(text(),'Biweekly')]")
    public WebElement biweeklyButton;

    @FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Monthly']")
    public WebElement monthlyButton;

    //@FindBy(xpath = "//input[@id='basic_repeat']")
   // public WebElement repeatTimes;

    @FindBy(xpath = "//div[@class=\"ant-input-number-input-wrap\"]")
    public List<WebElement> repeatTimes;

    @FindBy(xpath = "//div[contains(text(),'Does not repeat')]")
    public WebElement doesNotRepeatButton;
    @FindBy(xpath = "(//div[@class='ant-select-selector'])[2]")
    public WebElement scheduleButton;

    @FindBy(xpath = "//div[@class='ant-select-item-option-content']")
    public List<WebElement> scheduleMenu;

    @FindBy(xpath = "//div[@title='Month']")
    public WebElement monthButton;
    @FindBy(xpath = "//div[@title='Week']")
    public WebElement weekButton;
    @FindBy(xpath = "//div[@title='3 Days']")
    public WebElement threeDaysButton;
    @FindBy(xpath = "//div[@title='Day']")
    public WebElement dayButton;
    @FindBy(xpath = "//h2[text()='November 2023']")
    public WebElement monthPage;
    @FindBy(xpath = "//span[@class='fc-icon fc-icon-chevron-right']")
    public WebElement nextMonthButton;
    @FindBy(xpath = "//h2[text()='December 2023']")
    public WebElement nextMonthPage;

    @FindBy(xpath = "//div[@class='fc-timegrid fc-timeGridWeek-view fc-view']")
    public WebElement weekView;

    @FindBy(xpath = "//div[@class='fc-timegrid fc-timeGridThreeDay-view fc-view']")
    public WebElement threeDaysView;

    @FindBy(xpath = "//div[@class='fc-timegrid fc-timeGridDay-view fc-view']")
    public WebElement dayView;

    @FindBy(xpath = "//button[@data-test-id='calendar_actionButton_scheduleBtn']")
    public WebElement scheduleAppointment_button;

    @FindBy(xpath = "//button[@data-test-id='calenderPage_addNewEvent_Button']")
    public WebElement addNewEvent_button;

    @FindBy(xpath = "//button[@data-test-id='calendar_actionButton_blockTimeBtn']")
    public WebElement blockTime_button;

    @FindBy(xpath = "//button[@data-test-id='calendar_actionButton_schedulingSettingsBtn']")
    public WebElement schedulingSetting_button;

    @FindBy(xpath = "//div[text()='Schedule an Appointment']")
    public WebElement scheduleTitle;

    @FindBy(xpath = "//span[@aria-label='close']")
    public WebElement closeButton;

    @FindBy(xpath = "//div[text()='Add Event']")
    public WebElement addEventTitle;

    @FindBy(xpath = "//div[text()='Block Dates']")
    public WebElement blockDatesTitle;

    @FindBy(xpath = "//span[@class='ant-typography text-capitalize  css-aqx16b']")
    public WebElement location;

    @FindBy(css = ".fc-daygrid-day-number[aria-label]")
    public List<WebElement> calenderAllDays;

    @FindBy(xpath = "//td[contains(@class,'fc-day-today')]")
    public WebElement today;
    @FindBy(xpath = "//div[@data-test-id='calender_schedule_locationDropdown']")
    public WebElement locationDropdownMenu;

    @FindBy(xpath = "//span[@title='Online']")
    public WebElement onlineLocation;

    @FindBy(xpath = "//span[text()='Schedule an Appointment']")
    public WebElement schedule_Appointment_title;

    @FindBy(xpath = "//input[@data-test-id='calender_schedule_customServiceButton']")
    public WebElement custom_Services_radioBtn;

    @FindBy(xpath = "//input[@data-test-id='calender_schedule_registeredButton']")
    public WebElement registered_Services_radioBtn;

    @FindBy(xpath = "//div[@aria-label='Default select example']/span[@class='ant-select-arrow']/..")
//    @FindBy(css="#service")
    public WebElement appointment_service_radioBtn;

    @FindBy(xpath = "//div[@class='ant-select-item-option-content']")
    public List<WebElement> service_options;

    @FindBy(xpath = "//div[@class='ant-select-item ant-select-item-group']//strong")
    public WebElement groupSessionService;

    @FindBy(xpath = "//strong[normalize-space()='------------ Package-------------']")
    public WebElement packageService;

    @FindBy(xpath = "//strong[normalize-space()='------------ Individual Session------------']")
    public WebElement individualSession;

    @FindBy(xpath = "//div[@class='ant-picker-cell-inner']")
    public List<WebElement> dateDropdown;

    @FindBy(xpath = "//input[@id='basic_date']")
    public WebElement date;
    @FindBy(xpath = "//input[@id='basic_timeStart']")
    public WebElement startTime;
    @FindBy(xpath = "//span[@class='rc-time-picker-icon']")
    public List<WebElement> timeClearButton;
    @FindBy(xpath = "//div[text()='Please Select Start Time']")
    public WebElement startTimeErrorMsg;
    @FindBy(xpath = "//input[@class='rc-time-picker-panel-input']")
    public WebElement selectTimeDropdown;
    @FindBy(xpath = "//div[@class='rc-time-picker-panel-select']//li")
    public List<WebElement> selectHourMinButtons;
    @FindBy(xpath = "//span[text()='Registered Clients']")
    public WebElement registeredClientText;
    @FindBy(xpath = "//input[@id='registeredClients']")
    public WebElement registeredClientButton;
    @FindBy(xpath = "//span[text()='New Client (Enter Manually)']")
    public WebElement newClientText;
    @FindBy(xpath = "(//input[@class='ant-select-selection-search-input'])[6]")
    public WebElement inputClients;
    @FindBy(xpath = "//span[@class='ant-select-selection-item']")
    public List<WebElement> selectClients;
    @FindBy(xpath = "//iframe[@id='tiny-react_2195370641701023391094_ifr']")
    public WebElement iframeTherapistNote;
    @FindBy(xpath = "//body[@id='tinymce']")
    public WebElement therapistNote;
    @FindBy(xpath = "//input[@class='ant-checkbox-input']")
    public List<WebElement> checkBoxesOnFooter;
    @FindBy(xpath = "//button[@id='submit']")
    public WebElement submitButton;
    @FindBy(xpath = "//div[@class='ant-message-custom-content ant-message-success']")
    public WebElement meetingMsg;



}
