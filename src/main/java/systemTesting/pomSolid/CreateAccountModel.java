package systemTesting.pomSolid;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountModel {

    @FindBy(id = "exampleFirstName")
    protected WebElement firstName;

    @FindBy(id = "exampleLastName")
    protected WebElement lastName;

    @FindBy(id = "exampleInputEmail")
    protected WebElement email;

    @FindBy(id = "exampleInputPassword")
    protected WebElement password;

    @FindBy(id = "exampleRepeatPassword")
    protected WebElement repeatPassword;

    @FindBy(xpath = "//a[contains(text(),'Register Account')]")
    protected WebElement registerAccount;
}
