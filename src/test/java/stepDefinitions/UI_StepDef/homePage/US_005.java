package stepDefinitions.UI_StepDef.homePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

import static utilities.JS_utilities.scrollAndClickWithJS;

public class US_005 extends CommonPage {
    @When("The user clicks usa flag language button")
    public void theUserClicksUsaFlagLanguageButton() {
        getHomePage().languageButton.click();
        ReusableMethods.waitFor(2);
    }

    @Then("The user verify navbar buttons if they are visible and English")
    public void theUserVerifyNavbarButtonsIfTheyAreVisibleAndEnglish() {
        Assert.assertTrue(getHomePage().features.isDisplayed());
        String feauture = "Features";
        Assert.assertEquals(feauture,getHomePage().features.getText());

        Assert.assertTrue(getHomePage().Pricing.isDisplayed());
        String price = "Pricing";
        Assert.assertEquals(price,getHomePage().Pricing.getText());

        Assert.assertTrue(getHomePage().resources.isDisplayed());
        String resource = "Resources";
        String test3 = getHomePage().resources.getText();
        Assert.assertEquals(resource, getHomePage().resources.getText());

        Assert.assertTrue(getHomePage().contactUs.isDisplayed());
        String contactUs = "Contact Us";
        Assert.assertEquals(contactUs,getHomePage().contactUs.getText());

        Assert.assertTrue(getHomePage().loginButton.isDisplayed());
        String login = "Login";
        Assert.assertEquals(login,getHomePage().loginButton.getText());

        Assert.assertTrue(getHomePage().SignUPForFree.isDisplayed());
        String signUp = "Sign Up for Free";
        Assert.assertEquals(signUp,getHomePage().SignUPForFree.getText());

    }

    @And("The user clicks features button and verify if all the features are English")
    public void theUserClicksFeaturesButtonAndVerifyIfAllTheFeaturesAreEnglish() {
        getHomePage().features.click();
        String appointment = "Appointment Scheduling";
        Assert.assertEquals(appointment,getHomePage().appointmentScheduling.getText());


    }

    @And("The user clicks Pricing button and verify if the page is English")
    public void theUserClicksPricingButtonAndVerifyIfThePageIsEnglish() {
        ReusableMethods.waitFor(2);
        getHomePage().Pricing.click();
        String pricing = "Exceptional\n" +
                "Features,\n" +
                "Affordable Prices";
        Assert.assertEquals(pricing,getHomePage().exceptionalFeaturesPricing.getText());


    }

    @And("The user clicks Resources button and verify if all resources are English")
    public void theUserClicksResourcesButtonAndVerifyIfAllResourcesAreEnglish() {
        getHomePage().resources.click();
        ReusableMethods.hover(getHomePage().aboutUsButton);
        getHomePage().aboutUsButton.click();
        String who = "Who is Hypnotes?";
        Assert.assertEquals(who,getHomePage().whoIsHypnotes.getText());

    }

    @And("The user clicks Contact us button and verify if the page is English")
    public void theUserClicksContactUsButtonAndVerifyIfThePageIsEnglish() {
        getHomePage().contactUsButton.click();
        String help = "How can we help?";
        Assert.assertEquals(help,getHomePage().howCanWeHelp.getText());
    }

    @And("The user clicks Login button and verify the page is English")
    public void theUserClicksLoginButtonAndVerifyThePageIsEnglish() {
        getHomePage().loginButton.click();
        String therapistLogin = "Therapist Login";
        Assert.assertEquals(therapistLogin,getLoginPage().therapistLogin.getText());

    }

    @And("The user clicks Sign up for free button and varify the page is English")
    public void theUserClicksSignUpForFreeButtonAndVarifyThePageIsEnglish() {
        getHomePage().SignUPForFree.click();
        String register = "Register As a Therapist";
        Assert.assertEquals(register,getLoginPage().registerAsATherapist.getText());

    }

