package solidPractice.dependencyInvesion;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        List<Empleado> contaEmpleados = new ArrayList<>();
        contaEmpleados.add(new Conta());
        contaEmpleados.add(new Ingenieria());
        contaEmpleados.add(new Ventas());

        for(Empleado em: contaEmpleados){
            em.tasks();
        }
        System.out.println(contaEmpleados.size());
    }
}
