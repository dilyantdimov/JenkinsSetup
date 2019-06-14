package stepsDefinition;


import cucumber.TestContext;
import cucumber.api.java.en.Given;
import pageObjects.HomePage;



public class HomePageSteps {
    TestContext testContext;
    HomePage homePage;

    // Constructor - initialize TestContext -> webDriverManager, pageObjectManager
    // return homepage from PageObjectManager
    public HomePageSteps(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("^I am on the Homepage$")
    public void iAmOnTheHomePage() {
        homePage.navigateToHomePage();
    }

}
