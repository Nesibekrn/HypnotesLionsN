package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonPage{

    @FindBy(xpath="//*[@data-test-id='loginScreen_logIn']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[text()='Product Demo']")//us09
    public WebElement productDemo;
    @FindBy(xpath = "//div[text()='How Does Hypnotes Work?']")
    public WebElement hynotesWork;
    @FindBy(xpath = "//div[text()='Pricing']")
    public WebElement pricing;
    @FindBy(xpath = "//div[text()='HIPAA Compliance']")
    public WebElement hipaaCompliance;

    @FindBy(xpath = "//div[text()='Secure Login, Account Verification & Data Storage']")
    public WebElement secureLogin;

    @FindBy(xpath = "//div[text()='Reviews/Testimonials']")
    public WebElement reviewsTestimonials;
    @FindBy(xpath = "//div[text()='Get Started For Free']")
    public WebElement getStarted;//us09

}
