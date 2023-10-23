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

    /*@FindBy(xpath = "//*[@id=\"rc_select_0\"]")
    ///html/body/div[1]/div/div[1]/div/div[3]/span[1]/div/div/span[1]/input
    ///html/body/div[1]/div/div[1]/div/div[3]/span[1]/div/div/span[1]/input
    public WebElement usaFlag;*/

    @FindBy(xpath = "//input[@aria-activedescendant=\"rc_select_0_list_0\"]")
    public WebElement usaFlag;

    @FindBy(xpath = "//input[@aria-activedescendant=\"rc_select_0_list_1\"]")
    public WebElement turkiyeFlag;

    @FindBy(xpath = "//input[@aria-activedescendant=\"rc_select_0_list_2\"]")
    public WebElement germanyFlag;

    @FindBy(xpath = "//input[@aria-activedescendant=\"rc_select_0_list_3\"]")
    //aria-activedescendant="rc_select_1_list_3"
    public WebElement franceFlag;

    @FindBy(xpath = "//input[@aria-activedescendant=\"rc_select_0_list_4\"]")
    public WebElement russiaFlag;

    @FindBy(xpath = "//input[@aria-activedescendant=\"rc_select_0_list_5 \"]")
    //@FindBy(xpath ="//input([@aria-activedescendant=\"rc_select_1_list_5]")
    public WebElement spainFlag;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[2]/div/div[1]/h1")
    public WebElement sayfaSlogani;
    ////*[@id="__next"]/div/main/div[2]/div/div[1]/h1
















}
