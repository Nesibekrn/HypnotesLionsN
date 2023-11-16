package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class CalendarPage extends CommonPage {

    @FindBy(xpath = "//a[@href='/dashboard/calendar']")
    public WebElement calendar_buton;
    @FindBy(xpath = "//div[@class='fc-daygrid-day-frame fc-scrollgrid-sync-inner']/..")
    public List<WebElement> currentDayElements;
    @FindBy(xpath = "//span[@data-test-id='calendar_tooltip_scheduleApp_onCalendar']")
    public WebElement schedule_Appointment_title;

    @FindBy(xpath = "//input[@id='registered']/following-sibling::*")
    public WebElement registered_Services_radioBtn;

}
