package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.github.javafaker.Faker;
import org.junit.Assert;
import java.util.List;
import static utilities.ReusableMethods.waitFor;

public class RegisterPage extends CommonPage {
    @FindBy(xpath = "//span[contains(text(),'Sign Up for Free')]")
    public WebElement signUpForFree;

    @FindBy(css = "div.register_wrapper___MAvD div.register_row__XC4up div.register_col__zTnRz div.RegisterForm_formContanier__TUs7y div.RegisterForm_form__n23C0 div.RegisterForm_formGroup__03WXK:nth-child(1) div.RegisterForm_scoialIconContanier__gaFVJ a:nth-child(1) > div.RegisterForm_socRowCont__fpaxX")
    public WebElement signWithGoogle;


    @FindBy(xpath="//div[@data-test-id='registerAs_a_clientPage_signInWithFacebook']")
    public WebElement signWithFacebook;

    @FindBy(linkText = "I am a Client")
    public WebElement clientLogin;
    @FindBy(xpath = "//span[contains(text(),\"Next\")]")
    public WebElement nextButton;
    @FindBy(xpath = "//input[@id=\"identifierId\"]")
    public WebElement emailOrPhone;
    @FindBy(xpath = "//input[@name=\"Passwd\"]")
    public WebElement passwordGoogle;

    @FindBy(xpath = "//header/div[1]/div[2]/div[6]/a[1]/span[1]/span[1]")
    public WebElement nameAvatar;

    @FindBy(xpath = "//a[.='I am a Client']")
    public WebElement ButtonIAmAClient;

    @FindBy(xpath = "//a[.='Already have an account?']")
    public WebElement ButtonAlreadyHaveAnAccount;

    @FindBy(xpath = "//a[.='Therapist Login']")
    public WebElement ButtonTherapistLogin;

    @FindBy(xpath = "//input[@name='fullname']")
    public WebElement InputFullName;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement InputEmail;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement InputPassword;

    @FindBy(xpath = "//button[@data-test-id='registerPage_signup_button']")
    public WebElement ButtonSignUp;

    @FindBy(css = "[data-test-id='registerAsClientPage_name']")
    public WebElement inputName;


    @FindBy(xpath = "//input[@placeholder='Surname']")
    public WebElement inputSurname;


    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement inputEmail;


    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement inputPassword;


    @FindBy(xpath = "//h3[normalize-space()='Verify Email']")
    public WebElement verifyEmail;


    @FindBy(xpath = "//p[normalize-space()='8-50 characters']")
    public WebElement characterValidation;


    @FindBy(xpath = "//p[normalize-space()='A lowercase letter']")
    public WebElement lowercaseLetterValidation;


    @FindBy(xpath = "//p[normalize-space()='A capital (uppercase) letter']")
    public WebElement uppercaseValidation;


    @FindBy(xpath = "//p[normalize-space()='A number']")
    public WebElement numberValidation;


    @FindBy(xpath="//a[@data-test-id='registerPage_I_am_a_client']")
    public WebElement iAmClient;

    @FindBy(xpath="//input[@name='name']")
    public WebElement clientName;

    @FindBy(xpath="//input[@name='surname']")
    public WebElement clientSurname;

    @FindBy(xpath="//input[@name='email']")
    public WebElement clientEmail;

    @FindBy(xpath="//input[@name='password']")
    public WebElement clientPassword;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement signUpButton;

    @FindBy(xpath="//h3[normalize-space()='Verify Email']")
    public WebElement verifyEmailText;

    @FindBy(xpath="//div[@class='register_col__zTnRz']")
    public List<WebElement> verifyEmailWindow;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement sendAgain;

    @FindBy(xpath="//div[@class='ant-message-notice-content']")
    public WebElement popUpMessage;

    public void creatingValidCredentials(){
        Faker faker = new Faker();
        clientName.sendKeys(faker.name().firstName());
        clientSurname.sendKeys(faker.name().lastName());
        clientEmail.sendKeys(faker.internet().emailAddress());
        clientPassword.sendKeys("Aa1!aaaa");
        waitFor(1);
        signUpButton.click();
        waitFor(3);
    }

    public void verifyEmailAllTexts(){
        for (int i = 0; i < verifyEmailWindow.size(); i++) {
            WebElement element = verifyEmailWindow.get(i);
            waitFor(1);
            Assert.assertTrue(element.isDisplayed());
            waitFor(1);
        }
    }

    @FindBy(xpath = "//p[normalize-space()='A special character']")
    public WebElement specialCharacterValidation;


