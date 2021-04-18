package com.primerospasos.variable;

import com.sun.codemodel.internal.JForEach;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class OperadoresYCiclos {

    //Operadores de comparacion
    // < > == != <= >= || && =
    //Operadores de incremento
    // ++ -- += -=

//   ___1__
// 3 | 3
//     0

    public static void main(String[] args) {
        //int a = 0;
        int b = 1;
/*
        if(a == b){
            System.out.println("Entro en el if");
        }else if(a != b){
            System.out.println("Entro en el else if");
        }else if(a != b){
            System.out.println("Entro en el else if");
        }else if(a != b){
            System.out.println("Entro en el else if");
        }else if(a != b){
            System.out.println("Entro en el else if");
        }else if(a != b){
            System.out.println("Entro en el else if");
        }else if(a != b && a == b){
            System.out.println("Entro en el else if");
        } else {
            System.out.println("Entro en el else");
        }*/
        String c = "f";

        switch (c){
            case "a":
            case "A":
                System.out.println("Caso 0");
                break;
            case "1":
                System.out.println("Caso 1");
                break;
            case "2":
                System.out.println("Caso 2");
                break;
            default:
                System.out.println("Default");
                break;

        }
        int a;
/*
        for(a = 0;a<=1;a++){
            System.out.println(a);
        }*/


        /*ArrayList<Integer> k = new ArrayList<Integer>();
        k.add(9);
        k.add(8);
        k.add(7);*/

        int [] g = {1,2,3};
        a = 0;
        System.out.println("Tamaño del arreglo: " + g.length);
        System.out.println("indice 0: " + g[0]);
        System.out.println("indice 1: " + g[1]);
        System.out.println("induce 2: " + g[2]);

        System.out.println("Bucle for");
        for(a = 0; a<g.length;a++){
            System.out.println("indice " + a + ": " + g[a]);
        }
        System.out.println("Bucle foreach");
        a=0;
        for(int l : g){
            System.out.println(l);
            System.out.println("indice: " + a);
            a++;
        }

        System.out.println("Bucle while");
        a = 0;
        while(a<g.length){
            System.out.println(g[a]);
            a++;
        }
    //0
        int [] y = {1};
        System.out.println("Bucle do while");
        a = 2;
        do {
            System.out.println("indice inicial: " + a);
            System.out.println(y[0]);
            a++;
            System.out.println("indice: " + a);
        } while (a<g.length);

        float valor = 4/3;
        double valor2 = 3%4;

        System.out.println("divicion: " + valor);
        System.out.println("modulo: " + valor2);

    }



    //for(){

    //}

    /*
    while(){

    }
    do{

    } while();
    */


    // .equals();



}
