package systemTesting.pomWithoutRefactor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccountModel {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(id = "exampleFirstName")
    private WebElement firstName;

    @FindBy(id = "exampleLastName")
    private WebElement lastName;

    @FindBy(id = "exampleInputEmail")
    private WebElement email;

    @FindBy(id = "exampleInputPassword")
    private WebElement password;

    @FindBy(id = "exampleRepeatPassword")
    private WebElement repeatPassword;

    @FindBy(xpath = "//a[contains(text(),'Register Account')]")
    private WebElement registerAccount;


    public void createNewAccount(String text) throws InterruptedException {
        writeFirstName(text);
        writeLastName(text);
        writeEmail(text);
        writePassword(text);
        writeRepeatPassword(text);
        Thread.sleep(10000);
        clickRegisterAccount();
    }

    private void writeFirstName(String text){
        firstName.sendKeys(text);
    }

    private void writeLastName(String text){
        lastName.sendKeys(text);
    }

    private void writeEmail(String text){
        email.sendKeys(text);
    }

    private void writePassword(String text){
        password.sendKeys(text);
    }
    private void writeRepeatPassword(String text){
        repeatPassword.sendKeys(text);
    }

    private void clickRegisterAccount(){
        registerAccount.click();
    }

    public CreateAccountModel(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver,this);
    }
}
