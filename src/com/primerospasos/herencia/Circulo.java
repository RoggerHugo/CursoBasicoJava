package com.primerospasos.herencia;

public class Circulo extends FiguraGeometrica{
    public Circulo(){

        setDimension(2);
    }

    public double getCircunferencia(double radio){
        int a = 2;
        double pi = 3.1416;
        setRadio(radio);
        dibuja();
        cambiaColor();

        return getRadio() * a * pi;
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
