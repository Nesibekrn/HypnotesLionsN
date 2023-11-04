package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarPage extends CommonPage{
    @FindBy(xpath="//span[text()='Yes']")
    public WebElement popupPageYes;
    @FindBy(xpath="//li[@data-menu-id='rc-menu-uuid-06996-2-/dashboard/documents']")
    public WebElement documents_button;
}
