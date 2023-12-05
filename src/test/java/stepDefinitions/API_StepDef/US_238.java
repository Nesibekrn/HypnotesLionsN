package stepDefinitions.API_StepDef;

import enums.Enum_Fy;
import enums.USER_INFO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US_238 {
    @Given("the user request to add a new client from api")
    public void theUserRequestToAddANewClientFromApi() {
        API api = new API(Enum_Fy.THERAPIST_2);
        api.getClientsApi().createClient();


    }

    @Then("the user request to update the client from api")
    public void theUserRequestToUpdateTheClientFromApi() {

        API api = new API(Enum_Fy.THERAPIST_2);
        api.getClientsApi().updateClient();
    }
}
