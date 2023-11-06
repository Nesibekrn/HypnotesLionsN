package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

import static stepDefinitions.Hooks.driver;
import static utilities.ReusableMethods.waitFor;
import static utilities.ReusableMethods.waitForPageToLoad;

public class LoginPage extends CommonPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);//bu sayfaya gel driver'da bu locate i bul page factory sayesinde
    }
    //fatih
    @FindBy(xpath = "//span[@class='ant-typography style_signUpBtn__JTRJm css-15rg2km']")
    public WebElement SignUpForFree;
    @FindBy(xpath = "//input[@data-test-id=' registerPage_fullname']")
    public WebElement FullNameButtonForSignUpForFree;
    @FindBy(xpath = "//input[@data-test-id=' registerPage_email']")
    public WebElement EmailButtonForSignUpForFree;
    @FindBy(xpath = "//input[@data-test-id=' registerPage_password']")
    public WebElement PasswordButtonForSignUpForFree;
    @FindBy(xpath = "//button[@data-test-id='registerPage_signup_button']")
    public WebElement SignUpButtonForSignUpForFree;
    @FindBy(xpath = "//a[contains(text(),'VERIFY EMAIL')]")
    public WebElement ButtonVERIFYeMAIL;


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
    @FindBy(xpath = "//i[@class='material-icons-outlined f36']")
    public WebElement MailSaissirAdresseClick;
    @FindBy(xpath = "//button[@id='refresh']")
    public WebElement MailSaissirRefresh;

    @FindBy(xpath = "//div[@class='bname']")
    public WebElement YopmailMailAdress;

    @FindBy(xpath = "(//p[@class='RegisterForm_differentAccount__riHel'])[1]")
    public WebElement VerifyMailmesajVerificationforYopmail;


    @FindBy(xpath = "//iframe[@id='ifmail']")
    public WebElement IframeYopmail;

    @FindBy(xpath = "//a[contains(text(),'PASSWORD RESET')]")
    public WebElement PasswordResetButton;




    @FindBy(xpath = "//input[@data-test-id=' newPassword_yourMailAddress']")
    public WebElement EmailAddressForNewPassword;


    @FindBy(xpath = "//input[@data-test-id='newPassword_newPassword']")
    public WebElement NewPasswordforRESET;

    @FindBy(xpath = "//input[@data-test-id='newwPassword_confirmPassword']")
    public WebElement ComfirmPassword;

    @FindBy(xpath = "//button[@data-test-id='newPassword_submitButton']")
    public WebElement Submitbutton;



    @FindBy(xpath = "//p[contains(text(),'Password has been updated')]")
    public WebElement MessagePasswordHasBeenUpdated;

    @FindBy(xpath = "//span[contains(text(),'Go to the Login Page')]")
    public WebElement ButtonGoToLoginPage;


    @FindBy(xpath = "//input[@data-test-id='loginAsClientPage_password']")
    public WebElement PasswordButton;
    @FindBy(xpath = "//button[@data-test-id='loginAsClientPage_loginButton']")
    public WebElement LoginButtonforSignIn;

    @FindBy(xpath = "//input[@data-test-id='loginAsClientPage_email']")
    public WebElement ButtonEMAILFORLOGIN;
















    //FATIH YILMAZ UST









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
    public WebElement alertMessageK;


    @FindBy(xpath = "//a[@href='/login/client']")
    public WebElement clientLogin_link;
    @FindBy(xpath = "//a[@href='/reset-password']")
    public WebElement forgotYourPassword_link;
    @FindBy(css = "[data-test-id='loginPage_do_you_have_an_account']")
    public WebElement needAnAccount_link;
    @FindBy(xpath = "//span[@class='ant-btn-icon']")
    public WebElement showPassword_icon;

    @FindBy(xpath = "//div[@class='LoginForm_formTitle__yLRNe']")
    public WebElement therapistLogin;

    @FindBy(xpath = "//div[@class='RegisterForm_formTitle__aW1LG']")
    public WebElement registerAsATherapist;

    @FindBy(xpath="//div[@class='LoginForm_fontSmall__y0l1R'][normalize-space()='Sign in with Facebook']")
    public WebElement signInWithFacebook;

    @FindBy(xpath="//input[@id='email']")
    public WebElement input_emailFacebook;

    @FindBy(xpath=" //input[@id='pass']")
    public WebElement input_PassFacebook;

    @FindBy(xpath="//button[@id='loginbutton']")
    public WebElement loginButtonFacebook;

    @FindBy(xpath="//input[@id='username']")
    public WebElement emailLinkedIn;

    @FindBy(xpath="//input[@id='password']")
    public WebElement passwordLinkedIn;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement signInWithLinkedIn;
    @FindBy(xpath="//span[@class='form__label--error--link unify_join_error_no_account']")
    public WebElement errorMessage_LinkIn;

    @FindBy(xpath="//a[@class='ant-dropdown-trigger ant-dropdown-open']")
    public WebElement profileDDM;
    @FindBy(xpath="//h2[@id=\"alertInfo\"]")
    public WebElement errorMessage_Apple;



    @FindBy(xpath="//button[@data-test-id=\"loginAsClientPage_loginButton\"]")
    public WebElement ClientloginButton;



    // @FindBy(xpath="span[@data-test-id='loginScreen_logIn']")
   // public WebElement login button;

   // @FindBy(xpath = "//input[@data-test-id='loginAsClientPage_email']")
    //public WebElement email_login;

  //  @FindBy(xpath = "//input[@data-test-id='loginAsClientPage_password']")
    //public WebElement password_login;

   // @FindBy(xpath = "//button[@data-test-id='loginAsClientPage_loginButton']")
   // public WebElement Login_button;


//button[@class="ant-btn css-15rg2km ant-btn-round ant-btn-primary ant-btn-sm ant-btn-background-ghost"]

    public void ThrerapistLogIn(String userEmail,String userPassword){
        driver.get("https://test.hypnotes.net/login");
        email_login.sendKeys(userEmail);
        password_Login.sendKeys(userPassword);
        waitFor(1);
        login_button.click();
       waitForPageToLoad(2);


    }

    public void clientLogIn(String userEmail,String userPassword){
        driver.get("https://test.hypnotes.net/login/client");
        email_login.sendKeys(userEmail);
        password_Login.sendKeys(userPassword);
        login_button.click();
        waitForPageToLoad(5);


    }
}
