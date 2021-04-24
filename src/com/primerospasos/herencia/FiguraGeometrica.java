package com.primerospasos.herencia;

public class FiguraGeometrica implements Figura {

    private int dimension;
    private int base;
    private int altura;
    private double radio;
    private int lado;

    public void setDimension(int dimension){
        this.dimension = dimension;
    }

    public int getDimension() {
        return dimension;
    }

    public void setBase(int base){
        this.base = base;
    }

    public int getBase(){
        return base;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public void setLado(int lado){
        this.lado = lado;
    }

    public int getLado(){
        return lado;
    }

    @Override
    public void dibuja() {
        System.out.println("Dibujando figura geometrica");
    }

    @Override
    public void borra() {
        System.out.println("Borrando figura geometrica");
    }

    @Override
    public void cambiaColor() {
        System.out.println("Cambiando color");
    }
}
