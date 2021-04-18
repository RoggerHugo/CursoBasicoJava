package com.primerospasos.herencia;

public abstract class OperacionesAritmeticas {

    public abstract int suma(int a, int b);

    public abstract int resta(int a, int b);

    public int multiplicacion(int a, int b){
        return a*b;
    }

    public int divicion(int a, int b){
        return a/b;
    }
}
