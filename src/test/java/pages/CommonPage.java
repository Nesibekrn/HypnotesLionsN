package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static stepDefinitions.Hooks.driver;

public abstract class CommonPage {
    public CommonPage(){
        PageFactory.initElements(driver,this);


    }
    public HomePage homePage;
    public LoginPage loginPage;
    public RegisterPage registerPage;
    public CalendarPage calendarPage;
    public AccountPage accountPage;
    public ClientsPage clientsPage;
    public CouponsPage couponsPage;
    public DashboardPage dashboardPage;
    public DocumentsPage documentsPage;
    public EmailSmsPage emailSmsPage;
    private QuestionariesPage questionariesPage;
    public ServicesPage servicesPage;
    public SettingsPage settingsPage;

    public HomePage getHomePage(){
        if(homePage==null){
            homePage=new HomePage();
        }
        return homePage;
    }
    public RegisterPage getRegisterPage(){
        if(registerPage==null){
            registerPage=new RegisterPage();
        }
        return registerPage;
    }
    public AccountPage getAccountPage(){
        if(accountPage==null){
            accountPage=new AccountPage();
        }
        return accountPage;
    }
    public CalendarPage getCalendarPage(){
        if(calendarPage==null){
            calendarPage=new CalendarPage();
        }
        return calendarPage;
    }
    public ClientsPage getClientsPage(){
        if(clientsPage==null){
            clientsPage=new ClientsPage();
        }
        return clientsPage;
    }
    public CouponsPage getCouponsPage(){
        if(couponsPage==null){
            couponsPage=new CouponsPage();
        }
        return couponsPage;
    }
    public DashboardPage getDashboardPage(){
        if(dashboardPage==null){
            dashboardPage=new DashboardPage();
        }
        return dashboardPage;
    }
    public DocumentsPage getDocumentsPage(){
        if(documentsPage==null){
            documentsPage=new DocumentsPage();
        }
        return documentsPage;
    }
    public EmailSmsPage getEmailSmsPage(){
        if(emailSmsPage==null){
            emailSmsPage=new EmailSmsPage();
        }
        return emailSmsPage;
    }
    public QuestionariesPage getQuestionariesPage(){
        if(questionariesPage==null){
            questionariesPage=new QuestionariesPage();
        }
        return questionariesPage;
    }
    public ServicesPage getServicesPage(){
        if(servicesPage==null){
            servicesPage=new ServicesPage();
        }
        return servicesPage;
    }
    public SettingsPage getSettingsPage(){
        if(settingsPage==null){
            settingsPage=new SettingsPage();
        }
        return settingsPage;
    }
    public LoginPage getLoginPage(){
        if(loginPage==null){
            loginPage=new LoginPage();
        }
        return loginPage;
    }


}
