package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CalendarPage extends CommonPage{

    @FindBy(xpath="//a[@href='/dashboard/calendar']")
    public WebElement calendar_buton;

    @FindBy(xpath = "//div[@class='ant-select css-aqx16b ant-select-single ant-select-show-arrow']")
    public WebElement scheduleButton;

   @FindBy(xpath="//div[@class='ant-select-item-option-content']")
   public List<WebElement>scheduleMenu;

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

    @FindBy(xpath ="//button[@data-test-id='calendar_actionButton_scheduleBtn']")
    public WebElement scheduleAppointment_button;

    @FindBy(xpath ="//button[@data-test-id='calenderPage_addNewEvent_Button']")
    public WebElement addNewEvent_button;

    @FindBy(xpath ="//button[@calendar_actionButton_blockTimeBtn']")
    public WebElement blockTime_button;

    @FindBy(xpath ="//button[@calendar_actionButton_schedulingSettingsBtn']")
    public WebElement schedulingSetting_button;

    @FindBy(xpath = "//div[text()='Schedule an Appointment']")
    public WebElement scheduleTitle;

    @FindBy(xpath = "//span[@aria-label='close']")
    public WebElement closeButton;



}
