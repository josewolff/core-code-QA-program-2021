package solidPractice.liskovPrinciple;

public class MainLiskov {

    public static void main(String[] args){
        CalcularArea cuadrado = new Cuadrado();
        cuadrado.calculoArea();

        CalcularArea rectangulo = new Rectangulo();
        rectangulo.calculoArea();



        CalcularArea calcularArea = new Cuadrado();





        print(cuadrado);
        print(rectangulo);
    }


    public static  void print(CalcularArea c){

    }


    /**
     * x = cuadgrado
     * y = calcular area.
     *
     * If “x” is a subtype of “y” that means that the objects of type “y” may be replaced with objects of type “x”.
     *
     */
}
