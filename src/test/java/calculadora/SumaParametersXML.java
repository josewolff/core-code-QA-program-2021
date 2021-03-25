package calculadora;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SumaParametersXML {

    @Test
    @Parameters({"numero1", "numero2", "expectedResult"})
    public void sumaDosnumeros(int numero1, int numero2, int expectedResult){
        Suma suma = new Suma();
        int  actualResult =  suma.sumar(numero1,numero2);
        Assert.assertEquals(actualResult,expectedResult, " La suma no es correcta.");
    }
}
