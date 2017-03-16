package org.foobarspam.expresionesRegulares;

import java.util.concurrent.ThreadLocalRandom;

public class GenerarNumeroID {
	private static char[] letraDeControl = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
	private static char[] letraNoValida = {'I', 'O', 'U', 'Ñ'};
	private static char[] numeros = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
	private static char[] letraInicioNie = {'X', 'Y', 'Z'};
	
	private static short cantidadNumerosDni = 8;
	private static short cantidadNumerosNie = 7;
	
	
	// Getters
	
	public static char[] getLetraDeControl() {
		return letraDeControl;
	}

	public static char[] getLetraNoValida() {
		return letraNoValida;
	}

	public static char[] getNumeros() {
		return numeros;
	}

	public static char[] getLetraInicioNie() {
		return letraInicioNie;
	}

	public static short getCantidadNumerosDni() {
		return cantidadNumerosDni;
	}

	public static short getCantidadNumerosNie() {
		return cantidadNumerosNie;
	}
	
	// ---------- LOGICA GENERAR DNI ----------
	public static String generarDNINoValido(){
		String numDni = "";
		for (int i = 0; i < getCantidadNumerosDni(); i++){
			int indiceAleatorio = ThreadLocalRandom.current().nextInt(getNumeros().length);
			numDni += getNumeros()[indiceAleatorio];
		}
		int indiceAleatorio = ThreadLocalRandom.current().nextInt(getLetraNoValida().length);
		numDni += getLetraNoValida()[indiceAleatorio];
		return numDni;
	}

	public static String generarDNIValido(){
		String numDni = "";
		for (int i = 0; i < getCantidadNumerosDni(); i++){
			int indiceAleatorio = ThreadLocalRandom.current().nextInt(getNumeros().length);
			numDni += getNumeros()[indiceAleatorio];
		}
		int indiceAleatorio = ThreadLocalRandom.current().nextInt(getLetraDeControl().length);
		numDni += getLetraDeControl()[indiceAleatorio];
		return numDni;
	}
	
	
	// ---------- LOGICA GENERAR NIE ----------
	public static String generarNIENoValido(){
		String numNie = "";
		numNie += getLetraInicioNie()[ThreadLocalRandom.current().nextInt(getLetraInicioNie().length)];
		for (int i = 0; i < getCantidadNumerosNie(); i++){
			int indiceAleatorio = ThreadLocalRandom.current().nextInt(getNumeros().length);
			numNie += getNumeros()[indiceAleatorio];
		}
		int indiceAleatorio = ThreadLocalRandom.current().nextInt(getLetraNoValida().length);
		numNie += getLetraNoValida()[indiceAleatorio];
		return numNie;
	}

	public static String generarNIEValido(){
		String numNie = "";
		numNie += getLetraInicioNie()[ThreadLocalRandom.current().nextInt(getLetraInicioNie().length)];
		for (int i = 0; i < getCantidadNumerosNie(); i++){
			int indiceAleatorio = ThreadLocalRandom.current().nextInt(getNumeros().length);
			numNie += getNumeros()[indiceAleatorio];
		}
		int indiceAleatorio = ThreadLocalRandom.current().nextInt(getLetraDeControl().length);
		numNie += getLetraDeControl()[indiceAleatorio];
		return numNie;
	}


}
