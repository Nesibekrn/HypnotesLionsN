package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends CommonPage{
    @FindBy(css = "span.ant-menu-title-content>[href$='/email-sms']")
    public WebElement email_smsLink_therapistDashboard;
    @FindBy(css="button.ant-btn-dangerous")
    public WebElement timeZonePopUP_NoButton;

}
