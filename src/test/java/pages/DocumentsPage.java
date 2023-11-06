package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DocumentsPage extends CommonPage{
    @FindBy(xpath="//a[@href='/dashboard/documents']")
    public WebElement documents_button;






}
