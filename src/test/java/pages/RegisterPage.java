package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends CommonPage{
    @FindBy(xpath="//span[contains(text(),'Sign Up for Free')]")
    public WebElement signUpForFree;

    @FindBy(css = "div.register_wrapper___MAvD div.register_row__XC4up div.register_col__zTnRz div.RegisterForm_formContanier__TUs7y div.RegisterForm_form__n23C0 div.RegisterForm_formGroup__03WXK:nth-child(1) div.RegisterForm_scoialIconContanier__gaFVJ a:nth-child(1) > div.RegisterForm_socRowCont__fpaxX")
    public WebElement signWithGoogle;

    @FindBy(linkText = "I am a Client")
    public WebElement clientLogin;
    @FindBy(xpath="//span[contains(text(),\"Next\")]")
    public WebElement nextButton;
    @FindBy(xpath="//input[@id=\"identifierId\"]")
    public WebElement  emailOrPhone;
    @FindBy(xpath="//input[@name=\"Passwd\"]")
    public WebElement  passwordGoogle;


    @FindBy(xpath="//header/div[1]/div[2]/div[6]/a[1]/span[1]/span[1]")
    public WebElement  nameAvatar;




    @FindBy(xpath = "//input[@placeholder=' Name']")
    public WebElement inputName;


    @FindBy(xpath = "//input[@placeholder='Surname']")
    public WebElement inputSurname;


    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement inputEmail;


    @FindBy(xpath = "//input[@placeholder=' Password']")
    public WebElement inputPassword;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signUpButton;


    @FindBy(xpath = "//h3[normalize-space()='Verify Email']")
    public WebElement verifyEmail;




    @FindBy(xpath = "//p[normalize-space()='8-50 characters']")
    public WebElement characterValidation ;


    @FindBy(xpath = "//p[normalize-space()='A lowercase letter']")
    public WebElement lowercaseLetterValidation;


    @FindBy(xpath = "//p[normalize-space()='A capital (uppercase) letter']")
    public WebElement uppercaseValidation;


    @FindBy(xpath = "//p[normalize-space()='A number']")
    public WebElement numberValidation;


    @FindBy(xpath = "//p[normalize-space()='A special character']")
    public WebElement specialCharacterValidation;


    @FindBy(xpath = "//span[@data-test-id=\"loginScreen_signUpIt'sFree\"]")
    public WebElement signupFreeButton;

    @FindBy(xpath ="//h3[@class='RegisterForm_formTitle__aW1LG']" )
    public WebElement registerAsaTherapist;

    @FindBy(xpath="//span[@class='ant-typography style_signUpBtn__JTRJm css-15rg2km']")
    public WebElement signUpFreeButton;
    @FindBy(xpath="//a[@data-test-id='registerPage_I_am_a_client']")
    public WebElement iAmClientButton;
    @FindBy(xpath="//button[@aria-label='Sign in']")
    public WebElement signInButtonLinkedin;
    @FindBy(xpath=" //input[@id='username']")
    public WebElement input_emailLinkedin;
    @FindBy(xpath=" //input[@id='password']")
    public WebElement input_passwordLinkedin;
    @FindBy(xpath="(//div[@class='RegisterForm_fontSmall__p6mzi'][normalize-space()='Sign in with Linkedin'])[1]")
    public WebElement signInWithLinkedinButton;

    @FindBy(xpath=" //button[@id='oauth__auth-form__submit-btn']")
    public WebElement allowButton;
}
