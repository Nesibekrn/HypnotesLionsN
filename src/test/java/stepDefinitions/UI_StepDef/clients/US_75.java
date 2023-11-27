package stepDefinitions.UI_StepDef.clients;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.CommonPage;

import java.util.List;

import static utilities.ReusableMethods.waitFor;

public class US_75 extends CommonPage {


    @Then("user is able enter valid values on the below fields")
    public void user_is_able_enter_valid_values_on_the_below_fields(io.cucumber.datatable.DataTable dataTable) {
        List<String> clientInfos=dataTable.asList();

        for(int i=0; i<+clientInfos.size(); i++){
            Assert.assertTrue(getClientsPage().invoiceClientInfo.get(i+1).isEnabled());
            getClientsPage().invoiceClientInfo.get(i+1).clear();
            getClientsPage().invoiceClientInfo.get(i+1).sendKeys(clientInfos.get(i));
            waitFor(1);

            Assert.assertEquals(getClientsPage().invoiceClientInfo.get(i+1).getAttribute("value"),clientInfos.get(i));

        }

    }

    @Then("the user is able to select a country from country dropdown")
    public void theUserIsAbleToSelectACountryFromCountryDropdown() {
        getClientsPage().ddCountryWithoutSelect.click();
        Select ss=new Select(getClientsPage().dropDownCountrySelect);
        ss.selectByVisibleText("Turkey");
       // System.out.println("*********************"+getClientsPage().selectedCountry.getAttribute("value"));

        Assert.assertTrue(getClientsPage().selectedCountry.getAttribute("value").contains("Turkey"));


    }
}
