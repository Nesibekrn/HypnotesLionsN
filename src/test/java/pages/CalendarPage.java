package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarPage extends CommonPage{

    @FindBy(xpath="//a[@href='/dashboard/calendar']")
    public WebElement calendar_buton;

    @FindBy (xpath ="//a[@aria-label=\"December 9, 2023\"]")
    public WebElement nine_December_Button;

    @FindBy (xpath ="//input[@data-test-id=\"calender_schedule_customServiceButton\"]")
    public WebElement custom_Service_Button;

    @FindBy (xpath ="//input[@id=\"basic_title\"]")
    public WebElement service_Name_Button;

    @FindBy (xpath ="//input[@class=\"ant-input-number-input\"]")
    public WebElement price_GBP_Button;

    @FindBy (xpath ="//input[@id=\"basic_duration\"]")
    public WebElement duration_Button;

    @FindBy (xpath ="//input[@id=\"basic_categoryTypeId\"]")
    public WebElement service_Type_Button;

    @FindBy (xpath ="//button[@id=\"submit\"]")
    public WebElement submit_Button;

}
