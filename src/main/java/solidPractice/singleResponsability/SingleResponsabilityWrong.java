package solidPractice.singleResponsability;

public class SingleResponsabilityWrong {

    public void calcularArea(){
        System.out.println("Calcular Area.");
    }

    public void calcularVolumen(int a, int b){
        System.out.println("Calcular volumen.");
        int volumen = a+b;
    }

    public void calcularPerimetro(){
        System.out.println("Calcular Perimetro.");
    }
}
