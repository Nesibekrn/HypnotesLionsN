package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ServicesPage extends CommonPage {
    @FindBy(xpath = "//a[@href=='/dashboard/services']")
    public WebElement services_buton;
}
