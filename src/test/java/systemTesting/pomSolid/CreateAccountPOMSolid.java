package systemTesting.pomSolid;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import systemTesting.InitDriver;
import systemTesting.pomWithoutRefactor.CreateAccountModel;

public class CreateAccountPOMSolid extends InitDriver {

    private CreateAccountModelActions createAccountModelActions;

    @BeforeClass
    public void goToPage(){
        driver.get("http://localhost:7000/register.html");
        createAccountModelActions = new CreateAccountModelActions(driver,wait);
    }

    @Test
    public void createAccountTest() throws InterruptedException {
        System.out.println(driver.getCurrentUrl());
        createAccountModelActions.createNewAccount("tesitng");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        if(!url.contains("login.html")){
            Assert.fail("The page doesn't work");
        }
    }
}
