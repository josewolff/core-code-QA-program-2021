package solidPractice.interfaceSegregation.wrong;

public class SUV implements ICarro{
    @Override
    public void manejar() {
        System.out.println("manejar");
    }

    @Override
    public void frenar() {
        System.out.println("Frenar");
    }

    @Override
    public void mantenimientollantasRin15() {
    // no lo voy a usar
    }

    @Override
    public void mantenimientollantasRin18() {
        System.out.println("Rin18");
    }
}
