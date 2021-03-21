package introductionToOOP;

public class Perro {

    private int patas;
    private String nombre;
    private int cantidadOjos;
    private String apodo;

    public Perro(int patas, String nombre){
        this.patas = patas;
        this.nombre = nombre;
    }

    public Perro(int patas, String nombre, int cantidadOjos, String apodo){
        this.patas = patas;
        this.nombre = nombre;
        this.cantidadOjos = cantidadOjos;
        this.apodo = apodo;
    }


    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
