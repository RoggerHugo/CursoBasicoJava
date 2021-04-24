package com.primerospasos.herencia;

public class Circulo extends FiguraGeometrica{
    public Circulo(){

        setDimension(2);
    }

    public double getCircunferencia (double radio){
        setRadio(radio);
        dibuja();
        cambiaColor();

        return getRadio() * 2 * 3.1416;
    }

    @Override
    public void cambiaColor() {

        System.out.println("Color Azul");
    }
    @Override
    public void dibuja() {

        System.out.println("Circulo");
    }


}
