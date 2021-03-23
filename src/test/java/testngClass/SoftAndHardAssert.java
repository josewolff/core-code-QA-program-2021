package testngClass;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class SoftAndHardAssert {

    @BeforeClass
    public void beforeClass(){
        System.out.println("\nbefore class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method");
    }

    @Test(description = "test with hard assert.")
    public void hardAssertTest(){
        Assert.fail("hardAssertTest");
        System.out.println("hardAssertTest");
    }

    @Test(description = "test with hard assert.",dependsOnMethods = {"hardAssertTest"})
    public void softAssertTest(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.fail("softAssertTest");
       // softAssert.assertAll();
        System.out.println("softassert");
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
