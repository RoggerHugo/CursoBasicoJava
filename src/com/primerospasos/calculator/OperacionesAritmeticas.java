package com.primerospasos.calculator;

public class OperacionesAritmeticas {

    public int suma(int a, int b){
        return a+b;
    }

    public int resta(int a, int b){
        return a-b;
    }

    public int multiplicacion(int a, int b){
        return a*b;
    }

    public int divicion(int a, int b){
        return a/b;
    }

    public void imprimeNumeros(int top, boolean tipo) {

        //tipo = true es Acendente
        if(tipo){
            for (int a = 1; a<= top; a++) System.out.println("Numero: " + a);
        } else {
            for (int a = top; a>= 1; a--) System.out.println("Numero: " + a);
        }
    }


}