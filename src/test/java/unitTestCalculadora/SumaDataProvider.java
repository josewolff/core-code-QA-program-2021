package unitTestCalculadora;

import dataProviders.DataProvidersClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumaDataProvider {

    @Test(dataProvider = "getParametersUnitTest", dataProviderClass = DataProvidersClass.class, groups = {"unitTesting"})
    public void sumaDosnumeros(int numero1, int numero2, int expectedResult) throws InterruptedException {
        Suma suma = new Suma();
        int  actualResult =  suma.sumar(numero1,numero2);
        Thread.sleep(50);
        Assert.assertEquals(actualResult,expectedResult, " La suma no es correcta.");

        if(numero1 >=250){
            //Assert.fail("Testing fial");
        }
        String expectedUrl = "";
        String currentUrl = "";

        Assert.assertEquals(expectedUrl,
                currentUrl,
                "Url's doesn't match");
    }
}
