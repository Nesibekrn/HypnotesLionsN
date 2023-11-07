package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuestionariesPage extends CommonPage{
    @FindBy(xpath = "//a[text()='Questionnaires']")
    public WebElement QuestionnairesSectionBtn;
}
