package calculadora;

import dataProviders.DataProvidersClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import testngClass.SoftAndHardAssert;

public class SumaDataProvider {

    @Test(dataProvider = "getParameters", dataProviderClass = DataProvidersClass.class)
    public void sumaDosnumeros(int numero1, int numero2, int expectedResult) throws InterruptedException {
        Suma suma = new Suma();
        int  actualResult =  suma.sumar(numero1,numero2);
        Thread.sleep(2000);
        Assert.assertEquals(actualResult,expectedResult, " La suma no es correcta.");


        String expectedUrl = "";
        String currentUrl = "";

        Assert.assertEquals(expectedUrl,
                currentUrl,
                "Url's doesn't match");
    }
}
