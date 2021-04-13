package systemTesting.createAccountPOMWtithouRefactor;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import systemTesting.InitDriver;
import systemTesting.pomWithoutRefactor.CreateAccountModel;

public class CreateAccountPOMWithoutRefactor extends InitDriver {

    private CreateAccountModel createAccountModel;

    @BeforeClass
    public void goToPage(){
        driver.get("http://localhost:7000/register.html");
        createAccountModel = new CreateAccountModel(driver,wait);
    }

    @Test
    public void createAccountTest() throws InterruptedException {
        System.out.println(driver.getCurrentUrl());
        createAccountModel.createNewAccount("tesitng");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        if(!url.contains("login.html")){
            Assert.fail("The page doesn't work");
        }
    }
}
