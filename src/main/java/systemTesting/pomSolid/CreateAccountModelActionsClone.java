package systemTesting.pomSolid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccountModelActionsClone extends CreateAccountModel{

    private WebDriver driver;
    private WebDriverWait wait;

    public CreateAccountModelActionsClone(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver,this);
    }

    public void createNewAccount(String text) throws InterruptedException {
        writeFirstName(text);
        writeLastName(text);
        writeEmail(text);
        writePassword(text);
        writeRepeatPassword(text);
        Thread.sleep(10000);
        clickRegisterAccount();
    }

    public void writeFirstName(String text){
        firstName.sendKeys(text);
    }

    public void writeLastName(String text){
        lastName.sendKeys(text);
    }

    public void writeEmail(String text){
        email.sendKeys(text);
    }

    public void writePassword(String text){
        password.sendKeys(text);
    }
    public void writeRepeatPassword(String text){
        repeatPassword.sendKeys(text);
    }

    public void clickRegisterAccount(){
        registerAccount.click();
    }


}
