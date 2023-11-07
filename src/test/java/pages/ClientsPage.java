package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClientsPage extends CommonPage{

   @FindBy(xpath = "//a[@href='/dashboard/clients']")
   public WebElement clients_button;

  @FindBy(xpath ="//span[@class='ant-typography ant-typography-success css-aqx16b']" )
   public WebElement viewDetailsButton;

    @FindBy(xpath ="//span[@data-test-id='dashboard_clients_sessions']")
    public WebElement sessionsButton;

    @FindBy(xpath = "//button[@class='ant-btn css-aqx16b ant-btn-primary']")
    public WebElement addNewSessionButton;
}
