package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonPage{
    @FindBy(xpath="//*[@data-test-id='loginScreen_logIn']")
    public WebElement loginButton;

    @FindBy(id="facebookLink_footerLogo")
    public WebElement facebookIcon;

    @FindBy(id="linkedinLink_footerLogo")
    public WebElement linkedinIcon;

    @FindBy(id="twitterLink_footerLogo")
    public WebElement twitterIcon;

    @FindBy(id="instagramLink_footerLogo")
    public WebElement instagramIcon;
}
