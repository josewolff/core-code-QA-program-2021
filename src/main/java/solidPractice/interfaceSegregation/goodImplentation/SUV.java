package solidPractice.interfaceSegregation.goodImplentation;

import solidPractice.interfaceSegregation.goodImplentation.interaces.ICarro;
import solidPractice.interfaceSegregation.goodImplentation.interaces.ISuv;

public class SUV implements ICarro, ISuv {

    @Override
    public void manejar() {
        System.out.println("manejar");
    }

    @Override
    public void frenar() {
        System.out.println("Frenar");
    }


    @Override
    public void mantenimientollantasRin18() {
        System.out.println("Rin18");
    }
}
