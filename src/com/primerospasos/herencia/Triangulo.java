package com.primerospasos.herencia;

public class Triangulo extends FiguraGeometrica{

    public Triangulo(){
        setDimension(2);
    }

    public int getPerimetro(int lado){
        if(lado == lado){
            setLado(lado);
            dibuja();
            cambiaColor();
            return getLado() * getLado() * getLado();
        }else {
            System.out.println("La  base y la altura no son iguales");
            return 0;
        }


    }

    @Override
    public void cambiaColor() {
        System.out.println("Color Negro");
    }
}
