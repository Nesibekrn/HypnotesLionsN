package stepDefinitions.UI_StepDef.homePage;

import io.cucumber.java.en.Given;
import pages.CommonPage;


import static stepDefinitions.Hooks.driver;

public class US_001_StepDef extends CommonPage {


    String title="";
    @Given("User goes to {string}")
    public void user_goes_to(String Url) {
      driver.get(Url);
    }
    @Given("User gets page title")
    public void user_gets_page_title() {
        title= driver.getTitle();

      

    }

}
