package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CalendarPage extends CommonPage {

    @FindBy(xpath = "//a[@href='/dashboard/calendar']")
    public WebElement calendar_buton;

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

}
