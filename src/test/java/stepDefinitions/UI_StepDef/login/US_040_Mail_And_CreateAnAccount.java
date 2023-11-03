package stepDefinitions.UI_StepDef.login;

import org.openqa.selenium.WindowType;
import pages.LoginPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_040_Mail_And_CreateAnAccount {

    LoginPage loginPage = new LoginPage();
    String randomNameyeni = ReusableMethods.rasgeleIsimOlustur();// buraya gore degistir


    public void takeValidEmail() {

        System.out.println(randomNameyeni);

        Driver.getDriver().get("https://yopmail.com/fr/");
        ReusableMethods.waitFor(3);
        loginPage.MailCookies.click();
        loginPage.MailSaissirAdresse.click();
        loginPage.MailSaissirAdresse.sendKeys(randomNameyeni);
        ReusableMethods.waitFor(1);
        loginPage.MailSaissirAdresseClick.click();
        ReusableMethods.waitFor(2);
        loginPage.YopmailMailAdress.isDisplayed();
        ReusableMethods.waitFor(3);

        //CREATE AN ACCOUNT olusturur

        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get("https://test.hypnotes.net/");
        /*bu kod sayesinde yeni bir sekme actik.Bundan sonrasi icin artik yeni bir sekmeye ihtiyac yok
        Fakat step def 'de 90. satir'da 2.YOL  tekrar gidecegimiz sayfanin indeksini yazdik ve oraya gittik
        ve ardindan 122. satirda ayni kodu yazarak istedigimiz satira gectik.
        Reusable method'da bu kod var  ReusableMethods.switchToWindow(2);
         */

        ReusableMethods.waitFor(3);
        loginPage.SignUpForFree.click();
        ReusableMethods.waitFor(5);
        loginPage.FullNameButtonForSignUpForFree.sendKeys("France");
        ReusableMethods.waitFor(1);
        loginPage.EmailButtonForSignUpForFree.sendKeys(randomNameyeni + "@yopmail.com");
        ReusableMethods.waitFor(5);
        loginPage.PasswordButtonForSignUpForFree.sendKeys("123456789Aa@");
        ReusableMethods.waitFor(1);
        loginPage.SignUpButtonForSignUpForFree.click();
        ReusableMethods.waitFor(3);
        loginPage.VerifyMailmesajVerificationforYopmail.isDisplayed();
        ReusableMethods.waitFor(3);


    }


}
