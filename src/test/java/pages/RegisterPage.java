package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends CommonPage {
    @FindBy(xpath = "//span[contains(text(),'Sign Up for Free')]")
    public WebElement signUpForFree;

    @FindBy(css = "div.register_wrapper___MAvD div.register_row__XC4up div.register_col__zTnRz div.RegisterForm_formContanier__TUs7y div.RegisterForm_form__n23C0 div.RegisterForm_formGroup__03WXK:nth-child(1) div.RegisterForm_scoialIconContanier__gaFVJ a:nth-child(1) > div.RegisterForm_socRowCont__fpaxX")
    public WebElement signWithGoogle;

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



}