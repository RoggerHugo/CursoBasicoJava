package com.primerospasos.variable;

public class MiPrimeraClase {

	String mensaje = "Hola Mundo!";
	
	public MiPrimeraClase() {

	}

	public MiPrimeraClase(String datoEntrada) {

	}
	public MiPrimeraClase(int datoEntrada) {

	}
	public MiPrimeraClase(String datoEntrada, String datoEntrada2) {

	}
	public MiPrimeraClase(String datoEntrada, int datoEntrada2) {

	}

	public void saludo() {
		System.out.println(mensaje);
	}
	public void saludo(String a) {
		System.out.println(a);
	}
	public int saludo(int b) {
		return b;
	}
}
