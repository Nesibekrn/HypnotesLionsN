package stepDefinitions.API_StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;


public class US_244 {

    private Response response;
    private String phpSessId;
    private int questionCategoryId;
    private String updateTitle;
    private String expectedTitle;
    private String questionCategoryTitle;
    private Map<String, Object> requestBody = new HashMap<>();
    private List<Integer> questionIdsList = new ArrayList<>();
    private Map<String, Object> addQuestionCategoryRequest = new HashMap<>();
    private Map<String, Object> deleteRequestFormData = new HashMap<>();
    private Map<String, Object> updateRequestFormData = new HashMap<>();

    @When("user has valid login credentials")
    public void userHasValidLoginCredentials() {

        requestBody.put("username", "threapistlions@yopmail.com");
        requestBody.put("password", "Test123.");

    }

    @And("user sends a POST request to the valid username and password")
    public void userSendsAPOSTRequestToTheValidUsernameAndPassword() {

        //Body -> raw -> JSON => I use contentType(ContentType.JSON).body(requestBody)
        response = given().contentType(ContentType.JSON).body(requestBody).post("https://test.hypnotes.net/api/login");
        response.prettyPrint();

    }

    @Then("API responds with a status code {int}")
    public void apiRespondsWithAStatusCode(int expectedStatusCode) {

        int actualStatusCode = response.getStatusCode();
        Assert.assertEquals(expectedStatusCode, actualStatusCode);

    }

    @And("response contains an authentication token")
    public void responseContainsAnAuthenticationToken() {

        Assert.assertTrue(response.jsonPath().getBoolean("authenticated"));

    }

    @And("user gets phpSessId")
    public void userGetsPhpSessId() {

        phpSessId = response.cookie("PHPSESSID");
        System.out.println("phpSessId = " + phpSessId);

    }

    @When("the user makes a POST request to create add new Question Category in the Questionnaire Forms")
    public void theUserMakesAPOSTRequestToCreateAddNewQuestionCategoryInTheQuestionnaireForms() {

        expectedTitle = "Stress Assessment Category";
        addQuestionCategoryRequest.put("title", expectedTitle);

        //Body -> form-data => formParams()
        response = given().formParams(addQuestionCategoryRequest).header("cookie", "PHPSESSID=" + phpSessId).post("https://test.hypnotes.net/api/question/addQuestionCategory");
        response.prettyPrint();

    }

    @And("the new Question Category should be successfully created in the Questionnaire Forms")
    public void theNewQuestionCategoryShouldBeSuccessfullyCreatedInTheQuestionnaireForms() {

        boolean isQuestionCategoryCreated = response.jsonPath().getBoolean("success");
        Assert.assertTrue("Question Category should be successfully created", isQuestionCategoryCreated);

    }

    @And("the user verifies that response is as expected Question Category for add new Question Category")
    public void theUserVerifiesThatResponseIsAsExpectedQuestionCategoryForAddNewQuestionCategory() {

        questionCategoryTitle = response.jsonPath().get("questionCategory.title");
        System.out.println("Actual Question Category Title = " + questionCategoryTitle);
        System.out.println("Expected Question Category Title = " + expectedTitle);

        Assert.assertEquals("Titles do not match.", questionCategoryTitle, expectedTitle);

    }

    @When("the user makes a POST request to delete a specific Question Category")
    public void theUserMakesAPOSTRequestToDeleteASpecificQuestionCategory() {

        deleteRequestFormData.put("questionCategoryId", questionCategoryId);

        //Body -> form-data => formParams()
        response = given().formParams(deleteRequestFormData).header("cookie", "PHPSESSID=" + phpSessId).post("https://test.hypnotes.net/api/question/deleteQuestionCategory");
        response.prettyPrint();

    }

    @And("the user makes a POST request to get all Question Category")
    public void theUserMakesAPOSTRequestToGetAllQuestionCategory() {

        //GetAllQuestionCategory request body is empty.
        //I do not need formParams() or body() methods.
        response = given().header("cookie", "PHPSESSID=" + phpSessId).post("https://test.hypnotes.net/api/question/getAllQuestionCategory");
        response.prettyPrint();

    }

    @And("the response should contain a list of Question Category")
    public void theResponseShouldContainAListOfQuestionCategory() {

        // List of all IDs
        questionIdsList = response.jsonPath().get("questionCategory.id");

        System.out.println("questionIdsList" + questionIdsList);

    }

    @And("the user gets questionCategoryId")
    public void theUserGetsQuestionCategoryId() {

        //Last ID
        questionCategoryId = questionIdsList.get(questionIdsList.size() - 1);
        System.out.println("questionCategoryId = " + questionCategoryId);

        Assert.assertTrue("Question Category List contains last question Category Id. ", questionIdsList.contains(questionCategoryId));

    }

    @And("the user makes a POST request to update Question Category")
    public void theUserMakesAPOSTRequestToUpdateQuestionCategory() {

        updateTitle = "Stress Assessment";
        updateRequestFormData.put("title", updateTitle);
        updateRequestFormData.put("questionCategoryId", questionCategoryId);

        //Body -> form-data => formParams()
        response = given().formParams(updateRequestFormData).header("cookie", "PHPSESSID=" + phpSessId).post("https://test.hypnotes.net/api/question/updateQuestionCategory");
        response.prettyPrint();
    }

    @And("the Question Category should be successfully updated in the Questionnaire Forms")
    public void theQuestionCategoryShouldBeSuccessfullyUpdatedInTheQuestionnaireForms() {

        boolean isCategoryUpdated = response.jsonPath().getBoolean("success");

        // Validate category updation success in the response body
        Assert.assertTrue("Category should be successfully updated", isCategoryUpdated);

    }

    @And("the user verifies that response is as expected Question Category for update Question Category")
    public void theUserVerifiesThatResponseIsAsExpectedQuestionCategoryForUpdateQuestionCategory() {


        questionCategoryTitle = response.jsonPath().get("questionCategory.title");
        System.out.println("Actual Question Category Title = " + questionCategoryTitle);
        System.out.println("Expected Updated Question Category Title = " + updateTitle);

        // Validate the Title of Question Category with updated title
        Assert.assertEquals("Updated Titles do not match.", questionCategoryTitle, updateTitle);

    }

    @And("the Question Category should be successfully deleted from the Questionnaire Forms")
    public void theQuestionCategoryShouldBeSuccessfullyDeletedFromTheQuestionnaireForms() {

        boolean isCategoryDeleted = response.jsonPath().getBoolean("success");

        // Validate Question Category deletion success in the response body
        Assert.assertTrue("Category should be successfully deleted", isCategoryDeleted);

    }

    @And("the user verifies that response is as expected Question Category for delete Question Category")
    public void theUserVerifiesThatResponseIsAsExpectedQuestionCategoryForDeleteQuestionCategory() {

        String expectedDeleteCategoryBodyDescr = "Category removed";
        String actualDeleteCategoryBody = response.jsonPath().getString("descr");

        // Validate the description of Question Category deletion
        Assert.assertEquals("Category creation description should match", expectedDeleteCategoryBodyDescr, actualDeleteCategoryBody);

    }

}
