package testngClass;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class Login {

    @BeforeClass
    public void beforeClass(){
        System.out.println("\nbefore class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method");
    }

    @Test(description = "test with hard assert.")
    public void loginTest(){
        //Assert.fail("loginTest");
        System.out.println("loginTest");
    }

    @Test(description = "test with send email assert.", dependsOnMethods = {"loginTest"}, enabled = true)
    public void sendEmail(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.fail("sendEmail");
       // softAssert.assertAll();
        System.out.println("sendEmail");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After class");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After method.");
    }
}
