package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarPage extends CommonPage{

    @FindBy(xpath="//a[@href='/dashboard/calendar']")
    public WebElement calendar_buton;
}