    @When("The user clicks Turkiye flag language button")
    public void theUserClicksTurkiyeFlagLanguageButton() {
        getHomePage().languageButton.click();
        ReusableMethods.waitFor(2);
        scrollAndClickWithJS(getHomePage().turkiyeFlag);
    }

    @Then("The user verify navbar buttons if they are visible and Turkish")
    public void theUserVerifyNavbarButtonsIfTheyAreVisibleAndTurkish() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(getHomePage().features.isDisplayed());
        String ozellikler = "Özellikler";
        Assert.assertEquals(ozellikler,getHomePage().features.getText());

        Assert.assertTrue(getHomePage().Pricing.isDisplayed());
        String fiyatlandirma = "Fiyatlandırma";
        Assert.assertEquals(fiyatlandirma,getHomePage().Pricing.getText());

        Assert.assertTrue(getHomePage().resources.isDisplayed());
        String kaynaklar = "Kaynaklar";
        Assert.assertEquals(kaynaklar, getHomePage().resources.getText());

        Assert.assertTrue(getHomePage().contactUs.isDisplayed());
        String bizeUlasin = "Bize Ulaşın";
        Assert.assertEquals(bizeUlasin,getHomePage().contactUs.getText());

        Assert.assertTrue(getHomePage().loginButton.isDisplayed());
        String giris = "Giriş";
        Assert.assertEquals(giris,getHomePage().loginButton.getText());

