package pageObjects;


import managers.FileReaderManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void navigateToHomePage(){
        driver.get(FileReaderManager.getInstance().getConfigFileReader().getAppUrl());
    }
}
