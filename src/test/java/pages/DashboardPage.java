package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends CommonPage{

    @FindBy(xpath = "//a[@href='/dashboard']")
    public WebElement DashboardButton;


}
