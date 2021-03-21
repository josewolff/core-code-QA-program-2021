package solidPractice.dependencyInvesion;

public class Conta extends  Empleado{

    @Override
    public void tasks() {
        super.tasks();
        System.out.println("Conta");
    }
}
