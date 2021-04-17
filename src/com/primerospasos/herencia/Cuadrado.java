package com.primerospasos.herencia;

public class Cuadrado extends FiguraGeometrica {

    int rectas = 4;
    int puntos = 4;
    int angulo = 90;
    int base;
    int altura;
    int perimetro;

    @Override
    public int setDimension() {
        return 2;
    }

}
