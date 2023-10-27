package pages;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import static utilities.ReusableMethods.waitFor;

public class RegisterPage extends CommonPage{
    @FindBy(xpath="//span[@class='ant-typography style_signUpBtn__JTRJm css-15rg2km']")
    public WebElement signUpFreeButton;
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
}
