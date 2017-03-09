package org.foobarspam.Estructuras;

import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class NumerosRepetidosTreeSet {
	public static void main (String[] args){
		int cantidadNumeros = 8;
		int numeroAleatorio;
		TreeSet<Integer> numeros = new TreeSet<Integer>();
		while (numeros.size() != cantidadNumeros){
			numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 11);
				numeros.add(numeroAleatorio);
		}
		System.out.print("Los números elegidos son: " + numeros.toString());
	}
}