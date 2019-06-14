package stepsDefinition;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pageObjects.RestAssuredPage;

public class RestAssuredSteps {

    TestContext testContext;
    RestAssuredPage restAssuredPage;

    public RestAssuredSteps(TestContext context){
        testContext = context;
        restAssuredPage = testContext.getPageObjectManager().getRestAssuredPage();

    }


    @Given("^I hit the json endpoint$")
    public void iHitTheJsonEndpoint() {
        restAssuredPage.hitEndPoint();
    }

    @Given("^I check the comments$")
    public void iCheckTheComments() {
        restAssuredPage.checkComments();
    }

    @And("^I test basic auth$")
    public void iTestBasicAuth() {
        restAssuredPage.basicAuth();
    }

    @And("^I test OAuth$")
    public void iTestOAuth() {
        restAssuredPage.oAuth();
    }
}

