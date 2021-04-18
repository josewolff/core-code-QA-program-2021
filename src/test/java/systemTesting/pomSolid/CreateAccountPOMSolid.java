package systemTesting.pomSolid;

import org.aspectj.lang.annotation.After;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import systemTesting.InitDriver;
import systemTesting.pomWithoutRefactor.CreateAccountModel;
import utils.TakeScreenShots;

public class CreateAccountPOMSolid extends InitDriver {

    private CreateAccountModelActions createAccountModelActions;
    private TakeScreenShots takeScreenShots;

    @BeforeClass
    public void goToPage(){
        driver.get("http://192.168.0.30:7000/register.html");
        createAccountModelActions = new CreateAccountModelActions(driver,wait);
        takeScreenShots = new TakeScreenShots(driver);
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

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        takeScreenShots.takeScreenShot("createaccount.png");
    }
}
