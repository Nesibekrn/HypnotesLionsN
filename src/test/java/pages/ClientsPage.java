package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ClientsPage extends CommonPage{

    @FindBy(xpath = "//a[@href='/dashboard/clients']")
    public WebElement clients_button;

    @FindBy(xpath = "//div[@class='ant-card ant-card-bordered css-aqx16b']")
    public List<WebElement> allClients;

    @FindBy(xpath = "//span[@data-test-id=\"dashboard_clients_invoices\"]")
    public WebElement invoices;

    @FindBy(xpath = "(//div[@class='view invoices_w60__nfXh_'])[1]")
    public WebElement invoiceNo;

    @FindBy(xpath = "(//div[@class='view invoices_w60__nfXh_'])[2]")
    public WebElement invoiceDate;

    @FindBy(xpath = "(//div[@class='view invoices_w60__nfXh_'])[3]")
    public WebElement dueDate;



}
