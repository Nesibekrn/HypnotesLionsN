package stepDefinitions.UI_StepDef.clients;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.CommonPage;

public class US_093 extends CommonPage {
    @And("user clicks Schedule an Appointment at the selected client")
    public void userClicksScheduleAnAppointmentAtTheSelectedClient() {
      getClientsPage().button_ScheduleAnAppointment.click();
    }

    @When("user selects {string} at the Service section")
    public void userSelectsAtTheServiceSection(String service) {
        getClientsPage().service_inputSelect2.sendKeys(service);
    }

    @And("user selects Online at the Locations section")
    public void userSelectsOnlineAtTheLocationsSection() {
        getClientsPage().dropDown_ScheduleAnAppointmentLocationsSelect.click();
    }


}
