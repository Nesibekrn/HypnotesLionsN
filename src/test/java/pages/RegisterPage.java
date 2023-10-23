package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegisterPage extends CommonPage{


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


}

