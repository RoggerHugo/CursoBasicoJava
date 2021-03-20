package com.primerospasos.variable;

public class Carro {

    public static void main(String args[]){

        Vehiculo vehiculo1 = new Vehiculo();
        System.out.println("Carro1: "+vehiculo1.rines);
        vehiculo1.arrancaVehiculo();

        Vehiculo vehiculo2 = new Vehiculo("Rojo", "Aluminio");
        System.out.println("Carro2: "+vehiculo2.rines);
        vehiculo2.arrancaVehiculo();

        Vehiculo vehiculo3 = new Vehiculo("Basicos");
        System.out.println("Carro3: "+vehiculo3.rines);
        vehiculo3.arrancaVehiculo();

    }
}
