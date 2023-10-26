package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
<<<<<<< HEAD
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginPage extends CommonPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);//bu sayfaya gel driver'da bu locate i bul page factory sayesinde
    }

    @FindBy(xpath = "//span[@class='ant-typography style_logInBtn__PV10a css-15rg2km' and @data-test-id='loginScreen_logIn']")
    public WebElement Login;


    @FindBy(xpath = "//a[@href='/reset-password']")
    public WebElement ForgotYourPassword;

    @FindBy(xpath = "//h3")
    public WebElement ForgotYourPasswordWindow;

    @FindBy(xpath = "//input[@data-test-id='Forgot_password_inputBox']")
    public WebElement ButtonEmail;


    @FindBy(xpath = "//button[@data-test-id='Forgot_password_sendEmailButton']")
    public WebElement ButtonSendEmail;


    @FindBy(xpath = "//div[@class='ant-message-custom-content ant-message-success']")
    public WebElement Alert;

    @FindBy(xpath = "//button[@id='accept']")
    public WebElement MailCookies;

    @FindBy(xpath = "//input[@placeholder='Saisissez une adresse ici']")
    public WebElement MailSaissirAdresse;



    @FindBy(xpath = "//input[@placeholder='Your Email Address']")
    public WebElement EmailAddressForNewPassword ;


    @FindBy(xpath = "//input[@placeholder='New Password' and @type='password' and @data-test-id='newPassword_newPassword' and @id='plainPassword']")
    public WebElement NewPasswordforRESET;

    @FindBy(xpath = "//input[@placeholder='Confirm Password']")
    public WebElement ComfirmPassword ;


    @FindBy(xpath = "//button[@data-test-id='newPassword_submitButton']")
    public WebElement Submitbutton;














=======

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
>>>>>>> main



}
