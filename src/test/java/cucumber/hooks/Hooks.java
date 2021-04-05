package cucumber.hooks;

import cucumber.stepData.StepsData;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Hooks {

    private StepsData stepsData;

    public Hooks(StepsData stepsData){
        this.stepsData = stepsData;
    }

    @Before
    public void initBrowser(){
        stepsData.driver =  new SafariDriver();
    }

    @After
    public void closeDriver(){
        stepsData.driver.close();
    }

}
