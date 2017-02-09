package org.foobarspam.VentasSupermercado.main;

import java.util.concurrent.ThreadLocalRandom;

import org.foobarspam.VentasSupermercado.Supermercado.Supermercado;

public class Ventas {
	
	public static void main(String[] args){
		double[] ventas = new double[5];
		Supermercado[] tiendas = new Supermercado[5];
		
//		double aleatorio = new double ThreadLocalRandom.current().nextDouble();
		
		// Definimos los atributos de las tiendas
		String[] nombres = {"Mercadona", "Lidl", "Dia", "Eroski", "Aldi"};
		// Definimos las recaudaciones al Azar
//		double[] recaudaciones = {50000000, 40000000, 30000000, 20000000, 10000000};
		double[] recaudaciones = new double[5];
		for (int i = 0; i < recaudaciones.length; i++){
			recaudaciones[i] = ThreadLocalRandom.current().nextDouble(50);
		}
		
		// Inicializamos las tiendas
		for (int i = 0; i<tiendas.length;i++){
			tiendas[i] = new Supermercado(nombres[i], recaudaciones[i]);
		}
		
		// Asignamos la recaudación al array Ventas
		for (int i = 0; i<ventas.length; i++){
			ventas[i] = tiendas[i].getRecaudacionAnual();
		}
		
		
		// Comprobar cual es el Supermercado con Mayores ventas anuales
		System.out.println("El supermercado con más ventas es:\n" 
		+ tiendas[mayorRecaudacion(ventas)].getNombre() + ": "
		+ tiendas[mayorRecaudacion(ventas)].getRecaudacionAnual());
		
		// Comprobar cual es el Supermercado con Menores ventas anuales
		System.out.println("El supermercado con menos ventas es:\n" 
				+ tiendas[menorRecaudacion(ventas)].getNombre() + ": "
				+ tiendas[menorRecaudacion(ventas)].getRecaudacionAnual());
		
		
		// Mostrar la recaudación total de los Supermercados
		System.out.println("La recaudación total es: " + recaudacionTotal(ventas) + " €");
		
	}
	
	public static int mayorRecaudacion(double[] ventas){
		int posicion = 0;
		double auxiliar = ventas[0];
		for (int i = 1; i < ventas.length; i++){
			if (ventas[i] > auxiliar){
				auxiliar = ventas[i];
				posicion = i;
			}
		}
		return posicion;
	}
	
	public static int menorRecaudacion(double[] ventas){
		int posicion = 0;
		double auxiliar = ventas[0];
		for (int i = 1; i < ventas.length; i++){
			if (ventas[i] < auxiliar){
				auxiliar = ventas[i];
				posicion = i;
			}
		}
		return posicion;
	}
	
	public static double recaudacionTotal(double[] ventas){
		double total = 0;
		for (int i = 0; i < ventas.length; i++){
				total += ventas[i];
		}
		return total;
	}
}
