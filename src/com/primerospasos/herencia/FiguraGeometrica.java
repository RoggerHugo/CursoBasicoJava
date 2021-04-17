package com.primerospasos.herencia;

public class FiguraGeometrica {

    private int dimension;
    int recta;
    int angulo;
    int punto;
    int curva;
    int perimetro;
    int radio;
    int circunferencia;
    int base;
    int altura;
    int profundidad;

    public void getDimension(int dimension){
        this.dimension = dimension;
    }

    public int setDimension(){
        return dimension;
    }
}
