package solidPractice.liskovPrinciple;

public class MainLiskov {

    public static void main(String[] args){
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.calculoArea();

        CalcularArea calcularArea = new Cuadrado();

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.calculoArea();
    }

    /**
     * x = cuadgrado
     * y = calcular area.
     *
     * If “x” is a subtype of “y” that means that the objects of type “y” may be replaced with objects of type “x”.
     *
     */
}
