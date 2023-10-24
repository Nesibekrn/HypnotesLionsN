package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends CommonPage{
    @FindBy(xpath="//*[@data-test-id='loginScreen_logIn']")
    public WebElement loginButton;

    @FindBy(css = "h5[style='font-size: 25px; font-weight: 600; padding: 10px;']")
    public List<WebElement> listTitles;

    @FindBy(xpath = "//a[@class='ant-btn css-15rg2km ant-btn-link features-btn']")
    public List<WebElement> listHeader;
    @FindBy(xpath = "(//img[@alt='logo'])[2]")
    public WebElement faceBookIcon;
    @FindBy(xpath = "(//img[@alt='logo'])[3]")
    public WebElement linkedinIcon;
    @FindBy(xpath = "(//img[@alt='logo'])[4]")
    public WebElement xIcon;
    @FindBy(xpath = "(//img[@alt='logo'])[5]")
    public WebElement instagramIcon;
    @FindBy(xpath = "//input[@data-test-id='mainPage_enterYourEmailAddress_input']")
    public WebElement inputEmailFooter;
    @FindBy(xpath = "//button[@data-test-id='mainPage_SignUpButton']")
    public WebElement signUpButtonFooter;
    @FindBy(xpath = "//i[@class='x1b0d499 xmgbrsx']")
    public WebElement faceBookX;



















}
