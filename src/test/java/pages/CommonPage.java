package pages;

import org.openqa.selenium.support.PageFactory;

import java.util.Calendar;

import static stepDefinitions.Hooks.driver;

public abstract class CommonPage {
    public CommonPage(){
        PageFactory.initElements(driver,this);


    }
    private HomePage homePage;
    private LoginPage loginPage;
    private RegisterPage registerPage;
    private CalendarPage calendarPage;
    private AccountPage accountPage;
    private ClientsPage clientsPage;
    private CouponsPage couponsPage;
    private DashboardPage dashboardPage;
    private DocumentsPage documentsPage;
    private EmailSmsPage emailSmsPage;
    private QuestionariesPage questionariesPage;
    private ServicesPage servicesPage;
    private SettingsPage settingsPage;

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
