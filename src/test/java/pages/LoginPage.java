package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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

















}
