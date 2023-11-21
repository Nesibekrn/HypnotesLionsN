package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarPage extends CommonPage{

    @FindBy(xpath="//a[@href='/dashboard/calendar']")
    public WebElement calendar_buton;

    @FindBy(xpath = "//tbody/tr[5]/td[3]/div[1]/div[1]")
    public WebElement anyDateButton;

    @FindBy(xpath = "//label[@title='Repeat Options']")
    public WebElement repeatOptionsButton;

    @FindBy(xpath = "//span[@title='Does not repeat']")
    public WebElement repeatOptionDropdownButton;

    @FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Daily']")
    public WebElement dailyButton;

    @FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Weekly']")
    public WebElement weeklyButton;

    @FindBy(xpath = "//div[contains(text(),'Biweekly')]")
    public WebElement biweeklyButton;

    @FindBy(xpath = "//div[@class='ant-select-item-option-content'][normalize-space()='Monthly']")
    public WebElement monthlyButton;

    @FindBy(xpath = "//div[contains(text(),'Does not repeat')]")
    public WebElement doesNotRepeatButton;
}
