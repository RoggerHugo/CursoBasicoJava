package com.primerospasos.calculator;

public class Calculadora {

    public static void main(String[] args) {

        OperacionesAritmeticas oa = new OperacionesAritmeticas();

        System.out.println("suma: " + oa.suma(1,2));
        System.out.println("resta: " + oa.resta(1,2));
        System.out.println("multiplicacion: " + oa.multiplicacion(1,2));
        System.out.println("division: " + oa.divicion(1,1));
        oa.imprimeNumeros(5, false);

    }
}

//crear clase OperacionesAritmeticas
// crear metodos suma, resta, multiplicacion, divicion