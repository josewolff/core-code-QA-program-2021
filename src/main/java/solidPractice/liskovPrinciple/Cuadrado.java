package solidPractice.liskovPrinciple;

public class Cuadrado extends CalcularArea {

    @Override
    protected void calculoArea() {
        super.calculoArea();
        System.out.println("Cuadrado");
    }
}
