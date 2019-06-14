package pageObjects;

import io.restassured.authentication.OAuthSignature;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;


public class RestAssuredPage {

    private WebDriver driver;

    public RestAssuredPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void hitEndPoint() {

       //driver.get("http://localhost:3000/");

        given().when().get("http://localhost:3000/").then().statusCode(200);

    }

    public void checkComments() {
        given().when().get("http://localhost:3000/comments").then().statusCode(200)
            .assertThat().body("size()",is(3));
    }
    
    public void basicAuth() {
        given().auth().preemptive().basic("postman", "password").when().get("https://postman-echo.com/basic-auth").then().statusCode(200);
    }


    public void oAuth() {
        given().auth().oauth2("0d2e5449d978c3383bb8e1fbcf8e04452030610a").when()
                .get("https://api.imgur.com/3/account/dilyandimov/images").then().statusCode(200).assertThat().body("data.account_url[1]",equalTo("dilyanDimov"));

    }
}
