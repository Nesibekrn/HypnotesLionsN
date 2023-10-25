package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonPage{
    @FindBy(xpath = "//input[@name='username']")
    public WebElement email_login;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement password_Login;
    @FindBy(xpath = "//button[@class='ant-btn css-15rg2km ant-btn-default LoginForm_loginBtn__1yNyd']")
    public WebElement login_button;
    @FindBy(xpath = "//span[@data-test-id='loginScreen_logIn']")
    public WebElement loginButton;

    @FindBy(xpath = "(//div[@class='LoginForm_fontSmall__y0l1R'])[4]")
    public WebElement loginWithApple;

    @FindBy(xpath = "(//div[@class='LoginForm_fontSmall__y0l1R'])[3]")
    public WebElement loginWithLinkedIn;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement emailApple;

    @FindBy(xpath = "//input[@id='password_text_field']")
    public WebElement passwordApple;

    @FindBy(xpath = "//a[@class='ant-dropdown-trigger']")
    public WebElement profile;
    //login olmayi assert etmek icin

    @FindBy(xpath = "//button[@id='sign-in']")
    public WebElement emailSend;

    @FindBy(xpath = "//div[@class='overflow-text']")
    public WebElement continuerButton;

    @FindBy(xpath = "//button[@id='unlock-account-1698098954911-9']")
    public WebElement alertMessage;

    @FindBy(xpath = "//a[@href='/login/client']")
    public WebElement clientLogin_link;
    @FindBy(xpath = "//a[@href='/reset-password']")
    public WebElement forgotYourPassword_link;
    @FindBy(css = "[data-test-id='loginPage_do_you_have_an_account']")
    public WebElement needAnAccount_link;
    @FindBy(xpath = "//span[@class='ant-btn-icon']")
    public WebElement showPassword_icon;



}
