package cucumber;

import cucumber.hooks.Hooks;
import cucumber.stepData.StepsData;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CommonSteps {

    private StepsData stepsData;
    private WebDriver driver;

    public CommonSteps(StepsData stepsData){
        this.stepsData = stepsData;
        this.driver = stepsData.driver;
    }

    @Given("a user enter {string}")
    public void aUserEnter(String url) {
        driver.get(url);
        System.out.println("go to url");
    }
}
