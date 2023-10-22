package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.Hooks;
import utilities.Driver;

public class HomePage extends CommonPage{
    Hooks hooks = new Hooks();
    WebDriver driver = null;

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="//*[@data-test-id='loginScreen_logIn']")
    public WebElement loginButton;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[2]/div[1]/div[1]")
    public WebElement ourPlatform;//09
    @FindBy(xpath = "//div[text()='Product Demo']")
    public WebElement productDemo;//09
    @FindBy(xpath = "//div[text()='How Does Hypnotes Work?']")
    public WebElement hynotesWork;//09
    @FindBy(xpath = "//div[text()='Pricing']")
    public WebElement pricing;//09
    @FindBy(xpath = "//div[text()='HIPAA Compliance']")
    public WebElement hipaaCompliance;//09

    @FindBy(xpath = "//div[text()='Secure Login, Account Verification & Data Storage']")
    public WebElement secureLogin;//09
    @FindBy(xpath = "//div[text()='Reviews/Testimonials']")
    public WebElement reviewsTestimonials;//09
    @FindBy(xpath = "//div[text()='Get Started For Free']")
    public WebElement getStarted;//09

}
