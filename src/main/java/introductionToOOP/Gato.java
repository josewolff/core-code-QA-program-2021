package introductionToOOP;

public class Gato extends Animal{


    public Gato(String nombre) {
        super(nombre);
    }

    public String getGatoName(String nombre, String apodo){
        return getNombreApodo(nombre,apodo);
    }
}
