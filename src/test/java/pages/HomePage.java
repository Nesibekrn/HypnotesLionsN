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
    @FindBy(xpath = "//span[text()='Payment Service']")
    public WebElement secondHeader;
    @FindBy(xpath = "//span[@data-test-id='loginScreen_features']")
    public WebElement features;
    @FindBy(xpath = "//span[@data-test-id='loginScreen_pricing']")
    public WebElement Pricing;
    @FindBy(xpath = "//span[@data-test-id='loginScreen_resources']")
    public WebElement resources;
    @FindBy(xpath = "//span[@data-test-id='loginScreen_contactUs']")
    public WebElement contactUs;
    @FindBy(xpath = "//div[@class='ant-select-selector']")
    public WebElement language;
    @FindBy(xpath = "//span[@class='ant-typography style_signUpBtn__JTRJm css-15rg2km']")
    public WebElement SignUPForFree;
    @FindBy(xpath = "//div[text()='FEATURES']")
    public WebElement featuresText;
    @FindBy(xpath = "//h1")
    public WebElement pricingText;
    @FindBy(xpath = "//div[text()='RESOURCES']")
    public WebElement ressourcesText;
    @FindBy(xpath = "//p[@class='ContactForm_formTitle__JMH9d']")
    public WebElement contactUsText;













}
