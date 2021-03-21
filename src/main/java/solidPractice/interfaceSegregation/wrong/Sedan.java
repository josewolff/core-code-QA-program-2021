package solidPractice.interfaceSegregation.wrong;

public class Sedan implements ICarro{

    @Override
    public void manejar() {
        System.out.println("manejar");
    }

    @Override
    public void frenar() {
        System.out.println("frenar");
    }

    @Override
    public void mantenimientollantasRin15() {
        System.out.println("Rin15");
    }

    @Override
    public void mantenimientollantasRin18() {
        //no lo voy usar
    }
}
