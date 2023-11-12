package stepDefinitions.UI_StepDef.clients;

import com.mysql.cj.xdevapi.Client;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.ClientsPage;
import pages.CommonPage;
import utilities.ReusableMethods;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.TimeUnit;

import static java.lang.Character.isAlphabetic;
import static org.apache.commons.lang3.ArrayUtils.isSorted;
import static org.junit.Assert.*;
import static stepDefinitions.Hooks.driver;

public class US_052 extends CommonPage {

    Actions actions = new Actions(driver);
    @Given("User clicks to clients section")
    public void user_clicks_to_clients_section() throws InterruptedException {
        getClientsPage().clientBut.click();
        Thread.sleep(2000);
        getClientsPage().upgradeNow.click();
    }
    @Given("sees the customer list in search client form")
    public void sees_the_customer_list_in_search_client_form() {
      getClientsPage().listClient.isEnabled();
    }

    @Then("Verify customer list is in alphabetical order")
    public void verify_customer_list_is_in_alphabetical_order() {
        List<WebElement> clientList = driver.findElements(By.xpath("//h5[@style='margin: 30px;']"));
        for (int i = 0; i < clientList.size(); i++) {
            System.out.println(clientList.get(i).getText());
        }
            List<String> names = new ArrayList<>();
            for (WebElement element : clientList) {
                names.add(element.getText());
            }
            // İsimleri sırala
            Collections.sort(names);
        assertTrue(isSorted(names));
    }

    private static boolean isSorted(List<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                return false;
            }
        }
        return true;
    }

    @Given("Clicks on Sort By button")
    public void clicks_on_sort_by_button() {
        ReusableMethods.waitFor(2);
        getClientsPage().sortByButton.click();
        ReusableMethods.waitFor(2);
    }
    @Given("chooses to sort by name")
    public void chooses_to_sort_by_name() {
        getClientsPage().sortByButton2.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Verify that it is in alphabetical order")
    public void verify_that_it_is_in_alphabetical_order() {
        List<WebElement> clientList = driver.findElements(By.xpath("//h5[@style='margin: 30px;']"));
        for (int i = 0; i < clientList.size(); i++) {
            System.out.println(clientList.get(i).getText());
        }
        List<String> names = new ArrayList<>();
        for (WebElement element : clientList) {
            names.add(element.getText());
        }
        // İsimleri sırala
        Collections.sort(names);
        assertTrue(isSorted(names));
    }
    @Given("chooses to sort by surname")
    public void chooses_to_sort_by_surname() {
        actions.sendKeys(getClientsPage().sortByButton2, Keys.ARROW_DOWN, Keys.ARROW_DOWN,Keys.ENTER).build().perform();
        ReusableMethods.waitFor(2);
    }
    @Given("chooses to sort by date added")
    public void chooses_to_sort_by_date_added() {
        actions.sendKeys(getClientsPage().sortByButton2, Keys.ARROW_DOWN, Keys.ARROW_DOWN,Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        ReusableMethods.waitFor(2);
    }
    @Then("Verify that it is in order by recent date")
    public void verify_that_it_is_in_order_by_recent_date() {

        ReusableMethods.waitFor(2);
        String lesDates =getClientsPage().lesDates.getText();
        System.out.println(lesDates);
        actions.clickAndHold(getClientsPage().lesDates).moveByOffset(10, 10).release().build().perform();
        actions.moveToElement(getClientsPage().lesDates).build().perform();//bekletmek icin

        // Belirli bir süre beklemek için
        try {
            TimeUnit.SECONDS.sleep(2); // 2 saniye beklemek için
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ReusableMethods.waitFor(2);
        System.out.println(getClientsPage().lesDates2.getText());//YUKARDAKI KISIM TAM TARIHI ALMAK ICIN

        List<WebElement> similarElements = driver.findElements(By.xpath("//span[@class='text-center text-muted']"));

        // Topluca locate edilen elemanlar üzerinde işlem yapma
        for (WebElement element : similarElements) {
            System.out.println(element.getText());
        }


    }







}
