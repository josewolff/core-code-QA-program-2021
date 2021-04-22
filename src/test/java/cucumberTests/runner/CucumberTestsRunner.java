package cucumberTests.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test(groups = "tesitng-cucumber")
@CucumberOptions(features = {"src/test/resources/featuresFiles"},
        glue = {"cucumberTests/tests","cucumberTests/hooksAndShareData"},
        plugin = {"html:target/cucumber-reports/cucumber-reports.html","json:target/cucumber-reports/Cucumber.json"},
        publish = true, tags = "@outline")
public class CucumberTestsRunner extends AbstractTestNGCucumberTests {


}
