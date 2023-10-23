package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonPage{
    @FindBy(xpath = "//span[@data-test-id='loginScreen_logIn']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='LoginForm_fontSmall__y0l1R']")
    public WebElement loginWithApple;

    @FindBy(xpath = "//div[@class='LoginForm_fontSmall__y0l1R']")
    public WebElement loginWithLinkedIn;

    @FindBy(xpath = "//input[@id='account_name_text_field']")
    public WebElement emailApple;

    @FindBy(xpath = "//input[@id='password_text_field']")
    public WebElement passwordApple;

    @FindBy(xpath = "//a[@class='ant-dropdown-trigger']")
    public WebElement profile;
    //login olmayi assert etmek icin

}
