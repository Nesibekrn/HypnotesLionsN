package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClientsPage extends CommonPage{

    @FindBy(xpath = "//a[@href='/dashboard/clients']")
    public WebElement clients_button;

}
