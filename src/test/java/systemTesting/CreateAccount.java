package systemTesting;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateAccount extends InitDriver {

    @BeforeClass(alwaysRun = true)
        public void initUrl(){
            driver.get("http://localhost:7000/register.html");

        }

        @Test(groups = {"CreateUser"})
        public void CreateUser()  {
        try{
            Thread.sleep(5000);
            System.out.println(driver.getCurrentUrl());
        }catch(Exception e){
            Assert.fail("No se encontro el elemento de login");
        }

    }
}
