package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClientsPage extends CommonPage{

    @FindBy(xpath = "//a[@href='/dashboard/clients']")
    public WebElement clients_button;

    @FindBy(xpath = "//span[text()='Import Client']")
    public WebElement importClientsButton;

    @FindBy(xpath = "//div[text()='Choose Import Method']")
    public WebElement chooseImportMethodWindow;

    @FindBy(xpath = "//body/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/button[4]")
    public WebElement easyPracticeMethod;

    @FindBy(xpath = "//input[@class=\"custom-file-input\"]")
    public WebElement chooseFileForEasyPractice;

    @FindBy(xpath = "//span[text()='Upload']")
    public WebElement uploadButtonForEasyPractice;


    @FindBy(xpath = "//h5[contains(text(),\"Zeynep butterfly\")]")
    public WebElement importedClient;


}