        Assert.assertTrue(getHomePage().SignUPForFree.isDisplayed());
        String ucretsizKayit = "Ücretsiz Kaydolun";
        Assert.assertEquals(ucretsizKayit,getHomePage().SignUPForFree.getText());
    }

    @And("The user clicks features button and verify if all the features are Turkish")
    public void theUserClicksFeaturesButtonAndVerifyIfAllTheFeaturesAreTurkish() {
        getHomePage().features.click();
        String randevu = "Randevu Planlama";
        Assert.assertEquals(randevu,getHomePage().appointmentScheduling.getText());

    }

    @And("The user clicks Pricing button and verify if the page is Turkish")
    public void theUserClicksPricingButtonAndVerifyIfThePageIsTurkish() {
        getHomePage().Pricing.click();
        String fiyat = "Olağanüstü\n" +
                "Özellikler,\n" +
                "Uygun Fiyatlar";
        Assert.assertEquals(fiyat,getHomePage().exceptionalFeaturesPricing.getText());

    }

    @And("The user clicks Resources button and verify if all resources are Turkish")
    public void theUserClicksResourcesButtonAndVerifyIfAllResourcesAreTurkish() {
        getHomePage().resources.click();
        ReusableMethods.hover(getHomePage().aboutUsButton);
        getHomePage().aboutUsButton.click();
        String kim = "Hypnotes kimdir?";
        Assert.assertEquals(kim,getHomePage().whoIsHypnotes.getText());
    }

    @And("The user clicks Contact us button and verify if the page is Turkish")
    public void theUserClicksContactUsButtonAndVerifyIfThePageIsTurkish() {
        ReusableMethods.waitFor(2);
        getHomePage().contactUs.click();
        String yardim = "Nasıl yardımcı olabiliriz?";
        Assert.assertEquals(yardim,getHomePage().howCanWeHelp.getText());
    }

    @And("The user clicks Login button and verify the page is Turkish")
    public void theUserClicksLoginButtonAndVerifyThePageIsTurkish() {
        getHomePage().loginButton.click();
        String giris = "Terapist Giriş";
        Assert.assertEquals(giris,getLoginPage().therapistLogin.getText());
    }

    @And("The user clicks Sign up for free button and varify the page is Turkish")
    public void theUserClicksSignUpForFreeButtonAndVarifyThePageIsTurkish() {
        getHomePage().SignUPForFree.click();
        String kaydolun = "Terapist Olarak Kaydolun";
        Assert.assertEquals(kaydolun,getLoginPage().registerAsATherapist.getText());
    }

    @When("The user clicks Germany flag language button")
    public void theUserClicksGermanyFlagLanguageButton() {
        getHomePage().languageButton.click();
        ReusableMethods.waitFor(2);
        scrollAndClickWithJS(getHomePage().germanyFlag);
    }

    @Then("The user verify navbar buttons if they are visible and German")
    public void theUserVerifyNavbarButtonsIfTheyAreVisibleAndGerman() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(getHomePage().features.isDisplayed());
        String ozelliklerAlm = "Eigenschaften";
        Assert.assertEquals(ozelliklerAlm,getHomePage().features.getText());

        Assert.assertTrue(getHomePage().Pricing.isDisplayed());
        String fiyatlandirmaAlm = "Preisgestaltung";
        Assert.assertEquals(fiyatlandirmaAlm,getHomePage().Pricing.getText());

        Assert.assertTrue(getHomePage().resources.isDisplayed());
        String kaynaklarAlm = "Ressourcen";
        Assert.assertEquals(kaynaklarAlm, getHomePage().resources.getText());

        Assert.assertTrue(getHomePage().contactUs.isDisplayed());
        String bizeUlasinAlm = "Kontakt";
        Assert.assertEquals(bizeUlasinAlm,getHomePage().contactUs.getText());

        Assert.assertTrue(getHomePage().loginButton.isDisplayed());
        String girisAlm = "Anmeldung";
        Assert.assertEquals(girisAlm,getHomePage().loginButton.getText());

        Assert.assertTrue(getHomePage().SignUPForFree.isDisplayed());
        String ucretsizKayitAlm = "Kostenlos anmelden";
        Assert.assertEquals(ucretsizKayitAlm,getHomePage().SignUPForFree.getText());
    }

    @And("The user clicks features button and verify if all the features are German")
    public void theUserClicksFeaturesButtonAndVerifyIfAllTheFeaturesAreGerman() {
        getHomePage().features.click();
        String randevuAlm = "Terminplanung";
        Assert.assertEquals(randevuAlm,getHomePage().appointmentScheduling.getText());
    }

    @And("The user clicks Pricing button and verify if the page is German")
    public void theUserClicksPricingButtonAndVerifyIfThePageIsGerman() {
        getHomePage().Pricing.click();
        String fiyatAlm = "Außergewöhnlich\n" +
                "Eigenschaften,\n" +
                "Erschwingliche Preise";
        Assert.assertEquals(fiyatAlm,getHomePage().exceptionalFeaturesPricing.getText());

    }

    @And("The user clicks Resources button and verify if all resources are German")
    public void theUserClicksResourcesButtonAndVerifyIfAllResourcesAreGerman() {
        getHomePage().resources.click();
        ReusableMethods.hover(getHomePage().aboutUsButton);
        getHomePage().aboutUsButton.click();
        String kimAlm = "Wer ist Hypnotes?";
        Assert.assertEquals(kimAlm,getHomePage().whoIsHypnotes.getText());
    }

    @And("The user clicks Contact us button and verify if the page is German")
    public void theUserClicksContactUsButtonAndVerifyIfThePageIsGerman() {
        ReusableMethods.waitFor(2);
        getHomePage().contactUs.click();
        String yardimAlm = "Wie können wir helfen?";
        Assert.assertEquals(yardimAlm,getHomePage().howCanWeHelp.getText());
    }

    @And("The user clicks Login button and verify the page is German")
    public void theUserClicksLoginButtonAndVerifyThePageIsGerman() {
        getHomePage().loginButton.click();
        String girisAlm = "Therapeut Login";
        Assert.assertEquals(girisAlm,getLoginPage().therapistLogin.getText());
    }

    @And("The user clicks Sign up for free button and varify the page is German")
    public void theUserClicksSignUpForFreeButtonAndVarifyThePageIsGerman() {
        getHomePage().SignUPForFree.click();
        String kaydolunAlm = "Als Therapeut registrieren";
        Assert.assertEquals(kaydolunAlm,getLoginPage().registerAsATherapist.getText());
    }

    @When("The user clicks France flag language button")
    public void theUserClicksFranceFlagLanguageButton() {
        getHomePage().languageButton.click();
        ReusableMethods.waitFor(2);
        scrollAndClickWithJS(getHomePage().franceFlag);
    }

    @Then("The user verify navbar buttons if they are visible and French")
    public void theUserVerifyNavbarButtonsIfTheyAreVisibleAndFrench() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(getHomePage().features.isDisplayed());
        String ozelliklerFr = "Caractéristiques";
        Assert.assertEquals(ozelliklerFr,getHomePage().features.getText());

        Assert.assertTrue(getHomePage().Pricing.isDisplayed());
        String fiyatlandirmaFr = "Tarification";
        Assert.assertEquals(fiyatlandirmaFr,getHomePage().Pricing.getText());

        Assert.assertTrue(getHomePage().resources.isDisplayed());
        String kaynaklarFr = "Ressources";
        Assert.assertEquals(kaynaklarFr, getHomePage().resources.getText());

        Assert.assertTrue(getHomePage().contactUs.isDisplayed());
        String bizeUlasinFr = "Nous contacter";
        Assert.assertEquals(bizeUlasinFr,getHomePage().contactUs.getText());

        Assert.assertTrue(getHomePage().loginButton.isDisplayed());
        String girisFr = "Connexion";
        Assert.assertEquals(girisFr,getHomePage().loginButton.getText());

        Assert.assertTrue(getHomePage().SignUPForFree.isDisplayed());
        String ucretsizKayitFr = "S'inscrire gratuitement";
        Assert.assertEquals(ucretsizKayitFr,getHomePage().SignUPForFree.getText());
    }

    @And("The user clicks features button and verify if all the features are French")
    public void theUserClicksFeaturesButtonAndVerifyIfAllTheFeaturesAreFrench() {
        getHomePage().features.click();
        String randevuFr = "Prise de rendez-vous";
        Assert.assertEquals(randevuFr,getHomePage().appointmentScheduling.getText());

    }

    @And("The user clicks Pricing button and verify if the page is French")
    public void theUserClicksPricingButtonAndVerifyIfThePageIsFrench() {
        getHomePage().Pricing.click();
        String fiyatFr = "Exceptionnel\n" +
                "Caractéristiques,\n" +
                "Prix abordables";
        Assert.assertEquals(fiyatFr,getHomePage().exceptionalFeaturesPricing.getText());
    }

    @And("The user clicks Resources button and verify if all resources are French")
    public void theUserClicksResourcesButtonAndVerifyIfAllResourcesAreFrench() {
        getHomePage().resources.click();
        ReusableMethods.hover(getHomePage().aboutUsButton);
        getHomePage().aboutUsButton.click();
        String kimFr = "Qui est Hypnotes ?";
        Assert.assertEquals(kimFr,getHomePage().whoIsHypnotes.getText());
    }

    @And("The user clicks Contact us button and verify if the page is French")
    public void theUserClicksContactUsButtonAndVerifyIfThePageIsFrench() {
        ReusableMethods.waitFor(2);
        getHomePage().contactUs.click();
        String yardimFr = "Comment pouvons-nous vous aider ?";
        Assert.assertEquals(yardimFr,getHomePage().howCanWeHelp.getText());
    }

    @And("The user clicks Login button and verify the page is French")
    public void theUserClicksLoginButtonAndVerifyThePageIsFrench() {
        getHomePage().loginButton.click();
        String girisFr = "Thérapeute Connexion";
        Assert.assertEquals(girisFr,getLoginPage().therapistLogin.getText());
    }

    @And("The user clicks Sign up for free button and varify the page is French")
    public void theUserClicksSignUpForFreeButtonAndVarifyThePageIsFrench() {
        getHomePage().SignUPForFree.click();
        String kaydolunFr = "S'inscrire comme thérapeute";
        Assert.assertEquals(kaydolunFr,getLoginPage().registerAsATherapist.getText());

    }

    @When("The user clicks Russia flag language button")
    public void theUserClicksRussiaFlagLanguageButton() {
        getHomePage().languageButton.click();
        ReusableMethods.waitFor(2);
        scrollAndClickWithJS(getHomePage().russiaFlag);

    }

    @Then("The user verify navbar buttons if they are visible and Russian")
    public void theUserVerifyNavbarButtonsIfTheyAreVisibleAndRussian() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(getHomePage().features.isDisplayed());
        String ozelliklerRs = "Характеристики";
        Assert.assertEquals(ozelliklerRs,getHomePage().features.getText());

        Assert.assertTrue(getHomePage().Pricing.isDisplayed());
        String fiyatlandirmaRs = "Ценообразование";
        Assert.assertEquals(fiyatlandirmaRs,getHomePage().Pricing.getText());

        Assert.assertTrue(getHomePage().resources.isDisplayed());
        String kaynaklarRs = "Ресурсы";
        Assert.assertEquals(kaynaklarRs, getHomePage().resources.getText());

        Assert.assertTrue(getHomePage().contactUs.isDisplayed());
        String bizeUlasinRs = "Свяжитесь с нами";
        Assert.assertEquals(bizeUlasinRs,getHomePage().contactUs.getText());

        Assert.assertTrue(getHomePage().loginButton.isDisplayed());
        String girisRs = "Вход в систему";
        Assert.assertEquals(girisRs,getHomePage().loginButton.getText());

        Assert.assertTrue(getHomePage().SignUPForFree.isDisplayed());
        String ucretsizKayitRs = "Бесплатная регистрация";
        Assert.assertEquals(ucretsizKayitRs,getHomePage().SignUPForFree.getText());
    }

    @And("The user clicks features button and verify if all the features are Russian")
    public void theUserClicksFeaturesButtonAndVerifyIfAllTheFeaturesAreRussian() {
        getHomePage().features.click();
        String randevuRs = "Планирование назначений";
        Assert.assertEquals(randevuRs,getHomePage().appointmentScheduling.getText());
    }

    @And("The user clicks Pricing button and verify if the page is Russian")
    public void theUserClicksPricingButtonAndVerifyIfThePageIsRussian() {
        getHomePage().Pricing.click();
        String fiyatRs = "Исключительно\n" +
                "Характеристики,\n" +
                "Доступные цены";
        Assert.assertEquals(fiyatRs,getHomePage().exceptionalFeaturesPricing.getText());
    }

    @And("The user clicks Resources button and verify if all resources are Russian")
    public void theUserClicksResourcesButtonAndVerifyIfAllResourcesAreRussian() {
        getHomePage().resources.click();
        ReusableMethods.hover(getHomePage().aboutUsButton);
        getHomePage().aboutUsButton.click();
        String kimRs = "Кто такой Hypnotes?";
        Assert.assertEquals(kimRs,getHomePage().whoIsHypnotes.getText());
    }

    @And("The user clicks Contact us button and verify if the page is Russian")
    public void theUserClicksContactUsButtonAndVerifyIfThePageIsRussian() {
        ReusableMethods.waitFor(2);
        getHomePage().contactUs.click();
        String yardimRs = "Чем мы можем помочь?";
        Assert.assertEquals(yardimRs,getHomePage().howCanWeHelp.getText());
    }

    @And("The user clicks Login button and verify the page is Russian")
    public void theUserClicksLoginButtonAndVerifyThePageIsRussian() {
        getHomePage().loginButton.click();
        String girisRs = "Терапевт Вход";
        Assert.assertEquals(girisRs,getLoginPage().therapistLogin.getText());
    }

    @And("The user clicks Sign up for free button and varify the page is Russian")
    public void theUserClicksSignUpForFreeButtonAndVarifyThePageIsRussian() {
        getHomePage().SignUPForFree.click();
        String kaydolunRs = "Регистрация в качестве терапевта";
        Assert.assertEquals(kaydolunRs,getLoginPage().registerAsATherapist.getText());
    }

    @When("The user clicks Spain flag language button")
    public void theUserClicksSpainFlagLanguageButton() {
        getHomePage().languageButton.click();
        ReusableMethods.waitFor(2);
        scrollAndClickWithJS(getHomePage().spainFlag);
    }

    @Then("The user verify navbar buttons if they are visible and Spanish")
    public void theUserVerifyNavbarButtonsIfTheyAreVisibleAndSpanish() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(getHomePage().features.isDisplayed());
        String ozelliklerSp = "Características";
        Assert.assertEquals(ozelliklerSp,getHomePage().features.getText());

        Assert.assertTrue(getHomePage().Pricing.isDisplayed());
        String fiyatlandirmaSp = "Precios";
        Assert.assertEquals(fiyatlandirmaSp,getHomePage().Pricing.getText());

        Assert.assertTrue(getHomePage().resources.isDisplayed());
        String kaynaklarSp = "Recursos";
        Assert.assertEquals(kaynaklarSp, getHomePage().resources.getText());

        Assert.assertTrue(getHomePage().contactUs.isDisplayed());
        String bizeUlasinSp = "Contacte con nosotros";
        Assert.assertEquals(bizeUlasinSp,getHomePage().contactUs.getText());

        Assert.assertTrue(getHomePage().loginButton.isDisplayed());
        String girisSp = "Inicio de sesión";
        Assert.assertEquals(girisSp,getHomePage().loginButton.getText());

        Assert.assertTrue(getHomePage().SignUPForFree.isDisplayed());
        String ucretsizKayitSp = "Regístrate gratis";
        Assert.assertEquals(ucretsizKayitSp,getHomePage().SignUPForFree.getText());
    }

    @And("The user clicks features button and verify if all the features are Spanish")
    public void theUserClicksFeaturesButtonAndVerifyIfAllTheFeaturesAreSpanish() {
        getHomePage().features.click();
        String randevuSp = "Programación de citas";
        Assert.assertEquals(randevuSp,getHomePage().appointmentScheduling.getText());
    }

    @And("The user clicks Pricing button and verify if the page is Spanish")
    public void theUserClicksPricingButtonAndVerifyIfThePageIsSpanish() {
        getHomePage().Pricing.click();
        String fiyatSp = "Excepcional\n" +
                "Características,\n" +
                "Precios asequibles";
        Assert.assertEquals(fiyatSp,getHomePage().exceptionalFeaturesPricing.getText());
    }

    @And("The user clicks Resources button and verify if all resources are Spanish")
    public void theUserClicksResourcesButtonAndVerifyIfAllResourcesAreSpanish() {
        getHomePage().resources.click();
        ReusableMethods.hover(getHomePage().aboutUsButton);
        getHomePage().aboutUsButton.click();
        String kimSp = "¿Quién es Hypnotes?";
        Assert.assertEquals(kimSp,getHomePage().whoIsHypnotes.getText());
    }

    @And("The user clicks Contact us button and verify if the page is Spanish")
    public void theUserClicksContactUsButtonAndVerifyIfThePageIsSpanish() {
        ReusableMethods.waitFor(2);
        getHomePage().contactUs.click();
        String yardimSp = "¿Cómo podemos ayudarle?";
        Assert.assertEquals(yardimSp,getHomePage().howCanWeHelp.getText());
    }

    @And("The user clicks Login button and verify the page is Spanish")
    public void theUserClicksLoginButtonAndVerifyThePageIsSpanish() {
        getHomePage().loginButton.click();
        String girisSp = "Terapeuta Inicio de sesión";
        Assert.assertEquals(girisSp,getLoginPage().therapistLogin.getText());
    }

    @And("The user clicks Sign up for free button and varify the page is Spanish")
    public void theUserClicksSignUpForFreeButtonAndVarifyThePageIsSpanish() {
        getHomePage().SignUPForFree.click();
        String kaydolunSp = "Registrarse como terapeuta";
        Assert.assertEquals(kaydolunSp,getLoginPage().registerAsATherapist.getText());
    }
}
