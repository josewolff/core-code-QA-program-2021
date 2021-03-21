package solidPractice.dependencyInvesion;

public class Ventas extends  Empleado{
    @Override
    public void tasks() {
        super.tasks();
        System.out.println("ventas");
    }
}
