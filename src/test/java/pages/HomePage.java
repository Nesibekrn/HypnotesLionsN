package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonPage{
    @FindBy(xpath="//*[@data-test-id='loginScreen_logIn']")
    public WebElement loginButton;
}
