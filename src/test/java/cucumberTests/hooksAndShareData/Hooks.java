package cucumberTests.hooksAndShareData;

import cucumberTests.driversInitTemp.CucumberDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hooks {
    private ShareData shareData;

    public Hooks(ShareData shareData){
        this.shareData = shareData;
    }

    @Before
    public void InitDriver(){
        CucumberDriver cucumberDriver =  new CucumberDriver();
        shareData.driver = cucumberDriver.initDriver("chrome");
        shareData.wait = new WebDriverWait(shareData.driver, 10, 100);
    }

    @After
    public void closeDriver(){
        shareData.driver.quit();
    }
}
