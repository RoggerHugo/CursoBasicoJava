package com.primerospasos.variable;

import java.util.Date;

public class Objetos {

	public static void main(String[] args) {
		
		char[] a = {'H','o','l','a'};
		String b = "";
		String c = new String("Hola");
		
		Byte d = null;
		Short e;
		Integer f;
		Long g;
		Float h;
		Double i;
		Character j;
		Boolean k;
		Object o = null;
		
		MiPrimeraClase p = new MiPrimeraClase();
		p.saludo();
		p.saludo("Hola SARA/GABO");
		System.out.print(p.saludo(20));

	}
}
