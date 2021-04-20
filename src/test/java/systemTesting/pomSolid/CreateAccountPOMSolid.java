package systemTesting.pomSolid;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import systemTesting.InitDriver;
import utils.GlobalVariables;
import utils.TakeScreenShots;

public class CreateAccountPOMSolid extends InitDriver {

    private CreateAccountModelActions createAccountModelActions;
    private TakeScreenShots takeScreenShots;

    @BeforeClass(alwaysRun = true)
    public void goToPage(){
        driver.get(GlobalVariables.seleniumHost + "/register.html");
        createAccountModelActions = new CreateAccountModelActions(driver,wait);
        takeScreenShots = new TakeScreenShots(driver);
    }

    @Test(groups = {"CreateUser"})
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
