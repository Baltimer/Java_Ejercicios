package org.foobarspam.expresionesRegulares;

import java.util.Scanner;

public class programaPrincipal {

	public static void main(String[] args) {
		System.out.println("Introduce un DNI: ");
		Scanner input = new Scanner(System.in);
		String numeroID = input.nextLine();
		Dni dni = new Dni(numeroID);
		
		while(!dni.tieneFormatoValido()){
			System.out.println("El DNI introducido NO es correcto, introducelo de nuevo: ");
			input = new Scanner(System.in);
		    numeroID = input.nextLine();
			dni.setNumeroId(numeroID);
		}
		
		System.out.println("El DNI: " + dni.getNumeroId() + " es corecto!");
		while(!dni.tieneLetraCorrecta()){
			System.out.println("Pero la letra de control no lo es, introducela de nuevo: ");
			input = new Scanner(System.in);
		    numeroID = input.nextLine();
			dni.setNumeroId(numeroID);
		}
		
		System.out.println("\nAhora introduce un NIE: ");
		input = new Scanner(System.in);
		numeroID = input.nextLine();
		Nie nie = new Nie(numeroID);
		while(!nie.tieneFormatoValido()){
			System.out.println("El NIE introducido NO es correcto, introducelo de nuevo: ");
			input = new Scanner(System.in);
		    numeroID = input.nextLine();
			nie.setNumeroId(numeroID);
		}
		System.out.println("El NIE: " + nie.getNumeroId() + " es corecto!");
		while(!nie.tieneLetraCorrecta()){
			System.out.println("Pero la letra de control no lo es, introducela de nuevo: ");
			input = new Scanner(System.in);
		    numeroID = input.nextLine();
			nie.setNumeroId(numeroID);
		}
		
		System.exit(0);
		
	
	}

}
