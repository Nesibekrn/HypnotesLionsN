package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class CalendarPage extends CommonPage {

    @FindBy(xpath = "//a[@href='/dashboard/calendar']")
    public WebElement calendar_buton;
//    @FindBy(xpath = "//div[@class='fc-daygrid-day-frame fc-scrollgrid-sync-inner']/..")
//    public List<WebElement> currentDayElements;

    @FindBy(css = ".fc-daygrid-day-number")
    public List<WebElement> currentDayElements;

    @FindBy(xpath = "//span[text()='Schedule an Appointment']/..")
    public WebElement schedule_Appointment_title;

    @FindBy(xpath = "//input[@data-test-id='calender_schedule_customServiceButton']")
    public WebElement custom_Services_radioBtn;

    @FindBy(xpath = "//input[@data-test-id='calender_schedule_registeredButton']")
    public WebElement registered_Services_radioBtn;

}
