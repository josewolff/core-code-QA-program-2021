package cucumberTests.tests;

import cucumberTests.driversInitTemp.CucumberDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import systemTesting.pomSolid.CreateAccountModelActions;


public class RegisterStepsDefinition {

    private WebDriver driver;
    private WebDriverWait wait;
    private CreateAccountModelActions createAccountModelActions;

    @Given("that we create a new account on {string}")
    public void thatWeCreateANewAccountOn(String url) {
        CucumberDriver cucumberDriver =  new CucumberDriver();
        driver = cucumberDriver.initDriver("chrome");
        wait = new WebDriverWait(driver,10, 100);
        driver.get(url);
        createAccountModelActions = new CreateAccountModelActions(driver,wait);
    }

    @When("we add the firstname as {string}")
    public void weAddTheFirstnameAs(String firstname) {
       createAccountModelActions.writeFirstName(firstname);
    }

    @And("we add the lastname as {string}")
    public void weAddTheLastnameAs(String lastname) {
        createAccountModelActions.writeLastName(lastname);
    }

    @Then("the firstname should be a String")
    public void theFirstnameShouldBeAString() {
        String firstName = createAccountModelActions.getFirstNameElement().getText();
        System.out.println("Firstname: " + firstName);
        try{
            Integer.parseInt(firstName);
            Assert.fail("Firstname is not a string");
        }catch (Exception e){ }
    }

    @And("the lastname shouuld be a String")
    public void theLastnameShouuldBeAString() {
        String lastName = createAccountModelActions.getLastNameElement().getText();
        System.out.println("latName: " + lastName);
        try{
            Integer.parseInt(lastName);
            Assert.fail("Firstname is not a string");
        }catch (Exception e){ }
    }
}
