package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CalendarPage extends CommonPage{

    @FindBy(xpath="//a[@href='/dashboard/calendar']")
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
}
