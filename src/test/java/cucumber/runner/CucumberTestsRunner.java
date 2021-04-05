package cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/featuresFiles"},
        glue = {"cucumber"},
        plugin = {"html:target/cucumber-reports/cucumber-reports.html","json:target/cucumber-reports/Cucumber.json"},
        publish = true)
public class CucumberTestsRunner extends AbstractTestNGCucumberTests {


}
