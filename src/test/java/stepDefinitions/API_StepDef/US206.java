package stepDefinitions.API_StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Calendar;
import java.util.Random;
import static io.restassured.RestAssured.given;

public class US206 {
    Response response;
    Map<String, Object> payload = new HashMap<>();
    Map<String,Object>slotTimes=new HashMap<>();

    static int clientId;
    String datetime;
    String phpSessId;
    String startTime;

    JsonPath jsonPath;

    String laststarttime;
    String timeSlotStatus;



    @Given("user logins as a therapist and takes token from api")
    public void user_logins_as_a_therapist_and_takes_token_from_api() {
        payload.put("username", "hypnotes2022tr1@gmail.com");
        payload.put("password", "Aydinlik123/");

        response = given().body(payload).post("https://test.hypnotes.net/api/login");
        response.prettyPrint();

        phpSessId = response.cookies().get("PHPSESSID");
        System.out.println("phpSessid = " + phpSessId);

    }

    @When("User selects a specific client")
    public void User_selects_a_specific_client() {

        response = given().
                header("cookie", "PHPSESSID=" + phpSessId).
                post("https://test.hypnotes.net/api/dashboard/getClientBasicInfo");
        // response.prettyPrint();
        jsonPath = response.jsonPath();
        clientId = (Integer) jsonPath.getList("ClientInfo.clientId").get(0);
        System.out.println(clientId);
    }

    @Then("User selects an available date")
    public void user_selects_an_available_date() throws IOException {
        Random random = new Random();
        // Bir Calendar nesnesi oluşturun
        Calendar calendar = Calendar.getInstance();

        // Calendar nesnesine rastgele bir gün ekleyin
        int randomDay = random.nextInt(30) + 1; // 1 ile 30 arasında rastgele bir gün
        calendar.set(Calendar.DAY_OF_MONTH, randomDay);

        // Ay ve yılı da rastgele bir şekilde ayarlayabilirsiniz
        int randomMonth = random.nextInt(12) + 1; // 1 ile 12 arasında rastgele bir ay
        int randomYear = 2023 + random.nextInt(5); // 2023 ile 2026 arasında rastgele bir yıl
        calendar.set(Calendar.MONTH, randomMonth - 1); // Calendar.MONTH 0 ile 11 arasında olduğu için -1
        calendar.set(Calendar.YEAR, randomYear);
        // Oluşturulan rastgele tarihi yazdırın
        System.out.println("Random Date: " + calendar.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = sdf.format(calendar.getTime());

        payload.put("schedulerId", "ae2e65599f92de053b366b0cf8ff83bc");
        payload.put("categoryId", "168");
        payload.put("dateTime", formattedDate);
        payload.put("location", "Online");
        response = given().
                header("cookie", "PHPSESSID=" + phpSessId).
                formParams(payload).
                post("https://test.hypnotes.net/api/settings/meeting/getAvailableTimes");
        response.prettyPrint();

        String jsonString = response.getBody().asString();

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(jsonString);

        // "timeSlots" dizisini alın
        JsonNode timeSlotsNode = jsonNode.get("timeSlots");

        // "timeSlotStatus" değeri "available" olanları içeren yeni bir dizi oluşturun
        ArrayNode availableTimeSlotsNode = objectMapper.createArrayNode();
        for (JsonNode slotNode : timeSlotsNode) {
            String timeSlotStatus = slotNode.get("timeSlotStatus").asText();
            if ("available".equals(timeSlotStatus)) {
                availableTimeSlotsNode.add(slotNode);
            }
        }

        // Yeni JSON yanıtını oluşturun
        ObjectNode newJsonNode = objectMapper.createObjectNode();
        newJsonNode.put("success", jsonNode.get("success").asBoolean());
        newJsonNode.set("timeSlots", availableTimeSlotsNode);
        newJsonNode.put("descr", jsonNode.get("descr").asText());

        // Yeni JSON yanıtını yazdırın
       // System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(newJsonNode));

        String datetime = newJsonNode
                .path("timeSlots")
                .get(0)
                .path("startTime")
                .asText();
       // jsonPath = newJsonNode.jsonPath();
    System.out.println(datetime);
        //verideki time zone kismini atmak
    String input = datetime;

    // Metni uce böl
    String[] parts = input.split(" ", 3);  // 3 parametre, "Europe/London" içindeki boşlukları korumak için

    // "Europe/London" kısmını atmak için sadece ilk iki parçayı kullanabilirsiniz
    laststarttime =parts[0]+" "+parts[1];
        System.out.println(laststarttime);
}
    @Then("User creates a new appointment for a specific client")
    public void User_creates_a_new_appointment_for_a_specific_client(){

        payload.put("categoryId", "7035");
        payload.put("clientId", clientId);
        payload.put("datetime", laststarttime);
        payload.put("locationTitle", "Online");
        payload.put("timezone", "America/New_York");

        response = given().
                header("cookie",  "PHPSESSID=" + phpSessId).
                formParams(payload).
                post("https://test.hypnotes.net/api/dashboard/client/create-meeting");
        response.prettyPrint();
        }

    @Then("User verifies if the status is True")
    public void user_verifies_if_the_status_is_true() {

       // Assert.assertTrue(response.jsonPath().getBoolean("success"));
        Assert.assertTrue(response.prettyPrint().contains("true"));
        //Assert.assertEquals(200, response.getStatusCode());;
    }

    @Then("User verifies that if the response is as expected")
    public void user_verifies_that_if_the_response_is_as_expected() {
        Assert.assertTrue(response.prettyPrint().contains("meetUrl"));
        Assert.assertTrue(response.prettyPrint().contains("meetingId"));
        //Assert.assertTrue(response.jsonPath().getString("clientId").equals(clientId));
    }
}
