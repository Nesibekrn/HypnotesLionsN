package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClientsPage extends CommonPage{

   @FindBy(xpath = "//a[@href='/dashboard/clients']")
   public WebElement clients_button;

  @FindBy(xpath ="//span[@class='ant-typography ant-typography-success css-aqx16b']" )
   public WebElement viewDetailsButton;

   // @FindBy(xpath ="(//span[@class='ant-typography ant-typography-success css-aqx16b'])[1]")
    //public WebElement viewDetailsButton;

    @FindBy(xpath ="//span[@data-test-id='dashboard_clients_sessions']")
    public WebElement sessionsButton;

    @FindBy(xpath = "(//button[@class='ant-btn css-aqx16b ant-btn-primary'])[1]")
    public WebElement addNewSessionButton;

    //@FindBy(xpath = "(//div[@class='ant-tabs-tab-btn'])[8]")
    //public WebElement session1button;

    @FindBy(xpath = "(//label[@style='color: rgb(0, 0, 0); font-size: 1.1rem; margin-top: 10px;'])[1]")
    public WebElement dateButton;

    @FindBy(xpath = "//label[@style='color: rgb(0, 0, 0); font-size: 1.1rem; margin-top: 20px; margin-bottom: 10px;']")
    public WebElement associatedIssues;

    @FindBy(xpath = "(//label[@style='color: rgb(0, 0, 0); font-size: 1.1rem; margin-top: 20px; margin-bottom: 10px;'])[2]")
    public WebElement keyPoint;

    @FindBy(xpath = "(//label[@style='color: rgb(0, 0, 0); font-size: 1.1rem; margin-top: 20px; margin-bottom: 10px;'])[3]")
    public WebElement afterThought;

    @FindBy(xpath = "(//label[@style='color: rgb(0, 0, 0); font-size: 1.1rem; margin-top: 20px; margin-bottom: 10px;'])[4]")
    public WebElement applicationsSuggestions;

    @FindBy(xpath = "(//label[@style='color: rgb(0, 0, 0); font-size: 1.1rem; margin-top: 20px; margin-bottom: 10px;'])[5]")
    public WebElement attachments;

    @FindBy(xpath = "(//label[@style='color: rgb(0, 0, 0); font-size: 1.1rem; margin-top: 20px; margin-bottom: 10px;'])[2]")
    public WebElement voiceNotes;

}
