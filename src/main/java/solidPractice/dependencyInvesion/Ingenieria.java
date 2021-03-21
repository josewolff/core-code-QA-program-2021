package solidPractice.dependencyInvesion;

public class Ingenieria extends  Empleado{

    @Override
    public void tasks() {
        super.tasks();
        System.out.println("Ingenieria");
    }
}
