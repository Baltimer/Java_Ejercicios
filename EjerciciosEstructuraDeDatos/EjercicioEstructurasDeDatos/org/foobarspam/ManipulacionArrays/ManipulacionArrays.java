package org.foobarspam.ManipulacionArrays;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ManipulacionArrays {
	
	
	public static void main(String args[]){
		int[] lista = new int[25];
		for (int i = 0; i < lista.length; i++){
			lista[i] = ThreadLocalRandom.current().nextInt(25, 51);
		}
		
		double[] auxiliar = new double[4];
		/*
		 * CASOS TEST PARA COMPROBAR QUE ES CORRECTA LA SALIDA
		 */
		/*
		int[] listaControl = {5,5,6,5,6,7,8};
		auxiliar[0] = numeroDePares(listaControl);
		System.out.println("Número de Pares: " +auxiliar[0]);
		auxiliar[1] = numeroDeImpares(listaControl);
		System.out.println("Número de Impares: " +auxiliar[1]);
		auxiliar[2] = mediaImpares(listaControl);
		System.out.println("Media de Impares: " + auxiliar[2]);
		auxiliar[3] = sumaNumerosValoresBajos(listaControl);
		System.out.println("Suma desde 1 a Par más Bajo: " + auxiliar[3]);
		*/
		
		System.out.println("---------- Contenido de la lista ----------\nNúmeros: ");
		for (int numero : lista){
			System.out.print(numero + " ");
		}
		System.out.println("\n\n---------- Contenido de auxiliar ----------\n");
		auxiliar[0] = numeroDePares(lista);
		System.out.println("Número de Pares: " +auxiliar[0]);
		auxiliar[1] = numeroDeImpares(lista);
		System.out.println("Número de Impares: " +auxiliar[1]);
		auxiliar[2] = mediaImpares(lista);
		System.out.println("Media de Impares: " + auxiliar[2]);
		auxiliar[3] = sumaNumerosValoresBajos(lista);
		System.out.println("Suma desde 1 a Par más Bajo: " + auxiliar[3]);
	}
	
	private static double numeroDePares(int[] lista){
		double numeroPares = 0;
		for (int numero : lista){
			if (numero%2 == 0){
				numeroPares++;
			}
		}
		
		return numeroPares;
	}
	
	private static double numeroDeImpares(int[] lista){
		double numeroImpares = 0;
		for (int numero : lista){
			if (numero%2 != 0){
				numeroImpares++;
			}
		}
		
		return numeroImpares;
	}
	
	private static double mediaImpares(int[] lista){
		double sumaImpares = 0;
		double numeroImpares = 0;
		for (int numero : lista){
			if (numero % 2 != 0){
				sumaImpares += numero;
				numeroImpares++;
			}
		}
		return sumaImpares / numeroImpares;
	}
	
	private static int sumaNumerosValoresBajos(int[] lista){
		int suma = 0;
		int numeroInicio = encontrarPrimerParMasBajo(lista);
		while (1 <= numeroInicio){
			suma += numeroInicio;
			numeroInicio -=1;
		}
		return suma;
	}
	
	private static int encontrarPrimerParMasBajo(int[] lista){
		int parBajo = 0;
		Arrays.sort(lista);
		for (int numero : lista){
			if (numero % 2 == 0){
				parBajo = numero;
				return parBajo;
			}
		}
		return parBajo;
	}
}