    @FindBy(xpath = "//input[@name='fullname']")
    public WebElement input_fullName;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement input_email;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement input_password;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement button_signUp;
    @FindBy(xpath = "//h3[.='Verify Email']")
    public WebElement header_verifyEmail;
    @FindBy(xpath = "//span[.='Validation error.']")
    public WebElement popUp_validationError;

    @FindBy(xpath = "//span[@data-test-id=\"loginScreen_signUpIt'sFree\"]")
    public WebElement signupFreeButton;

    @FindBy(xpath = "//h3[@class='RegisterForm_formTitle__aW1LG']")
    public WebElement registerAsaTherapist;

    @FindBy(xpath = "//span[@class='ant-typography style_signUpBtn__JTRJm css-15rg2km']")
    public WebElement signUpFreeButton;
    @FindBy(xpath = "//a[@data-test-id='registerPage_I_am_a_client']")
    public WebElement iAmClientButton;
    @FindBy(xpath = "//button[@aria-label='Sign in']")
    public WebElement signInButtonLinkedin;
    @FindBy(xpath = " //input[@id='username']")
    public WebElement input_emailLinkedin;
    @FindBy(xpath = " //input[@id='password']")
    public WebElement input_passwordLinkedin;
    @FindBy(xpath = "(//div[@class='RegisterForm_fontSmall__p6mzi'][normalize-space()='Sign in with Linkedin'])[1]")
    public WebElement signInWithLinkedinButton;

    @FindBy(xpath = " //button[@id='oauth__auth-form__submit-btn']")
    public WebElement allowButton;


    //VerifyEmail Locators

    @FindBy(xpath = "//input[@id='login']")
    public WebElement yopmailEmail;
    @FindBy(xpath = "//i[contains(text(),'\uE5C8')]")
    public WebElement yopmailEmailInbox;

    @FindBy(xpath="//a[contains(text(),\"VERIFY EMAIL\")]")
    public WebElement verifyEmailYopmailInbox;


    @FindBy(xpath="//iframe[@id=\"ifmail\"]")
    public WebElement verifyEmailFrame;



    @FindBy(xpath="(//div[@class='RegisterForm_socRowCont__fpaxX'])[4]")
    public WebElement signInWithApple;
    @FindBy(css="#account_name_text_field ")
    public WebElement inputMail;
    @FindBy(css="#password_text_field")
    public WebElement enterPassword;
    @FindBy(xpath="//i[@class='shared-icon icon_sign_in']")
    public WebElement next_button;
    @FindBy(xpath ="//button[@type='button'][1]")
    public WebElement continueButton;
    @FindBy(css=".ac-localnav-title")
    public WebElement alertPage;

    //Webelemnts for US_020
    @FindBy(xpath="//a[text()='I am a Client']")
    private WebElement amAclient_Link;
    public void verifyIamAclientLink(String expectedLinkName){
        Assert.assertEquals(expectedLinkName,amAclient_Link.getText());
        Assert.assertTrue(amAclient_Link.isEnabled() && amAclient_Link.isDisplayed());

    }
    @FindBy(css = "[data-test-id='register_as_a_client']")
    public WebElement registerAsAClientText;

    @FindBy(xpath = "//a[@id='social-media-login-logo-g'][1]")
    public WebElement loginWithGoogle;
    @FindBy(xpath ="//input[@id='identifierId']")
    public WebElement emailGoogle;
    @FindBy(xpath = "//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']")
    public WebElement nextGoogle;
    @FindBy(xpath = "//div[@class='rFrNMe ze9ebf YKooDc wIXLub zKHdkd sdJrJc']")
    public WebElement passwordGooglee;
  //  @FindBy(xpath = "//span[@data-test-id='loginScreen_signUpIt'sFree_forMobile']")
    ////                 span[@data-test-id='loginScreen_logIn']
    // public WebElement registerloginButton;

    @FindBy(xpath = "//span[text()='Login']")
    public WebElement registerloginButton;

    @FindBy(xpath = "(//div[@class='RegisterForm_fontSmall__p6mzi'])[3]")
    public WebElement signInWithLinkedin;

    @FindBy(id="username")
    public WebElement linkedInUserName;

    @FindBy(id="password")
    public WebElement linkedInPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement linkedInSignInButton;

    @FindBy(xpath = "//h1[starts-with(text(),'Hızlıca')]")
    public WebElement linkedInTurkceDogrulamaMesaji;

    @FindBy(xpath = "//h1[starts-with(text(),'Let')]")
    public WebElement linkedInEnglishVerificationMessage;
}
