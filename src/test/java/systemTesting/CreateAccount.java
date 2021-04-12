package systemTesting;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.TakeScreenShots;

public class CreateAccount extends InitDriver{

    @BeforeClass
    public void goToPage(){
        driver.get("http://192.168.0.30:7000/register.html");
    }

    @Test
    public void createAccountTest(){
        try{
            System.out.println(driver.getCurrentUrl());
            System.out.println(driver.getPageSource());
            TakeScreenShots takeScreenShots = new TakeScreenShots(driver);
            takeScreenShots.takeScreenShot("test3.png");
            Thread.sleep(10000);
            driver.findElement(By.id("exampleFirstName")).sendKeys("Core");
            driver.findElement(By.xpath("//input[contains(@placeholder,'Last Name')]")).sendKeys("code");
            driver.findElement(By.id("exampleInputEmail")).sendKeys("core@gmail.com");
            driver.findElement(By.id("exampleInputPassword")).sendKeys("Core-pass");
            driver.findElement(By.id("exampleRepeatPassword")).sendKeys("Core-pass-repeat");
            Thread.sleep(5000); //NO SE HACE
           // driver.findElement(By.xpath("//a[contains(text(),'Register Account')]")).click();
            String url = driver.getCurrentUrl();
            System.out.println(url);
            if(!url.contains("login.html")){
                Assert.fail("The page doesn't work");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
