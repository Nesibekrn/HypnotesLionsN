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
    @FindBy(xpath = "///div[@title='Day']")
    public WebElement dayButton;
    @FindBy(xpath = "//h2[text()='November 2023']")
    public WebElement monthPage;
    @FindBy(xpath = "//span[@class='fc-icon fc-icon-chevron-right']")
    public WebElement nextMonthButton;
    @FindBy(xpath = "//h2[text()='December 2023']")
    public WebElement nextMonthPage;
    @FindBy(xpath ="//div[@class='fc-timegrid-now-indicator-container'] ")
    public List<WebElement> daysColumn;


}
