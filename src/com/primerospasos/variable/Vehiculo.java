package com.primerospasos.variable;

public class Vehiculo {

    public String color;
    public String tipoLlantas;
    public String rines;
    public String chasis;
    public String cristales;
    public int numLlantas;
    public int numPuertas;
    public boolean cajuela;

    private String motor = "1.2";
    private String tipoAsientos = "Tela";

    protected String tipoFrenos = "";
    protected boolean bolsaAire = true;
    protected String tipoCombistible = "Gasolina";

    boolean aireAcondicionado = true;

    public Vehiculo(){
        this.color = "Negro";
        this.tipoLlantas = "Carreras";
        this.rines = "Deportivos";
        this.chasis = "Deportivos";
        this.cristales = "Negros";
        this.numLlantas = 3;
        this.numPuertas = 1;
        this.cajuela = false;
    }
    public Vehiculo(String color, String rines){
        this.color = color;
        this.tipoLlantas = "Carreras";
        this.rines = rines;
        this.chasis = "Deportivos";
        this.cristales = "Negros";
        this.numLlantas = 3;
        this.numPuertas = 1;
        this.cajuela = false;
    }
    public Vehiculo(String rines){
        this.color = "Negro";
        this.tipoLlantas = "Carreras";
        this.rines = rines;
        this.chasis = "Deportivos";
        this.cristales = "Negros";
        this.numLlantas = 3;
        this.numPuertas = 1;
        this.cajuela = false;
    }

    public void arrancaVehiculo(){
        aireAcondicionado = false;
        System.out.println("Prendio carro");
    }
}
