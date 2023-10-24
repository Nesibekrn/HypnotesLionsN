package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends CommonPage{

    @FindBy(xpath = "//span[@data-test-id=\"loginScreen_signUpIt'sFree\"]")
    public WebElement signupFreeButton;

    @FindBy(xpath ="//h3[@class='RegisterForm_formTitle__aW1LG']" )
    public WebElement registerAsaTherapist;

}
