package calculadora;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumaTestMultipleMethods {

    @Test
    public void sumaDosNumeros(){
        final int expectedResult = 27;
        final int numero1 = 12;
        final int numero2 = 15;
        Suma suma = new Suma();
        int  actualResult =  suma.sumar(numero1,numero2);
        Assert.assertEquals(actualResult,expectedResult, " La suma no es correcta.");
    }


    @Test
    public void sumaDosnumerosPositoYNegativo(){
        final int expectedResult = 3;
        final int numero1 = -12;
        final int numero2 = 15;
        Suma suma = new Suma();
        int  actualResult =  suma.sumar(numero1,numero2);
        Assert.assertEquals(actualResult,expectedResult, " La suma no es correcta.");
    }

    @Test
    public void sumaDosnumerosPositoYNegativo2(){
        final int expectedResult = -3;
        final int numero1 = 12;
        final int numero2 = -15;
        Suma suma = new Suma();
        int  actualResult =  suma.sumar(numero1,numero2);
        Assert.assertEquals(actualResult,expectedResult, " La suma no es correcta.");
    }
}
