package com.primerospasos.herencia;

public class HPEA {

    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado();

        int perimetro = cuadrado.getPerimetro(2,2);
        System.out.println("Perimetro del cuadrado: " + perimetro);

    }
}
