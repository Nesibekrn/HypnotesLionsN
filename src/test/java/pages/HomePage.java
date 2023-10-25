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

    @FindBy(xpath = "//*[@id=\"__next\"]/div/div[1]/div/div[3]/span[1]/div")
    public WebElement languageButton;

    @FindBy(xpath = "(//div[contains(@class,'ant-select-item-option')]/div)[1]")
    public WebElement usaFlag;

    @FindBy(xpath = "(//div[contains(@class,'ant-select-item-option')]/div)[2]")
    public WebElement turkiyeFlag;

    @FindBy(xpath = "(//div[contains(@class,'ant-select-item-option')]/div)[3]")
    public WebElement germanyFlag;

    @FindBy(xpath ="(//div[contains(@class,'ant-select-item-option')]/div)[4]")

    public WebElement franceFlag;

    @FindBy(xpath ="(//div[contains(@class,'ant-select-item-option')]/div)[5]")
    public WebElement russiaFlag;

    @FindBy(xpath = "(//div[contains(@class,'ant-select-item-option')]/div)[6]")
    public WebElement spainFlag;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[2]/div/div[1]/h1")
    public WebElement sayfaSlogani;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[2]/div/div[3]/h3")
    public WebElement paraTasarrufu;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[2]/div/div[2]/h3")
    public WebElement leSloganim;















}
