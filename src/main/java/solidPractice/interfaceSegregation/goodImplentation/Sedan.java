package solidPractice.interfaceSegregation.goodImplentation;

import solidPractice.interfaceSegregation.goodImplentation.interaces.ISedan;

public class Sedan implements ISedan {

    @Override
    public void manejar() {
        System.out.println("manejar");
    }

    @Override
    public void frenar() {
        System.out.println("frenar");
    }


    @Override
    public void mantenimientollantasRin15() {
        System.out.println("rin 15");
    }
}
