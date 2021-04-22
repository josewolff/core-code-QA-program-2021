package cucumberTests.tests;

import cucumberTests.driversInitTemp.CucumberDriver;
import cucumberTests.hooksAndShareData.Hooks;
import cucumberTests.hooksAndShareData.ShareData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import systemTesting.pomSolid.CreateAccountModelActions;


public class RegisterStepsDefinition {

    private ShareData shareData;
    private CreateAccountModelActions createAccountModelActions;

    public RegisterStepsDefinition(ShareData shareData){
        this.shareData = shareData;
    }

    @Given("that we create a new account on {string}")
    public void thatWeCreateANewAccountOn(String url) {
        shareData.driver.get(url);
        createAccountModelActions = new CreateAccountModelActions(shareData.driver, shareData.wait);
    }

    @When("we add the firstname as {string}")
    public void weAddTheFirstnameAs(String firstname) {
       createAccountModelActions.writeFirstName(firstname);
    }

    @And("we add the lastname as {string}")
    public void weAddTheLastnameAs(String lastname) {
        createAccountModelActions.writeLastName(lastname);
    }

    @And("we add the email as {string}")
    public void weAddTheEmailAs(String email) {
        createAccountModelActions.writeEmail(email);
    }

    @And("we add the password as {string}")
    public void weAddThePasswordAs(String password) {
        createAccountModelActions.writePassword(password);
    }

    @And("we add the repeat password as {string}")
    public void weAddTheRepeatPasswordAs(String repearPassword) {
        createAccountModelActions.writeRepeatPassword(repearPassword);
    }

    @And("we clicks the register account button")
    public void weClicksTheRegisterAccountButton() {
        createAccountModelActions.clickRegisterAccount();
    }

    @Then("the page should have the url {string}")
    public void thePageShouldHaveTheUrl(String urlLogin) {
        String currentUrl = shareData.driver.getCurrentUrl();
        if(!currentUrl.contains(urlLogin)){
            Assert.fail("The site didn't redirect to the expeted page. ExpectedUrl: " + currentUrl);
        }
    }

    @When("we clicks the button register with google")
    public void weClicksTheButtonRegisterWithGoogle() {
        createAccountModelActions.clickRegisterWithGoogleButton();
    }
}
