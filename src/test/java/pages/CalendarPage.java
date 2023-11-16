package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CalendarPage extends CommonPage{

    @FindBy(xpath="//a[@href='/dashboard/calendar']")
    public WebElement calendar_buton;
    @FindBy(xpath = "//div[@class=\"fc-daygrid-day-top\"]")
    public List<WebElement> currentDayElements;

}
