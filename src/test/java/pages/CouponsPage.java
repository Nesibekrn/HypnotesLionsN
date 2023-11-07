package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CouponsPage extends  CommonPage{


    @FindBy(xpath = "//a[@href='/dashboard/calendar']")
    public WebElement CouponsButton;




}
