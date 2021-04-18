package cucumber;

import cucumber.hooks.Hooks;
import cucumber.stepData.StepsData;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Steps {

    private StepsData stepsData;
    private WebDriver driver;

    public Steps(StepsData stepsData){
        this.stepsData = stepsData;
        this.driver = stepsData.driver;
    }

    @Then("the result should be {int}")
    public void theResultShouldBe(int arg0) {
        System.out.println("values " + arg0);
    }

    @When("a user add {int}")
    public void aUserAdd(int arg0) throws InterruptedException {
        driver.findElement(By.id("search")).sendKeys("testing");
        driver.findElement(By.id("search-icon-legacy")).click();
        String title = driver.getTitle();
        Thread.sleep(2000);
        System.out.println("values " + title);
    }

    @When("a user substrct {int}")
    public void aUserSubstrct(int arg0) throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys("Picocontainer");
        Thread.sleep(2000);
        String title = driver.getTitle();
        System.out.println("values " + title);
    }
}
