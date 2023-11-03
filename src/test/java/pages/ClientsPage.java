package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClientsPage extends CommonPage{

   @FindBy(xpath = "//a[@href='/dashboard/clients']")
   public WebElement clients_button;

   // @FindBy(xpath = "//*[@id=\"__next\"]/div/div/section/aside/div[1]/div[2]/ul/li[4]/span[2]/a")
    //public WebElement clients_button;
}
