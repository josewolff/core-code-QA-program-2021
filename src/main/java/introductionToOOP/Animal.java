package introductionToOOP;

public class Animal {
    private String nombre;
    public Animal(String nombre){
        this.nombre = nombre;
    }

    protected String getNombreApodo(String nombre, String apodo){
        return nombre +"-"+apodo;
    }
}
